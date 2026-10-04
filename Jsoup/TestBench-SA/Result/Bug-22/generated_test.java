package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{" \t"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "\\s+"}, {"org.jsoup.nodes.Element", "data", ""}, {"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", ""}}), new String[][]{{"clone", "", "5"}, {"getElementsByTag", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"> \n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "010"}, {"org.jsoup.nodes.Element", "previousElementSibling", ""}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "abs:", "o\n"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n <010></010>\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5e300", "0x1F"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "removeChild", "org.jsoup.nodes.Node", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "isBlock", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "childNode", "int", "-1"}, {"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "{\"a\":1}"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "id", ""}, {"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "-10", "<sample:0>"}}), new String[][]{{"last", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 17, new String[][]{}, 2), new String[][]{{"before", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.jsoup.nodes.Element", "clone", ""}, {"org.jsoup.nodes.Element", "className", ""}}), new String[][]{{"text", "", "6"}, {"toggleClass", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<a,b\n1,2 text=\"a\" class=\" sample\"></a,b\n1,2>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a,b\n1,2 text=\"a\" class=\" sample\"></a,b\n1,2> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.jsoup.nodes.Element", "appendText", "java.lang.String", "value"}, {"org.jsoup.nodes.Element", "addChildren", "org.jsoup.nodes.Node[]", "<null>"}, {"org.jsoup.nodes.Element", "dataset", ""}}), new String[][]{{"listIterator", "", "7"}, {"hasPrevious", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n value\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "addChildren", "org.jsoup.nodes.Node[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexLessThan", "int", "2147483647"}, {"org.jsoup.nodes.Element", "outerHtml", "java.lang.StringBuilder", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"[1,2]", "Hello, World"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "before", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.Node", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:5>", "<sample:6>"}, {"org.jsoup.nodes.Node", "clone", ""}}), new String[][]{{"attributes", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" [1,2]=\"Hello, World\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", "010"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "1E-5", "i"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 44, new String[][]{{"org.jsoup.nodes.Element", "siblingNodes", ""}, {"org.jsoup.nodes.Element", "prepend", "java.lang.String", "--1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "--1 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "append", new String[]{"java.lang.String"}, new String[]{"n0x12334W679br"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingOwnText", "java.lang.String", ""}, {"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "-1\n.5"}, {"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "-1.5"}}, 1), new String[][]{{"getElementsMatchingText", "java.lang.String", "4"}, {"attr", "java.lang.String", "3"}, {"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n <-1\n.5></-1\n.5>n0x12334W679br\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasClass", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1.1234567890123456"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "Pattern synta error: ", "#text"}, {"org.jsoup.nodes.Element", "absUrl", "java.lang.String", "Pattern synta error: "}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "appendChild", "org.jsoup.nodes.Node", "<sample:7>"}, {"org.jsoup.nodes.Element", "toggleClass", "java.lang.String", ""}, {"org.jsoup.nodes.Element", "textNodes", ""}}), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" class=\"\">\n <!--a-->\n <!--0-->\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"outerHtml", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Element", "before", "java.lang.String", "axabs:"}, {"org.jsoup.nodes.Element", "tag", ""}}), new String[][]{{"before", "java.lang.String", "1"}, {"removeAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "child", "int", "-1"}}, 3), new String[][]{{"hasAttr", "java.lang.String", "1"}, {"before", "java.lang.String", "0"}, {"toggleClass", "java.lang.String", "0"}, {"empty", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 40, new String[][]{{"org.jsoup.nodes.Element", "attributes", ""}, {"org.jsoup.nodes.Element", "hasAttr", "java.lang.String", "++"}, {"org.jsoup.nodes.Element", "outerHtml", ""}}), new String[][]{{"attr", "java.lang.String,java.lang.String", "1"}, {"after", "java.lang.String", "4"}, {"toggleClass", "java.lang.String", "0"}, {"parents", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:4>"}}), new String[][]{{"ownerDocument", "", "6"}, {"previousSibling", "", "2"}, {"removeAttr", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"E[", "1.Ck24w067#Title"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:0>"}, {"org.jsoup.nodes.Node", "before", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.Node", "childNode", "int", "0"}}), new String[][]{{"absUrl", "java.lang.String", "2"}, {"siblingNodes", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[<!DOCTYPE a PUBLIC \"0\" \"sample\">]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"-131072"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "prependText", "java.lang.String", "itm0I5/"}, {"org.jsoup.nodes.Element", "addClass", "java.lang.String", "a b"}, {"org.jsoup.nodes.Element", "wrap", "java.lang.String", ",--5..Patterrn syntax error: I"}}), new String[][]{{"append", "java.lang.String", "4"}, {"addAll", "java.util.Collection", "6"}, {"attr", "java.lang.String,java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"-131072"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "prependText", "java.lang.String", "itm0I5/"}, {"org.jsoup.nodes.Element", "addClass", "java.lang.String", "a b"}, {"org.jsoup.nodes.Element", "wrap", "java.lang.String", ",--5..Pattern syntax error: I"}}, 3), new String[][]{{"append", "java.lang.String", "4"}, {"addAll", "java.util.Collection", "6"}, {"hasText", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" class=\" a b\">\n itm0I5/\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "appendElement", "java.lang.String", ".a/"}, {"org.jsoup.nodes.Element", "dataNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n <.a/></.a/>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{"java.lang.String"}, new String[]{"2E.50"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", ""}, {"org.jsoup.nodes.Element", "prepend", "java.lang.String", "n0x1234W6789"}}, 1), new String[][]{{"hasClass", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n 2E.50\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{"java.lang.String"}, new String[]{"2E.IA500x1234567897"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", "12:30:45"}, {"org.jsoup.nodes.Element", "baseUri", ""}, {"org.jsoup.nodes.Element", "siblingNodes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\">\n 2E.IA500x1234567897\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n 2E.IA500x1234567897\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "attr", "java.lang.String", "20020-0o-001value\\t+\\s+"}}), new String[][]{{"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"+}"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "aa"}, {"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "1s5e30"}, {"org.jsoup.nodes.Element", "outerHtml", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"1+]#txtt-1.\"1.d"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "daa"}, {"org.jsoup.nodes.Element", "dataset", ""}}), new String[][]{{"clone", "", "7"}, {"before", "java.lang.String", "1"}, {"retainAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n <daa></daa>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"o\t"}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "/`/X\"\010PT1H"}, {"org.jsoup.nodes.Element", "elementSiblingIndex", ""}, {"org.jsoup.nodes.Element", "appendText", "java.lang.String", "aaaaaaabaaaaaaaaa`aaaaaaaaaaaa "}}, 1), new String[][]{{"parents", "", "7"}, {"before", "java.lang.String", "1"}, {"indexOf", "java.lang.Object", "6"}, {"text", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\">\n </`/x\"\010pt1h><//`/x\"\010pt1h>aaaaaaabaaaaaaaaa`aaaaaaaaaaaa \n</line1\n\nline3> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{",--5..Oatterrn syntax erro_s: I+1"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "r"}, {"org.jsoup.nodes.Element", "absUrl", "java.lang.String", "A"}, {"org.jsoup.nodes.Element", "appendText", "java.lang.String", ",--5..Oattern syntax erros: Id1"}}, 1), new String[][]{{"parents", "", "7"}, {"before", "java.lang.String", "1"}, {"clear", "", "2"}, {"is", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n <r></r>,--5..Oattern syntax erros: Id1\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "["}, {"org.jsoup.nodes.Element", "absUrl", "java.lang.String", "?@"}, {"org.jsoup.nodes.Element", "appendText", "java.lang.String", ",--5..Oattenssyntax eqros: Id1"}}, 1), new String[][]{{"parents", "", "7"}, {"remove", "java.lang.Object", "5"}, {"size", "", "2"}, {"removeAttr", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<x \t y comment=\"a\">\n <[></[>,--5..Oattenssyntax eqros: Id1\n</x \t y>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n <[></[>,--5..Oattenssyntax eqros: Id1\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "2020-02-30T25:61:61"}, {"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "-1"}, {"org.jsoup.nodes.Element", "tagName", "java.lang.String", "1.12334578901234567"}}), new String[][]{{"parents", "", "5"}, {"remove", "java.lang.Object", "1"}, {"val", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<1.12334578901234567 comment=\"a\">\n <2020-02-30t25:61:61></2020-02-30t25:61:61>\n</1.12334578901234567> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "2020-02-30T25:61:61"}, {"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "-1"}, {"org.jsoup.nodes.Element", "tagName", "java.lang.String", "1.12334578901234567"}}), new String[][]{{"parents", "", "5"}, {"remove", "java.lang.Object", "1"}, {"val", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<1.12334578901234567 comment=\"a\">\n <2020-02-30t25:61:61></2020-02-30t25:61:61>\n</1.12334578901234567> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{".5"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "2C20"}, {"org.jsoup.nodes.Element", "prependText", "java.lang.String", "http://example.co/a?b=c\\s+"}, {"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "-1"}}), new String[][]{{"parents", "", "4"}, {"add", "org.jsoup.nodes.Element", "0"}, {"first", "", "3"}, {"outerHtml", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.1234567"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "<F10x0"}, {"org.jsoup.nodes.Element", "prependText", "java.lang.String", " hf/>"}, {"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "2147483647"}}, 3), new String[][]{{"wrap", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n  hf/&gt;\n <<f10x0></<f10x0>\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{""}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "1?C@texarea"}, {"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "1073741803"}}), new String[][]{{"wrap", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "FA/z"}, {"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "19"}, {"org.jsoup.nodes.Element", "setSiblingIndex", "int", "14"}}), new String[][]{{"addClass", "java.lang.String", "0"}, {"after", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"n0x11\n34W678"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "-5e"}, {"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "-524238"}, {"org.jsoup.nodes.Element", "select", "java.lang.String", "o"}}, 1), new String[][]{{"addClass", "java.lang.String", "0"}, {"remove", "", "6"}, {"add", "int,org.jsoup.nodes.Element", "2"}, {"hasClass", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "i"}, {"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "A"}, {"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "-1"}}, 2), new String[][]{{"hasClass", "java.lang.String", "2"}, {"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "--15"}, {"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "br"}, {"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "7"}}, 2), new String[][]{{"tagName", "java.lang.String", "3"}, {"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "1.5Title1a"}, {"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "br"}, {"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "-67106807"}}), new String[][]{{"prepend", "java.lang.String", "4"}, {"removeClass", "java.lang.String", "4"}, {"append", "java.lang.String", "1"}, {"text", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aa a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" class=\"\">\n <br class=\"\">a</br>a\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "a,b,d"}, {"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "br"}, {"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "67106809"}}, 2), new String[][]{{"prepend", "java.lang.String", "5"}, {"removeClass", "java.lang.String", "4"}, {"append", "java.lang.String", "5"}, {"set", "int,org.jsoup.nodes.Element", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<x \t y comment=\"a\" class=\"\">\n a\n <br class=\"\">aa</br>a\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" class=\"\">\n a\n <br class=\"\">aa</br>a\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "E[t_xtarea"}, {"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "br"}, {"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "-2147483648"}}, 3), new String[][]{{"prepend", "java.lang.String", "5"}, {"empty", "", "5"}, {"append", "java.lang.String", "2"}, {"text", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n 0\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "E[t_xtare"}, {"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "br"}, {"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "2147483647"}}), new String[][]{{"tagName", "java.lang.String", "5"}, {"removeClass", "java.lang.String", "5"}, {"append", "java.lang.String", "2"}, {"text", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("00 0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\" class=\"\"><a class=\"\">0</a>0</a> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "E[t^xtare"}, {"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "br"}, {"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "10"}}), new String[][]{{"listIterator", "int", "5"}, {"nextIndex", "", "6"}, {"previousIndex", "", "7"}, {"hasPrevious", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n <br />\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "br"}, {"org.jsoup.nodes.Element", "appendChild", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "18"}}, 2), new String[][]{{"prepend", "java.lang.String", "2"}, {"removeClass", "java.lang.String", "0"}, {"append", "java.lang.String", "5"}, {"text", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 0a0aa 0a 0a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" class=\"\">\n 0\n <br class=\"\">0a</br>\n <#root class=\"\">\n  0a\n </#root>a\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "p\t"}, {"org.jsoup.nodes.Element", "appendChild", "org.jsoup.nodes.Node", "<sample:4>"}, {"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "536871451"}}), new String[][]{{"prepend", "java.lang.String", "3"}, {"removeClass", "java.lang.String", "0"}, {"append", "java.lang.String", "2"}, {"text", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample sample00 sample0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" class=\"\">\n sample\n <p class=\"\">sample0</p>\n <!--a-->0\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "br"}, {"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "-2147483648"}, {"org.jsoup.nodes.Element", "appendChild", "org.jsoup.nodes.Node", "<sample:10>"}}), new String[][]{{"html", "", "1"}, {"removeClass", "java.lang.String", "6"}, {"traverse", "org.jsoup.select.NodeVisitor", "4"}, {"text", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" class=\"\">\n <br class=\"\" />\n <!--a-->\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "br"}, {"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "-1073741803"}, {"org.jsoup.nodes.Element", "appendChild", "org.jsoup.nodes.Node", "<sample:10>"}}, 1), new String[][]{{"containsAll", "java.util.Collection", "1"}, {"removeClass", "java.lang.String", "4"}, {"traverse", "org.jsoup.select.NodeVisitor", "0"}, {"text", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" class=\"\">\n <br class=\"\" />\n <!--a-->\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsContainingText", new String[]{"java.lang.String"}, new String[]{"p\t"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "setSiblingIndex", "int", "9"}, {"org.jsoup.nodes.Element", "appendChild", "org.jsoup.nodes.Node", "<sample:1>"}}), new String[][]{{"remove", "", "0"}, {"after", "java.lang.String", "4"}, {"addAll", "int,java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">a\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "br"}, {"org.jsoup.nodes.Element", "children", ""}, {"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "-2147483648"}}, 3), new String[][]{{"prepend", "java.lang.String", "1"}, {"html", "java.lang.String", "2"}, {"traverse", "org.jsoup.select.NodeVisitor", "0"}, {"text", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n 0\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "absUrl", "java.lang.String", "abs:"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "appendChild", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "-1.5", "EE\\"}, {"org.jsoup.nodes.Element", "prependText", "java.lang.String", "aha"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n aha\n <#root></#root>\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "abs:"}, {"org.jsoup.nodes.Element", "appendChild", "org.jsoup.nodes.Node", "<sample:1>"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "-295", "EE\\"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\"\">a\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parents", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}, {"org.jsoup.nodes.Element", "addClass", "java.lang.String", "HL9"}, {"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.1234567"}}, 2), new String[][]{{"hasClass", "java.lang.String", "1"}, {"attr", "java.lang.String", "6"}, {"unwrap", "", "3"}, {"html", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" class=\" HL9\">\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\">\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5", "class"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "val", ""}, {"org.jsoup.nodes.Element", "toggleClass", "java.lang.String", "0x1F"}}), new String[][]{{"hasText", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\" 0x1F\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parents", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "#ropt"}, {"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "1075839007"}}, 2), new String[][]{{"val", "java.lang.String", "7"}, {"last", "", "3"}, {"eq", "int", "4"}, {"hasAttr", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"teysarea", "[.5f"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "absUrl", "java.lang.String", " \t"}, {"org.jsoup.nodes.Node", "hashCode", ""}}), new String[][]{{"attr", "java.lang.String", "2"}, {"after", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "absUrl", "java.lang.String", " \t"}, {"org.jsoup.nodes.Node", "hashCode", ""}}), new String[][]{{"attr", "java.lang.String", "2"}, {"after", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 10, new String[][]{{"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:131071>"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "after", "org.jsoup.nodes.Node", "<sample:6>"}, {"org.jsoup.nodes.Node", "unwrap", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "nextElementSibling", ""}, {"org.jsoup.nodes.Element", "val", "java.lang.String", "B"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<line1\n\nline3 comment=\"a\" value=\"B\"></line1\n\nline3>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\" value=\"B\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "empty", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.jsoup.nodes.Element", "getElementsByClass", "java.lang.String", "truf"}, {"org.jsoup.nodes.Element", "textNodes", ""}, {"org.jsoup.nodes.Element", "doClone", "org.jsoup.nodes.Node", "<sample:4>"}}), new String[][]{{"baseUri", "", "3"}, {"html", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a,b\n1,2 text=\"a\">\n 0\n</a,b\n1,2> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a,b\n1,2 text=\"a\">\n 0\n</a,b\n1,2> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", "0?C@teLa", ",--5..Patterrn syntax error: I"}, {"org.jsoup.nodes.Element", "getElementsByAttribute", "java.lang.String", "+1"}}, 1), new String[][]{{"html", "", "6"}, {"clear", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "appendText", "java.lang.String", "ab"}}), new String[][]{{"listIterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n ab\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.Element", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "2147483647", "<sample:0>"}}), new String[][]{{"not", "java.lang.String", "1"}, {"lastIndexOf", "java.lang.Object", "6"}, {"first", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a\nb comment=\"a\"></a\nb> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{"java.lang.String"}, new String[]{"11I."}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "1.Ck24w067Title"}}), new String[][]{{"appendElement", "java.lang.String", "1"}, {"before", "org.jsoup.nodes.Node", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" class=\"\">\n 11I.\n <!--a-->\n <a></a>\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "unwrap", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.nodes.Node", "attributes", ""}, {"org.jsoup.nodes.Node", "setParentNode", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.Node", "replaceWith", "org.jsoup.nodes.Node", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "childNodesAsArray", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "data", ""}, {"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", "5."}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\"> \n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"> \n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "data", ""}, {"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", "5."}, {"org.jsoup.nodes.Element", "val", "java.lang.String", "<8"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\" value=\"&lt;8\"> \n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" value=\"&lt;8\"> \n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "data", ""}, {"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", "5."}, {"org.jsoup.nodes.Element", "val", "java.lang.String", "<8"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "data", ""}, {"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", "5."}}, 1), new String[][]{{"outerHtml", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\"> \n</{\"a\":1}>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"> \n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"o\t"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "data", ""}, {"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", "5."}}, 1), new String[][]{{"outerHtml", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\">\n o \n</{\"a\":1}>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n o \n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"o\t"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "data", ""}, {"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", "5."}}, 1), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\">\n o \n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n o \n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{" _"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "data", ""}, {"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", "5."}}, 1), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\">\n  _\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n  _\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{" \t"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "data", ""}, {"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", ""}}, 1), new String[][]{{"clone", "", "5"}, {"getElementsByTag", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"> \n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"TI\u00e9TLD"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "\\s+"}, {"org.jsoup.nodes.Element", "data", ""}, {"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", "o"}}, 3), new String[][]{{"clone", "", "5"}, {"getElementsByTag", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n TI&eacute;TLD\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "\\s+"}, {"org.jsoup.nodes.Element", "data", ""}, {"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", ""}}, 3), new String[][]{{"clone", "", "5"}, {"getElementsByTag", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n 1.1234567\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"1.1234577"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "\\s+"}, {"org.jsoup.nodes.Element", "data", ""}, {"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", ""}}, 3), new String[][]{{"clone", "", "5"}, {"getElementsByTag", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n 1.1234577\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"1.1234"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "\\s+"}, {"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", ""}}, 3), new String[][]{{"clone", "", "5"}, {"getElementsByTag", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n 1.1234\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"1.12341"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "\\s+"}, {"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", ""}}, 3), new String[][]{{"clone", "", "5"}, {"getElementsByTag", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n 1.12341\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"teytarea"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "\\s+"}, {"org.jsoup.nodes.Element", "siblingElements", ""}, {"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", ""}}, 3), new String[][]{{"clone", "", "5"}, {"getElementsByTag", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n teytarea\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"teytarea"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "\\s+"}, {"org.jsoup.nodes.Element", "siblingElements", ""}, {"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", ""}}, 3), new String[][]{{"clone", "", "5"}, {"getElementsByTag", "java.lang.String", "5"}, {"get", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeName", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.Element", "previousElementSibling", ""}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "abs:", "o\n"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeName", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.util.regex.Pattern", "<null>"}, {"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "010"}, {"org.jsoup.nodes.Element", "getElementsByAttribute", "java.lang.String", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n <010></010>\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeName", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.util.regex.Pattern", "<null>"}, {"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "011"}, {"org.jsoup.nodes.Element", "getElementsByAttribute", "java.lang.String", "-1TITLE"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n <011></011>\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeName", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.util.regex.Pattern", "<null>"}, {"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "P11"}, {"org.jsoup.nodes.Element", "getElementsByAttribute", "java.lang.String", "-1TITLE"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n <p11></p11>\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"1", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeName", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.util.regex.Pattern", "<null>"}, {"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "P21"}, {"org.jsoup.nodes.Element", "getElementsByAttribute", "java.lang.String", "-1TITLE"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n <p21></p21>\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeName", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.util.regex.Pattern", "<null>"}, {"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "P21"}, {"org.jsoup.nodes.Element", "getElementsByAttribute", "java.lang.String", "-1TITLE"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("line1\n\nline3", String.valueOf(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\">\n <p21></p21>\n</line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"I", "Pattern syntax error: "}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "firstElementSibling", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"I", "Pattern syntax error: "}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "firstElementSibling", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1.5dbr"}, false, 10, new String[][]{{"org.jsoup.nodes.Element", "firstElementSibling", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", ";brI"}, {"org.jsoup.nodes.Element", "after", "java.lang.String", "5."}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", ";brI"}, {"org.jsoup.nodes.Element", "after", "java.lang.String", "5."}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "doClone", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", ";brI"}, {"org.jsoup.nodes.Element", "after", "java.lang.String", "5."}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"0\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"sample\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "preserveWhitespace", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "baseUri", ""}, {"org.jsoup.nodes.Element", "hasText", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "preserveWhitespace", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "baseUri", ""}, {"org.jsoup.nodes.Element", "hasText", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "-1", "<sample:5>"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingOwnText", "java.lang.String", "{\"a\":1}"}, {"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "addClass", "java.lang.String", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "addClass", "java.lang.String", "</"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" class=\" &lt;/\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "addClass", "java.lang.String", "</"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" class=\" &lt;/\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "addClass", "java.lang.String", "TITLE"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" class=\" TITLE\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Element", "before", "java.lang.String", "1.5f"}, {"org.jsoup.nodes.Element", "children", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "before", "java.lang.String", "1.5f"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a comment=\"a\"></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.Element", "before", "java.lang.String", "1-/4f"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a\nb comment=\"a\"></a\nb> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jsoup.nodes.Element", "before", "java.lang.String", "1-/4f"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a\r\nb comment=\"a\"></a\r\nb> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.jsoup.nodes.Element", "before", "java.lang.String", "1-/4f"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a\rb comment=\"a\"></a\rb> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.jsoup.nodes.Element", "ownerDocument", ""}, {"org.jsoup.nodes.Element", "previousSibling", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a,b\n1,2 text=\"a\"></a,b\n1,2> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.Element", "after", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.Element", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}, {"org.jsoup.nodes.Element", "children", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a\nb comment=\"a\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a\n</a\nb> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "isBlock", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "isBlock", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "childNode", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "isBlock", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "childNode", "int", "-1"}, {"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "{\"\"a\":1}1.12345678901234567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "isBlock", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "childNode", "int", "-1"}, {"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "{\"\"a\":1}1.12345678901234567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "10", "<sample:6>"}, {"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "\u00e9"}, {"org.jsoup.nodes.Element", "appendChild", "org.jsoup.nodes.Node", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "-10", "<sample:0>"}, {"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "\u00e9"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<{\"a\":1} comment=\"a\" class=\"\"></{\"a\":1}>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" class=\"\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "-10", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<{\"a\":1} comment=\"a\"></{\"a\":1}>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "before", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "-10", "<sample:0>"}}, 1), new String[][]{{"addAll", "int,java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "before", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.Element", "id", ""}, {"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "-10", "<sample:0>"}}, 1), new String[][]{{"addAll", "int,java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "0x123456789"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "0x133456789"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 23, new String[][]{}, 2), new String[][]{{"text", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a\rb comment=\"a\"></a\rb> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.jsoup.nodes.Element", "clone", ""}, {"org.jsoup.nodes.Element", "className", ""}}, 1), new String[][]{{"text", "", "6"}, {"toggleClass", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<a,b\n1,2 text=\"a\" class=\" sample\"></a,b\n1,2>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a,b\n1,2 text=\"a\" class=\" sample\"></a,b\n1,2> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.jsoup.nodes.Element", "clone", ""}, {"org.jsoup.nodes.Element", "className", ""}, {"org.jsoup.nodes.Element", "appendText", "java.lang.String", "value"}}, 1), new String[][]{{"text", "", "6"}, {"toggleClass", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<a,b\n1,2 text=\"a\" class=\" sample\">\n value\n</a,b\n1,2>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a,b\n1,2 text=\"a\" class=\" sample\">\n value\n</a,b\n1,2> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.jsoup.nodes.Element", "clone", ""}, {"org.jsoup.nodes.Element", "className", ""}, {"org.jsoup.nodes.Element", "appendText", "java.lang.String", "value"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.jsoup.nodes.Element", "clone", ""}, {"org.jsoup.nodes.Element", "appendText", "java.lang.String", "value"}}, 1), new String[][]{{"text", "", "6"}, {"toggleClass", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<<a><b>t</b></a> comment=\"a\" class=\" sample\">\n value\n</<a><b>t</b></a>>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\" sample\">\n value\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.jsoup.nodes.Element", "appendText", "java.lang.String", "value"}, {"org.jsoup.nodes.Element", "childNodesAsArray", ""}, {"org.jsoup.nodes.Element", "addChildren", "org.jsoup.nodes.Node[]", "<empty>"}}, 2), new String[][]{{"listIterator", "", "7"}, {"hasPrevious", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n value\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "select", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:E7_aC>"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "setSiblingIndex", "int", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Node", "siblingNodes", ""}, {"org.jsoup.nodes.Node", "nextSibling", ""}, {"org.jsoup.nodes.Node", "siblingIndex", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Node", "siblingNodes", ""}, {"org.jsoup.nodes.Node", "nextSibling", ""}, {"org.jsoup.nodes.Node", "siblingIndex", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.Node", "siblingNodes", ""}, {"org.jsoup.nodes.Node", "nextSibling", ""}, {"org.jsoup.nodes.Node", "siblingIndex", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "val", "java.lang.String", "o\n"}, {"org.jsoup.nodes.Element", "doClone", "org.jsoup.nodes.Node", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<x \t y comment=\"a\" value=\"\n\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" value=\"\n\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "val", "java.lang.String", "o\n"}, {"org.jsoup.nodes.Element", "doClone", "org.jsoup.nodes.Node", "<sample:0>"}}, 3), new String[][]{{"hasText", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" value=\"\n\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "attr", "java.lang.String", "1E-5"}, {"org.jsoup.nodes.Element", "val", "java.lang.String", "o\n"}, {"org.jsoup.nodes.Element", "doClone", "org.jsoup.nodes.Node", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "before", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaadaaaaaaaaaaaaaaaa+1"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "previousSibling", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:10>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"i", "Title"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "itmeH"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "abc", "0x1F"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<8", "itmeH"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "ab", "0x1F"}, {"org.jsoup.nodes.Element", "classNames", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{">"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "attributes", ""}, {"org.jsoup.nodes.Element", "data", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\">\n &gt;\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n &gt;\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"?"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "attributes", ""}, {"org.jsoup.nodes.Element", "data", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\">\n ?\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n ?\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"C"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "attributes", ""}, {"org.jsoup.nodes.Element", "data", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\">\n C\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n C\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"n"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "attributes", ""}, {"org.jsoup.nodes.Element", "data", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\">\n n\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n n\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"n"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "attributes", ""}, {"org.jsoup.nodes.Element", "data", ""}}), new String[][]{{"getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{" /="}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "data", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\">\n  /=\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n  /=\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"n0x1234W6789"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "data", ""}, {"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", "5."}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\">\n n0x1234W6789\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n n0x1234W6789\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "data", ""}, {"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", "5."}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\"> \n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"> \n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "data", ""}, {"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", "5."}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "1L", "</"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{" \t"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "data", ""}, {"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", ""}}), new String[][]{{"clone", "", "5"}, {"getElementsByTag", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"> \n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String"}, new String[]{"n0x1234W6789"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "equals", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "wrap", new String[]{"java.lang.String"}, new String[]{"1e10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "wrap", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingOwnText", "java.lang.String", "1.1234567"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeName", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeName", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeName", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("line1\n\nline3", String.valueOf(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeName", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeName", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "abs:", "o\t"}, {"org.jsoup.nodes.Element", "outerHtml", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeName", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Element", "previousElementSibling", ""}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "abs:", "o\t"}, {"org.jsoup.nodes.Element", "outerHtml", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeName", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.Element", "previousElementSibling", ""}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "abs:", "o\t"}, {"org.jsoup.nodes.Element", "outerHtml", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "010"}, {"org.jsoup.nodes.Element", "getElementsByAttribute", "java.lang.String", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeName", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.util.regex.Pattern", "<null>"}, {"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "010"}, {"org.jsoup.nodes.Element", "getElementsByAttribute", "java.lang.String", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n <010></010>\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "remove", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "hasAttr", "java.lang.String", "+1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"I", "Pattern syntax error: "}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "firstElementSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", "br"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", ";brI"}, {"org.jsoup.nodes.Element", "after", "java.lang.String", "5."}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", ";brI"}, {"org.jsoup.nodes.Element", "after", "java.lang.String", "5."}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "attr", "java.lang.String", "{\"a\":1}"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "getAllElements", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "before", "org.jsoup.nodes.Node", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "baseUri", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5e300", "0x1F"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "preserveWhitespace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "hasText", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "preserveWhitespace", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "baseUri", ""}, {"org.jsoup.nodes.Element", "hasText", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "1", "<sample:7>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingOwnText", "java.lang.String", "{\"a\":1}"}, {"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "addClass", "java.lang.String", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "addClass", "java.lang.String", "TITLE"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\" class=\" TITLE\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Element", "addClass", "java.lang.String", "TITLE"}, {"org.jsoup.nodes.Element", "children", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownerDocument", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "before", "java.lang.String", "1.5f"}, {"org.jsoup.nodes.Element", "children", ""}, {"org.jsoup.nodes.Element", "children", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "before", "java.lang.String", "1.5f"}, {"org.jsoup.nodes.Element", "children", ""}, {"org.jsoup.nodes.Element", "children", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "1", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.Element", "after", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.Element", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a\nb comment=\"a\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a\n</a\nb> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.Element", "after", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.Element", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}, {"org.jsoup.nodes.Element", "children", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a\nb comment=\"a\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a\n</a\nb> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{"java.util.Set"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "isBlock", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "childNode", "int", "-1"}, {"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "{\"\"a\":1}1.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "isBlock", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "childNode", "int", "-1"}, {"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "{\"\"a\":1~1.12345678901234567"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "tagName", "java.lang.String", "http://example.com/a?b=c"}, {"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "PT1H"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "after", new String[]{"java.lang.String"}, new String[]{""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "id", ""}, {"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "-10", "<sample:0>"}}), new String[][]{{"addAll", "int,java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "tagName", "java.lang.String", "Hello, World"}, {"org.jsoup.nodes.Element", "id", ""}, {"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "-10", "<sample:0>"}}), new String[][]{{"last", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<hello, world comment=\"a\"></hello, world> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<hello, world comment=\"a\"></hello, world> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "0x123456789"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "10", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "childNode", new String[]{"int"}, new String[]{"2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.jsoup.nodes.Element", "clone", ""}, {"org.jsoup.nodes.Element", "className", ""}, {"org.jsoup.nodes.Element", "ownText", ""}}), new String[][]{{"text", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a\rb comment=\"a\"></a\rb> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.jsoup.nodes.Element", "clone", ""}, {"org.jsoup.nodes.Element", "className", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "lastElementSibling", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.jsoup.nodes.Element", "clone", ""}, {"org.jsoup.nodes.Element", "appendText", "java.lang.String", "value"}}), new String[][]{{"text", "", "6"}, {"toggleClass", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<<a><b>t</b></a> comment=\"a\" class=\" sample\">\n value\n</<a><b>t</b></a>>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\" sample\">\n value\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.jsoup.nodes.Element", "clone", ""}, {"org.jsoup.nodes.Element", "appendText", "java.lang.String", "value"}}), new String[][]{{"text", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("value", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n value\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"-10"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "2147483647", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.jsoup.nodes.Element", "clone", ""}, {"org.jsoup.nodes.Element", "appendText", "java.lang.String", "value"}, {"org.jsoup.nodes.Element", "toString", ""}}), new String[][]{{"listIterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n value\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.jsoup.nodes.Element", "clone", ""}, {"org.jsoup.nodes.Element", "appendText", "java.lang.String", "value"}, {"org.jsoup.nodes.Element", "toString", ""}}), new String[][]{{"listIterator", "", "6"}, {"set", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.jsoup.nodes.Element", "appendText", "java.lang.String", "value"}, {"org.jsoup.nodes.Element", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}}), new String[][]{{"listIterator", "", "7"}, {"hasPrevious", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n value\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\">\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.jsoup.nodes.Element", "appendText", "java.lang.String", "value"}, {"org.jsoup.nodes.Element", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}}), new String[][]{{"listIterator", "", "7"}, {"hasPrevious", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n valuea\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "nodeName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#comment", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", "java.lang.StringBuilder", "<empty>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 33, new String[][]{{"org.jsoup.nodes.Element", "appendText", "java.lang.String", "value"}, {"org.jsoup.nodes.Element", "childNodesAsArray", ""}, {"org.jsoup.nodes.Element", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}}), new String[][]{{"is", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"abs:", "PT1H"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "tagName", ""}, {"org.jsoup.nodes.Element", "attr", "java.lang.String", "abc"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jsoup.nodes.Node", "unwrap", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"value", "itmeH"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", " ", "010"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:E7_aC>"}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "setSiblingIndex", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "elementSiblingIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "elementSiblingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "toggleClass", "java.lang.String", "o\n"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\" o\n\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "elementSiblingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "elementSiblingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "absUrl", "java.lang.String", "5."}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "elementSiblingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "[1,2]", "<sample:3>"}, {"org.jsoup.nodes.Element", "absUrl", "java.lang.String", "5."}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "elementSiblingIndex", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "[1,2]", "<sample:3>"}, {"org.jsoup.nodes.Element", "absUrl", "java.lang.String", "5."}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "previousSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "wrap", "java.lang.String", "\n"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "wrap", "java.lang.String", "\n"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"0\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "wrap", "java.lang.String", "\n"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"sample\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "-10", "<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttribute", "java.lang.String", "<null>"}, {"org.jsoup.nodes.Element", "nextSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "wrap", "java.lang.String", "1L"}, {"org.jsoup.nodes.Element", "attr", "java.lang.String", " \t"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "wrap", "java.lang.String", "0L"}, {"org.jsoup.nodes.Element", "attr", "java.lang.String", " \t"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "wrap", "java.lang.String", "\\s+"}, {"org.jsoup.nodes.Element", "attr", "java.lang.String", " \t"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexLessThan", "int", "2147483647"}, {"org.jsoup.nodes.Element", "outerHtml", "java.lang.StringBuilder", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexLessThan", "int", "2147483647"}, {"org.jsoup.nodes.Element", "outerHtml", "java.lang.StringBuilder", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "siblingNodes", ""}, {"org.jsoup.nodes.Node", "siblingIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "siblingNodes", ""}, {"org.jsoup.nodes.Node", "siblingIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Node", "unwrap", ""}, {"org.jsoup.nodes.Node", "siblingNodes", ""}, {"org.jsoup.nodes.Node", "siblingIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "prependText", "java.lang.String", "0x123456789"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "val", "java.lang.String", "o\n"}, {"org.jsoup.nodes.Element", "doClone", "org.jsoup.nodes.Node", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<x \t y comment=\"a\" value=\"\n\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" value=\"\n\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNode", new String[]{"int"}, new String[]{"-10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "attr", "java.lang.String", "teytarea010"}, {"org.jsoup.nodes.Element", "val", "java.lang.String", "o\na,a,c"}, {"org.jsoup.nodes.Element", "doClone", "org.jsoup.nodes.Node", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "firstElementSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "setParentNode", "org.jsoup.nodes.Node", "<sample:10>"}, {"org.jsoup.nodes.Element", "firstElementSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "baseUri", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "wrap", "java.lang.String", "0x123456789"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeClass", new String[]{"java.lang.String"}, new String[]{"abs:"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeClass", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaa`aaaaaaaaaaaa"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "textNodes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeClass", new String[]{"java.lang.String"}, new String[]{"aaaaaaa]aaaaaaa`aaaaaaaaaaaa"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", "Titud"}, {"org.jsoup.nodes.Element", "textNodes", ""}, {"org.jsoup.nodes.Element", "dataNodes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependElement", new String[]{"java.lang.String"}, new String[]{"o\n"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:5>"}, false), new String[][]{{"absUrl", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:10>"}, false, 7, new String[][]{}), new String[][]{{"absUrl", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!----> {getData=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "before", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "before", new String[]{"java.lang.String"}, new String[]{"aaaaaaa]aaaaaaa`aaaaaaaaaaaa"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "before", new String[]{"java.lang.String"}, new String[]{"aaaaaaa]aaaaaaa`aaaaaaaaaaaa"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "Pattern synta error: "}, {"org.jsoup.nodes.Element", "parents", ""}, {"org.jsoup.nodes.Element", "outerHtml", "java.lang.StringBuilder", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "Pattern synta error: "}, {"org.jsoup.nodes.Element", "parents", ""}, {"org.jsoup.nodes.Element", "outerHtml", "java.lang.StringBuilder", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1084908770", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\"\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "parents", ""}, {"org.jsoup.nodes.Element", "outerHtml", "java.lang.StringBuilder", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("347744782", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "absUrl", new String[]{"java.lang.String"}, new String[]{"Pattern syntax error: "}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "Pattesn synta error: "}, {"org.jsoup.nodes.Element", "parents", ""}, {"org.jsoup.nodes.Element", "outerHtml", "java.lang.StringBuilder", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1270282828", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" class=\"\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "Pattesn synta error: "}, {"org.jsoup.nodes.Element", "parents", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-832567880", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" class=\"\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "Pattesn synta error: 5."}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1199429167", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\" class=\"\"></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "Pattesn synta error: 5."}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2091284889", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a\nb comment=\"a\" class=\"\"></a\nb> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", ""}, {"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "Pattesn synta error: 5."}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1087039858", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a\r\nb comment=\"a\" class=\"\"></a\r\nb> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 21, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("345613694", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a\r\nb comment=\"a\"></a\r\nb> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 23, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1898424948", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a\rb comment=\"a\"></a\rb> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 25, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1376826974", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a,b\n1,2 text=\"a\"></a,b\n1,2> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("162370724", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "dataNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("162370724", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", ""}, {"org.jsoup.nodes.Element", "dataNodes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("162370724", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", ""}, {"org.jsoup.nodes.Element", "dataNodes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", ""}, {"org.jsoup.nodes.Element", "dataNodes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("600085672", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", ""}, {"org.jsoup.nodes.Element", "elementSiblingIndex", ""}, {"org.jsoup.nodes.Element", "dataNodes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1903593984", String.valueOf(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "elementSiblingIndex", ""}, {"org.jsoup.nodes.Element", "dataNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("600085672", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "prependText", "java.lang.String", "PT1H"}, {"org.jsoup.nodes.Element", "elementSiblingIndex", ""}, {"org.jsoup.nodes.Element", "dataNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("600085672", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n PT1H\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "prependText", "java.lang.String", "PT1H"}, {"org.jsoup.nodes.Element", "elementSiblingIndex", ""}, {"org.jsoup.nodes.Element", "dataNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1903593984", String.valueOf(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\">\n PT1H\n</line1\n\nline3> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "child", new String[]{"int"}, new String[]{"-1"}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "hasClass", "java.lang.String", " />"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{"java.lang.String"}, new String[]{"o\n"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"[1,2]", "Hello, World"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "before", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.Node", "clone", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"[1,2]", "Hello, World"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "before", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.Node", "clone", ""}}), new String[][]{{"attributes", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" comment=\"a\" [1,2]=\"Hello, World\" {size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"[1#,2s", "Helo- World"}, false, 0, new String[][]{{"org.jsoup.nodes.Node", "before", "org.jsoup.nodes.Node", "<sample:6>"}, {"org.jsoup.nodes.Node", "clone", ""}}), new String[][]{{"absUrl", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--a--> {getData=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"[1-1s", "Title"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "clone", ""}, {"org.jsoup.nodes.Node", "unwrap", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Comment", actual.getClass().getName());
  assertEquals("\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"[1-1s", "Title"}, false, 1, new String[][]{{"org.jsoup.nodes.Node", "clone", ""}, {"org.jsoup.nodes.Node", "unwrap", ""}}), new String[][]{{"baseUri", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--0--> {getData=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Node", "org.jsoup.nodes.Comment", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaa`aaaaaaaaaaaa", "Sile"}, false, 2, new String[][]{{"org.jsoup.nodes.Node", "traverse", "org.jsoup.select.NodeVisitor", "<sample:1>"}, {"org.jsoup.nodes.Node", "clone", ""}, {"org.jsoup.nodes.Node", "unwrap", ""}}), new String[][]{{"baseUri", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n<!--sample--> {getData=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "replaceWith", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "5.1."}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasAttr", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
