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
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"+0"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "attr", "java.lang.String", "1E-5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "-10", "<sample:7>"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexLessThan", "int", "1073758188"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataset", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "siblingElements", ""}, {"org.jsoup.nodes.Element", "ownerDocument", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"textrea"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "after", "org.jsoup.nodes.Node", "<sample:0>"}, {"org.jsoup.nodes.Element", "previousElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getAllElements", ""}, {"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "prepend", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"1E45I1.12345678901234567"}, false, 3, new String[][]{}), new String[][]{{"getElementsMatchingText", "java.util.regex.Pattern", "2"}, {"forms", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n 1E45I1.12345678901234567\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "empty", ""}}), new String[][]{{"data", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n <!--a-->\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "7"}, {"after", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"xFFFFFEFF", "\u00e9null"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "baseUri", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsContainingOwnText", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "-49", "<sample:3>"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "5"}, {"hasClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "nextElementSibling", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "preserveWhitespace", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendElement", new String[]{"java.lang.String"}, new String[]{"a{"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsByClass", "java.lang.String", "-.-51.5"}}, 3), new String[][]{{"getElementsByIndexGreaterThan", "int", "6"}, {"removeAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n <a{></a{>\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{}), new String[][]{{"dataNodes", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"b{r"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "tag", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "isBlock", ""}}), new String[][]{{"getElementsContainingOwnText", "java.lang.String", "7"}, {"tagName", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n <#root></#root>\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"nulm", "11e10"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", ";"}}), new String[][]{{"listIterator", "", "6"}, {"set", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaa{aaaaaaaaaaa"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "prepend", "java.lang.String", "-\"-1>"}, {"org.jsoup.nodes.Element", "doClone", "org.jsoup.nodes.Node", "<sample:2>"}}, 2), new String[][]{{"getElementsByTag", "java.lang.String", "7"}, {"removeAttr", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" value=\"aaaaaaaaaaaaaaaaaaa{aaaaaaaaaaa\">\n -\"-1&gt;\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendElement", new String[]{"java.lang.String"}, new String[]{"xFFFFFEFF\""}, false, 7, new String[][]{}, 3), new String[][]{{"before", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<xfffffeff\"></xfffffeff\"> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n 0\n <xfffffeff\"></xfffffeff\">\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "append", "java.lang.String", "60H"}, {"org.jsoup.nodes.Element", "previousSibling", ""}}, 1), new String[][]{{"getElementsMatchingText", "java.util.regex.Pattern", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<{\"a\":1} comment=\"a\">\n 60H\n <!--a-->\n</{\"a\":1}>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n 60H\n <!--a-->\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"Patutern syntax ersor: "}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "(e10", "s"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "baseUri", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "br"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n <br>\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"10"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "equals", "java.lang.Object", "<sample:0>"}}, 1), new String[][]{{"parents", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendElement", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaataaaaaaaa"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "traverse", "org.jsoup.select.NodeVisitor", "<sample:7>"}}), new String[][]{{"after", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<aaaaaaaaaaaaaaaaaaaaaataaaaaaaa></aaaaaaaaaaaaaaaaaaaaaataaaaaaaa> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n <aaaaaaaaaaaaaaaaaaaaaataaaaaaaa></aaaaaaaaaaaaaaaaaaaaaataaaaaaaa>\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendElement", new String[]{"java.lang.String"}, new String[]{"a,b,cTITLE"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "before", "java.lang.String", "texxtr(e`"}, {"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "1.5e300"}}), new String[][]{{"before", "org.jsoup.nodes.Node", "2"}, {"firstElementSibling", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" class=\"\">\n <#root></#root>\n <a,b,ctitle></a,b,ctitle>\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{"java.lang.String"}, new String[]{"5 /v>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "ownerDocument", ""}, {"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "[1+2]"}}, 1), new String[][]{{"classNames", "java.util.Set", "1"}, {"getElementsByClass", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<5 /v> comment=\"a\" class=\"a 0\"></5 /v>>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<5 /v> comment=\"a\" class=\"a 0\"></5 /v>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"!)>  > \t", ">d.12345678"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "a,b,-c", "Pattern syntax drror: 123456789012345678901234567890"}}), new String[][]{{"clear", "", "3"}, {"removeAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", ">d.12346673-1.5"}}, 2), new String[][]{{"getElementsByIndexLessThan", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "-..v51/5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n <-..v51/5></-..v51/5>\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataNodes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "addChildren", "org.jsoup.nodes.Node[]", "<sample:7>"}}), new String[][]{{"subList", "int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-./", "i"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "2097162", "<sample:4>"}}, 1), new String[][]{{"append", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{"\tb"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "brrclavss"}}), new String[][]{{"appendElement", "java.lang.String", "6"}, {"getElementsContainingText", "java.lang.String", "7"}, {"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\"\tb\">\n <0></0>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"><!a>\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendElement", new String[]{"java.lang.String"}, new String[]{"5 .v></"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "replaceWith", "org.jsoup.nodes.Node", "<sample:6>"}}), new String[][]{{"nextElementSibling", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n <5 .v></></5 .v></>\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "preserveWhitespace", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{"java.lang.String"}, new String[]{"0H"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "childNodeSize", ""}}, 2), new String[][]{{"appendElement", "java.lang.String", "1"}, {"lastElementSibling", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n 0H\n <a></a>\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesCopy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "null"}}), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n <null></null>\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "addClass", "java.lang.String", "1.5d"}}, 2), new String[][]{{"getElementById", "java.lang.String", "2"}, {"hasClass", "java.lang.String", "5"}, {"html", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\" class=\"1.5d\">\n 0\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" class=\"1.5d\">\n 0\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendElement", new String[]{"java.lang.String"}, new String[]{"Hdllo, Word2020-01-01"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "lastElementSibling", ""}}), new String[][]{{"append", "java.lang.String", "2"}, {"before", "org.jsoup.nodes.Node", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<hdllo, word2020-01-01>\n 0\n</hdllo, word2020-01-01> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">a\n <hdllo, word2020-01-01>\n  0\n </hdllo, word2020-01-01>\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasText", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "childNodesAsArray", ""}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "123456789012345678901234567890", "{\"a\":1}"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{"java.lang.String"}, new String[]{"\\s*"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "tagName", "java.lang.String", "texttr(e`+1"}, {"org.jsoup.nodes.Element", "hashCode", ""}}), new String[][]{{"insertChildren", "int,java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayStoreException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendElement", new String[]{"java.lang.String"}, new String[]{"//"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "childNode", "int", "0"}}, 3), new String[][]{{"firstElementSibling", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n <//><///>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendElement", new String[]{"java.lang.String"}, new String[]{"0H"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "clone", ""}}), new String[][]{{"cssSelector", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y > 0h", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n <0h></0h>\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "equals", "java.lang.Object", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "tfxtrrea"}, {"org.jsoup.nodes.Element", "text", "java.lang.String", "/"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n/]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n /\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownText", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "html", "java.lang.String", "\u00e9"}, {"org.jsoup.nodes.Element", "html", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n \u00e9\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendElement", new String[]{"java.lang.String"}, new String[]{"textrea"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "children", ""}}), new String[][]{{"after", "org.jsoup.nodes.Node", "6"}, {"getElementsMatchingText", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n <textrea></textrea>\n <!--a-->\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addClass", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 3, new String[][]{}), new String[][]{{"cssSelector", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>.PT1H", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\"PT1H\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "appendChild", "org.jsoup.nodes.Node", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">0\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setSiblingIndex", new String[]{"int"}, new String[]{"-1048577"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "http://eample.com/a?b=c", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "1.123455678", "a,b,cI"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "lastElementSibling", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataNodes", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendElement", new String[]{"java.lang.String"}, new String[]{"1.1345678+1"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "1e10", ".?"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "empty", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "hasText", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"1.25", "<sample:4>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "dataNodes", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "before", "org.jsoup.nodes.Node", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "262189", "<sample:0>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "insertChildren", new String[]{"int", "java.util.Collection"}, new String[]{"20", "<sample:2>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesCopy", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "isBlock", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "lastElementSibling", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\010", "</"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "before", "org.jsoup.nodes.Node", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parentNode", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "removeClass", "java.lang.String", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeAttr", new String[]{"java.lang.String"}, new String[]{"1\".123456789012u34567"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"15e31/", "Si\tle"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "lastElementSibling", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", "<null>", "ar"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "data", ""}}, 3), new String[][]{{"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"-2147483584"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "classNames", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "after", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "1x1F", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "append", new String[]{"java.lang.String"}, new String[]{"[a,2]"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "1", "<sample:3>"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "previousSibling", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "after", new String[]{"java.lang.String"}, new String[]{"null"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "id", ""}, {"org.jsoup.nodes.Element", "childNodeSize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "before", "java.lang.String", "-1Pattern syntax error: "}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendElement", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"br"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "textNodes", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "html", "java.lang.String", "-1.t5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"textr(e`"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "classNames", "java.util.Set", "<sample:2>"}}, 3), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "3"}, {"forms", "", "2"}, {"remove", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" class=\"0 sample \">\n textr(e`\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{" />"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "childNodeSize", ""}}, 3), new String[][]{{"removeClass", "java.lang.String", "5"}, {"hasAttr", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"-0.1", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "removeAttr", "java.lang.String", "1.25123456789012345678901234567990"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "-64", "<sample:0>"}, {"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "5d"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12356", "2"}, false, 7, new String[][]{}, 1), new String[][]{{"add", "int,java.lang.Object", "2"}, {"hasAttr", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasText", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"262144", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "dataset", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "absUrl", new String[]{"java.lang.String"}, new String[]{"iX"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "setParentNode", "org.jsoup.nodes.Node", "<sample:1>"}, {"org.jsoup.nodes.Element", "addChildren", "org.jsoup.nodes.Node[]", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parents", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"toggleClass", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependElement", new String[]{"java.lang.String"}, new String[]{"I"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "1073758258"}, {"org.jsoup.nodes.Element", "prepend", "java.lang.String", ".5--1:nth-child(%d)"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodes", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendElement", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "attributes", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"l"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "append", "java.lang.String", "http://eample."}}, 3), new String[][]{{"after", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendElement", new String[]{"java.lang.String"}, new String[]{" )>  > "}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "id", ""}}, 1), new String[][]{{"elementSiblingIndex", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n <)>  >></)>  >>\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "-24", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "appendElement", "java.lang.String", " Hello, World"}}, 1), new String[][]{{"tagName", "java.lang.String", "1"}, {"val", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "before", "org.jsoup.nodes.Node", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesCopy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "previousSibling", ""}, {"org.jsoup.nodes.Element", "siblingIndex", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "baseUri", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesCopy", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "cssSelector", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"aa0", "<sample:4>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "append", "java.lang.String", ">"}, {"org.jsoup.nodes.Element", "replaceWith", "org.jsoup.nodes.Node", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "children", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{"java.util.Set"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "previousSibling", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\" class=\"0 sample \"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\"0 sample \"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"add", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"-..51.5"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", "5 /v>"}, {"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "aaaaaaaaaaaa1aaaaaa<aaaaaaaaaaa"}}, 1), new String[][]{{"wrap", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" class=\"\">\n 5 /v&gt;\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasClass", new String[]{"java.lang.String"}, new String[]{"class"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "previousElementSibling", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "2020-02-30b25:61:61"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"5 /v>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "addClass", "java.lang.String", "aaaaaaaaaaaaa1aaaaa<aaaaaaaaaaa"}}, 1), new String[][]{{"className", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaa1aaaaa<aaaaaaaaaaa", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" class=\"aaaaaaaaaaaaa1aaaaa<aaaaaaaaaaa\">\n 5 /v&gt;\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "unwrap", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesCopy", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"trimToSize", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "1073758207", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "after", new String[]{"java.lang.String"}, new String[]{"/10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "1", "<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "attr", "java.lang.String,java.lang.String", "1E45I", "texttarea\\s+"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingNodes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "firstElementSibling", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"1073758258", "<null>"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "getElementsByTag", "java.lang.String", ".?"}, {"org.jsoup.nodes.Element", "append", "java.lang.String", "1.5e31/"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasClass", new String[]{"java.lang.String"}, new String[]{"[1,2]1.5d"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextElementSibling", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeName", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1x123456789", "+2"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{".?"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<x \t y comment=\"a\">\n .?\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n .?\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{";"}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "getElementsByTag", "java.lang.String", "Hello, World"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "child", new String[]{"int"}, new String[]{"1073758258"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678", "12345678901234578901234567890"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attributes", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"Hdllo, Word"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/a", "5 />"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "wrap", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendElement", new String[]{"java.lang.String"}, new String[]{"0x1234456789"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousElementSibling", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodeSize", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "baseUri", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependElement", new String[]{"java.lang.String"}, new String[]{"{\"\t:1}"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeClass", new String[]{"java.lang.String"}, new String[]{"#"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addClass", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\" class=\"\t\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" class=\"\t\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parents", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependElement", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<1.5d></1.5d> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n <1.5d></1.5d>\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "before", new String[]{"java.lang.String"}, new String[]{"r5."}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "clone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "0", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "unwrap", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownText", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "Patutern syntax error: ", "\n"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownerDocument", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"2147483647", "<empty>"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", "http://eam;le.com/a?b=c010"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "childNodeSize", ""}, {"org.jsoup.nodes.Element", "addClass", "java.lang.String", "\n"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Tag", actual.getClass().getName());
  assertEquals("x \t y {canContainBlock=true, getName=x \t y, isBlock=false, isData=false, isEmpty=false, isFormListed=false, isFormSubmittable=false, isInline=true, isKnownTag=false, isSelfClosing=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" class=\"\n\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "wrap", new String[]{"java.lang.String"}, new String[]{"0"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"0"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\">\n 0\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n 0\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "val", "java.lang.String", "\ttru+"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "empty", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "parents", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNode", new String[]{"int"}, new String[]{"10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"E-5"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "before", "org.jsoup.nodes.Node", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parents", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "#r(oot", "-./"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesCopy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", "\n"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownText", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasText", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataNodes", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:4>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<x \t y comment=\"a\"></x \t y>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "0x123456789"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "lastElementSibling", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parents", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addClass", new String[]{"java.lang.String"}, new String[]{"--1+1"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\" class=\"--1+1\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\"--1+1\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasAttr", new String[]{"java.lang.String"}, new String[]{"/a"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "childNodes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownerDocument", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "prepend", "java.lang.String", "P0H"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n P0H\n</{\"a\":1}> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "removeAttr", "java.lang.String", "`bc"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "before", "java.lang.String", "0%1F"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getAllElements", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "appendChild", "org.jsoup.nodes.Node", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "append", new String[]{"java.lang.String"}, new String[]{"1.123567"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "after", "java.lang.String", "Pattern syntax error: 123456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<x \t y comment=\"a\">\n 1.123567\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n 1.123567\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "absUrl", new String[]{"java.lang.String"}, new String[]{".010"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"051F", "a1.5e300"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nodeName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "child", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parent", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attr", new String[]{"java.lang.String"}, new String[]{"5."}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "childNodeSize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"Patutern syntax errorD "}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "after", "org.jsoup.nodes.Node", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{">d.12345678"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "childNodes", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\" class=\">d.12345678\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" class=\">d.12345678\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "--1"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.util.regex.Pattern", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeAttr", new String[]{"java.lang.String"}, new String[]{"00"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingOwnText", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\"><!a>\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"><!a>\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"\\s+"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "nextElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attr", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNode", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "removeAttr", "java.lang.String", "X-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "children", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "nextSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parents", new String[]{}, new String[]{}, false), new String[][]{{"addAll", "int,java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "elementSiblingIndex", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "append", new String[]{"java.lang.String"}, new String[]{"class"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "classNames", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:1>", "<sample:7>"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "addClass", "java.lang.String", "<"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "wrap", new String[]{"java.lang.String"}, new String[]{"1.5e31/"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{":nth-chil(%d)a b"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "childNodeSize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"e", "0x1b"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", "/a0b"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasClass", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "0", "<sample:0>"}, {"org.jsoup.nodes.Element", "removeAttr", "java.lang.String", "0laass"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousSibling", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "prepend", "java.lang.String", "textarea1E-5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n textarea1E-5\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "cssSelector", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", "int", "-2147483645"}, {"org.jsoup.nodes.Element", "append", "java.lang.String", "1.12D4567890123356"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{"-1. "}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "l2", "\\s+"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<x \t y comment=\"a\" class=\"-1. \"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" class=\"-1. \"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownText", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "addClass", "java.lang.String", ".?"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" class=\".?\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "1073741825", "<sample:3>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "hasText", ""}, {"org.jsoup.nodes.Element", "setBaseUri", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "-5", "<sample:0>"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "equals", "java.lang.Object", "<d:1.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getOutputSettings", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "baseUri", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"\t", "<empty>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeClass", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "nextElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\" class=\"\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" class=\"\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{"java.lang.String"}, new String[]{"1.122456778"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "after", "java.lang.String", ";1.12345678901234567<"}, {"org.jsoup.nodes.Element", "prepend", "java.lang.String", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n truea\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "childNodeSize", ""}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"1h25"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "lastElementSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexLessThan", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "firstElementSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:6>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">a\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getAllElements", ""}, {"org.jsoup.nodes.Element", "dataset", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1} comment=\"a\">\n <#root></#root>\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\">\n <#root></#root>\n</{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "append", new String[]{"java.lang.String"}, new String[]{"true"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "siblingIndex", ""}}), new String[][]{{"html", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n true\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "id", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingOwnText", "java.lang.String", "http://eample.com/a?b=c1.5"}, {"org.jsoup.nodes.Element", "cssSelector", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "remove", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "className", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "className", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependElement", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFFF#"}, false, 5, new String[][]{}), new String[][]{{"cssSelector", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodeSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "baseUri", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getOutputSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "before", "org.jsoup.nodes.Node", "<sample:5>"}}), new String[][]{{"prettyPrint", "", "1"}, {"syntax", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings$Syntax", actual.getClass().getName());
  assertEquals("html", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:27>"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "firstElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "childNodesCopy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "parent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prepend", new String[]{"java.lang.String"}, new String[]{"5 PT1H"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "-2147483648", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Si\tle", "1.5d"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingNodes", new String[]{}, new String[]{}, false), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1492351785", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendElement", new String[]{"java.lang.String"}, new String[]{"l"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<l></l> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n <l></l>\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "after", "org.jsoup.nodes.Node", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "className", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", ":nth-chile(%d)null"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n <:nth-chile(%d)null></:nth-chile(%d)null>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownerDocument", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "replaceWith", "org.jsoup.nodes.Node", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<#", "Pattern syntax error: 12356789012345678901234567890"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "siblingIndex", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:4>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "appendChild", "org.jsoup.nodes.Node", "<sample:0>"}}), new String[][]{{"html", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!--a-->\n<#root></#root>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n <!--a-->\n <#root></#root>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tag", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "1073758258"}}), new String[][]{{"getName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "-2147483647", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 7, new String[][]{}), new String[][]{{"html", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<x \t y comment=\"a\">\n 0\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\">\n 0\n</x \t y> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "child", new String[]{"int"}, new String[]{"1073758207"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{"<\\s+"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}), new String[][]{{"attr", "java.lang.String,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\" 0=\"sample\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\" 0=\"sample\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addClass", new String[]{"java.lang.String"}, new String[]{"Hdloo, Word"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "siblingIndex", ""}, {"org.jsoup.nodes.Element", "after", "java.lang.String", "clvss"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownText", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.util.regex.Pattern", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"1.123567"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "childNodesAsArray", ""}, {"org.jsoup.nodes.Element", "attr", "java.lang.String", "Sh\tletrue"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"a\t"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "attributes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "prepend", "java.lang.String", "1E45I1.12345678901234567"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setSiblingIndex", new String[]{"int"}, new String[]{"-9"}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "classNames", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{"java.lang.String"}, new String[]{"http://eample.com/a?b=c1.5"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<http://eample.com/a?b=c1.5 comment=\"a\"></http://eample.com/a?b=c1.5> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<http://eample.com/a?b=c1.5 comment=\"a\"></http://eample.com/a?b=c1.5> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataNodes", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"add", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "text", ""}, {"org.jsoup.nodes.Element", "textNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeClass", new String[]{"java.lang.String"}, new String[]{"TITLF"}, false, 5, new String[][]{}), new String[][]{{"getElementsMatchingText", "java.util.regex.Pattern", "2"}, {"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} comment=\"a\" class=\"\"></{\"a\":1}> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "2147483647", "<sample:4>"}, {"org.jsoup.nodes.Element", "nodeName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "5/", "<empty>"}}), new String[][]{{"nextSibling", "", "7"}, {"appendChild", "org.jsoup.nodes.Node", "1"}, {"isBlock", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\" class=\"2020-01-01\">a\n</x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{" 1L"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "-10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasText", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataNodes", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"isEmpty", "", "2"}, {"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"textrea"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "#root", "1."}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\">\n textrea\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n textrea\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.lang.String", "2147483(648"}}), new String[][]{{"className", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\">\n 1.25\n</<a><b>t</b></a>> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementById", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attr", new String[]{"java.lang.String"}, new String[]{"0P"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "parentNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parentNode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"></<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<<a><b>t</b></a> comment=\"a\"><!a>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> comment=\"a\"><!a>\n</<a><b>t</b></a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "childNode", "int", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<x \t y comment=\"a\"></x \t y> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
