package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "title", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "previousElementSibling", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{}, new String[]{}, false), new String[][]{{"charset", "", "2"}});
  assertNotNull(actual);
  assertEquals("sun.nio.cs.UTF_8", actual.getClass().getName());
  assertEquals("UTF-8 {canEncode=true, isRegistered=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tagName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "classNames", "java.util.Set", "<empty>"}, {"org.jsoup.nodes.Document", "createElement", "java.lang.String", "x"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#root", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "append", new String[]{"java.lang.String"}, new String[]{"J"}, false), new String[][]{{"normalise", "", "0"}, {"getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "3"}, {"val", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body>\n  J \n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "append", new String[]{"java.lang.String"}, new String[]{"\n\u00e9"}, false, 2, new String[][]{}), new String[][]{{"outputSettings", "", "0"}, {"escapeMode", "org.jsoup.nodes.Entities$EscapeMode", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "\u00e9 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttribute", "java.lang.String", "1-5r"}}), new String[][]{{"outputSettings", "", "1"}, {"charset", "java.nio.charset.Charset", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\t1.5", "12345678901234678901234567890"}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "classNames", ""}}), new String[][]{{"outputSettings", "", "4"}, {"indentAmount", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "firstElementSibling", ""}}), new String[][]{{"indentAmount", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"1-5f.5"}, false, 6, new String[][]{}), new String[][]{{"outputSettings", "", "1"}, {"prettyPrint", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "1-5f.5 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"2049", "<sample:1>"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "text", "java.lang.String", "f123456789012346f78901234567890"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"1-1.5"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "title", "java.lang.String", "J"}}), new String[][]{{"nextElementSibling", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<html>\n <head>\n  <title>J</title>\n </head>\n <body></body>\n</html><1-1.5></1-1.5> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependText", new String[]{"java.lang.String"}, new String[]{""}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "", "#document1.12345678"}}), new String[][]{{"normalise", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "outputSettings", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "previousElementSibling", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "baseUri", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nextSibling", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "after", new String[]{"java.lang.String"}, new String[]{"0x7234567890x123456789"}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "getElementsByIndexEquals", "int", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:\ta>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "val", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "elementSiblingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String"}, new String[]{" "}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByIndexEquals", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "append", new String[]{"java.lang.String"}, new String[]{"aG,b,c"}, false, 3, new String[][]{}, 3), new String[][]{{"getElementsByTag", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "children", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "ownerDocument", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "val", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tag", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Tag", actual.getClass().getName());
  assertEquals("#root {canContainBlock=true, getName=#root, isBlock=false, isData=false, isEmpty=false, isInline=true, isKnownTag=false, isSelfClosing=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "child", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"t", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingOwnText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "id", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "childNode", "int", "0"}}, 1), new String[][]{{"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "children", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"removeAttr", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexLessThan", new String[]{"int"}, new String[]{"262144"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "head", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "attr", "java.lang.String,java.lang.String", "1e11.5", "1-5"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"2146435071", "<null>"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "text", "java.lang.String", "a,b,chead"}, {"org.jsoup.nodes.Document", "classNames", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "classNames", ""}}, 3), new String[][]{{"before", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"55"}, false, 3, new String[][]{}, 3), new String[][]{{"before", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "child", new String[]{"int"}, new String[]{"10"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "siblingIndex", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setSiblingIndex", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "getElementsMatchingOwnText", "java.lang.String", "1423456789012345678901234567890"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "append", "java.lang.String", ".5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".5", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>.5 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeAttr", new String[]{"java.lang.String"}, new String[]{"+W010"}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "select", "java.lang.String", "\na,b,c"}}, 2), new String[][]{{"getElementsByTag", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "title", new String[]{"java.lang.String"}, new String[]{"HII"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "absUrl", new String[]{"java.lang.String"}, new String[]{"1.5300"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{"java.lang.String"}, new String[]{".6"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "dataset", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-2147483647", "<sample:5>"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "2147483605", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "empty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "removeClass", "java.lang.String", "UDTF-8"}}, 1), new String[][]{{"nextElementSibling", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "1", "<null>"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "baseUri", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addClass", new String[]{"java.lang.String"}, new String[]{"I9I"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttribute", "java.lang.String", "-"}}, 1), new String[][]{{"attr", "java.lang.String,java.lang.String", "7"}, {"ownText", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-8", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "prependText", "java.lang.String", "htmli"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nodeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "hasClass", "java.lang.String", "Hello, Xorld+1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#document", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tagName", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#root", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "parent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "attributes", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementById", new String[]{"java.lang.String"}, new String[]{"1I5e400"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"2020-01-01UTF-8"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "toggleClass", "java.lang.String", "Titleaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.jsoup.nodes.Document", "baseUri", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nodeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "children", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#document", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"24"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "head", ""}}, 2), new String[][]{{"add", "int,org.jsoup.nodes.Element", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addClass", new String[]{"java.lang.String"}, new String[]{"html"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "tagName", ""}}, 1), new String[][]{{"classNames", "java.util.Set", "6"}, {"getElementsByIndexEquals", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createShell", new String[]{"java.lang.String"}, new String[]{"i"}, true, 0, null, 3), new String[][]{{"isBlock", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"tjtle", "1.251.5f"}, false, 0, null, 2), new String[][]{{"addAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hasText", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tag", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"isData", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createShell", new String[]{"java.lang.String"}, new String[]{"\r"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "previousElementSibling", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "previousSibling", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", ".5", ".1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"a,b,"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "html", ""}, {"org.jsoup.nodes.Document", "setBaseUri", "java.lang.String", "\r#doacument"}}, 3), new String[][]{{"nodeName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#document", String.valueOf(actual));
  assertEquals("receiver state after the call", "a,b, {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "removeAttr", "java.lang.String", "I\r\t"}}, 2), new String[][]{{"createElement", "java.lang.String", "7"}, {"childNodes", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "parent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "toString", ""}, {"org.jsoup.nodes.Document", "appendChild", "org.jsoup.nodes.Node", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{".6"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "html", ""}, {"org.jsoup.nodes.Document", "childNodes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{"0b/b"}, false, 0, null, 2), new String[][]{{"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678", "{\"a\":111}"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "19M", "#root"}}, 3), new String[][]{{"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nextElementSibling", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "attr", "java.lang.String,java.lang.String", "TITXLLE", "12:30:45UTF-8"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "preserveWhitespace", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nodeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "classNames", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#document", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567891"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "getElementsMatchingOwnText", "java.util.regex.Pattern", "<sample:0>"}}, 3), new String[][]{{"hasAttr", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsContainingText", new String[]{"java.lang.String"}, new String[]{"{\"a;:1}"}, false, 0, null, 3), new String[][]{{"is", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsContainingText", new String[]{"java.lang.String"}, new String[]{"xa,b,c"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attributes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "baseUri", ""}}, 1), new String[][]{{"iterator", "", "0"}, {"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nextSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "equals", "java.lang.Object", "<s:e>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attributes", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"size", "", "1"}, {"put", "org.jsoup.nodes.Attribute", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "lastElementSibling", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNode", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addClass", new String[]{"java.lang.String"}, new String[]{"\u00e8"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "addClass", "java.lang.String", "?true"}}, 3), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getElementsByAttribute", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodesAsArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "appendText", "java.lang.String", "HI"}});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[\nHI]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "HI {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"11.12345678901234567", "true"}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "empty", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "body", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "data", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"", "<sample:0>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addClass", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "siblingNodes", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingOwnText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:1>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nextElementSibling", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"8a,b,c"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"itml", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodesAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "after", "java.lang.String", "0xd1"}});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "siblingElements", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"<a></a>", "<sample:0>"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "siblingNodes", ""}}), new String[][]{{"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "lastElementSibling", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "child", new String[]{"int"}, new String[]{"49"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tag", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Tag", actual.getClass().getName());
  assertEquals("#root {canContainBlock=true, getName=#root, isBlock=false, isData=false, isEmpty=false, isInline=true, isKnownTag=false, isSelfClosing=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{" !"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtml", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "previousSibling", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "append", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a,b,c {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a,b,c {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "head", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "classNames", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNode", new String[]{"int"}, new String[]{"15"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsContainingText", new String[]{"java.lang.String"}, new String[]{"#document"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "parents", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hasAttr", new String[]{"java.lang.String"}, new String[]{"\ne"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByTag", "java.lang.String", "#root0x1F1.12345678"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\n", ":HI"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:0>", "<sample:6>"}}), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "html", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createShell", new String[]{"java.lang.String"}, new String[]{"PT2H"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "baseUri", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "childNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsMatchingOwnText", "java.lang.String", "UTF-8"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "val", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "absUrl", new String[]{"java.lang.String"}, new String[]{"1.123456"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "children", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "children", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "ownerDocument", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "append", new String[]{"java.lang.String"}, new String[]{"/1"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "getElementsByTag", "java.lang.String", "aaaaaaaaaaaaaaaaaa`aaaaaaaaaaa12:30:45"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("/1 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/1 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "before", new String[]{"java.lang.String"}, new String[]{"e"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "classNames", new String[]{"java.util.Set"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "preserveWhitespace", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "prepend", "java.lang.String", ""}, {"org.jsoup.nodes.Document", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodes", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "-2147483647", "<sample:1>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attributes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependText", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "nextSibling", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "after", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "siblingIndex", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"-1"}, false), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "siblingNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "-2147483648", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tag", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "head", ""}}), new String[][]{{"getName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#root", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "siblingIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "preserveWhitespace", ""}, {"org.jsoup.nodes.Document", "hasText", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "val", new String[]{"java.lang.String"}, new String[]{"TI"}, false), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"6\u00e9"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "elementSiblingIndex", ""}, {"org.jsoup.nodes.Document", "addChildren", "org.jsoup.nodes.Node[]", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tag", new String[]{}, new String[]{}, false), new String[][]{{"canContainBlock", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "equals", "java.lang.Object", "<i:-1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "val", new String[]{"java.lang.String"}, new String[]{"1.5ey00"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}}), new String[][]{{"getElementsByTag", "java.lang.String", "6"}, {"addClass", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"0123456789012345678901234567890"}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "2147483647", "<sample:4>"}}), new String[][]{{"last", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementById", "java.lang.String", " "}, {"org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", "int", "-10"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "val", new String[]{"java.lang.String"}, new String[]{"11"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "-2147483647", "<sample:3>"}}), new String[][]{{"before", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "nextSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("753707963", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tagName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "childNodesAsArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#root", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "id", ""}}), new String[][]{{"subList", "int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "baseUri", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "a\n<!--a--><!a> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String"}, new String[]{"\tnull"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "val", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "prependElement", "java.lang.String", "\"root-1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<\"root-1></\"root-1> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<\"root-1></\"root-1> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "empty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-2147483648", "<empty>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "tag", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:7>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-9>"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "ownText", ""}, {"org.jsoup.nodes.Document", "title", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "parent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "child", "int", "69"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeAttr", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFF"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "val", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "setSiblingIndex", "int", "-2147483640"}}), new String[][]{{"nextElementSibling", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"I", "I010"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "prependElement", "java.lang.String", "123456789012345678901234567890"}, {"org.jsoup.nodes.Document", "hashCode", ""}}), new String[][]{{"outerHtml", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<123456789012345678901234567890></123456789012345678901234567890>\n\n<123456789012345678901234567890></123456789012345678901234567890>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<123456789012345678901234567890></123456789012345678901234567890> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{" "}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "childNode", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "toggleClass", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "ownerDocument", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeAttr", new String[]{"java.lang.String"}, new String[]{"-0.i"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "lastElementSibling", ""}}), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeClass", new String[]{"java.lang.String"}, new String[]{"1-5f"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "appendElement", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "className", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"123456789012345678901234567890", "123456789012345668901234567890title"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "append", new String[]{"java.lang.String"}, new String[]{"body0xFFFFFFFF"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "UUSF-8", "#root-1"}}), new String[][]{{"html", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("0 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "parents", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "head", ""}}), new String[][]{{"lastIndexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"<a>be</a>"}, false, 6, new String[][]{}), new String[][]{{"last", "", "7"}, {"containsAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "classNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "0wFFFFFFFE", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567890123456html", "1.1234567890123456"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"hhtml"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "attr", "java.lang.String,java.lang.String", "UFF8", "/a/bhead-0.0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<hhtml></hhtml> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html><hhtml></hhtml> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String"}, new String[]{"{\"a\""}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "prependElement", "java.lang.String", ".51.12345678\u00e9"}, {"org.jsoup.nodes.Document", "attributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<.51.12345678\u00e9></.51.12345678\u00e9> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsMatchingText", "java.lang.String", "/a/c.5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "val", new String[]{"java.lang.String"}, new String[]{"6abc"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 4, new String[][]{}), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html><1.5></1.5> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x1F", "\t"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"134217716"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "childNodesAsArray", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "select", new String[]{"java.lang.String"}, new String[]{"01.1234567890123456"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "addClass", "java.lang.String", "HI5.5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "baseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "empty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsMatchingOwnText", "java.util.regex.Pattern", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "previousElementSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "bac", "1L"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "previousSibling", ""}}), new String[][]{{"getElementsByClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{"a,"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "absUrl", "java.lang.String", "1body"}}), new String[][]{{"removeAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "ownerDocument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "text", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nodeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:1>"}, {"org.jsoup.nodes.Document", "getElementsByAttributeStarting", "java.lang.String", "-0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#document", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a ", "tiule"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "prependText", "java.lang.String", "f3147483648"}}), new String[][]{{"set", "int,org.jsoup.nodes.Element", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"i0"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "data", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "select", new String[]{"java.lang.String"}, new String[]{"title1.12345678901234567"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "previousSibling", ""}}), new String[][]{{"retainAll", "java.util.Collection", "2"}, {"indexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false), new String[][]{{"getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "append", "java.lang.String", ";a>b</a>"}, {"org.jsoup.nodes.Document", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "0", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(";a>b", String.valueOf(actual));
  assertEquals("receiver state after the call", ";a&gt;b {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "wrap", new String[]{"java.lang.String"}, new String[]{"2\t9"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "ownerDocument", new String[]{}, new String[]{}, false), new String[][]{{"body", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "hasClass", "java.lang.String", "0x1E"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeClass", new String[]{"java.lang.String"}, new String[]{"\t1.5"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "classNames", ""}}), new String[][]{{"hasAttr", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nextSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "after", "java.lang.String", "12:30:45true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "[2,82]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "elementSiblingIndex", ""}, {"org.jsoup.nodes.Document", "childNodesAsArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "append", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "children", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "2147483647", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<null>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "title", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "html", "java.lang.String", "/a/c"}, {"org.jsoup.nodes.Document", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "/a.b-1", "oull"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/a/c {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hasText", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "hasAttr", "java.lang.String", "0x1F1E-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "child", "int", "236"}}), new String[][]{{"hasText", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"\t2020-02-30T25:61:61"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsMatchingText", "java.lang.String", "0x1rFbody"}}), new String[][]{{"data", "", "1"}, {"nextElementSibling", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<2020-02-30t25:61:61></2020-02-30t25:61:61> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "val", ""}}), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "val", ""}}), new String[][]{{"val", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:4>", "-30", "<sample:6>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"4."}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "after", "java.lang.String", "html"}}), new String[][]{{"prependChild", "org.jsoup.nodes.Node", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<4.>0\n</4.> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<4.>0\n</4.> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "elementSiblingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "head", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("0 {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "ownerDocument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "hasText", ""}}), new String[][]{{"after", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsContainingOwnText", "java.lang.String", "123456789012345678901234567890[1,2]"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "addClass", "java.lang.String", "<>b</a>"}}), new String[][]{{"isKnownTag", "", "0"}, {"preserveWhitespace", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "children", new String[]{}, new String[]{}, false), new String[][]{{"subList", "int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\n0x2F", "1.12345678123456789012345678901234567890"}, false), new String[][]{{"after", "java.lang.String", "0"}, {"listIterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "previousSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "setParentNode", "org.jsoup.nodes.Node", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "a\n<!--a--><!a> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attributes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "getElementsContainingText", "java.lang.String", "1.5e"}}), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attributes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "lastElementSibling", ""}}), new String[][]{{"hasKey", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getAllElements", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"2147483647", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"1.5ey0"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "outerHtml", "java.lang.StringBuilder", "<sample:1>"}}), new String[][]{{"outerHtml", "", "6"}, {"after", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<1.5ey0></1.5ey0> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<1.5ey0></1.5ey0>a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "children", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}, {"org.jsoup.nodes.Document", "getElementsByAttributeStarting", "java.lang.String", "true0x1F"}}), new String[][]{{"prepend", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<#root></#root>a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/a/b"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/a/b {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/a/b {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setSiblingIndex", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "ownerDocument", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "childNodesAsArray", ""}}), new String[][]{{"classNames", "java.util.Set", "3"}, {"appendText", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("sample {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "getElementsByClass", "java.lang.String", "gtml"}}), new String[][]{{"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeClass", new String[]{"java.lang.String"}, new String[]{"a,b,1.5f"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "body", ""}}), new String[][]{{"firstElementSibling", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "ownText", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "appendChild", "org.jsoup.nodes.Node", "<null>"}, {"org.jsoup.nodes.Document", "addClass", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "classNames", "java.util.Set", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"--1title010", "22:30:45"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "preserveWhitespace", ""}}), new String[][]{{"html", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false), new String[][]{{"lastElementSibling", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"i"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("i {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "i {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsMatchingText", "java.lang.String", "1.2"}}), new String[][]{{"after", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nextSibling", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "12>30:45", "1/5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingOwnText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "IBI", "it8l"}}), new String[][]{{"clear", "", "2"}, {"retainAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "appendElement", "java.lang.String", "<a>b</af>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a>b</af>></<a>b</af>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeClass", new String[]{"java.lang.String"}, new String[]{"1.5"}, false), new String[][]{{"getElementsByIndexGreaterThan", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"HI0x123456789", ""}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "appendChild", "org.jsoup.nodes.Node", "<sample:6>"}}), new String[][]{{"get", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "html", ""}, {"org.jsoup.nodes.Document", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:7>", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "parents", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"add", "int,org.jsoup.nodes.Element", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeAttr", new String[]{"java.lang.String"}, new String[]{"bod "}, false), new String[][]{{"appendElement", "java.lang.String", "3"}, {"getElementsByIndexLessThan", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "title", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "2020-02-30Td5:61:61", "UTE-8"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "H123456789012345678901234567890"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "body", ""}, {"org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "2020-01-01", " 10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "children", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsMatchingText", "java.lang.String", "0x1234567889"}}), new String[][]{{"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false), new String[][]{{"before", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "wrap", new String[]{"java.lang.String"}, new String[]{"HI"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementById", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c0"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "appendElement", "java.lang.String", "\t1E-5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<1e-5></1e-5> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeAttr", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "removeClass", "java.lang.String", "Ii"}}), new String[][]{{"absUrl", "java.lang.String", "2"}, {"dataset", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "empty", new String[]{}, new String[]{}, false), new String[][]{{"getElementsByAttribute", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "parent", ""}}), new String[][]{{"addAll", "int,java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"0x8F"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsContainingOwnText", "java.lang.String", "0x123456789"}, {"org.jsoup.nodes.Document", "text", "java.lang.String", "HI9"}}), new String[][]{{"removeClass", "java.lang.String", "6"}, {"indexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "appendElement", "java.lang.String", "1.1234567890123456-1"}, {"org.jsoup.nodes.Document", "setParentNode", "org.jsoup.nodes.Node", "<sample:5>"}}), new String[][]{{"getElementById", "java.lang.String", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<1.1234567890123456-1></1.1234567890123456-1>\n<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "elementSiblingIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "html", "java.lang.String", "{\"b\":1}"}, {"org.jsoup.nodes.Document", "getElementsByAttributeStarting", "java.lang.String", "cead"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{&quot;b&quot;:1} {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addClass", new String[]{"java.lang.String"}, new String[]{"head1.12345678"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "appendElement", "java.lang.String", "\u00e9,"}}), new String[][]{{"nextSibling", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<\u00e9,></\u00e9,> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "children", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "appendText", "java.lang.String", "0xFFFFFFFF1L2020-02-30T25:61:61"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0xFFFFFFFF1L2020-02-30T25:61:61 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "children", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "hasAttr", "java.lang.String", "0.5 "}}), new String[][]{{"hasAttr", "java.lang.String", "6"}, {"html", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"#document"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "getElementsMatchingText", "java.lang.String", " "}, {"org.jsoup.nodes.Document", "appendElement", "java.lang.String", "body"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("#document\n<body></body> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "#document\n<body></body> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false), new String[][]{{"createElement", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\t\t", "\tI"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"PTH"}, false), new String[][]{{"hasText", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setBaseUri", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "1.12345678901234567nullhtml", "[[,2]"}, {"org.jsoup.nodes.Document", "prepend", "java.lang.String", "9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "9 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"1..5"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "id", ""}, {"org.jsoup.nodes.Document", "getElementsMatchingOwnText", "java.util.regex.Pattern", "<sample:4>"}}), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "3"}, {"eq", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<1..5></1..5> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeClass", new String[]{"java.lang.String"}, new String[]{""}, false, 4, new String[][]{}), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html>\n<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>\n<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"1/5"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<1/5></1/5> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<1/5></1/5> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addClass", new String[]{"java.lang.String"}, new String[]{"GBI"}, false), new String[][]{{"html", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"[1,<2 ", ""}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "1.5e300", "[0,2]"}}), new String[][]{{"dataset", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "appendChild", "org.jsoup.nodes.Node", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<!--a-->\n<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!--a-->\n<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"15"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "getElementsMatchingOwnText", "java.lang.String", "X"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<15></15> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<15></15> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "-532", "<sample:8>"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "getElementsMatchingText", "java.util.regex.Pattern", "<sample:4>"}, {"org.jsoup.nodes.Document", "prependChild", "org.jsoup.nodes.Node", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "elementSiblingIndex", ""}, {"org.jsoup.nodes.Document", "attr", "java.lang.String,java.lang.String", "-1.5U", "+1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" -1.5u=\"+1\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 6, new String[][]{}), new String[][]{{"hasClass", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<2020-01-01></2020-01-01> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "parents", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"removeAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "getElementsByIndexLessThan", "int", "-2"}}), new String[][]{{"addAll", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendText", new String[]{"java.lang.String"}, new String[]{"2L020-02-3T25:61:61"}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "getElementsContainingOwnText", "java.lang.String", "http://example.com/a?b=c"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("2L020-02-3T25:61:61 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2L020-02-3T25:61:61 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"1.5ey00"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "toggleClass", "java.lang.String", "[1,2]\n1E-5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<1.5ey00></1.5ey00> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<1.5ey00></1.5ey00> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attributes", new String[]{}, new String[]{}, false), new String[][]{{"html", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "classNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "2147483597", "<null>"}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "after", "java.lang.String", "--1"}, {"org.jsoup.nodes.Document", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "01F"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<0x1f></0x1f> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html><0x1f></0x1f> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aa#document", "1/5d"}, false), new String[][]{{"lastIndexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "2147483647", "<sample:10>"}}), new String[][]{{"classNames", "java.util.Set", "6"}, {"getElementsByIndexGreaterThan", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0x123456789 class=\"0\"></0x123456789> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"IHII"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<ihii></ihii> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<ihii></ihii> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addClass", new String[]{"java.lang.String"}, new String[]{"x1"}, false), new String[][]{{"children", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "append", new String[]{"java.lang.String"}, new String[]{"02"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("02 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "02 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{".5f"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "lastElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<.5f></.5f> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<.5f></.5f> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeAttr", new String[]{"java.lang.String"}, new String[]{"0xGFFFFFFG"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "getElementById", "java.lang.String", "tru>HII"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "classNames", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"add", "java.lang.Object", "5"}, {"isEmpty", "", "0"}, {"add", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"Tjtl"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "parent", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"#documenn0", "2147483648/a/b"}, false), new String[][]{{"removeAll", "java.util.Collection", "6"}, {"subList", "int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
}
