package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataset", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.02345678901244567", "</"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "childNodesCopy", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{":nth-child($d))-1"}, false, 9, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "preserveWhitespace", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "preserveWhitespace", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"1-123456789012344671L"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "10", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"1-123456789012344671L"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "-2147483648", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingNodes", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jsoup.nodes.Element", "nextElementSibling", ""}, {"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "1.1234567"}, {"org.jsoup.nodes.Element", "previousElementSibling", ""}}), new String[][]{{"iterator", "", "1"}, {"next", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementById", new String[]{"java.lang.String"}, new String[]{"buj\u00e9"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "setParentNode", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.Element", "html", "java.lang.String", "5."}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n 5.\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "cssSelector", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.jsoup.nodes.Element", "appendText", "java.lang.String", "1-12345678901234467"}, {"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "0", "<sample:0>"}, {"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} text=\"a\">\n 1-12345678901234467\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsContainingOwnText", new String[]{"java.lang.String"}, new String[]{"</"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "hasAttr", "java.lang.String", ">"}, {"org.jsoup.nodes.Element", "ownText", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"5."}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}, {"org.jsoup.nodes.Element", "removeAttr", "java.lang.String", "I5"}}), new String[][]{{"val", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\">\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{"java.lang.String"}, new String[]{"1,2"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<sample:7>"}, {"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:2>"}, {"org.jsoup.nodes.Element", "equals", "java.lang.Object", "<s:ay>"}}), new String[][]{{"cssSelector", "", "3"}, {"getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "1"}, {"set", "int,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "val", ""}, {"org.jsoup.nodes.Element", "appendElement", "java.lang.String", ":nth-child(%d)"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\">\n <:nth-child(%d)></:nth-child(%d)>\n</line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "cssSelector", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "0y"}, {"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", "n,ul12020-01-01"}, {"org.jsoup.nodes.Element", "getAllElements", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n <0y></0y>\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownText", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "0", "<sample:0>"}, {"org.jsoup.nodes.Element", "prependText", "java.lang.String", "\\ts+"}, {"org.jsoup.nodes.Element", "textNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\ts+", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n \\ts+a\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{"java.lang.String"}, new String[]{"_l_ul\t"}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", "int", "12"}, {"org.jsoup.nodes.Element", "outerHtml", "java.lang.StringBuilder", "<sample:3>"}, {"org.jsoup.nodes.Element", "hasClass", "java.lang.String", ""}}, 2), new String[][]{{"appendElement", "java.lang.String", "1"}, {"lastElementSibling", "", "7"}, {"isBlock", "", "0"}, {"append", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>a</a> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\" value=\"_l_ul\t\">\n <a>a</a>\n</line1\n\nline3> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{"java.lang.String"}, new String[]{"#"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "dataNodes", ""}, {"org.jsoup.nodes.Element", "siblingIndex", ""}, {"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", "[1,2]", "\u00e9147483e648--1"}}, 2), new String[][]{{"appendElement", "java.lang.String", "1"}, {"isBlock", "", "5"}, {"firstElementSibling", "", "7"}, {"children", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" value=\"#\">\n <a></a>\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{"java.lang.String"}, new String[]{"1y35/78:23366978901LxF0."}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "trf"}, {"org.jsoup.nodes.Element", "siblingElements", ""}}, 1), new String[][]{{"appendElement", "java.lang.String", "1"}, {"cssSelector", "", "0"}, {"after", "org.jsoup.nodes.Node", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" value=\"1y35/78:23366978901LxF0.\">\n <a></a><!DOCTYPE a PUBLIC \"0\" \"sample\">\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{"java.lang.String"}, new String[]{"axOarse\u00e9}123456789012345678901234567890"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "\ntrfH"}, {"org.jsoup.nodes.Element", "html", "java.lang.String", "_l_tl\t"}, {"org.jsoup.nodes.Element", "siblingElements", ""}}, 2), new String[][]{{"appendElement", "java.lang.String", "1"}, {"cssSelector", "", "6"}, {"getElementsByClass", "java.lang.String", "3"}, {"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" value=\"axOarse\u00e9}123456789012345678901234567890\">\n _l_tl \n <a></a>\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{"java.lang.String"}, new String[]{"0..1t"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "html", ""}, {"org.jsoup.nodes.Element", "append", "java.lang.String", "1L"}, {"org.jsoup.nodes.Element", "getOutputSettings", ""}}, 3), new String[][]{{"appendElement", "java.lang.String", "1"}, {"before", "java.lang.String", "0"}, {"elementSiblingIndex", "", "7"}, {"getElementsMatchingText", "java.util.regex.Pattern", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<a></a>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" value=\"0..1t\">\n 1L\n <a></a>\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{"java.lang.String"}, new String[]{"\u00e9I#"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "prepend", "java.lang.String", "PT1#H"}, {"org.jsoup.nodes.Element", "toggleClass", "java.lang.String", ":noth-child(%dd("}, {"org.jsoup.nodes.Element", "html", ""}}, 2), new String[][]{{"appendElement", "java.lang.String", "3"}, {"cssSelector", "", "2"}, {"nextElementSibling", "", "3"}, {"html", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<sample>\n sample\n</sample> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" class=\":noth-child(%dd(\" value=\"\u00e9I#\">\n PT1#H\n <sample>\n  sample\n </sample>\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" />", ":nth-child(%d("}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "reparentChild", "org.jsoup.nodes.Node", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "prepend", "java.lang.String", "PT0TT1"}, {"org.jsoup.nodes.Element", "appendElement", "java.lang.String", ":nth-child(%d)"}, {"org.jsoup.nodes.Element", "html", ""}}, 3), new String[][]{{"appendElement", "java.lang.String", "3"}, {"cssSelector", "", "2"}, {"nextElementSibling", "", "0"}, {"getElementsByAttributeValue", "java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" value=\"\">\n PT0TT1\n <:nth-child(%d)></:nth-child(%d)>\n <sample></sample>\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{"java.lang.String"}, new String[]{"01234679TITM\rE"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", "a-btc"}, {"org.jsoup.nodes.Element", "getElementsByTag", "java.lang.String", "1.E22x5889013456"}, {"org.jsoup.nodes.Element", "text", ""}}, 1), new String[][]{{"appendElement", "java.lang.String", "3"}, {"getElementsMatchingOwnText", "java.util.regex.Pattern", "6"}, {"after", "java.lang.String", "5"}, {"removeClass", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<sample class=\"\"></sample>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" value=\"01234679TITM\rE\">\n a-btc\n <sample class=\"\"></sample>a\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{"java.lang.String"}, new String[]{"1-A123356489012344681L"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", "\"-btc1.5e300"}, {"org.jsoup.nodes.Element", "getElementsByTag", "java.lang.String", "1.E22x58890113456"}, {"org.jsoup.nodes.Element", "text", ""}}, 1), new String[][]{{"appendElement", "java.lang.String", "3"}, {"classNames", "java.util.Set", "6"}, {"nextElementSibling", "", "6"}, {"getElementsByClass", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<sample class=\"0\"></sample>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" value=\"1-A123356489012344681L\">\n \"-btc1.5e300\n <sample class=\"0\"></sample>\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "text", ""}, {"org.jsoup.nodes.Element", "toString", ""}, {"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "\n22/-#601-2020-02-30T25:61:61"}}), new String[][]{{"appendElement", "java.lang.String", "1"}, {"before", "org.jsoup.nodes.Node", "3"}, {"nextElementSibling", "", "3"}, {"append", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>sample</a> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" class=\"\" value=\"1.5d\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <a>sample</a>\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"_l_ul\t", "#root"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<{\"a\":1} comment=\"a\"></{\"a\":1}>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataNodes", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "attr", "java.lang.String", "I.rr"}, {"org.jsoup.nodes.Element", "prependElement", "java.lang.String", ":nth-child(%d("}}), new String[][]{{"size", "", "5"}, {"listIterator", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesCopy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "\""}, {"org.jsoup.nodes.Element", "before", "org.jsoup.nodes.Node", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[<\"></\">]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n <\"></\">\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"2.1244568"}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "parent", ""}, {"org.jsoup.nodes.Element", "elementSiblingIndex", ""}, {"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", "1.E22x58890113456"}}), new String[][]{{"select", "java.lang.String", "7"}, {"listIterator", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "equals", "java.lang.Object", "<s:b>"}, {"org.jsoup.nodes.Element", "tagName", "java.lang.String", ".aa,\r,c > "}, {"org.jsoup.nodes.Element", "hashCode", ""}}), new String[][]{{"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<.aa,\r,c > comment=\"a\"></.aa,\r,c >> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownText", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "classNames", "java.util.Set", "<sample:1>"}, {"org.jsoup.nodes.Element", "tagName", ""}, {"org.jsoup.nodes.Element", "outerHtml", "java.lang.StringBuilder", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\" class=\"a 0\"></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"\\"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "\u00e9I#", "/a/b"}, {"org.jsoup.nodes.Element", "setSiblingIndex", "int", "-2"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<sample:1>"}, {"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "1.55d"}}), new String[][]{{"data", "", "0"}, {"getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">a\n <1.55d></1.55d>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "empty", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "replaceWith", "org.jsoup.nodes.Node", "<sample:1>"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "1-12355,77:nuh-child(%d)1.1234567aTITLE", "1v(0-0.0"}, {"org.jsoup.nodes.Element", "siblingElements", ""}}, 3), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\"></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "empty", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "addClass", "java.lang.String", "1..25 />"}, {"org.jsoup.nodes.Element", "getElementsByIndexLessThan", "int", "-2147483648"}}, 2), new String[][]{{"hasText", "", "7"}, {"html", "", "6"}, {"hasClass", "java.lang.String", "5"}, {"cssSelector", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("line1\n\nline3.1..25./>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\" class=\"1..25 />\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "empty", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "addClass", "java.lang.String", "10"}, {"org.jsoup.nodes.Element", "empty", ""}, {"org.jsoup.nodes.Element", "text", ""}}, 3), new String[][]{{"attr", "java.lang.String,java.lang.String", "1"}, {"html", "", "5"}, {"hasClass", "java.lang.String", "3"}, {"cssSelector", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y.10", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" class=\"10\" a=\"0\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "empty", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "prepend", "java.lang.String", "`W:nth-child(%d)"}, {"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "1234567f80123456789123/45667890"}, {"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:7>"}}, 1), new String[][]{{"data", "", "1"}, {"addClass", "java.lang.String", "2"}, {"appendElement", "java.lang.String", "1"}, {"cssSelector", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y.0 > a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" class=\"0\">\n <a></a>\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "empty", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "prepend", "java.lang.String", "."}, {"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "Title"}, {"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<null>"}}), new String[][]{{"html", "java.lang.String", "6"}, {"getElementById", "java.lang.String", "1"}, {"appendElement", "java.lang.String", "5"}, {"cssSelector", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y > a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n 0\n <a></a>\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "clone", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "className", ""}, {"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "textarea"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a comment=\"a\"><textarea></textarea></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\"><textarea></textarea></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "setParentNode", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.Element", "elementSiblingIndex", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<x \t y comment=\"a\"></x \t y>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<line1\n\nline3 comment=\"a\"></line1\n\nline3>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "5.", ".5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<line1\n\nline3 comment=\"a\"></line1\n\nline3>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "after", "org.jsoup.nodes.Node", "<sample:2>"}}, 3), new String[][]{{"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "attr", "java.lang.String,java.lang.String", "#root", "1L"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "-2147483648", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "-2147483648", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "tagName", ""}, {"org.jsoup.nodes.Element", "equals", "java.lang.Object", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "0x1F"}, {"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.util.regex.Pattern", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "parent", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+1", "1E-5"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "childNodes", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataset", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataset", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataset", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"remove", "java.lang.Object", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "attributes", ""}, {"org.jsoup.nodes.Element", "text", "java.lang.String", ":nth-child(%d)"}, {"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "Pattern syntax error: "}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\">:nth-child(%d)</a> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", ":nth-child(%d)"}, {"org.jsoup.nodes.Element", "previousElementSibling", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a\rb", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a\rb comment=\"a\">\n :nth-child(%d)\n</a\rb> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "lastElementSibling", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "lastElementSibling", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("line1\n\nline3", String.valueOf(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "lastElementSibling", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\"></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E-55", "</"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "childNodesCopy", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "ownText", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\">\n 0xFFFFFFFF\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n 0xFFFFFFFF\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "ownText", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\">\n 0x123456789\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n 0x123456789\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"0x12345678:"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "ownText", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\">\n 0x12345678:\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n 0x12345678:\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"70x12345678:"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "ownText", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\">\n 70x12345678:\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n 70x12345678:\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"70x12345678:"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "ownText", ""}}, 3), new String[][]{{"attr", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n 70x12345678:\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementById", new String[]{"java.lang.String"}, new String[]{"a[1C,]"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "/", "1.5"}, {"org.jsoup.nodes.Element", "isBlock", ""}, {"org.jsoup.nodes.Element", "removeChild", "org.jsoup.nodes.Node", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingIndex", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingIndex", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingIndex", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingIndex", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingIndex", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "addClass", "java.lang.String", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\" class=\"-1\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "doClone", "org.jsoup.nodes.Node", "<null>"}, {"org.jsoup.nodes.Element", "classNames", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a comment=\"a\"></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.Element", "doClone", "org.jsoup.nodes.Node", "<null>"}, {"org.jsoup.nodes.Element", "classNames", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a\nb comment=\"a\"></a\nb> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "doClone", "org.jsoup.nodes.Node", "<null>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "doClone", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "010"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "doClone", "org.jsoup.nodes.Node", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousElementSibling", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "replaceWith", "org.jsoup.nodes.Node", "<sample:1>"}, {"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousElementSibling", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "tagName", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{"java.lang.String"}, new String[]{"http:://examrle.bom/a?b=c"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "before", "java.lang.String", "1L-0.0"}, {"org.jsoup.nodes.Element", "after", "org.jsoup.nodes.Node", "<sample:5>"}}, 2), new String[][]{{"nextElementSibling", "", "3"}, {"getElementsByIndexEquals", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{":nth-cgiXld($d))-1"}, false, 9, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"."}, false, 9, new String[][]{}, 1), new String[][]{{"first", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{".#"}, false, 9, new String[][]{}, 1), new String[][]{{"first", "", "0"}, {"empty", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{".\""}, false, 9, new String[][]{}, 1), new String[][]{{"first", "", "0"}, {"empty", "", "7"}, {"add", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "after", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "before", "org.jsoup.nodes.Node", "<sample:7>"}, {"org.jsoup.nodes.Element", "hasAttr", "java.lang.String", ":nth-child($d))-1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"010", "\010 "}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "val", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasClass", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingNodes", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingNodes", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"a"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "siblingIndex", ""}, {"org.jsoup.nodes.Element", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{"0BBBB010value"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{"o-nb,ic<2020-01-01y"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{"oo-nb,ic<2020-01-01y1.5 />"}, false, 5, new String[][]{}, 2), new String[][]{{"append", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{"oo-nb,ic<2020-01-01y1.5 />"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexLessThan", "int", "-2147483648"}}, 2), new String[][]{{"append", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{"oo-nb,ic<2020-01-01y1.5 />1.12345678901234561.5d<"}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexLessThan", "int", "-2147483648"}}, 2), new String[][]{{"append", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeAttr", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "removeClass", "java.lang.String", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeAttr", new String[]{"java.lang.String"}, new String[]{"W"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", "http://example.com/a?b=c", "/a/b"}, {"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "Title"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<x \t y comment=\"a\" class=\"\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" class=\"\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeAttr", new String[]{"java.lang.String"}, new String[]{"#"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", "http://example.com/a?b=c", "/a/b"}, {"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "Title"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\" class=\"\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\"\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeAttr", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", "http://example.com/a?b=c", "/a/b"}, {"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "Title"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendElement", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "before", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownText", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.jsoup.nodes.Element", "childNodesCopy", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownText", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "childNodesCopy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.123x568890123456", "12:)30:45"}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "nodeName", ""}, {"org.jsoup.nodes.Element", "unwrap", ""}, {"org.jsoup.nodes.Element", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "-2147483648", "<sample:5>"}}, 1), new String[][]{{"html", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.E22x56889013456", ".5"}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "nextSibling", ""}, {"org.jsoup.nodes.Element", "unwrap", ""}, {"org.jsoup.nodes.Element", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.E22x56889013456", "-5"}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "nextSibling", ""}, {"org.jsoup.nodes.Element", "unwrap", ""}, {"org.jsoup.nodes.Element", "clone", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeAttr", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "textNodes", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ht", "["}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "nextSibling", ""}, {"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "2147483647", "<sample:1>"}, {"org.jsoup.nodes.Element", "clone", ""}}, 1), new String[][]{{"removeClass", "java.lang.String", "0"}, {"remove", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\"></{\"a\":1}>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".5", "http://example.com/a?b=c"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".5", "http://example.com/a?b=c"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "data", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "after", "org.jsoup.nodes.Node", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "after", "org.jsoup.nodes.Node", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "after", "org.jsoup.nodes.Node", "<sample:3>"}}), new String[][]{{"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "after", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.Element", "className", ""}}), new String[][]{{"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:1>", "<sample:7>"}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "siblingIndex", ""}, {"org.jsoup.nodes.Element", "val", "java.lang.String", "[1,2]"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:0>", "<sample:0>"}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "getElementsByTag", "java.lang.String", "id"}, {"org.jsoup.nodes.Element", "siblingIndex", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "lastElementSibling", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{".5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "prependText", "java.lang.String", "5."}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "tagName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "firstElementSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "-2147483648", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"null", "http://example.com/a?b=c"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "/a/b"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"1", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "0x1F"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "0x1F"}, {"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.util.regex.Pattern", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousElementSibling", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "parent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "1", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}, {"org.jsoup.nodes.Element", "addClass", "java.lang.String", ">"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "2147483647", "<sample:2>"}, {"org.jsoup.nodes.Element", "id", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "attr", "java.lang.String", "TITLE"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNode", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "hasAttr", "java.lang.String", " "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasText", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "attributes", ""}, {"org.jsoup.nodes.Element", "text", "java.lang.String", ":nth-child(%d)"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "attributes", ""}, {"org.jsoup.nodes.Element", "text", "java.lang.String", ":nth-child(%d)"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\">:nth-child(%d)</a> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.nodes.Element", "attributes", ""}, {"org.jsoup.nodes.Element", "text", "java.lang.String", ":nth-child(%d)"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "remove", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "childNodesCopy", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{"java.lang.String"}, new String[]{"</"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.Element", "attributes", ""}, {"org.jsoup.nodes.Element", "text", "java.lang.String", ":nth-child(%d)"}, {"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "Pattern syntax error: "}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a\nb", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a\nb comment=\"a\">\n :nth-child(%d)\n</a\nb> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", ":nth-child(%d)"}, {"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "Pattern syntax error: "}, {"org.jsoup.nodes.Element", "previousElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a\r\nb", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a\r\nb comment=\"a\">\n :nth-child(%d)\n</a\r\nb> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "Pattern syntax error: "}, {"org.jsoup.nodes.Element", "previousElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a\r\nb", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a\r\nb comment=\"a\"></a\r\nb> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", ":nth-child(%d)"}, {"org.jsoup.nodes.Element", "previousElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a\rb", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a\rb comment=\"a\">\n :nth-child(%d)\n</a\rb> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", ":nth.child(%d)"}, {"org.jsoup.nodes.Element", "previousElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a\rb", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a\rb comment=\"a\">\n :nth.child(%d)\n</a\rb> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", ":nth.child(%d)"}, {"org.jsoup.nodes.Element", "previousElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b\n1,2", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a,b\n1,2 comment=\"a\">\n :nth.child(%d)\n</a,b\n1,2> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", ":nth.chid(%d)"}, {"org.jsoup.nodes.Element", "previousElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b\n1,2", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a,b\n1,2 comment=\"a\">\n :nth.chid(%d)\n</a,b\n1,2> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "firstElementSibling", ""}, {"org.jsoup.nodes.Element", "text", "java.lang.String", ":nth.chid(%d)"}, {"org.jsoup.nodes.Element", "previousElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n :nth.chid(%d)\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", ":nth.chid(%d)"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n :nth.chid(%d)\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "dataset", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678901234567", "</"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"#"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "setSiblingIndex", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\">\n #\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n #\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"$1L"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\">\n $1L\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n $1L\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\">\n -1\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n -1\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"-1W"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "ownText", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\">\n -1W\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n -1W\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"-11"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "ownText", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\">\n -11\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n -11\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"-11"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "ownText", ""}}), new String[][]{{"baseUri", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n -11\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"70x12345678:"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "ownText", ""}}), new String[][]{{"attr", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n 70x12345678:\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "after", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.Element", "ownText", ""}}), new String[][]{{"attr", "java.lang.String", "0"}, {"childNodeSize", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n 12:30:45\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "empty", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementById", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "removeChild", "org.jsoup.nodes.Node", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendElement", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "tagName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getOutputSettings", ""}, {"org.jsoup.nodes.Element", "prependText", "java.lang.String", "2020-02-30T25:61:61"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n 2020-02-30T25:61:61\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "prependText", "java.lang.String", "2020-02.30T25:61:61"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n 2020-02.30T25:61:61\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "prependText", "java.lang.String", "2020-02.30T25:61:61\u00e9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n 2020-02.30T25:61:61\u00e9\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingIndex", new String[]{}, new String[]{}, false, 17, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\"></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "childNodeSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-489074929", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "childNodeSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1755081765", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "childNodeSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1492351785", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.jsoup.nodes.Element", "cssSelector", ""}, {"org.jsoup.nodes.Element", "doClone", "org.jsoup.nodes.Node", "<null>"}, {"org.jsoup.nodes.Element", "classNames", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "isBlock", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "doClone", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "0101.5d"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "doClone", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "0101.5d"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousElementSibling", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "firstElementSibling", ""}, {"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"><!a>\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousElementSibling", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "firstElementSibling", ""}, {"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"><!a>\n</line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousElementSibling", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "firstElementSibling", ""}, {"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a comment=\"a\"><!a></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousElementSibling", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "firstElementSibling", ""}, {"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a comment=\"a\">\n <!--a--></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousElementSibling", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.Element", "firstElementSibling", ""}, {"org.jsoup.nodes.Element", "replaceWith", "org.jsoup.nodes.Node", "<sample:1>"}, {"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a\nb comment=\"a\">\n <!--a-->\n</a\nb> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousElementSibling", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", "-1"}, {"org.jsoup.nodes.Element", "replaceWith", "org.jsoup.nodes.Node", "<sample:1>"}, {"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{"java.lang.String"}, new String[]{"id"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "prepend", "java.lang.String", ".5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{"java.lang.String"}, new String[]{"1-12345678901234467"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "before", "java.lang.String", "1L"}, {"org.jsoup.nodes.Element", "after", "org.jsoup.nodes.Node", "<sample:5>"}}), new String[][]{{"nextElementSibling", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{"java.lang.String"}, new String[]{"1-1234567801234467"}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "before", "java.lang.String", "1L-0.0"}, {"org.jsoup.nodes.Element", "after", "org.jsoup.nodes.Node", "<sample:5>"}}), new String[][]{{"nextElementSibling", "", "3"}, {"getElementsByIndexEquals", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"."}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexLessThan", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{":nth-child($d)--1"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownText", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", ""}, {"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependElement", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingOwnText", "java.lang.String", "1"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", "a b", " > "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "after", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "before", "org.jsoup.nodes.Node", "<sample:7>"}, {"org.jsoup.nodes.Element", "hasAttr", "java.lang.String", ":nth-child($d))-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" > ", "textarea"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "reparentChild", "org.jsoup.nodes.Node", "<sample:6>"}, {"org.jsoup.nodes.Element", "textNodes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "empty", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "empty", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "empty", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "empty", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"attr", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "prependText", "java.lang.String", "{\"a\":1}"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parentNode", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasClass", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "child", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingNodes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingNodes", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingNodes", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"1.25"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "lastElementSibling", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "2020-01-01"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "10", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"1-123456789012344671L"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "10", "<empty>"}}), new String[][]{{"add", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"1-123456789012344671L"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "-2147483648", "<empty>"}, {"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "1.1234567890123456"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n <1.1234567890123456></1.1234567890123456>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"1-123456789012344671L"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "-2147483648", "<empty>"}, {"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "1.1234567890123456"}}), new String[][]{{"retainAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n <1.1234567890123456></1.1234567890123456>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"1-123456789012344671L"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "-2147483648", "<sample:1>"}, {"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "1.1234567890123456"}}), new String[][]{{"retainAll", "java.util.Collection", "1"}, {"text", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n <1.1234567890123456></1.1234567890123456>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"1-12346789012344671L"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "-2147483648", "<sample:1>"}, {"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "1.1234567890123456"}}), new String[][]{{"retainAll", "java.util.Collection", "1"}, {"text", "", "6"}, {"addAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n <1.1234567890123456></1.1234567890123456>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", "1.1234567890123456"}, {"org.jsoup.nodes.Element", "getElementsByAttribute", "java.lang.String", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasAttr", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "attr", "java.lang.String,java.lang.String", "a b", "1\r123456789012344671L"}, {"org.jsoup.nodes.Element", "childNode", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" a b=\"1\r123456789012344671L\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "tag", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "child", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "replaceWith", "org.jsoup.nodes.Node", "<null>"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", ">", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "http://example.com/a?b=c", "<sample:1>"}, {"org.jsoup.nodes.Element", "getElementsByClass", "java.lang.String", "</"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{"0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{"o-nb,ic<2020-01-01y"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1.1234567890123467"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeAttr", new String[]{"java.lang.String"}, new String[]{"gttp:://example.com/a?b=c"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", "http://example.com/a?b=c", "/a/b0x1F"}, {"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "Title"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\" class=\"\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\"\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "tagName", "java.lang.String", "+1"}, {"org.jsoup.nodes.Element", "parents", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-2147483648", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "elementSiblingIndex", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "setSiblingIndex", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "elementSiblingIndex", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "setSiblingIndex", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"5.", ">"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "classNames", "java.util.Set", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingNodes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "childNodesCopy", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingNodes", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "childNodesCopy", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingNodes", new String[]{}, new String[]{}, false, 12, new String[][]{}), new String[][]{{"set", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownText", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "childNodeSize", ""}, {"org.jsoup.nodes.Element", "parents", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownText", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "childNodeSize", ""}, {"org.jsoup.nodes.Element", "attr", "java.lang.String", "Pattern syntax error: "}, {"org.jsoup.nodes.Element", "parents", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownText", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "childNodeSize", ""}, {"org.jsoup.nodes.Element", "attr", "java.lang.String", "Pattern syntax error: "}, {"org.jsoup.nodes.Element", "parents", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownText", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "childNodeSize", ""}, {"org.jsoup.nodes.Element", "parents", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownText", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "parents", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a comment=\"a\"></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsContainingOwnText", new String[]{"java.lang.String"}, new String[]{"#"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{"java.lang.String"}, new String[]{"1e10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "tag", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "tag", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "tag", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "-0.0", " > "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "remove", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "-0.0", " > "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "1.1234567890123456"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567890123456", "TITLE010"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567890123456", "TITLE010"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ht", "x["}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "-2147483647", "<sample:0>"}, {"org.jsoup.nodes.Element", "clone", ""}}), new String[][]{{"removeClass", "java.lang.String", "0"}, {"remove", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parentNode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "removeChild", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.Element", "hasText", ""}, {"org.jsoup.nodes.Element", "siblingElements", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parentNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "removeChild", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.Element", "hasText", ""}, {"org.jsoup.nodes.Element", "siblingElements", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parentNode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "hasText", ""}, {"org.jsoup.nodes.Element", "siblingElements", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", "1.1234567"}, {"org.jsoup.nodes.Element", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", "1.1234567"}, {"org.jsoup.nodes.Element", "clone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", "1.1234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeClass", new String[]{"java.lang.String"}, new String[]{"1.E22x56889013456"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<empty>"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "null", "i"}}), new String[][]{{"traverse", "org.jsoup.select.NodeVisitor", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<empty>"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "{\"a\":1}", "i"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:3>"}, {"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "10", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:2>"}, {"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "10", "<sample:2>"}, {"org.jsoup.nodes.Element", "removeChild", "org.jsoup.nodes.Node", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:3>"}, {"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "10", "<sample:3>"}}), new String[][]{{"is", "java.lang.String", "1"}, {"addAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:1>"}, {"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "10", "<sample:0>"}, {"org.jsoup.nodes.Element", "id", ""}}), new String[][]{{"is", "java.lang.String", "1"}, {"get", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:1>"}, {"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "10", "<sample:0>"}}, 3), new String[][]{{"is", "java.lang.String", "1"}, {"get", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "a,b,c"}, {"org.jsoup.nodes.Element", "id", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\">a\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">a\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "a,b,c"}, {"org.jsoup.nodes.Element", "id", ""}, {"org.jsoup.nodes.Element", "attributes", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\"><!a>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"><!a>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "a,b,c"}, {"org.jsoup.nodes.Element", "id", ""}, {"org.jsoup.nodes.Element", "attributes", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\">\n <!--a-->\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n <!--a-->\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "a,b,c"}, {"org.jsoup.nodes.Element", "id", ""}, {"org.jsoup.nodes.Element", "attributes", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\">\n <#root></#root>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n <#root></#root>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "a,b,c"}, {"org.jsoup.nodes.Element", "id", ""}, {"org.jsoup.nodes.Element", "attributes", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", "Title"}, {"org.jsoup.nodes.Element", "nextElementSibling", ""}}), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingNodes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", "Uitle"}, {"org.jsoup.nodes.Element", "nextElementSibling", ""}, {"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "1.1234567"}}), new String[][]{{"iterator", "", "1"}, {"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingNodes", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jsoup.nodes.Element", "nextElementSibling", ""}, {"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "1.1234567"}, {"org.jsoup.nodes.Element", "previousElementSibling", ""}}, 3), new String[][]{{"iterator", "", "1"}, {"next", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "elementSiblingIndex", ""}, {"org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
