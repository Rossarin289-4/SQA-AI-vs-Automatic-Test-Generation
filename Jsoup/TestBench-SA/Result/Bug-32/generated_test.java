package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "classNames", ""}, {"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "firstElementSibling", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", "1.5f", "<a>b</a>"}, {"org.jsoup.nodes.Element", "val", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "0x1F", "12:30:44"}, {"org.jsoup.nodes.Element", "getElementsByClass", "java.lang.String", "1.5"}, {"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.lang.String", "true"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextElementSibling", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "setParentNode", "org.jsoup.nodes.Node", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"Pattern syntax error: "}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsByClass", "java.lang.String", "12:30:44"}, {"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "-1", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\">\n Pattern syntax error: \n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n Pattern syntax error: \n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataNodes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "equals", "java.lang.Object", "<b:true>"}, {"org.jsoup.nodes.Element", "attributes", ""}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "</1E-5", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "childNode", "int", "-10"}, {"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "ldaB "}, {"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "0xFFFFFFFF"}}, 3), new String[][]{{"classNames", "java.util.Set", "7"}, {"appendChild", "org.jsoup.nodes.Node", "1"}, {"getElementsMatchingOwnText", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\"sample \">\n <ldab></ldab>a\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{"0xFFFEFGFF-0.0 Pattern synuax error: 1e10"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "ldabB "}, {"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "1<.5e300"}, {"org.jsoup.nodes.Element", "toString", ""}}, 3), new String[][]{{"addClass", "java.lang.String", "5"}, {"appendChild", "org.jsoup.nodes.Node", "5"}, {"getElementsMatchingOwnText", "java.lang.String", "5"}, {"html", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<ldabb></ldabb>a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\" 0xFFFEFGFF-0.0 Pattern synuax error: 1e10 a\">\n <ldabb></ldabb>a\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{"20E-/1-02"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "lddbB "}, {"org.jsoup.nodes.Element", "parents", ""}}, 3), new String[][]{{"addClass", "java.lang.String", "5"}, {"appendChild", "org.jsoup.nodes.Node", "5"}, {"data", "", "6"}, {"getElementsByClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<{\"a\":1} comment=\"a\" class=\" 20E-/1-02 a\">\n <lddbb></lddbb>a\n</{\"a\":1}>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" class=\" 20E-/1-02 a\">\n <lddbb></lddbb>a\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "select", "java.lang.String", "1.12345678901234567"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "class", "br"}, {"org.jsoup.nodes.Element", "attr", "java.lang.String,java.lang.String", "Pattern syntaxx error: ", "F"}}), new String[][]{{"append", "java.lang.String", "4"}, {"appendChild", "org.jsoup.nodes.Node", "5"}, {"data", "", "6"}, {"getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\" pattern syntaxx error:=\"F\" class=\" 0x1F\">\n a\n</line1\n\nline3> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "icX"}, {"org.jsoup.nodes.Element", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}}), new String[][]{{"append", "java.lang.String", "6"}, {"appendChild", "org.jsoup.nodes.Node", "5"}, {"data", "", "6"}, {"dataNodes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\" 1e10\">\n <icx></icx>\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\">0a\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{" "}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}}), new String[][]{{"append", "java.lang.String", "6"}, {"appendChild", "org.jsoup.nodes.Node", "4"}, {"data", "", "7"}, {"dataNodes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\"  \">a0\n <!--a-->\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{"bTi9t5le"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "parent", ""}, {"org.jsoup.nodes.Element", "getElementsByTag", "java.lang.String", "trru/"}, {"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "aa"}}, 3), new String[][]{{"html", "", "4"}, {"elementSiblingIndex", "", "6"}, {"getElementsMatchingText", "java.util.regex.Pattern", "0"}, {"append", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<x \t y comment=\"a\" class=\" bTi9t5le\">\n <aa>\n  a\n </aa>a\n</x \t y>, <aa>\n a\n</aa>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" class=\" bTi9t5le\">\n <aa>\n  a\n </aa>a\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "a"}, {"org.jsoup.nodes.Element", "wrap", "java.lang.String", "l.ddB "}}), new String[][]{{"appendElement", "java.lang.String", "3"}, {"elementSiblingIndex", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" class=\"\">\n <a></a>\n <sample></sample>\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{" .F>-0.0"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "html", "java.lang.String", "b/c{\"2020-01-01"}, {"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "-0/cr"}, {"org.jsoup.nodes.Element", "tagName", "java.lang.String", "0aCb1"}}, 1), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "1"}, {"getElementsContainingText", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<0acb1 comment=\"a\" class=\"  .F&gt;-0.0\">\n <-0/cr></-0/cr>b/c{&quot;2020-01-01a\n</0acb1>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0acb1 comment=\"a\" class=\"  .F&gt;-0.0\">\n <-0/cr></-0/cr>b/c{&quot;2020-01-01a\n</0acb1> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "lastElementSibling", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "j", "{\"a\":1}"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "br"}, {"org.jsoup.nodes.Element", "append", "java.lang.String", "#r-0.0"}, {"org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", "int", "0"}}), new String[][]{{"getElementsMatchingOwnText", "java.lang.String", "0"}, {"val", "java.lang.String", "2"}, {"parents", "", "6"}, {"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<{\"a\":1} comment=\"a\" class=\"\" value=\"0\">\n <br value=\"0\" />#r-0.0\n</{\"a\":1}>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" class=\"\" value=\"0\">\n <br value=\"0\" />#r-0.0\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.util.regex.Pattern", "<sample:5>"}}, 1), new String[][]{{"last", "", "6"}, {"appendText", "java.lang.String", "0"}, {"getElementsByAttributeStarting", "java.lang.String", "1"}, {"add", "org.jsoup.nodes.Element", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"<a>b</a="}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "html", "java.lang.String", "010"}, {"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.util.regex.Pattern", "<sample:1>"}, {"org.jsoup.nodes.Element", "prepend", "java.lang.String", "1.5fHel>lo, World"}}), new String[][]{{"attr", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n 1.5fHel&gt;lo, World010\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", "java.lang.StringBuilder", "<sample:2>"}, {"org.jsoup.nodes.Element", "childNodesCopy", ""}, {"org.jsoup.nodes.Element", "html", "java.lang.String", "1.55fHel>lo,, Vorld1.4d"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a comment=\"a\">1.55fHel&gt;lo,, Vorld1.4d</a> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeClass", new String[]{"java.lang.String"}, new String[]{"1225567890123466789012345567890"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "20", "<sample:1>"}, {"org.jsoup.nodes.Element", "text", "java.lang.String", "1.5fHel>lo, World"}, {"org.jsoup.nodes.Element", "val", "java.lang.String", "022:30::44"}}), new String[][]{{"dataset", "", "3"}, {"values", "", "5"}, {"add", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeClass", new String[]{"java.lang.String"}, new String[]{"h"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "-10", "<sample:6>"}, {"org.jsoup.nodes.Element", "text", "java.lang.String", ""}, {"org.jsoup.nodes.Element", "val", "java.lang.String", "PT1G"}}, 1), new String[][]{{"getElementById", "java.lang.String", "1"}, {"getElementsByClass", "java.lang.String", "2"}, {"add", "org.jsoup.nodes.Element", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" value=\"PT1G\" class=\"\">\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "#r-0.0"}, {"org.jsoup.nodes.Element", "textNodes", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n <#r-0.0></#r-0.0>\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "12:30:44\n", "ldaB "}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexLessThan", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "textNodes", ""}, {"org.jsoup.nodes.Element", "getElementsByAttribute", "java.lang.String", "a,b,c"}, {"org.jsoup.nodes.Element", "after", "org.jsoup.nodes.Node", "<sample:4>"}}), new String[][]{{"append", "java.lang.String", "2"}, {"text", "", "4"}, {"tagName", "java.lang.String", "1"}, {"hasText", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\">0</a> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsContainingText", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "html", "java.lang.String", "kHellh, Workd"}, {"org.jsoup.nodes.Element", "appendElement", "java.lang.String", " .F>-0.0"}}, 2), new String[][]{{"unwrap", "", "0"}, {"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n kHellh, Workd\n <.f>-0.0></.f>-0.0>\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendElement", new String[]{"java.lang.String"}, new String[]{"v/"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", ""}, {"org.jsoup.nodes.Element", "outerHtml", "java.lang.StringBuilder", "<sample:2>"}}), new String[][]{{"before", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<v/></v/> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n a\n <v/></v/>\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendElement", new String[]{"java.lang.String"}, new String[]{"1.1224\n-0.0"}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "ownerDocument", ""}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "kHellh, Workd0xFFFFFFFF", "\037"}}, 2), new String[][]{{"hasText", "", "5"}, {"getElementsByIndexEquals", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\">\n <1.1224\n-0.0></1.1224\n-0.0>\n</line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"v9lt\"5."}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingOwnText", "java.lang.String", "Ax123456789"}, {"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.lang.String", "<>b<3[a="}}, 2), new String[][]{{"subList", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "previousElementSibling", ""}, {"org.jsoup.nodes.Element", "html", "java.lang.String", "1.5e300"}, {"org.jsoup.nodes.Element", "prependText", "java.lang.String", "s/"}}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n s/1.5e300\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "className", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "uITL", ".5"}, {"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "TITLE"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\"><title></title></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attr", new String[]{"java.lang.String"}, new String[]{"+\nab>"}, false, 12, new String[][]{{"org.jsoup.nodes.Element", "setParentNode", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.Element", "prependElement", "java.lang.String", ".5"}, {"org.jsoup.nodes.Element", "previousElementSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"\u00e9{T"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "vLqruue"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30:45", "1.123456789123456"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30:45", "1.1234567891234561E-5"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30:44", "1.23456789123451E-50x1F5."}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "0x1F"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1.5f"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1.5f"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Element", "childNodesAsArray", ""}, {"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1.5fHel>lo, World"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Element", "childNodesAsArray", ""}, {"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1.5fHel>lo, World"}, {"org.jsoup.nodes.Element", "getElementsByAttribute", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousSibling", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "childNodesAsArray", ""}, {"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1.5fHel>lo, World1.5d"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\"></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.Element", "childNodesAsArray", ""}, {"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1.5fHel>lo, Vorld1.5d"}, {"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a\nb comment=\"a\">\n <#root></#root>\n</a\nb> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.Element", "childNodesAsArray", ""}, {"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1e10"}, {"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<sample:2>"}}, 1), new String[][]{{"hasClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a\nb comment=\"a\">\n <#root></#root>\n</a\nb> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.Element", "childNodesAsArray", ""}, {"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1e10"}, {"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<sample:5>"}}, 1), new String[][]{{"hasClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a\nb comment=\"a\">\n a\n</a\nb> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.Element", "childNodesAsArray", ""}, {"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1e10"}, {"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<sample:6>"}}, 1), new String[][]{{"hasClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a\nb comment=\"a\">\n <!--a-->\n</a\nb> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "siblingElements", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "siblingElements", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("600085672", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "siblingElements", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1903593984", String.valueOf(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "wrap", "java.lang.String", "textarea"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("233224385", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\"></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.Element", "wrap", "java.lang.String", "texLarea"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-771028855", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a\nb comment=\"a\"></a\nb> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "2147483647", "<sample:6>"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "traverse", "org.jsoup.select.NodeVisitor", "<sample:2>"}, {"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n <#root></#root>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "2147483647", "<sample:6>"}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "traverse", "org.jsoup.select.NodeVisitor", "<null>"}, {"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "firstElementSibling", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "firstElementSibling", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "firstElementSibling", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"null1.5d", "nuvkl"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "doClone", "org.jsoup.nodes.Node", "<sample:6>"}, {"org.jsoup.nodes.Element", "elementSiblingIndex", ""}, {"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:5>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<null>", "<sample:1>"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "tag", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "after", "java.lang.String", "1.5"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "firstElementSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "text", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "firstElementSibling", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "text", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "firstElementSibling", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "text", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"a,b,c123456789012345678901234567890", "<null>"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "toggleClass", "java.lang.String", "[1,2]"}, {"org.jsoup.nodes.Element", "prependText", "java.lang.String", "#root"}}, 3), new String[][]{{"not", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" class=\" [1,2]\">\n #root\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"a,b,c123456789012345678901234567890", "<empty>"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "prependText", "java.lang.String", "#root"}}, 3), new String[][]{{"not", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n #root\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"a,b,c12346789012345678901234567890", "<empty>"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "prependText", "java.lang.String", "#roott"}}, 3), new String[][]{{"not", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n #roott\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"2147483647", "<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "appendChild", "org.jsoup.nodes.Node", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"1073741792", "<sample:0>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "attributes", ""}, {"org.jsoup.nodes.Element", "appendChild", "org.jsoup.nodes.Node", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"2147483616", "<sample:0>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "http://example.com/a?b=c"}, {"org.jsoup.nodes.Element", "attributes", ""}, {"org.jsoup.nodes.Element", "appendChild", "org.jsoup.nodes.Node", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5{\"a\":1}", "<a>b</a>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", ":"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousElementSibling", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "-2147483647", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousElementSibling", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "-2147483647", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousElementSibling", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "-2147483647", "<sample:3>"}, {"org.jsoup.nodes.Element", "outerHtml", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "id", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "after", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "setSiblingIndex", "int", "2147483616"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<{\"a\":1} comment=\"a\"></{\"a\":1}>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1), new String[][]{{"first", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a comment=\"a\"></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\"></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "childNodeSize", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "className", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "val", "java.lang.String", "1.5e300"}, {"org.jsoup.nodes.Element", "className", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" value=\"1.5e300\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "val", "java.lang.String", "1.5eE300"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" value=\"1.5eE300\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parent", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", "1.5e300"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n 1.5e300\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", "1.5e3001.5"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n 1.5e3001.5\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", "1.5e33001.5"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n 1.5e33001.5\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parent", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "<>b<[a>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "<>b<3[a>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a comment=\"a\" class=\"\"></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parent", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "<>b<3[a>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\" class=\"\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parent", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "a b", "1.5f"}, {"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "<>b<3[a>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\" class=\"\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"1e100"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "previousSibling", ""}, {"org.jsoup.nodes.Element", "outerHtml", "java.lang.StringBuilder", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"value"}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", "Pattern sIyntax error: ", "textbrea"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", "Pattern sIyntax error: ", "textbrea"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("162370724", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "attr", "java.lang.String", "1.1234567890123456"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", "Pattern sIyntax error: ", "textbrea"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("600085672", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "attr", "java.lang.String", "1.1234567890123456"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", "Pattern sIyn7ax error: ", "textbrea"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1903593984", String.valueOf(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"org.jsoup.nodes.Element", "setSiblingIndex", "int", "-1"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toString", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", ""}}, 3), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByClass", "java.lang.String", "1.5d"}, {"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", "010"}}, 1), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "traverse", "org.jsoup.select.NodeVisitor", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "childNodeSize", ""}, {"org.jsoup.nodes.Element", "unwrap", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30:45", "1.1234567890123456"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "10", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.util.regex.Pattern"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.lang.String", "/b/b"}, {"org.jsoup.nodes.Element", "wrap", "java.lang.String", "</"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.lang.String", "/b"}, {"org.jsoup.nodes.Element", "wrap", "java.lang.String", "</"}, {"org.jsoup.nodes.Element", "prependText", "java.lang.String", "Title"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1.5f"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1.5f"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "val", ""}, {"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "1.5f"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "classNames", ""}, {"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "10"}, {"org.jsoup.nodes.Element", "siblingElements", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "classNames", ""}, {"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "10"}, {"org.jsoup.nodes.Element", "siblingElements", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("347744782", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "classNames", ""}, {"org.jsoup.nodes.Element", "siblingElements", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("162370724", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "2147483647", "<sample:6>"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "traverse", "org.jsoup.select.NodeVisitor", "<sample:2>"}, {"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n <#root></#root>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "-2147483647", "<sample:7>"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "traverse", "org.jsoup.select.NodeVisitor", "<sample:1>"}, {"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "-2147483647", "<sample:8>"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "traverse", "org.jsoup.select.NodeVisitor", "<null>"}, {"org.jsoup.nodes.Element", "textNodes", ""}, {"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"i"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", "\u00e9"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "firstElementSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "val", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "hasAttr", "java.lang.String", "1.1234567891234561E-5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5f", "/b"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "0x1F", "12:30:44"}, {"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.lang.String", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "0x1F", "12:30:44"}, {"org.jsoup.nodes.Element", "getElementsByClass", "java.lang.String", "1.5"}, {"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.lang.String", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:1>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "after", "java.lang.String", "1.5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "after", "java.lang.String", "1.5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Tag", actual.getClass().getName());
  assertEquals("<a><b>t</b></a> {canContainBlock=true, getName=<a><b>t</b></a>, isBlock=false, isData=false, isEmpty=false, isInline=true, isKnownTag=false, isSelfClosing=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "after", "java.lang.String", "1.5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Tag", actual.getClass().getName());
  assertEquals("{\"a\":1} {canContainBlock=true, getName={\"a\":1}, isBlock=false, isData=false, isEmpty=false, isInline=true, isKnownTag=false, isSelfClosing=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "remove", ""}, {"org.jsoup.nodes.Element", "after", "java.lang.String", "15"}}), new String[][]{{"isData", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "remove", ""}, {"org.jsoup.nodes.Element", "after", "java.lang.String", "15"}}), new String[][]{{"isData", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "select", "java.lang.String", "textarea"}, {"org.jsoup.nodes.Element", "wrap", "java.lang.String", "1L"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "firstElementSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "addClass", "java.lang.String", "010"}, {"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "a,b,c"}, {"org.jsoup.nodes.Element", "outerHtml", "java.lang.StringBuilder", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "firstElementSibling", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "addClass", "java.lang.String", "010"}, {"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "a,b,c"}, {"org.jsoup.nodes.Element", "outerHtml", "java.lang.StringBuilder", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"1.5fHel>lo, Vorld1.5d"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "select", "java.lang.String", "1e10"}, {"org.jsoup.nodes.Element", "textNodes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "firstElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\"></{\"a\":1}>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<x \t y comment=\"a\"></x \t y>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "getElementsByClass", "java.lang.String", "-0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<line1\n\nline3 comment=\"a\"></line1\n\nline3>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "getElementsByClass", "java.lang.String", "0"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "\n", "i"}, {"org.jsoup.nodes.Element", "textNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a comment=\"a\"></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\"></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousSibling", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasClass", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"I", "<sample:2>"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "toggleClass", "java.lang.String", "[1,2]"}, {"org.jsoup.nodes.Element", "getElementsContainingOwnText", "java.lang.String", "1.5fHel>lo, World"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\" [1,2]\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"-1", "<null>"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "toggleClass", "java.lang.String", "[1,2]"}, {"org.jsoup.nodes.Element", "prependText", "java.lang.String", "#root"}, {"org.jsoup.nodes.Element", "getElementsContainingOwnText", "java.lang.String", "1.5fHel>lo, World"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\" [1,2]\">\n #root\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"a,b,c123456789012345678901234567890", "<sample:3>"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "toggleClass", "java.lang.String", "[1,2]"}, {"org.jsoup.nodes.Element", "prependText", "java.lang.String", "#root"}, {"org.jsoup.nodes.Element", "getElementsContainingOwnText", "java.lang.String", "1.5fHel>lo, World"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"a,b,c123456789012345678901234567890", "<empty>"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "prependText", "java.lang.String", "#root"}, {"org.jsoup.nodes.Element", "getElementsContainingOwnText", "java.lang.String", "1.5fHel>lo, World"}}), new String[][]{{"parents", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n #root\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"a,b,c123456789012345678901234567890", "<empty>"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "toggleClass", "java.lang.String", "[1,2]"}, {"org.jsoup.nodes.Element", "prependText", "java.lang.String", "#root"}, {"org.jsoup.nodes.Element", "getElementsContainingOwnText", "java.lang.String", "1.5fHel>lo, World"}}), new String[][]{{"parents", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" class=\" [1,2]\">\n #root\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"a,b,c123456789012345678901234567890", "<empty>"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "prependText", "java.lang.String", "#root"}, {"org.jsoup.nodes.Element", "getElementsContainingOwnText", "java.lang.String", "1.5fHel>lo, World"}}), new String[][]{{"parents", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n #root\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addClass", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "appendChild", "org.jsoup.nodes.Node", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"10", "<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "appendChild", "org.jsoup.nodes.Node", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasText", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5", "<a>b</a>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"contains", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"contains", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "insertChildren", new String[]{"int", "java.util.Collection"}, new String[]{"-2147483648", "<empty>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "html", "java.lang.String", "/b/b"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{}, new String[]{}, false, 9, new String[][]{}), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{}, new String[]{}, false, 17, new String[][]{}), new String[][]{{"clear", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\"></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousElementSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "-2147483647", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "after", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "elementSiblingIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "previousElementSibling", ""}, {"org.jsoup.nodes.Element", "nodeName", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<x \t y comment=\"a\"></x \t y>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 9, new String[][]{}), new String[][]{{"first", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "childNodeSize", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeAttr", new String[]{"java.lang.String"}, new String[]{"id"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parent", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", "1/5We3"}, {"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "<a>b</a>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "wrap", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownText", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "childNode", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownText", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownText", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "parents", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownText", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "parents", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "previousSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousSibling", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "classNames", "java.util.Set", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\"a 0\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"value"}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parents", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "preserveWhitespace", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567891234561E-5", "0x123456789"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "isBlock", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNode", new String[]{"int"}, new String[]{"2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parents", new String[]{}, new String[]{}, false, 14, new String[][]{}), new String[][]{{"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parents", new String[]{}, new String[]{}, false, 17, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\"></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parents", new String[]{}, new String[]{}, false, 19, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a\nb comment=\"a\"></a\nb> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parents", new String[]{}, new String[]{}, false, 20, new String[][]{}), new String[][]{{"attr", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parents", new String[]{}, new String[]{}, false, 21, new String[][]{}), new String[][]{{"attr", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a\r\nb comment=\"a\"></a\r\nb> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "absUrl", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "appendText", "java.lang.String", "a,b,c"}, {"org.jsoup.nodes.Element", "replaceWith", "org.jsoup.nodes.Node", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "append", new String[]{"java.lang.String"}, new String[]{"/b"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownerDocument", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "setParentNode", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.Element", "removeChild", "org.jsoup.nodes.Node", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "setParentNode", "org.jsoup.nodes.Node", "<sample:4>"}, {"org.jsoup.nodes.Element", "prepend", "java.lang.String", "/b"}, {"org.jsoup.nodes.Element", "removeChild", "org.jsoup.nodes.Node", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "setParentNode", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.Element", "prepend", "java.lang.String", "/b"}, {"org.jsoup.nodes.Element", "removeChild", "org.jsoup.nodes.Node", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\"></{\"a\":1}>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "0x1F"}, {"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", ""}}), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", "010"}}), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prepend", new String[]{"java.lang.String"}, new String[]{"a b"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByClass", "java.lang.String", "1.5d"}, {"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", "010"}, {"org.jsoup.nodes.Element", "attr", "java.lang.String,java.lang.String", "\n", "I"}}), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" =\"I\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", "010"}, {"org.jsoup.nodes.Element", "attr", "java.lang.String,java.lang.String", "\n", "1L"}, {"org.jsoup.nodes.Element", "nextElementSibling", ""}}), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" =\"1L\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", "010"}, {"org.jsoup.nodes.Element", "attr", "java.lang.String,java.lang.String", "\n", "1L"}, {"org.jsoup.nodes.Element", "nextElementSibling", ""}}), new String[][]{{"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" =\"1L\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "childNodeSize", ""}, {"org.jsoup.nodes.Element", "unwrap", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "attributes", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "attributes", ""}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "0xFFFFFFFF", "\\s+"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "attributes", ""}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "0xFFFFFFFF", "\\s+"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"010", "--1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "attributes", ""}, {"org.jsoup.nodes.Element", "unwrap", ""}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "0xFFFFFFFF", "\\r+"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<{\"a\":1} comment=\"a\"></{\"a\":1}>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "unwrap", ""}}), new String[][]{{"attr", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextElementSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "nextElementSibling", ""}, {"org.jsoup.nodes.Element", "preserveWhitespace", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesCopy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "select", "java.lang.String", "0xFFFFFFFF"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "tagName", "java.lang.String", "/ab"}, {"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "Hello+ World"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "</ab comment=\"a\">\n <hello+ world></hello+ world>\n<//ab> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "tagName", "java.lang.String", "0ab"}, {"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "Hello+ World"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0ab comment=\"a\">\n <hello+ world></hello+ world>\n</0ab> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "Hello+ World"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n <hello+ world></hello+ world>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "tagName", "java.lang.String", "0ab"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0ab comment=\"a\"></0ab> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingNodes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "id", ""}, {"org.jsoup.nodes.Element", "tagName", "java.lang.String", "0ab"}, {"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "Hello+ World"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0ab comment=\"a\">\n <hello+ world></hello+ world>\n</0ab> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "Hello+ World"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n <hello+ world></hello+ world>\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "removeAttr", "java.lang.String", "1.5e300"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "0xEGFFFFF"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n <0xegfffff></0xegfffff>\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "123456789012345678901234567890"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n <123456789012345678901234567890></123456789012345678901234567890>\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "ownText", ""}, {"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "1253456789012345678901234567890"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\">\n <1253456789012345678901234567890></1253456789012345678901234567890>\n</line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "classNames", ""}, {"org.jsoup.nodes.Element", "prepend", "java.lang.String", "1.1234567"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\\s+", "1.1234567890123456"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "ownText", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "parents", ""}, {"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "2147483616", "<sample:1>"}, {"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "1253456789012345668901234567890"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\">\n <1253456789012345668901234567890></1253456789012345668901234567890>\n</line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", "id"}, {"org.jsoup.nodes.Element", "parents", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\">id</a> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "1.5f"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", "j"}, {"org.jsoup.nodes.Element", "html", "java.lang.String", "12:30:45"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\">12:30:45</a> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "empty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "\u00e9"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", "0"}, {"org.jsoup.nodes.Element", "html", "java.lang.String", "12:30:45"}, {"org.jsoup.nodes.Element", "text", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\">12:30:45</a> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", "/"}, {"org.jsoup.nodes.Element", "html", "java.lang.String", "12:30:45"}, {"org.jsoup.nodes.Element", "text", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\">12:30:45</a> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", "/"}, {"org.jsoup.nodes.Element", "text", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\">/</a> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", "/"}, {"org.jsoup.nodes.Element", "html", "java.lang.String", "12:30:45"}, {"org.jsoup.nodes.Element", "text", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "siblingElements", ""}, {"org.jsoup.nodes.Element", "text", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\"></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "html", "java.lang.String", "12:30:35"}, {"org.jsoup.nodes.Element", "siblingElements", ""}, {"org.jsoup.nodes.Element", "text", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\">12:30:35</a> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "html", "java.lang.String", "12:300:35"}, {"org.jsoup.nodes.Element", "siblingElements", ""}, {"org.jsoup.nodes.Element", "text", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\">12:300:35</a> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{"java.util.Set"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "-2147483648", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setSiblingIndex", new String[]{"int"}, new String[]{"2147483616"}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "-2147483648", "<sample:2>"}, {"org.jsoup.nodes.Element", "setParentNode", "org.jsoup.nodes.Node", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "textarea"}, {"org.jsoup.nodes.Element", "html", "java.lang.String", "1.1224\n-0.0"}, {"org.jsoup.nodes.Element", "parent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n 1.1224 -0.0\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"-2147483647"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "before", "org.jsoup.nodes.Node", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "-1.5", "a"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "absUrl", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"-1"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "appendChild", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.Element", "before", "org.jsoup.nodes.Node", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementById", new String[]{"java.lang.String"}, new String[]{"<>b<3[a>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "before", "org.jsoup.nodes.Node", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<{\"a\":1} comment=\"a\"></{\"a\":1}>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "before", "org.jsoup.nodes.Node", "<sample:10>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingIndex", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "{\"a\":1}", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodes", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodes", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodes", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"subList", "int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodes", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"addAll", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"Pattern syntax error: "}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsByClass", "java.lang.String", "12:30:44"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\">\n Pattern syntax error: \n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n Pattern syntax error: \n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsByClass", "java.lang.String", "12:30:44"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"Pattern syntax error: "}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "getElementsByClass", "java.lang.String", "12:30:44"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"Patterm syntax error: "}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsByClass", "java.lang.String", "12:30:44"}, {"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "-1", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\">\n Patterm syntax error: \n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n Patterm syntax error: \n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"Pattrn syntax error: "}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsByClass", "java.lang.String", "12:30:44"}, {"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "-1", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\">\n Pattrn syntax error: \n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n Pattrn syntax error: \n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"Pattern syntax error: 1.5f"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsByClass", "java.lang.String", "12:30:44"}, {"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "-1", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\">\n Pattern syntax error: 1.5f\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n Pattern syntax error: 1.5f\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"Patterns syntax error: 1.5f"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsByClass", "java.lang.String", "12:30:44"}, {"org.jsoup.nodes.Element", "toString", ""}, {"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "-1", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\">\n Patterns syntax error: 1.5f\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n Patterns syntax error: 1.5f\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "toString", ""}, {"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "-1", "<empty>"}}, 1), new String[][]{{"baseUri", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n 2020-01-01\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{" "}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "toString", ""}, {"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "-1", "<empty>"}}, 1), new String[][]{{"baseUri", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"> \n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"  "}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "toString", ""}, {"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "-1", "<empty>"}}, 1), new String[][]{{"baseUri", "", "4"}, {"nextSibling", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"> \n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"  "}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "toString", ""}, {"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "-1", "<empty>"}}, 1), new String[][]{{"getElementsByIndexGreaterThan", "int", "4"}, {"attr", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"> \n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"\n"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"</"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "-1", "<empty>"}}), new String[][]{{"getElementsByIndexGreaterThan", "int", "4"}, {"attr", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n &lt;/\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"<dd"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "-1", "<sample:3>"}}), new String[][]{{"getElementsByIndexGreaterThan", "int", "4"}, {"attr", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n &lt;dd\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"/<dd"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "0", "<sample:3>"}}), new String[][]{{"getElementsByIndexGreaterThan", "int", "4"}, {"attr", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n /&lt;dd\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"d<dd"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "empty", ""}, {"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "0", "<sample:3>"}}), new String[][]{{"getElementsByIndexGreaterThan", "int", "4"}, {"attr", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n d&lt;dd\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"1"}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "isBlock", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"sd<dd"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "empty", ""}, {"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "0", "<sample:3>"}}), new String[][]{{"getElementsByIndexGreaterThan", "int", "4"}, {"attr", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n sd&lt;dd\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"rd=dd"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "empty", ""}, {"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "0", "<sample:2>"}}), new String[][]{{"getElementsByIndexGreaterThan", "int", "4"}, {"attr", "java.lang.String", "4"}, {"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n rd=dd\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"#root</+1"}, false, 11, new String[][]{{"org.jsoup.nodes.Element", "className", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataNodes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "equals", "java.lang.Object", "<b:true>"}, {"org.jsoup.nodes.Element", "attributes", ""}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "</<1E-5", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataNodes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "equals", "java.lang.Object", "<b:true>"}, {"org.jsoup.nodes.Element", "attributes", ""}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "</<1E-5", "0"}}), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataNodes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "data", ""}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "</<1E-5", "0"}}), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataNodes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "data", ""}, {"org.jsoup.nodes.Element", "childNodeSize", ""}, {"org.jsoup.nodes.Element", "baseUri", ""}}), new String[][]{{"get", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataNodes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "data", ""}, {"org.jsoup.nodes.Element", "childNodeSize", ""}, {"org.jsoup.nodes.Element", "baseUri", ""}}), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataNodes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "baseUri", ""}, {"org.jsoup.nodes.Element", "nextSibling", ""}}), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataNodes", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Element", "nextSibling", ""}, {"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "0", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingIndex", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "1.1234567891234561E-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
