package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "10", "<sample:0>"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", " />", "-1.5"}}), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<sample>\n a\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample>\n a\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementById", new String[]{"java.lang.String"}, new String[]{"ac"}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "nextElementSibling", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" > ", "2020-02-30T25:61:61"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "toggleClass", "java.lang.String", "ac"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\"ac\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "reparentChild", "org.jsoup.nodes.Node", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "insertChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "ownText", ""}}), new String[][]{{"getElementsMatchingText", "java.util.regex.Pattern", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<a>\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\"></a>, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "insertChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-1073741824", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "ownText", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "appendTo", "org.jsoup.nodes.Element", "<sample:2>"}, {"org.jsoup.nodes.Element", "selectFirst", "java.lang.String", "PT1H"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{"java.lang.String"}, new String[]{"br"}, false), new String[][]{{"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<br> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<br> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "appendChild", "org.jsoup.nodes.Node", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <!--a--></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"-33"}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "append", "java.lang.String", "2.5e300"}, {"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "2147483593", "<sample:2>"}, {"org.jsoup.nodes.Element", "getElementsContainingOwnText", "java.lang.String", "bbr1"}}), new String[][]{{"not", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample>\n 2.5e300\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousElementSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "childNodeSize", ""}, {"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.lang.String", "2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "preserveWhitespace", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependElement", new String[]{"java.lang.String"}, new String[]{"fi1147483648"}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "select", "java.lang.String", "a+e"}, {"org.jsoup.nodes.Element", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:3>", "<sample:2>"}}, 3), new String[][]{{"append", "java.lang.String", "2"}, {"appendChild", "org.jsoup.nodes.Node", "3"}, {"after", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<fi1147483648>\n 0<!DOCTYPE a PUBLIC \"0\" \"sample\">\n</fi1147483648> {hasParent=true, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0>\n <fi1147483648>\n  0<!DOCTYPE a PUBLIC \"0\" \"sample\">\n </fi1147483648>sample\n</0> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prepend", new String[]{"java.lang.String"}, new String[]{"1r"}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "shallowClone", ""}, {"org.jsoup.nodes.Element", "siblingElements", ""}}, 2), new String[][]{{"hasText", "", "3"}, {"getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0>\n 1r\n</0> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{"java.lang.String"}, new String[]{"11111.0022x2568"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "wrap", "java.lang.String", "\nvakue"}, {"org.jsoup.nodes.Element", "getElementsByClass", "java.lang.String", "textarea0"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "vvalue1.5e300", "+1"}}, 2), new String[][]{{"getAllElements", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<{\"a\":1}>\n 11111.0022x2568\n</{\"a\":1}>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}>\n 11111.0022x2568\n</{\"a\":1}> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "insertChildren", new String[]{"int", "java.util.Collection"}, new String[]{"-1073741824", "<empty>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "doClone", "org.jsoup.nodes.Node", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexLessThan", new String[]{"int"}, new String[]{"2147483647"}, false, 12, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,org.jsoup.nodes.Node[]", "-1", "<sample:1>"}, {"org.jsoup.nodes.Element", "appendTo", "org.jsoup.nodes.Element", "<sample:3>"}, {"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "br"}}, 2), new String[][]{{"html", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <#root>\n  0\n </#root><!DOCTYPE a PUBLIC \"0\" \"sample\"></a> {hasParent=true, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexLessThan", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,org.jsoup.nodes.Node[]", "0", "<sample:1>"}, {"org.jsoup.nodes.Element", "appendText", "java.lang.String", "/Ht+x1234567789"}}, 1), new String[][]{{"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\">/Ht+x1234567789</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexLessThan", new String[]{"int"}, new String[]{"8204"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,org.jsoup.nodes.Node[]", "0", "<sample:1>"}, {"org.jsoup.nodes.Element", "appendText", "java.lang.String", "ue110"}, {"org.jsoup.nodes.Element", "cssSelector", ""}}), new String[][]{{"prevAll", "", "2"}, {"outerHtml", "", "4"}, {"addAll", "java.util.Collection", "7"}, {"trimToSize", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\">ue110</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "preserveWhitespace", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesAsArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "1.5e300", "1E-5"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "#root", "1"}});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependElement", new String[]{"java.lang.String"}, new String[]{"111.002x3568"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "toggleClass", "java.lang.String", "a b"}, {"org.jsoup.nodes.Element", "val", "java.lang.String", "<a>b</a>"}}), new String[][]{{"firstElementSibling", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a class=\"a b\" value=\"<a>b</a>\">\n <111.002x3568></111.002x3568></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttribute", "java.lang.String", "\nvaue-1.5"}, {"org.jsoup.nodes.Element", "toggleClass", "java.lang.String", "1e10"}}), new String[][]{{"hasClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample class=\"1e10\"></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"ue110"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>a</a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownText", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.Element", "addClass", "java.lang.String", "x"}, {"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "1.12B34567"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0 class=\"x\">\n <1.12B34567></1.12B34567>\n</0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "111.002x3568"}, {"org.jsoup.nodes.Element", "prepend", "java.lang.String", "00e+12E-T5"}}, 1), new String[][]{{"data", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a>00e+12E-T5</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Element", "appendChild", "org.jsoup.nodes.Node", "<sample:0>"}, {"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "\tv`kue2030.02-20T25:61:611.12346678"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample>\n <!--a-->\n <v`kue2030.02-20T25:61:611.12346678></v`kue2030.02-20T25:61:611.12346678>\n</sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Element", "appendChild", "org.jsoup.nodes.Node", "<sample:1>"}, {"org.jsoup.nodes.Element", "elementSiblingIndex", ""}, {"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "\tv`kue2030.02-20T25:61:611.12346678"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample>a\n <v`kue2030.02-20T25:61:611.12346678></v`kue2030.02-20T25:61:611.12346678>\n</sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{"java.lang.Appendable"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "html", "java.lang.String", " <a>b</a>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals(" <a>b</a>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a> <a>b</a></a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{"java.lang.String"}, new String[]{"1-6"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "attr", "java.lang.String,boolean", "0E-5", "true"}, {"org.jsoup.nodes.Element", "insertChildren", "int,org.jsoup.nodes.Node[]", "2147483647", "<sample:0>"}}, 3), new String[][]{{"getElementsByAttributeStarting", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<1-6 0E-5></1-6> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "select", "java.lang.String", "bbr1"}, {"org.jsoup.nodes.Element", "prependText", "java.lang.String", "I"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[I]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>I</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{"java.lang.String"}, new String[]{""}, false, 12, new String[][]{{"org.jsoup.nodes.Element", "val", ""}, {"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "0", "<empty>"}, {"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "--1t-xtarea1.25#"}}), new String[][]{{"getElementsContainingText", "java.lang.String", "0"}, {"clone", "", "6"}, {"forms", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "appendChild", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.Element", "doClone", "org.jsoup.nodes.Node", "<sample:2>"}}, 3), new String[][]{{"getElementsByIndexGreaterThan", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample>\n <#root></#root>\n <#root></#root>\n</sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesCopy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "1.1234567890123456"}, {"org.jsoup.nodes.Element", "dataset", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[<1.1234567890123456></1.1234567890123456>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <1.1234567890123456></1.1234567890123456></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x1F", "$"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", "\\s+"}, {"org.jsoup.nodes.Element", "is", "java.lang.String", "1.5d"}}, 3), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{"vnth-dPT1H\u00e9"}, false, 9, new String[][]{}, 2), new String[][]{{"addClass", "java.lang.String", "2"}, {"hasSameValue", "java.lang.Object", "3"}, {"hasClass", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0 class=\"vnth-dPT1H\u00e9 0\"></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendTo", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"org.jsoup.nodes.Element", "classNames", "java.util.Set", "<sample:3>"}, {"org.jsoup.nodes.Element", "append", "java.lang.String", "111.002x3568"}}), new String[][]{{"before", "org.jsoup.nodes.Node", "4"}, {"cssSelector", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a > a.sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a class=\"sample\">111.002x3568</a> {hasParent=true, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendTo", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:16>"}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "classNames", "java.util.Set", "<sample:1>"}, {"org.jsoup.nodes.Element", "append", "java.lang.String", "11.102yu35\t6\r84"}, {"org.jsoup.nodes.Element", "dataNodes", ""}}, 3), new String[][]{{"elementSiblingIndex", "", "5"}, {"cssSelector", "", "7"}, {"before", "org.jsoup.nodes.Node", "7"}, {"after", "org.jsoup.nodes.Node", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a class=\"a 0\">11.102yu35 6 84</a> {hasParent=true, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\"a 0\">11.102yu35 6 84</a> {hasParent=true, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendTo", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:16>"}, false, 12, new String[][]{{"org.jsoup.nodes.Element", "classNames", "java.util.Set", "<sample:1>"}, {"org.jsoup.nodes.Element", "append", "java.lang.String", "[1,2]"}, {"org.jsoup.nodes.Element", "dataNodes", ""}}, 2), new String[][]{{"elementSiblingIndex", "", "5"}, {"cssSelector", "", "7"}, {"getElementsMatchingText", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\"a 0\">[1,2]</a> {hasParent=true, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendTo", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:12>"}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "classNames", "java.util.Set", "<sample:4>"}, {"org.jsoup.nodes.Element", "append", "java.lang.String", "[0P10x1F"}, {"org.jsoup.nodes.Element", "dataNodes", ""}}), new String[][]{{"elementSiblingIndex", "", "5"}, {"cssSelector", "", "7"}, {"getElementsMatchingText", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<a class=\" a\">[0P10x1F</a>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\" a\">[0P10x1F</a> {hasParent=true, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendTo", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "classNames", "java.util.Set", "<sample:7>"}, {"org.jsoup.nodes.Element", "append", "java.lang.String", "<b>c<u\n0b"}, {"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "00e110"}}, 2), new String[][]{{"elementSiblingIndex", "", "3"}, {"cssSelector", "", "0"}, {"dataNodes", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\"sample \"><b>c</b></a> {hasParent=true, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendTo", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "classNames", "java.util.Set", "<sample:11>"}, {"org.jsoup.nodes.Element", "append", "java.lang.String", " <a>b</a>"}, {"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1E-51v2:30:\u00e945"}}, 3), new String[][]{{"getElementsMatchingText", "java.util.regex.Pattern", "3"}, {"html", "java.lang.String", "2"}, {"is", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", "java.lang.Appendable", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<2147483648></2147483648> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<2147483648></2147483648> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setSiblingIndex", new String[]{"int"}, new String[]{"-1"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "-1", "<sample:0>"}, {"org.jsoup.nodes.Element", "parentNode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtmlTail", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "1", "<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "before", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "prependText", "java.lang.String", "-1.5"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "before", new String[]{"java.lang.String"}, new String[]{"/s+"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "empty", ""}, {"org.jsoup.nodes.Element", "lastElementSibling", ""}, {"org.jsoup.nodes.Element", "prependText", "java.lang.String", "-1.5"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "selectFirst", new String[]{"java.lang.String"}, new String[]{"_"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "selectFirst", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getOutputSettings", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getOutputSettings", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3), new String[][]{{"prettyPrint", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getOutputSettings", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3), new String[][]{{"prettyPrint", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getOutputSettings", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"prettyPrint", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getOutputSettings", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3), new String[][]{{"prettyPrint", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getOutputSettings", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Element", "firstElementSibling", ""}}, 3), new String[][]{{"prettyPrint", "", "4"}, {"indentAmount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", ".5d}-1", "[1,]"}, {"org.jsoup.nodes.Element", "html", "java.lang.String", "1.12B345671.12345678901234567"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample>\n 1.12B345671.12345678901234567\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", ".5d}-1", "[1,]"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", ".5d}-1", "[1,]"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "class"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", ".5d}-1", "[1,]"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "class"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", ".5d}-1", "[1,]"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Element", "appendText", "java.lang.String", "+1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample>\n +1\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Element", "appendText", "java.lang.String", "+2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample>\n +2\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Element", "appendText", "java.lang.String", "+2a"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample>\n +2a\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 17, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a #comment=\"a\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 19, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a\nb", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a\nb></a\nb> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementById", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "traverse", "org.jsoup.select.NodeVisitor", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementById", new String[]{"java.lang.String"}, new String[]{"0a/c"}, false, 9, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsContainingText", new String[]{"java.lang.String"}, new String[]{" />"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"0x112346789"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "220-1-01"}}, 1), new String[][]{{"removeAttr", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:0>"}, {"org.jsoup.nodes.Element", "getElementsByIndexLessThan", "int", "2147483647"}}, 3), new String[][]{{"isKnownTag", "", "5"}, {"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:0>"}, {"org.jsoup.nodes.Element", "getElementsByIndexLessThan", "int", "2147483647"}}, 3), new String[][]{{"isKnownTag", "", "5"}, {"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a #comment=\"a\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexLessThan", "int", "1073741823"}}, 3), new String[][]{{"isKnownTag", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a #comment=\"a\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 18, new String[][]{}, 3), new String[][]{{"isKnownTag", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 19, new String[][]{}, 3), new String[][]{{"isKnownTag", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a\nb></a\nb> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 19, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Tag", actual.getClass().getName());
  assertEquals("a\nb {canContainBlock=false, getName=a\nb, isBlock=false, isData=false, isEmpty=false, isFormListed=false, isFormSubmittable=false, isInline=true, isKnownTag=false, isSelfClosing=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a\nb></a\nb> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "tag", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Tag", actual.getClass().getName());
  assertEquals("a {canContainBlock=false, getName=a, isBlock=false, isData=false, isEmpty=false, isFormListed=false, isFormSubmittable=false, isInline=true, isKnownTag=true, isSelfClosing=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jsoup.nodes.Element", "tag", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Tag", actual.getClass().getName());
  assertEquals("0 {canContainBlock=false, getName=0, isBlock=false, isData=false, isEmpty=false, isFormListed=false, isFormSubmittable=false, isInline=true, isKnownTag=false, isSelfClosing=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "tag", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Tag", actual.getClass().getName());
  assertEquals("sample {canContainBlock=false, getName=sample, isBlock=false, isData=false, isEmpty=false, isFormListed=false, isFormSubmittable=false, isInline=true, isKnownTag=false, isSelfClosing=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "insertChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "64", "<sample:5>"}, {"org.jsoup.nodes.Element", "data", ""}}, 3), new String[][]{{"getElementsMatchingText", "java.util.regex.Pattern", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<a>a\n <!--a--></a>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>a\n <!--a--></a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "insertChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "64", "<sample:5>"}, {"org.jsoup.nodes.Element", "data", ""}}, 3), new String[][]{{"getElementsMatchingText", "java.util.regex.Pattern", "7"}, {"add", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"i"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>i</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>i</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"i"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", "int", "-1"}, {"org.jsoup.nodes.Element", "ownerDocument", ""}}, 1), new String[][]{{"elementSiblingIndex", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a>i</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"j"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", "int", "-2147483648"}, {"org.jsoup.nodes.Element", "ownerDocument", ""}}, 1), new String[][]{{"elementSiblingIndex", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a>j</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "{\"a\":1}", "1.12345678901234567"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "ckass", "0E-5"}, {"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "1L"}}, 3), new String[][]{{"getElementsByClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "clone", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "{\"a\":1}", "1.12345678901234567"}, {"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "1L"}}, 3), new String[][]{{"getElementsByClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "{\"a\":1}", "1.12345678901234567"}, {"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "1L"}}, 3), new String[][]{{"getElementsByClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"cka7s{"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "replaceWith", "org.jsoup.nodes.Node", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "</", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "</", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "</", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "</", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "<0", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "appendTo", "org.jsoup.nodes.Element", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "appendTo", "org.jsoup.nodes.Element", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "appendTo", "org.jsoup.nodes.Element", "<sample:2>"}, {"org.jsoup.nodes.Element", "selectFirst", "java.lang.String", "PT1H"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<empty>"}, {"org.jsoup.nodes.Element", "appendTo", "org.jsoup.nodes.Element", "<sample:4>"}, {"org.jsoup.nodes.Element", "selectFirst", "java.lang.String", "PT1H"}}, 2), new String[][]{{"prevAll", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<empty>"}, {"org.jsoup.nodes.Element", "appendTo", "org.jsoup.nodes.Element", "<sample:4>"}, {"org.jsoup.nodes.Element", "selectFirst", "java.lang.String", "PT1H"}}, 2), new String[][]{{"prevAll", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:1>"}, {"org.jsoup.nodes.Element", "appendTo", "org.jsoup.nodes.Element", "<sample:3>"}, {"org.jsoup.nodes.Element", "selectFirst", "java.lang.String", "PT1H"}}, 2), new String[][]{{"prevAll", "java.lang.String", "1"}, {"remove", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y></x \t y> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:3>"}, {"org.jsoup.nodes.Element", "appendTo", "org.jsoup.nodes.Element", "<sample:5>"}, {"org.jsoup.nodes.Element", "selectFirst", "java.lang.String", "0x2F"}}, 3), new String[][]{{"prevAll", "java.lang.String", "1"}, {"remove", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parents", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "previousSibling", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "-2147483648", "<sample:0>"}, {"org.jsoup.nodes.Element", "outerHtml", ""}, {"org.jsoup.nodes.Element", "hasParent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<http://example.com/a?b=c></http://example.com/a?b=c> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<http://example.com/a?b=c></http://example.com/a?b=c> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{"java.lang.String"}, new String[]{"htt://example.com/a?b=c"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "-2147483648", "<sample:0>"}, {"org.jsoup.nodes.Element", "outerHtml", ""}, {"org.jsoup.nodes.Element", "hasParent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<htt://example.com/a?b=c></htt://example.com/a?b=c> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<htt://example.com/a?b=c></htt://example.com/a?b=c> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"#", "01e+1"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"#$$1", "01(*0"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "absUrl", "java.lang.String", "123456789012345678901234567890"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<a></a>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "absUrl", "java.lang.String", "12345678"}}, 1), new String[][]{{"toggleClass", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<a class=\"\"></a>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\"\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.util.regex.Pattern"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "absUrl", "java.lang.String", "12345678"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{"java.lang.String"}, new String[]{"1-1334567bb 9012445567"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "prependText", "java.lang.String", "1.1234567"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>1-1334567bb 9012445567</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>1-1334567bb 9012445567</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "append", "java.lang.String", "1e10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a>1e10</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "append", "java.lang.String", "1e10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0>\n 1e10\n</0> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "append", "java.lang.String", "ve10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0>\n ve10\n</0> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "append", "java.lang.String", "ve10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample>\n ve10\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "append", "java.lang.String", "ve10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>>\n ve10\n</<a><b>t</b></a>> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "append", "java.lang.String", "ve10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a>ve10</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "append", "java.lang.String", "ve10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}>\n ve10\n</{\"a\":1}> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", "java.lang.Appendable", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<2147483648></2147483648> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<2147483648></2147483648> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setSiblingIndex", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "parentNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setSiblingIndex", new String[]{"int"}, new String[]{"-1"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "parentNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>a</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>a</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<0>\n a\n</0> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0>\n a\n</0> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<sample>\n a\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample>\n a\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", " />", "-1.5"}}), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a>>\n a\n</<a><b>t</b></a>> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>>\n a\n</<a><b>t</b></a>> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:2>"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", " />", "-1.5"}}), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<sample>\n a\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample>\n a\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:2>"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", " />", "-1.5"}}), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:2>"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", " />", "-1.5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:2>"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", " />", "-1.5"}}), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "5"}, {"clearAttributes", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1}>\n a\n</{\"a\":1}> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}>\n a\n</{\"a\":1}> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "previousSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:1>"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", " />", "-15"}}), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "5"}, {"clearAttributes", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<x \t y>\n a\n</x \t y> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y>\n a\n</x \t y> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "selectFirst", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "after", "org.jsoup.nodes.Node", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "elementSiblingIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "elementSiblingIndex", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "elementSiblingIndex", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "elementSiblingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "elementSiblingIndex", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownerDocument", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownerDocument", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownerDocument", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownerDocument", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "textNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "textNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<0></0>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "textNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<sample></sample>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "textNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a>></<a><b>t</b></a>>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addClass", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "childNodeSize", ""}, {"org.jsoup.nodes.Element", "addClass", "java.lang.String", "br"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a class=\"br [1,2]\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\"br [1,2]\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addClass", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "childNodeSize", ""}, {"org.jsoup.nodes.Element", "addClass", "java.lang.String", "br"}}), new String[][]{{"after", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addClass", new String[]{"java.lang.String"}, new String[]{"\u00e9\u00e9d"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "children", ""}, {"org.jsoup.nodes.Element", "childNodeSize", ""}, {"org.jsoup.nodes.Element", "addClass", "java.lang.String", "br"}}), new String[][]{{"after", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addClass", new String[]{"java.lang.String"}, new String[]{"\u00e9 L7abc"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "Title", "<null>"}, {"org.jsoup.nodes.Element", "children", ""}}), new String[][]{{"after", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "before", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "prependText", "java.lang.String", "-1.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeClass", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "dataset", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeClass", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "dataset", ""}}), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>a</a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>a</a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeClass", new String[]{"java.lang.String"}, new String[]{"1.12B34567"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "attr", "java.lang.String,boolean", "1", "false"}, {"org.jsoup.nodes.Element", "dataset", ""}}), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>a</a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>a</a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.lang.String", "1.5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.lang.String", "h"}}), new String[][]{{"last", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.lang.String", "01e"}}), new String[][]{{"empty", "", "2"}, {"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "10"}, {"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.lang.String", "01e"}}), new String[][]{{"empty", "", "2"}, {"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.lang.String", "01e+1"}}), new String[][]{{"empty", "", "2"}, {"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.lang.String", "0e+11"}, {"org.jsoup.nodes.Element", "getElementsByIndexLessThan", "int", "2147483647"}}), new String[][]{{"prevAll", "java.lang.String", "2"}, {"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.lang.String", "0e+11"}, {"org.jsoup.nodes.Element", "getElementsByIndexLessThan", "int", "2147483647"}, {"org.jsoup.nodes.Element", "wrap", "java.lang.String", "0"}}), new String[][]{{"prevAll", "java.lang.String", "2"}, {"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasText", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasText", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasText", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasText", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasText", new String[]{}, new String[]{}, false, 15, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "selectFirst", new String[]{"java.lang.String"}, new String[]{"br"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "elementSiblingIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "Pattern syntax error: ", "1.12345678901234567"}, {"org.jsoup.nodes.Element", "getElementsByAttribute", "java.lang.String", "01e+1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getOutputSettings", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getOutputSettings", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getOutputSettings", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "cssSelector", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getOutputSettings", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "cssSelector", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<x \t y></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getOutputSettings", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "cssSelector", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "html", "java.lang.String", "1.12B34567"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}>\n 1.12B34567\n</{\"a\":1}> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "html", "java.lang.String", "1.12B34567"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a>1.12B34567</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "html", "java.lang.String", "1.12B345671.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a>1.12B345671.12345678901234567</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "1.5d", "[1,2]"}, {"org.jsoup.nodes.Element", "html", "java.lang.String", "1.12B345671.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a>1.12B345671.12345678901234567</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "1.5d", "[1,2]"}, {"org.jsoup.nodes.Element", "html", "java.lang.String", "1.12B345671.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}>\n 1.12B345671.12345678901234567\n</{\"a\":1}> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "absUrl", new String[]{"java.lang.String"}, new String[]{" > "}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtmlTail", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "10", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addClass", new String[]{"java.lang.String"}, new String[]{"#root"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "dataNodes", ""}, {"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", "\n"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> class=\"#root\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> class=\"#root\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addClass", new String[]{"java.lang.String"}, new String[]{"#root"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "dataNodes", ""}, {"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", "\n"}}), new String[][]{{"children", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> class=\"#root\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addClass", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "dataNodes", ""}, {"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", "\n"}}), new String[][]{{"children", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> class=\"PT1H\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementById", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "traverse", "org.jsoup.select.NodeVisitor", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementById", new String[]{"java.lang.String"}, new String[]{"ac"}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "traverse", "org.jsoup.select.NodeVisitor", "<sample:7>"}, {"org.jsoup.nodes.Element", "nextElementSibling", ""}, {"org.jsoup.nodes.Element", "html", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" > ", "2020-02-30T25:61:61"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"aaaaaabaaaaaaaaaaaaaaaaaaaaaaa--1"}, false), new String[][]{{"removeAttr", "java.lang.String", "4"}, {"last", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "data", ""}, {"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "320-1-01"}}), new String[][]{{"removeAttr", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<a></a>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Tag", actual.getClass().getName());
  assertEquals("a {canContainBlock=false, getName=a, isBlock=false, isData=false, isEmpty=false, isFormListed=false, isFormSubmittable=false, isInline=true, isKnownTag=true, isSelfClosing=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Tag", actual.getClass().getName());
  assertEquals("0 {canContainBlock=false, getName=0, isBlock=false, isData=false, isEmpty=false, isFormListed=false, isFormSubmittable=false, isInline=true, isKnownTag=false, isSelfClosing=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Tag", actual.getClass().getName());
  assertEquals("sample {canContainBlock=false, getName=sample, isBlock=false, isData=false, isEmpty=false, isFormListed=false, isFormSubmittable=false, isInline=true, isKnownTag=false, isSelfClosing=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Tag", actual.getClass().getName());
  assertEquals("<a><b>t</b></a> {canContainBlock=false, getName=<a><b>t</b></a>, isBlock=false, isData=false, isEmpty=false, isFormListed=false, isFormSubmittable=false, isInline=true, isKnownTag=false, isSelfClosing...#207#466306620", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:0>"}}), new String[][]{{"isKnownTag", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:0>"}}), new String[][]{{"isKnownTag", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:0>"}}), new String[][]{{"isKnownTag", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:0>"}, {"org.jsoup.nodes.Element", "getElementsByIndexLessThan", "int", "2147483647"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:0>"}, {"org.jsoup.nodes.Element", "getElementsByIndexLessThan", "int", "2147483647"}}), new String[][]{{"isKnownTag", "", "5"}, {"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a #comment=\"a\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"10"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"10"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "ensureChildNodes", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"-41"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "ensureChildNodes", ""}, {"org.jsoup.nodes.Element", "after", "java.lang.String", "0"}, {"org.jsoup.nodes.Element", "toggleClass", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> class=\"0\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "ensureChildNodes", ""}, {"org.jsoup.nodes.Element", "after", "java.lang.String", "0"}, {"org.jsoup.nodes.Element", "toggleClass", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample class=\"0\"></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"-2147483647"}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "after", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "after", "java.lang.String", "0"}, {"org.jsoup.nodes.Element", "toggleClass", "java.lang.String", "0"}}), new String[][]{{"retainAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample class=\"0\"></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "insertChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-1", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "doClone", "org.jsoup.nodes.Node", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "insertChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-60", "<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "doClone", "org.jsoup.nodes.Node", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "insertChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-1", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>a</a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>a</a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "insertChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-1", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "insertChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "insertChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"64", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "ownText", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "insertChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "ownText", ""}}), new String[][]{{"getElementsMatchingText", "java.util.regex.Pattern", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<a><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a</a>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "insertChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:4>"}, false), new String[][]{{"getElementsMatchingText", "java.util.regex.Pattern", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<a>a\n <!--a--></a>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>a\n <!--a--></a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "insertChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "64", "<sample:5>"}, {"org.jsoup.nodes.Element", "data", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>a\n <!--a--></a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>a\n <!--a--></a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "insertChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "64", "<sample:5>"}, {"org.jsoup.nodes.Element", "data", ""}}), new String[][]{{"getElementsMatchingText", "java.util.regex.Pattern", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<a><?a?></a>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a><?a?></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>[1,2]</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>[1,2]</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"i"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>i</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>i</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<a></a>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<x \t y></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"cssSelector", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"cssSelector", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "1L"}}), new String[][]{{"cssSelector", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "class", "0E-5"}, {"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "1L"}}), new String[][]{{"getElementsByClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{"java.util.Set"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "{\"a\":1}", "1.12345678901234567"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "ckass", "0E-5"}, {"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "1L"}}), new String[][]{{"getElementsByClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "{\"a\":1}", "12:30:45"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "{\"a\"71}", "12:30:45"}}), new String[][]{{"getElementsByClass", "java.lang.String", "1"}, {"add", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parent", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "previousSibling", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "previousSibling", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "ensureChildNodes", ""}, {"org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", "int", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "ensureChildNodes", ""}, {"org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", "int", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "ensureChildNodes", ""}, {"org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", "int", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "ensureChildNodes", ""}, {"org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", "int", "6"}, {"org.jsoup.nodes.Element", "getAllElements", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", "2020-02-30T25:61:61"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"ckass"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "replaceWith", "org.jsoup.nodes.Node", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "</", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "</", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "</", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "</", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", "int", "-1073741824"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:3>"}, {"org.jsoup.nodes.Element", "appendTo", "org.jsoup.nodes.Element", "<sample:3>"}, {"org.jsoup.nodes.Element", "selectFirst", "java.lang.String", "PT1H"}}), new String[][]{{"prevAll", "java.lang.String", "1"}, {"remove", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a>a</a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.Element", "elementSiblingIndex", ""}, {"org.jsoup.nodes.Element", "appendTo", "org.jsoup.nodes.Element", "<sample:5>"}}), new String[][]{{"add", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "-2147483648", "<sample:0>"}, {"org.jsoup.nodes.Element", "outerHtml", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<1.5e300></1.5e300> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<1.5e300></1.5e300> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{"java.lang.String"}, new String[]{"1.5D"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "-2147483648", "<sample:0>"}, {"org.jsoup.nodes.Element", "outerHtml", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<1.5D></1.5D> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<1.5D></1.5D> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "-2147483648", "<sample:0>"}, {"org.jsoup.nodes.Element", "outerHtml", ""}, {"org.jsoup.nodes.Element", "hasParent", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<http://example.com/a?b=c></http://example.com/a?b=c> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<http://example.com/a?b=c></http://example.com/a?b=c> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "absUrl", new String[]{"java.lang.String"}, new String[]{"1.12B34567"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", "1.5f"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "childNodes", ""}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "<null>", "\t"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"2147483647", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "lastElementSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"#$$1", "01(*0"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Hlllo, Word1E-5", "01\u00e9*0"}, false, 6, new String[][]{}), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Hlfllp, Word1E-5null", "01\u00e9*/ > "}, false, 11, new String[][]{{"org.jsoup.nodes.Element", "getAllElements", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Hlfllp, Word1E-5null", "01\u00e9**/ > "}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "getAllElements", ""}}), new String[][]{{"next", "", "6"}, {"hasText", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "lastElementSibling", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{".", "<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "lastElementSibling", ""}, {"org.jsoup.nodes.Element", "textNodes", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"1", "<null>"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "lastElementSibling", ""}, {"org.jsoup.nodes.Element", "textNodes", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attr", new String[]{"java.lang.String"}, new String[]{".5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasAttributes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasAttributes", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsContainingOwnText", new String[]{"java.lang.String"}, new String[]{"i"}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "select", "java.lang.String", "1.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{"java.util.Set"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a class=\"\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\"\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{"java.util.Set"}, new String[]{"<sample:0>"}, false), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\"\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{"java.util.Set"}, new String[]{"<sample:2>"}, false), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\"0 sample \"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{"java.util.Set"}, new String[]{"<sample:4>"}, false), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\" a\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{"java.util.Set"}, new String[]{"<sample:3>"}, false), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\"sample\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{"java.util.Set"}, new String[]{"<sample:6>"}, false), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\"0\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{"java.lang.String"}, new String[]{"\u00e9\u00e9d"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<\u00e9\u00e9d></\u00e9\u00e9d> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<\u00e9\u00e9d></\u00e9\u00e9d> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{"java.lang.String"}, new String[]{"\u00e9\u00e9d"}, false), new String[][]{{"addClass", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<\u00e9\u00e9d class=\"\"></\u00e9\u00e9d> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<\u00e9\u00e9d class=\"\"></\u00e9\u00e9d> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{"java.lang.String"}, new String[]{"\u00e8\u00e9d"}, false), new String[][]{{"addClass", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<\u00e8\u00e9d class=\"\"></\u00e8\u00e9d> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<\u00e8\u00e9d class=\"\"></\u00e8\u00e9d> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{"java.lang.String"}, new String[]{"5\u00e9d"}, false), new String[][]{{"addClass", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<5\u00e9d class=\"\"></5\u00e9d> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<5\u00e9d class=\"\"></5\u00e9d> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{"java.lang.String"}, new String[]{"5\u00e9e"}, false), new String[][]{{"addClass", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<5\u00e9e class=\"\"></5\u00e9e> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<5\u00e9e class=\"\"></5\u00e9e> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{"java.lang.String"}, new String[]{"5\u00e9f"}, false), new String[][]{{"addClass", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<5\u00e9f class=\"\"></5\u00e9f> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<5\u00e9f class=\"\"></5\u00e9f> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{"java.lang.String"}, new String[]{"%\u00e9f"}, false), new String[][]{{"addClass", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<%\u00e9f class=\"\"></%\u00e9f> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<%\u00e9f class=\"\"></%\u00e9f> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
