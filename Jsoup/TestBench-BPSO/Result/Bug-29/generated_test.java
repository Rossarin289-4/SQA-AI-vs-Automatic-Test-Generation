package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "title", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "prependElement", "java.lang.String", "Hello, rWor"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<hello, rwor></hello, rwor> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "isBlock", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "quirksMode", new String[]{"org.jsoup.nodes.Document$QuirksMode"}, new String[]{"<sample:2>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "text", "java.lang.String", "rodot"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body>\n  rodot\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"charset", "", "4"}});
  assertNotNull(actual);
  assertEquals("sun.nio.cs.UTF_8", actual.getClass().getName());
  assertEquals("UTF-8 {canEncode=true, isRegistered=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "quirksMode", ""}, {"org.jsoup.nodes.Document", "prepend", "java.lang.String", "i"}}), new String[][]{{"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  i \n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body>\n  i \n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "Titl/null", "0"}, {"org.jsoup.nodes.Document", "prependText", "java.lang.String", "  "}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}, {"org.jsoup.nodes.Document", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}}), new String[][]{{"indentAmount", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\">a {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "removeClass", "java.lang.String", ".5"}}), new String[][]{{"escapeMode", "org.jsoup.nodes.Entities$EscapeMode", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{}, new String[]{}, false), new String[][]{{"prettyPrint", "boolean", "5"}, {"indentAmount", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:11>"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "textNodes", ""}}, 3), new String[][]{{"createElement", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<sample></sample> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "title", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "title", "java.lang.String", "Hello, srWor"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, srWor", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head>\n  <title>Hello, srWor</title>\n </head>\n <body></body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "head", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setSiblingIndex", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hasText", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getAllElements", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "before", "org.jsoup.nodes.Node", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nextSibling", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "0x1234m6789"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "hashCode", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tagName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "attributes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#root", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "elementSiblingIndex", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "nodeName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"[1,/]"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "body", ""}}, 1), new String[][]{{"attr", "java.lang.String,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tag", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Tag", actual.getClass().getName());
  assertEquals("#root {canContainBlock=true, getName=#root, isBlock=false, isData=false, isEmpty=false, isInline=true, isKnownTag=false, isSelfClosing=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeAttr", new String[]{"java.lang.String"}, new String[]{"I.5f"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"Hello, rWor"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "lastElementSibling", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "getElementsMatchingOwnText", "java.lang.String", "a"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Hello, Worldd", "\037"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "quirksMode", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$QuirksMode", actual.getClass().getName());
  assertEquals("noQuirks", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addClass", new String[]{"java.lang.String"}, new String[]{"#doocument"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "baseUri", ""}, {"org.jsoup.nodes.Document", "elementSiblingIndex", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{"java.lang.String"}, new String[]{"aq b"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "nextSibling", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "-2147483648", "<sample:5>"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "textNodes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "1.51.5f", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getAllElements", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"parents", "", "4"}, {"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nextSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "classNames", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"0"}, false, 6, new String[][]{}, 2), new String[][]{{"getElementsMatchingText", "java.util.regex.Pattern", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "outputSettings", "org.jsoup.nodes.Document$OutputSettings", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createShell", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "toString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "child", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "outputSettings", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tagName", new String[]{"java.lang.String"}, new String[]{"null"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "parent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByIndexEquals", "int", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "10", "<sample:0>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "id", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "before", "java.lang.String", "1e1d"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "ownerDocument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "absUrl", "java.lang.String", "Title"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "className", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", "int", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"---1"}, false, 4, new String[][]{}, 1), new String[][]{{"nextElementSibling", "", "2"}, {"getElementsByTag", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<---1></---1>\n<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "children", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtml", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "appendChild", "org.jsoup.nodes.Node", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("-1.5 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-1.5 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "preserveWhitespace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nodeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "addClass", "java.lang.String", "1-50xFFFFFFFF"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#document", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "child", new String[]{"int"}, new String[]{"-2097151"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsContainingText", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 0, null, 1), new String[][]{{"tagName", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "isBlock", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendText", new String[]{"java.lang.String"}, new String[]{"acc"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("acc {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "acc {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "elementSiblingIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "setParentNode", "org.jsoup.nodes.Node", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "previousElementSibling", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"2147483647", "<null>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"Tit,e"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "before", "java.lang.String", "4."}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<tit,e></tit,e> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "children", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"subList", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "ownerDocument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "textNodes", ""}, {"org.jsoup.nodes.Document", "addChildren", "org.jsoup.nodes.Node[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "select", "java.lang.String", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsContainingText", new String[]{"java.lang.String"}, new String[]{"Hello, WorldlimitedQuirks"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 3, new String[][]{}, 2), new String[][]{{"nextSibling", "", "6"}, {"getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!--0--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "unwrap", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "hasAttr", "java.lang.String", "1.5e300a,b,c"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "appendElement", "java.lang.String", "aTJTcE"}}, 1), new String[][]{{"dataNodes", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<2020-01-01></2020-01-01>\n<atjtce></atjtce> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexLessThan", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "parent", ""}}, 3), new String[][]{{"addClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"10", "<sample:1>"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "siblingNodes", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 1, new String[][]{}, 2), new String[][]{{"getElementsByIndexLessThan", "int", "3"}, {"tagName", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hashCode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1536090790", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeStarting", "java.lang.String", "13"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "before", "org.jsoup.nodes.Node", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{",1"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "title", "java.lang.String", "noQuirks0xFFFFFFFF"}}, 3), new String[][]{{"ownerDocument", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<,1></,1> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<,1></,1> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "dataNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "2147483647", "<sample:6>"}}, 1), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "dataNodes", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "classNames", new String[]{"java.util.Set"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "isBlock", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createShell", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "classNames", new String[]{"java.util.Set"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "<null>", "quirks"}, {"org.jsoup.nodes.Document", "nextElementSibling", ""}}, 3), new String[][]{{"baseUri", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "after", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "textNodes", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "children", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "addChildren", "int,org.jsoup.nodes.Node[]", "2147483647", "<sample:0>"}}, 3), new String[][]{{"hasText", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:8>"}, false, 0, null, 1), new String[][]{{"hasText", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "val", ""}}, 2), new String[][]{{"getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodesAsArray", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "empty", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeClass", new String[]{"java.lang.String"}, new String[]{"201/-01-01"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "replaceWith", "org.jsoup.nodes.Node", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nodeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#document", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtml", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"html-1.5"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "addChildren", "org.jsoup.nodes.Node[]", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "className", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNode", new String[]{"int"}, new String[]{"63"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "absUrl", "java.lang.String", "a,b,ctrue"}, {"org.jsoup.nodes.Document", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "wrap", new String[]{"java.lang.String"}, new String[]{"boodylimitedQuirks"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "textNodes", ""}, {"org.jsoup.nodes.Document", "append", "java.lang.String", "aTITLE"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "remove", ""}, {"org.jsoup.nodes.Document", "data", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "append", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "child", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("123456789012345678901234567890 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "123456789012345678901234567890 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2147483648", "bo\"odylimiteQuirks"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "className", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "traverse", "org.jsoup.select.NodeVisitor", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "preserveWhitespace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "parent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addClass", new String[]{"java.lang.String"}, new String[]{"#root"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{"java.lang.String"}, new String[]{"1.12445678901234560"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "addChildren", "int,org.jsoup.nodes.Node[]", "-2147483648", "<sample:0>"}, {"org.jsoup.nodes.Document", "replaceWith", "org.jsoup.nodes.Node", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nextElementSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "outputSettings", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "before", new String[]{"java.lang.String"}, new String[]{"-1/55"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "dataNodes", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:0>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "val", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "outputSettings", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "textNodes", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "childNodes", ""}}), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "prependElement", "java.lang.String", "--0.0U"}, {"org.jsoup.nodes.Document", "before", "org.jsoup.nodes.Node", "<sample:0>"}}), new String[][]{{"attr", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<--0.0u></--0.0u> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<--0.0u></--0.0u> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "classNames", "java.util.Set", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "child", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"PT1H12:30:i5"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "absUrl", "java.lang.String", "body\t"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeClass", new String[]{"java.lang.String"}, new String[]{"/100xFFFFFFFF"}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "nodeName", ""}}), new String[][]{{"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "remove", ""}, {"org.jsoup.nodes.Document", "outerHtml", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "lastElementSibling", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "addChildren", "int,org.jsoup.nodes.Node[]", "8388607", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addClass", new String[]{"java.lang.String"}, new String[]{"4."}, false, 6, new String[][]{}), new String[][]{{"baseUri", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsContainingText", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "preserveWhitespace", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "parents", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nodeName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#document", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nodeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "append", "java.lang.String", "a1c"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#document", String.valueOf(actual));
  assertEquals("receiver state after the call", "a1c {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"223456789012355678901234567890"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("223456789012355678901234567890 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "223456789012355678901234567890 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"1.5ff"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "isBlock", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "dataset", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "siblingElements", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getAllElements", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"UTF-", "t/ue"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "select", "java.lang.String", "1.123456791123456"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"+12020-02-30T25:61:61"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "ownText", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "outputSettings", ""}, {"org.jsoup.nodes.Document", "empty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"--15"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "toString", ""}, {"org.jsoup.nodes.Document", "replaceWith", "org.jsoup.nodes.Node", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<--15></--15> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nextSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "siblingElements", ""}, {"org.jsoup.nodes.Document", "previousElementSibling", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "val", new String[]{"java.lang.String"}, new String[]{"noQuirks"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "append", new String[]{"java.lang.String"}, new String[]{"1.123345678"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "outerHtml", ""}, {"org.jsoup.nodes.Document", "siblingIndex", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1.123345678 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1.123345678 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeClass", new String[]{"java.lang.String"}, new String[]{"bdy.5"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "appendChild", "org.jsoup.nodes.Node", "<sample:7>"}}), new String[][]{{"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<!--0-->]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!--0--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendText", new String[]{"java.lang.String"}, new String[]{"\"rot"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "0", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("&quot;rot {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "&quot;rot {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tag", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "getElementsByClass", "java.lang.String", "1.123567890113456"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Tag", actual.getClass().getName());
  assertEquals("#root {canContainBlock=true, getName=#root, isBlock=false, isData=false, isEmpty=false, isInline=true, isKnownTag=false, isSelfClosing=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "firstElementSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "hasAttr", "java.lang.String", "<a>b</a>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "select", new String[]{"java.lang.String"}, new String[]{"+1null"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setSiblingIndex", new String[]{"int"}, new String[]{"-2147483646"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\"> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\"> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "removeAttr", "java.lang.String", "1.123456789012345B67"}, {"org.jsoup.nodes.Document", "siblingElements", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<#root></#root> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<#root></#root> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "title", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValue", "java.lang.String,java.lang.String", ",1.c", "aTITE"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"noQ"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<noq></noq> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<noq></noq> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"2020-02-302020-01-01"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<2020-02-302020-01-01></2020-02-302020-01-01> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<2020-02-302020-01-01></2020-02-302020-01-01> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tagName", new String[]{"java.lang.String"}, new String[]{"qirks2020-02-30T25:61:61"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "-1", "<sample:6>"}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "attr", "java.lang.String", "Adncument"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexLessThan", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "classNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "hasAttr", "java.lang.String", "21474836480xFFFFFFFF"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<null>", "<sample:6>"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "baseUri", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "classNames", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "prependChild", "org.jsoup.nodes.Node", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "quirksMode", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "1048576", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1.0", "#oot"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"null+1"}, false), new String[][]{{"before", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hasAttr", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "10", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "isBlock", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "nodeName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "id", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "siblingIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "attr", "java.lang.String", "Hello, Worl"}, {"org.jsoup.nodes.Document", "getElementsByAttributeValue", "java.lang.String,java.lang.String", "a", "nIull"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1536090790", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "parent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">\n<!--a-->a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsContainingText", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "after", "org.jsoup.nodes.Node", "<sample:5>"}}), new String[][]{{"addClass", "java.lang.String", "1"}, {"hasAttr", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "quirksMode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$QuirksMode", actual.getClass().getName());
  assertEquals("noQuirks", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "parent", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"-1879048192"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "addChildren", "org.jsoup.nodes.Node[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "8", "<sample:13>"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "equals", "java.lang.Object", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PT1H", "h"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "childNode", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "append", new String[]{"java.lang.String"}, new String[]{"I"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "absUrl", "java.lang.String", "1{\"a\":1}"}}), new String[][]{{"id", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "I {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "2147483647", "<sample:9>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "parents", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"addAll", "int,java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hasText", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByTag", "java.lang.String", "ti"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "siblingIndex", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingOwnText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "firstElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-29", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "after", "org.jsoup.nodes.Node", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "isBlock", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:9>"}, false), new String[][]{{"nextElementSibling", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<#root></#root> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendText", new String[]{"java.lang.String"}, new String[]{"2020-02-308T25:61:61"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("2020-02-308T25:61:61 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2020-02-308T25:61:61 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendText", new String[]{"java.lang.String"}, new String[]{"#document2020-01-11"}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "childNodesAsArray", ""}}), new String[][]{{"id", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "#document2020-01-11 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"s,b,c"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsMatchingText", "java.lang.String", "\ti"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<s,b,c></s,b,c> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<s,b,c></s,b,c> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"P", "true"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "previousSibling", ""}}), new String[][]{{"remove", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsContainingText", new String[]{"java.lang.String"}, new String[]{"#roou"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "a\n<!--a--> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:7>"}, false), new String[][]{{"nextElementSibling", "", "4"}, {"getElementsByIndexEquals", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\thtml", ",a/b"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "classNames", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"addAll", "java.util.Collection", "3"}, {"retainAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:0>"}, false), new String[][]{{"attr", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementById", new String[]{"java.lang.String"}, new String[]{"1E-5 "}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "doClone", "org.jsoup.nodes.Node", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "empty", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "childNodes", ""}}), new String[][]{{"append", "java.lang.String", "7"}, {"addClass", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">sample {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">sample {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"2020-01-0h1\t"}, false, 4, new String[][]{}), new String[][]{{"eq", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", " ", "<null>"}}), new String[][]{{"html", "java.lang.String", "2"}, {"id", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "title", new String[]{"java.lang.String"}, new String[]{"quirks"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "textNodes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createShell", new String[]{"java.lang.String"}, new String[]{"Helloi, WLorld"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "val", ""}}), new String[][]{{"lastElementSibling", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "replaceWith", "org.jsoup.nodes.Node", "<sample:2>"}}), new String[][]{{"removeAttr", "java.lang.String", "3"}, {"text", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "previousSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "previousElementSibling", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addClass", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "setParentNode", "org.jsoup.nodes.Node", "<sample:2>"}}), new String[][]{{"child", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsMatchingText", "java.util.regex.Pattern", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tagName", new String[]{"java.lang.String"}, new String[]{"null.5"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "appendChild", "org.jsoup.nodes.Node", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"0x1FlimitedQuirks"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "getElementsByIndexLessThan", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("0x1FlimitedQuirks {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x1FlimitedQuirks {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsContainingOwnText", new String[]{"java.lang.String"}, new String[]{"Hello, World0"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByClass", "java.lang.String", "\u00e9"}, {"org.jsoup.nodes.Document", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:5>", "2147483647", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodes", new String[]{}, new String[]{}, false), new String[][]{{"removeAll", "java.util.Collection", "0"}, {"indexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "append", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 5, new String[][]{}), new String[][]{{"firstElementSibling", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "body", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "absUrl", new String[]{"java.lang.String"}, new String[]{"PT1Ha"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "val", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeClass", new String[]{"java.lang.String"}, new String[]{".1.5"}, false), new String[][]{{"attributes", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" class=\"\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "ownerDocument", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "isBlock", ""}}), new String[][]{{"child", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "", "01{1E-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1536090790", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeAttr", new String[]{"java.lang.String"}, new String[]{"TIT,E"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "prependText", "java.lang.String", "2020-02-30T25:61:61-1.5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61-1.5 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2020-02-30T25:61:61-1.5 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "empty", new String[]{}, new String[]{}, false), new String[][]{{"html", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>\n<#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\"> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "id", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "doClone", "org.jsoup.nodes.Node", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "after", new String[]{"java.lang.String"}, new String[]{"1e100"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "doClone", "org.jsoup.nodes.Node", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "parent", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "1.12f45678901234567", "11"}, {"org.jsoup.nodes.Document", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "2147483647", "<null>"}}), new String[][]{{"removeAttr", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendText", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}PT1H"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "prepend", "java.lang.String", "#documet"}}), new String[][]{{"getElementsByTag", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "#documet{&quot;a&quot;:1}PT1H {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtml", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "prepend", "java.lang.String", "\u00e9123456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&eacute;123456789012345678901234567890", String.valueOf(actual));
  assertEquals("receiver state after the call", "&eacute;123456789012345678901234567890 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"2010-02-30T25:61:61"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsMatchingOwnText", "java.util.regex.Pattern", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("2010-02-30T25:61:61 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2010-02-30T25:61:61 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsContainingOwnText", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "siblingIndex", ""}}), new String[][]{{"attr", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "quirksMode", new String[]{"org.jsoup.nodes.Document$QuirksMode"}, new String[]{"<sample:2>"}, false, 2, new String[][]{}), new String[][]{{"getElementsContainingOwnText", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsContainingOwnText", new String[]{"java.lang.String"}, new String[]{"UTF"}, false), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "text", ""}}), new String[][]{{"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createShell", new String[]{"java.lang.String"}, new String[]{"#root1.5dhtml"}, true), new String[][]{{"getElementsMatchingText", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <head></head>, <body></body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingOwnText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:2>"}, false), new String[][]{{"after", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 4, new String[][]{}), new String[][]{{"prepend", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:10>"}, false), new String[][]{{"getAllElements", "", "0"}, {"outerHtml", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!--a-->", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexLessThan", new String[]{"int"}, new String[]{"1048586"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "#document", "1.35"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <head></head>, <body></body>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:6"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "removeClass", "java.lang.String", "true"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("2020-02-30T25:6 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2020-02-30T25:6 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0", "UTF-8"}, false, 1, new String[][]{}), new String[][]{{"getAllElements", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"\u00e9\u00e9"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("&eacute;&eacute; {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "&eacute;&eacute; {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<empty>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "toggleClass", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "textNodes", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "className", ""}}), new String[][]{{"getElementsContainingOwnText", "java.lang.String", "4"}, {"after", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendText", new String[]{"java.lang.String"}, new String[]{".x5"}, false), new String[][]{{"after", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "siblingIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "setSiblingIndex", "int", "-14"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-14", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"2020-n02-01"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<2020-n02-01></2020-n02-01> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "appendElement", "java.lang.String", "1.22345678901234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1536090790", String.valueOf(actual));
  assertEquals("receiver state after the call", "<1.22345678901234567></1.22345678901234567> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodes", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"hhead"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "text", ""}}), new String[][]{{"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0", "0x12345689"}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "ownText", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"z\"a\":1|"}, false, 0, null, 3), new String[][]{{"nodeName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#document", String.valueOf(actual));
  assertEquals("receiver state after the call", "z&quot;a&quot;:1| {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "children", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"attr", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "children", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getAllElements", ""}, {"org.jsoup.nodes.Document", "absUrl", "java.lang.String", "<a>b</a>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "unwrap", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "removeAttr", "java.lang.String", "PT1"}, {"org.jsoup.nodes.Document", "classNames", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendText", new String[]{"java.lang.String"}, new String[]{"UTF.8"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "nodeName", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("UTF.8 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "UTF.8 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodesAsArray", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}}), new String[][]{{"nodeName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#document", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "ownText", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "getElementsByClass", "java.lang.String", "nulm\u00e9"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "outputSettings", "org.jsoup.nodes.Document$OutputSettings", "<sample:11>"}}), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<!--0--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "remove", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "-2", "<sample:4>"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "html", "java.lang.String", "1/"}, {"org.jsoup.nodes.Document", "nextSibling", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/ {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"-2145386496"}, false, 4, new String[][]{}), new String[][]{{"clear", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "dataset", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "siblingNodes", ""}}), new String[][]{{"entrySet", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "previousSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "-2147483648", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "empty", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "preserveWhitespace", ""}}), new String[][]{{"getElementsContainingOwnText", "java.lang.String", "3"}, {"select", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "classNames", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtml", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "firstElementSibling", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "siblingNodes", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "ownerDocument", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "outputSettings", "org.jsoup.nodes.Document$OutputSettings", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsContainingOwnText", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createShell", new String[]{"java.lang.String"}, new String[]{"Hello, rWor"}, true), new String[][]{{"getElementsContainingOwnText", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNode", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 0, null, 3), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"null"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "setParentNode", "org.jsoup.nodes.Node", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "textNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "hasClass", "java.lang.String", "1.55aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}), new String[][]{{"subList", "int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "siblingNodes", new String[]{}, new String[]{}, false), new String[][]{{"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body></body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "ownText", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "siblingNodes", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"listIterator", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"isBlock", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "parent", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "prependText", "java.lang.String", "boocylimitedQuirks"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "boocylimitedQuirks\n<html>\n <head></head>\n <body></body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "classNames", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", "int", "1073741823"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "preserveWhitespace", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "getElementById", "java.lang.String", "1.25head"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{"org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}), new String[][]{{"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "1"}, {"add", "org.jsoup.nodes.Element", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "isBlock", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1.5e300 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1.5e300 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tagName", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "createElement", "java.lang.String", "ahttp://example.com/a?b=c"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#root", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "quirksMode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "attributes", ""}, {"org.jsoup.nodes.Document", "classNames", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$QuirksMode", actual.getClass().getName());
  assertEquals("noQuirks", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "ownerDocument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "siblingNodes", ""}}, 2), new String[][]{{"child", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String"}, new String[]{".-15"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "wrap", "java.lang.String", "1.1234567890123456true010"}}, 2), new String[][]{{"prettyPrint", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "siblingIndex", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
