package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hasClass", new String[]{"java.lang.String"}, new String[]{"2020-1-01"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "quirksMode", "org.jsoup.nodes.Document$QuirksMode", "<sample:0>"}, {"org.jsoup.nodes.Document", "setSiblingIndex", "int", "0"}, {"org.jsoup.nodes.Document", "className", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendText", new String[]{"java.lang.String"}, new String[]{"Ti.laabaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "traverse", "org.jsoup.select.NodeVisitor", "<sample:6>"}, {"org.jsoup.nodes.Document", "normalise", ""}, {"org.jsoup.nodes.Document", "text", "java.lang.String", "2147483648"}}), new String[][]{{"hasAttr", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body>\n  2147483648\n </body>\n</html>Ti.laabaaaaaaaaaaaaaaaaaaaaaaaaaaa {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "dataNodes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "outputSettings", "org.jsoup.nodes.Document$OutputSettings", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "addChildren", "org.jsoup.nodes.Node[]", "<sample:4>"}, {"org.jsoup.nodes.Document", "text", ""}, {"org.jsoup.nodes.Document", "appendText", "java.lang.String", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  a \n </body>\n</html>\n<!--a--> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body>\n  a \n </body>\n</html>\n<!--a--> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.nodes.Document", "html", "java.lang.String", "#documeAHello, Wprld"}, {"org.jsoup.nodes.Document", "title", "java.lang.String", "+1"}}, 3), new String[][]{{"clone", "", "7"}, {"getElementsByTag", "java.lang.String", "7"}, {"traverse", "org.jsoup.select.NodeVisitor", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body>\n  #documeAHello, Wprld \n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{}, new String[]{}, false), new String[][]{{"indentAmount", "int", "6"}, {"charset", "", "5"}});
  assertNotNull(actual);
  assertEquals("sun.nio.cs.UTF_8", actual.getClass().getName());
  assertEquals("UTF-8 {canEncode=true, isRegistered=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.Document", "html", "java.lang.String", "10e2/E\r01#root"}, {"org.jsoup.nodes.Document", "tagName", "java.lang.String", "body"}, {"org.jsoup.nodes.Document", "setParentNode", "org.jsoup.nodes.Node", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{}, new String[]{}, false), new String[][]{{"indentAmount", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "-1073740798", "<sample:0>"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "title", ""}, {"org.jsoup.nodes.Document", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:5>", "<sample:7>"}, {"org.jsoup.nodes.Document", "createElement", "java.lang.String", "http://exampllle.com/a?b=c"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"prettyPrint", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.jsoup.nodes.Document", "baseUri", ""}}), new String[][]{{"prettyPrint", "", "0"}, {"indentAmount", "int", "3"}, {"escapeMode", "org.jsoup.nodes.Entities$EscapeMode", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "tag", ""}, {"org.jsoup.nodes.Document", "prepend", "java.lang.String", "TT9itle"}, {"org.jsoup.nodes.Document", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "Ti>tke", "0xFFPFFFFFF"}}), new String[][]{{"getElementsByIndexGreaterThan", "int", "1"}, {"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[TT9itle]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "TT9itle {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{",1"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "title", "java.lang.String", "Qaa/bb.+10x123456789"}, {"org.jsoup.nodes.Document", "title", "java.lang.String", "I"}, {"org.jsoup.nodes.Document", "title", ""}}), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "2"}, {"id", "", "5"}, {"attr", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<,1>\n <#root></#root>\n</,1>\n<html>\n <head>\n  <title>I</title>\n </head>\n <body></body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "select", "java.lang.String", "1.1234567890123456"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1536090790", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "getElementsMatchingText", "java.util.regex.Pattern", "<null>"}, {"org.jsoup.nodes.Document", "select", "java.lang.String", "1.1234567890123456"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1536090790", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "hasAttr", "java.lang.String", "1.5f"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "setParentNode", "org.jsoup.nodes.Node", "<sample:4>"}, {"org.jsoup.nodes.Document", "doClone", "org.jsoup.nodes.Node", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "doClone", "org.jsoup.nodes.Node", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hasClass", new String[]{"java.lang.String"}, new String[]{"[1,2]Title"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "setSiblingIndex", "int", "0"}, {"org.jsoup.nodes.Document", "getElementsByClass", "java.lang.String", "TITLE"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "unwrap", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("[1,2] {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[1,2] {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 0, null, 3), new String[][]{{"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[[1,2]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[1,2] {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"[1,2]{"}, false, 0, null, 3), new String[][]{{"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[[1,2]{]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[1,2]{ {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"[2,2]{"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "childNodesAsArray", ""}}, 3), new String[][]{{"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[[2,2]{]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[2,2]{ {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"[2,2]{quirks2020-02-30T25:61:61"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "childNodesAsArray", ""}}, 3), new String[][]{{"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[[2,2]{quirks2020-02-30T25:61:61]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[2,2]{quirks2020-02-30T25:61:61 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"[2,2]{quirks2020-02.30T25:61:61"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "childNodesAsArray", ""}}, 3), new String[][]{{"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[[2,2]{quirks2020-02.30T25:61:61]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[2,2]{quirks2020-02.30T25:61:61 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"[2,2]{quirks2020-02.30T25:61:61Hello, World"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "childNodesAsArray", ""}}, 3), new String[][]{{"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[[2,2]{quirks2020-02.30T25:61:61Hello, World]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[2,2]{quirks2020-02.30T25:61:61Hello, World {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"[2,2]{quirks2020-02.30T25:61:61Hello, World"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "childNodesAsArray", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("[2,2]{quirks2020-02.30T25:61:61Hello, World {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[2,2]{quirks2020-02.30T25:61:61Hello, World {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "elementSiblingIndex", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "elementSiblingIndex", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "remove", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "title", "java.lang.String", "Title"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "remove", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "title", "java.lang.String", "Titke"}, {"org.jsoup.nodes.Document", "dataset", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "remove", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "title", "java.lang.String", "Titke"}, {"org.jsoup.nodes.Document", "clone", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"prettyPrint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "hasText", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"abc", "1.12345678901234567"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "2147483648", "[1,2]"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "after", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "-1", "<sample:1>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "33", "<sample:1>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "outerHtml", ""}, {"org.jsoup.nodes.Document", "html", "java.lang.String", "2020-01-01"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
  assertEquals("receiver state after the call", "2020-01-01 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Document", "outerHtml", ""}, {"org.jsoup.nodes.Document", "html", "java.lang.String", "2X020-01-01"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2X020-01-01", String.valueOf(actual));
  assertEquals("receiver state after the call", "2X020-01-01 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "classNames", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "classNames", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"clone", "", "7"}, {"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedKeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "text", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "clone", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Document", "getElementsByIndexLessThan", "int", "60"}, {"org.jsoup.nodes.Document", "title", "java.lang.String", "k1"}}, 3), new String[][]{{"childNode", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tag", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.Document", "hasText", ""}}, 1), new String[][]{{"preserveWhitespace", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addClass", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addClass", new String[]{"java.lang.String"}, new String[]{"0x1W3456789"}, false, 0, null, 3), new String[][]{{"attr", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addClass", new String[]{"java.lang.String"}, new String[]{"0xt1W3456789TITLE0xFFFFFFFFFa b"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "appendElement", "java.lang.String", "1.1234567"}}, 3), new String[][]{{"attr", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<1.1234567></1.1234567> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addClass", new String[]{"java.lang.String"}, new String[]{"0xt1W3456789TITLE0xFFFFFFFFFa b"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "appendElement", "java.lang.String", "1.1234567"}}, 3), new String[][]{{"getElementsMatchingText", "java.util.regex.Pattern", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<1.1234567></1.1234567>, <1.1234567></1.1234567>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<1.1234567></1.1234567> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addClass", new String[]{"java.lang.String"}, new String[]{"0xt1W3456789TITLE0xFFFFFFFFFa b"}, false, 0, null, 3), new String[][]{{"getElementsMatchingText", "java.util.regex.Pattern", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "val", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Document", "setParentNode", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.Document", "className", ""}, {"org.jsoup.nodes.Document", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "0x1F", "Hello, World"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "2147483647", "<sample:1>"}, {"org.jsoup.nodes.Document", "html", "java.lang.String", "noQuirks"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<-0.0></-0.0> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "noQuirks {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "2147483647", "<sample:1>"}, {"org.jsoup.nodes.Document", "html", "java.lang.String", "noQuirks"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<-1.5></-1.5> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "noQuirks {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"-0.5"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "2147483647", "<sample:1>"}, {"org.jsoup.nodes.Document", "html", "java.lang.String", "noQuirks"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<-0.5></-0.5> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "noQuirks {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"-00.5"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "2147483647", "<sample:1>"}, {"org.jsoup.nodes.Document", "quirksMode", ""}, {"org.jsoup.nodes.Document", "html", "java.lang.String", "noQuirks"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<-00.5></-00.5> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "noQuirks {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{",00.5"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "quirksMode", ""}, {"org.jsoup.nodes.Document", "getAllElements", ""}, {"org.jsoup.nodes.Document", "html", "java.lang.String", "noQuirks"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<,00.5></,00.5> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "noQuirks {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{",00.5"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "quirksMode", ""}, {"org.jsoup.nodes.Document", "getAllElements", ""}, {"org.jsoup.nodes.Document", "html", "java.lang.String", "noQuirks"}}, 3), new String[][]{{"before", "org.jsoup.nodes.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "ownerDocument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "ownerDocument", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "ownerDocument", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "ownerDocument", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "before", "java.lang.String", "1.5d"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "before", "java.lang.String", "1.5d"}}, 3), new String[][]{{"after", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "getElementsContainingOwnText", "java.lang.String", "I"}, {"org.jsoup.nodes.Document", "html", ""}, {"org.jsoup.nodes.Document", "outerHtml", "java.lang.StringBuilder", "<sample:0>"}}, 1), new String[][]{{"contains", "java.lang.Object", "3"}, {"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body></body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "getElementsContainingOwnText", "java.lang.String", "I"}, {"org.jsoup.nodes.Document", "html", ""}, {"org.jsoup.nodes.Document", "outerHtml", "java.lang.StringBuilder", "<sample:0>"}}, 1), new String[][]{{"contains", "java.lang.Object", "3"}, {"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "-2147483648", "<sample:7>"}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "outputSettings", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "val", new String[]{}, new String[]{}, false, 18, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\"> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a\n<!--a--> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">\n<!--a-->a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!--0--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendText", new String[]{"java.lang.String"}, new String[]{"UTF-8"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("UTF-8 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "UTF-8 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendText", new String[]{"java.lang.String"}, new String[]{"UUTFy-8"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("UUTFy-8 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "UUTFy-8 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendText", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("abc {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "abc {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "baseUri", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.Document", "attr", "java.lang.String,java.lang.String", "\u00e8", "--1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "baseUri", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "attr", "java.lang.String,java.lang.String", "\u00e8", "--1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "baseUri", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "attr", "java.lang.String,java.lang.String", "\u00e8", "--1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "baseUri", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "attr", "java.lang.String,java.lang.String", "\u00e8", "--1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "baseUri", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "attr", "java.lang.String,java.lang.String", "\u00e8", "--D"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}, {"org.jsoup.nodes.Document", "getElementsByClass", "java.lang.String", "1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByClass", "java.lang.String", "1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "-2147483648", "<null>"}, false, 13, new String[][]{{"org.jsoup.nodes.Document", "getElementsMatchingText", "java.lang.String", "-a b"}, {"org.jsoup.nodes.Document", "toggleClass", "java.lang.String", "--1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "-2147483648", "<sample:6>"}, false, 13, new String[][]{{"org.jsoup.nodes.Document", "getElementsMatchingText", "java.lang.String", "title"}, {"org.jsoup.nodes.Document", "toggleClass", "java.lang.String", ".-1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "elementSiblingIndex", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "previousSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "setSiblingIndex", "int", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "select", "java.lang.String", "1.1234567890123456"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1536090790", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "preserveWhitespace", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "setParentNode", "org.jsoup.nodes.Node", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementById", "java.lang.String", "#root"}, {"org.jsoup.nodes.Document", "getElementsMatchingOwnText", "java.util.regex.Pattern", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"1."}, false, 4, new String[][]{}), new String[][]{{"attr", "java.lang.String,java.lang.String", "2"}, {"addClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"2{\"a\":1}"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:2>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "isBlock", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "firstElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hasClass", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "setSiblingIndex", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<1></1> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"1a,b,c"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<1a,b,c></1a,b,c> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"#documens"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<#documens></#documens> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"#doumens"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<#doumens></#doumens> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"#dovmens"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<#dovmens></#dovmens> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"#dovmeos"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<#dovmeos></#dovmeos> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "addClass", "java.lang.String", "true"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<-1.5></-1.5> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "unwrap", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "outerHtmlTail", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "1", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"null"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "id", ""}}), new String[][]{{"clear", "", "1"}, {"subList", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendText", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html>-1 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>-1 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendText", new String[]{"java.lang.String"}, new String[]{"-i1"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html>-i1 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>-i1 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendText", new String[]{"java.lang.String"}, new String[]{"1-i1"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html>1-i1 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>1-i1 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hasAttr", new String[]{"java.lang.String"}, new String[]{"limitedQuirks"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "10", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendText", new String[]{"java.lang.String"}, new String[]{"1-i1"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}}), new String[][]{{"dataNodes", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>1-i1 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendText", new String[]{"java.lang.String"}, new String[]{",1-i\n"}, false, 8, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}}), new String[][]{{"dataNodes", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>,1-i {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendText", new String[]{"java.lang.String"}, new String[]{",1xi\n"}, false, 9, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html>,1xi {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>,1xi {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendText", new String[]{"java.lang.String"}, new String[]{",1xi\n"}, false, 9, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}}), new String[][]{{"html", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html>,1xi", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>,1xi {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendText", new String[]{"java.lang.String"}, new String[]{",1xi\n"}, false, 9, new String[][]{{"org.jsoup.nodes.Document", "textNodes", ""}, {"org.jsoup.nodes.Document", "after", "java.lang.String", "1.5f"}, {"org.jsoup.nodes.Document", "normalise", ""}}), new String[][]{{"nextSibling", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>,1xi {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "remove", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendText", new String[]{"java.lang.String"}, new String[]{",2wi\n"}, false, 8, new String[][]{{"org.jsoup.nodes.Document", "remove", ""}, {"org.jsoup.nodes.Document", "textNodes", ""}, {"org.jsoup.nodes.Document", "normalise", ""}}), new String[][]{{"nextSibling", "", "0"}, {"getElementsContainingOwnText", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>,2wi {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendText", new String[]{"java.lang.String"}, new String[]{"Ti.laaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "traverse", "org.jsoup.select.NodeVisitor", "<sample:6>"}, {"org.jsoup.nodes.Document", "remove", ""}, {"org.jsoup.nodes.Document", "normalise", ""}}), new String[][]{{"hasAttr", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>Ti.laaaaaaaaaaaaaaaaaaaaaaaaaaaaaa {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("[1,2] {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[1,2] {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tag", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Tag", actual.getClass().getName());
  assertEquals("#root {canContainBlock=true, getName=#root, isBlock=false, isData=false, isEmpty=false, isInline=true, isKnownTag=false, isSelfClosing=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "title", "java.lang.String", "Title"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5d", "\t"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "title", "java.lang.String", "1.5e3300"}, {"org.jsoup.nodes.Document", "hasClass", "java.lang.String", "-0.0"}}), new String[][]{{"trimToSize", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[<html>\n <head>\n  <title>1.5e3300</title>\n </head>\n <body></body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head>\n  <title>1.5e3300</title>\n </head>\n <body></body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "hasText", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsContainingText", "java.lang.String", "PT1H"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1L {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1L {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"1Lu"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsContainingText", "java.lang.String", "PT1H"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1Lu {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1Lu {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tagName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#root", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"abc", "1.12345678901234567"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "2147483648", "[1,2]"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "val", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "1.5f"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0xFFFFFFFF", "a,b,c"}, false, 12, new String[][]{{"org.jsoup.nodes.Document", "empty", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0xFFFbFFFF", "a,b-c"}, false, 12, new String[][]{{"org.jsoup.nodes.Document", "appendText", "java.lang.String", "0x1F"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x1F {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "children", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "appendText", "java.lang.String", "i"}, {"org.jsoup.nodes.Document", "hasText", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "i {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "children", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "appendText", "java.lang.String", "i"}, {"org.jsoup.nodes.Document", "getElementById", "java.lang.String", "0xFFFFFFFF"}, {"org.jsoup.nodes.Document", "hasText", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body></body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>i {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "children", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Document", "appendText", "java.lang.String", "i"}, {"org.jsoup.nodes.Document", "getElementById", "java.lang.String", "0xFFFFFFFF"}, {"org.jsoup.nodes.Document", "hasText", ""}}), new String[][]{{"retainAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "i {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "-2147483648", "<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "previousElementSibling", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "2147483647", "<sample:3>"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "previousElementSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "indent", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "-1", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "outerHtml", ""}, {"org.jsoup.nodes.Document", "html", "java.lang.String", "2020-01-01"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
  assertEquals("receiver state after the call", "2020-01-01 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "body", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "body", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body></body> {hasText=false, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "classNames", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "classNames", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "classNames", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"clone", "", "7"}, {"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedKeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "text", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PT1H", "Titke"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tagName", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tagName", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false), new String[][]{{"after", "org.jsoup.nodes.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "setSiblingIndex", "int", "-2147483648"}, {"org.jsoup.nodes.Document", "addChildren", "int,org.jsoup.nodes.Node[]", "10", "<sample:0>"}}), new String[][]{{"charset", "java.nio.charset.Charset", "5"}, {"charset", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tag", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"preserveWhitespace", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tag", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"preserveWhitespace", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tag", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "html", "java.lang.String", "010"}}), new String[][]{{"preserveWhitespace", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "010 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tag", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "html", "java.lang.String", "01/"}}), new String[][]{{"preserveWhitespace", "", "5"}, {"isBlock", "", "5"}, {"isBlock", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "01/ {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tag", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Document", "html", "java.lang.String", "01/PT1H"}}), new String[][]{{"preserveWhitespace", "", "5"}, {"isBlock", "", "5"}, {"isBlock", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "01/PT1H {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nodeName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#document", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtml", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "remove", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "parents", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"#document", "0xFFFFFFFF"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "quirksMode", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"#document", "0xFFFFFFFF"}, false), new String[][]{{"addAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1", "0bFFFFFFFF"}, false), new String[][]{{"addAll", "java.util.Collection", "1"}, {"last", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "0bFFFFFEFFF"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "nodeName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Titke", "0FFFFFEFFF<a>b</a>"}, false, 11, new String[][]{{"org.jsoup.nodes.Document", "nodeName", ""}}), new String[][]{{"indexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Titke", "0FFFFFDFFF<a>b</a>"}, false, 11, new String[][]{{"org.jsoup.nodes.Document", "nodeName", ""}}), new String[][]{{"hasText", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "val", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "className", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "val", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "setParentNode", "org.jsoup.nodes.Node", "<null>"}, {"org.jsoup.nodes.Document", "className", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"#document"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "2147483647", "<sample:1>"}, {"org.jsoup.nodes.Document", "html", "java.lang.String", "noQuirks"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<-0.0></-0.0> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "noQuirks {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "removeAttr", "java.lang.String", "1L"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a b></a b> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a b></a b> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"a!b"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "removeAttr", "java.lang.String", "1x"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a!b></a!b> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a!b></a!b> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "ownerDocument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "ownerDocument", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "ownerDocument", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "wrap", "java.lang.String", "{\"a\":1}"}, {"org.jsoup.nodes.Document", "ownerDocument", ""}}), new String[][]{{"before", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodesAsArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "isBlock", ""}, {"org.jsoup.nodes.Document", "getElementsMatchingOwnText", "java.lang.String", "1.12345678"}});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodesAsArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "isBlock", ""}, {"org.jsoup.nodes.Document", "getElementsMatchingOwnText", "java.lang.String", "1.1234567{8"}});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body></body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{"X0"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{"W70"}, false), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{"a,b,caaaaaaaaaa`aaaaaaaaaaabaaaaaaa"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", "int", "-1"}, {"org.jsoup.nodes.Document", "appendText", "java.lang.String", "http://example.com/a?b=c"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "http://example.com/a?b=c {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "getElementsContainingOwnText", "java.lang.String", "I"}, {"org.jsoup.nodes.Document", "html", ""}, {"org.jsoup.nodes.Document", "outerHtml", "java.lang.StringBuilder", "<sample:0>"}}), new String[][]{{"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "getElementsContainingOwnText", "java.lang.String", "I"}, {"org.jsoup.nodes.Document", "html", ""}, {"org.jsoup.nodes.Document", "outerHtml", "java.lang.StringBuilder", "<sample:0>"}}), new String[][]{{"contains", "java.lang.Object", "0"}, {"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body></body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "body", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getElementsContainingOwnText", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<body></body>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValue", "java.lang.String,java.lang.String", "1.5f", "1.12345678"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\"> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">\n<!--a-->a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendText", new String[]{"java.lang.String"}, new String[]{"UTF-8"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("UTF-8 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "UTF-8 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingOwnText", new String[]{"java.util.regex.Pattern"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsContainingText", new String[]{"java.lang.String"}, new String[]{"I"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "baseUri", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "baseUri", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "baseUri", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "baseUri", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "baseUri", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}, {"org.jsoup.nodes.Document", "getElementsByClass", "java.lang.String", "0"}, {"org.jsoup.nodes.Document", "createElement", "java.lang.String", "2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"Titke"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getAllElements", ""}, {"org.jsoup.nodes.Document", "elementSiblingIndex", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "setBaseUri", "java.lang.String", "I"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "createElement", new String[]{"java.lang.String"}, new String[]{"null"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "preserveWhitespace", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<null></null> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "parent", ""}, {"org.jsoup.nodes.Document", "nextSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1536090790", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "siblingElements", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "elementSiblingIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "nextSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "elementSiblingIndex", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "nextSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "quirksMode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$QuirksMode", actual.getClass().getName());
  assertEquals("noQuirks", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "quirksMode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$QuirksMode", actual.getClass().getName());
  assertEquals("noQuirks", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1", "1.5f"}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}, {"org.jsoup.nodes.Document", "nodeName", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-#limitedQuirks", "a b"}, false, 3, new String[][]{}), new String[][]{{"listIterator", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-limitedQuirks", "a b"}, false, 3, new String[][]{}), new String[][]{{"last", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "preserveWhitespace", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "ownText", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "ownText", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "absUrl", "java.lang.String", "\u00e9"}, {"org.jsoup.nodes.Document", "id", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"head"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsContainingText", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "outerHtml", "java.lang.StringBuilder", "<sample:1>"}}), new String[][]{{"not", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "title", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "title", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "setBaseUri", "java.lang.String", "010"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setSiblingIndex", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nextSibling", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "ownText", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nextSibling", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "ownText", ""}, {"org.jsoup.nodes.Document", "classNames", "java.util.Set", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nextSibling", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.Document", "getElementsByIndexEquals", "int", "2147483647"}, {"org.jsoup.nodes.Document", "prepend", "java.lang.String", "i"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "i {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nextSibling", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.Document", "getElementsByIndexEquals", "int", "2147483647"}, {"org.jsoup.nodes.Document", "prepend", "java.lang.String", "iy"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "iy {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "wrap", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNode", new String[]{"int"}, new String[]{"-1"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "attr", "java.lang.String", "http://example.com/a?b=c"}, {"org.jsoup.nodes.Document", "previousElementSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getAllElements", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsContainingText", "java.lang.String", "TITLE"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getAllElements", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsContainingText", "java.lang.String", "TITLE"}}, 1), new String[][]{{"empty", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getAllElements", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.Document", "lastElementSibling", ""}, {"org.jsoup.nodes.Document", "siblingIndex", ""}}, 1), new String[][]{{"empty", "", "5"}, {"hasText", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getAllElements", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "lastElementSibling", ""}, {"org.jsoup.nodes.Document", "remove", ""}, {"org.jsoup.nodes.Document", "siblingIndex", ""}}, 1), new String[][]{{"empty", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[, <html></html>, <head></head>, <body></body>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"limitedQuirks"}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}}), new String[][]{{"outerHtml", "", "4"}, {"classNames", "java.util.Set", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<limitedquirks class=\"0 sample \"></limitedquirks> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>\n<limitedquirks class=\"0 sample \"></limitedquirks> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"limitedQuirk"}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}}), new String[][]{{"outerHtml", "", "4"}, {"classNames", "java.util.Set", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<limitedquirk class=\"0 sample \"></limitedquirk> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>\n<limitedquirk class=\"0 sample \"></limitedquirk> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"limitedQuirk1.Hd"}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}}), new String[][]{{"outerHtml", "", "4"}, {"classNames", "java.util.Set", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<limitedquirk1.hd class=\"0 sample \"></limitedquirk1.hd> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>\n<limitedquirk1.hd class=\"0 sample \"></limitedquirk1.hd> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "isBlock", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"limisedQuirk1.Hd"}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}}), new String[][]{{"outerHtml", "", "4"}, {"classNames", "java.util.Set", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<limisedquirk1.hd class=\"0 sample \"></limisedquirk1.hd> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>\n<limisedquirk1.hd class=\"0 sample \"></limisedquirk1.hd> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"limmisedQuirk1.Hd"}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}}), new String[][]{{"outerHtml", "", "4"}, {"classNames", "java.util.Set", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<limmisedquirk1.hd class=\"0 sample \"></limmisedquirk1.hd> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>\n<limmisedquirk1.hd class=\"0 sample \"></limmisedquirk1.hd> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"limmisedQuirk1..d"}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}}), new String[][]{{"outerHtml", "", "4"}, {"classNames", "java.util.Set", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<limmisedquirk1..d class=\"0 sample \"></limmisedquirk1..d> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>\n<limmisedquirk1..d class=\"0 sample \"></limmisedquirk1..d> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"limmise"}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}}), new String[][]{{"outerHtml", "", "4"}, {"classNames", "java.util.Set", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<limmise class=\"0 sample \"></limmise> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>\n<limmise class=\"0 sample \"></limmise> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"limise"}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}}), new String[][]{{"outerHtml", "", "4"}, {"classNames", "java.util.Set", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<limise class=\"0 sample \"></limise> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>\n<limise class=\"0 sample \"></limise> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"li"}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}}), new String[][]{{"outerHtml", "", "4"}, {"classNames", "java.util.Set", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<li class=\"0 sample \"></li> {hasText=false, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>\n<li class=\"0 sample \"></li> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"ki"}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}}), new String[][]{{"outerHtml", "", "4"}, {"classNames", "java.util.Set", "2"}, {"getAllElements", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<ki class=\"0 sample \"></ki>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>\n<ki class=\"0 sample \"></ki> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "select", "java.lang.String", "I"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:6>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getAllElements", ""}, {"org.jsoup.nodes.Document", "getElementsByTag", "java.lang.String", "a b"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "className", ""}, {"org.jsoup.nodes.Document", "after", "java.lang.String", "1.5d"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"1.123556789-0123 456"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}, {"org.jsoup.nodes.Document", "hasText", ""}, {"org.jsoup.nodes.Document", "normalise", ""}}), new String[][]{{"outerHtml", "", "4"}, {"classNames", "java.util.Set", "2"}, {"getElementsByIndexGreaterThan", "int", "1"}, {"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"1.123556789-0123\037456"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}, {"org.jsoup.nodes.Document", "hasText", ""}}, 1), new String[][]{{"outerHtml", "", "4"}, {"classNames", "java.util.Set", "2"}, {"getElementsByIndexGreaterThan", "int", "3"}, {"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String"}, new String[]{"null"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "remove", ""}, {"org.jsoup.nodes.Document", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"I"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}}, 1), new String[][]{{"outerHtml", "", "4"}, {"classNames", "java.util.Set", "2"}, {"getElementsByIndexGreaterThan", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>\n<\u0131 class=\"0 sample \"></\u0131> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"I0"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}}, 1), new String[][]{{"outerHtml", "", "4"}, {"classNames", "java.util.Set", "2"}, {"getElementsByIndexGreaterThan", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>\n<\u01310 class=\"0 sample \"></\u01310> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendElement", new String[]{"java.lang.String"}, new String[]{"J0"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}}, 1), new String[][]{{"outerHtml", "", "4"}, {"classNames", "java.util.Set", "2"}, {"getElementsByIndexGreaterThan", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>\n<j0 class=\"0 sample \"></j0> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"[1,2]", "<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "parents", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"[1,}html", "<sample:2>"}, false, 0, null, 3), new String[][]{{"attr", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "title", new String[]{"java.lang.String"}, new String[]{"html"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "title", new String[]{"java.lang.String"}, new String[]{"hg09F"}, false, 15, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "child", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "-1.5", "<sample:2>"}, {"org.jsoup.nodes.Document", "child", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "child", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-02-30T25:61:61", "1e10"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "preserveWhitespace", ""}}), new String[][]{{"attributes", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" 2020-02-30t25:61:61=\"1e10\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-02-30T25;61:611.5e300", "1e10"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "preserveWhitespace", ""}}), new String[][]{{"attributes", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" 2020-02-30t25;61:611.5e300=\"1e10\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-02-30T25;61:611.5e300", "1e10"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "preserveWhitespace", ""}}, 3), new String[][]{{"attributes", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" 2020-02-30t25;61:611.5e300=\"1e10\" {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-02-30T25;61:611.5e300", "1d10"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "preserveWhitespace", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-02-30T25;61:611.5e300", "1d10"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "preserveWhitespace", ""}}, 3), new String[][]{{"getElementsByIndexGreaterThan", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1d1H0"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"T", "1dF1"}, false, 1, new String[][]{}, 3), new String[][]{{"elementSiblingIndex", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-02-30T25:61:61", "1e1"}, false, 1, new String[][]{}, 3), new String[][]{{"data", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementById", "java.lang.String", "1L"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setSiblingIndex", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "val", "java.lang.String", "1.5e300"}, {"org.jsoup.nodes.Document", "unwrap", ""}, {"org.jsoup.nodes.Document", "childNodes", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "dataNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "replaceWith", "org.jsoup.nodes.Node", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "dataNodes", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "firstElementSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "{\"a\":1}", "12:30:45"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingOwnText", new String[]{"java.util.regex.Pattern"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingOwnText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "1", "<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "0", "<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TITLE", "Titke"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:4>", "<sample:1>"}}), new String[][]{{"id", "", "7"}, {"after", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "textNodes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "textNodes", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "textNodes", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "textNodes", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "textNodes", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"addAll", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementById", new String[]{"java.lang.String"}, new String[]{"+1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementById", new String[]{"java.lang.String"}, new String[]{"+2"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "id", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "previousSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "id", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "previousSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"#document"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<#document></#document> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<#document></#document> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"#document"}, false), new String[][]{{"getElementsMatchingText", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<#document></#document>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<#document></#document> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"#dpcument"}, false), new String[][]{{"getElementsMatchingText", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<#dpcument></#dpcument>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<#dpcument></#dpcument> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "data", ""}}), new String[][]{{"wrap", "java.lang.String", "2"}, {"val", "java.lang.String", "0"}, {"val", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "data", ""}}), new String[][]{{"remove", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"-2147483648"}, false), new String[][]{{"remove", "int", "2"}, {"hasAttr", "java.lang.String", "0"}, {"getElementsMatchingText", "java.util.regex.Pattern", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tagName", new String[]{"java.lang.String"}, new String[]{"http://example.col/a?b=c"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "outputSettings", ""}}), new String[][]{{"hasAttr", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "dataset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "before", "org.jsoup.nodes.Node", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"1", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"2147483647", "<sample:5>"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "absUrl", "java.lang.String", "/a/b"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
}
