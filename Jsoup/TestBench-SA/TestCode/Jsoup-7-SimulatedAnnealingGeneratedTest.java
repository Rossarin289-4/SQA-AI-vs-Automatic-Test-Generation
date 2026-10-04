package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"W/#5#docmmeht"}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "append", "java.lang.String", "2020-02-30T25:61:61"}, {"org.jsoup.nodes.Document", "title", ""}}), new String[][]{{"getElementsMatchingOwnText", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[W/#5#docmmeht]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "W/#5#docmmeht {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "elementSiblingIndex", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "text", "java.lang.String", "I"}, {"org.jsoup.nodes.Document", "createElement", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaa\raaaaaa"}, {"org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "+1", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body>\n  I\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "equals", "java.lang.Object", "<i:0>"}}), new String[][]{{"normalise", "", "1"}, {"getElementsByAttributeStarting", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaabaaaaaa1L"}, false, 14, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}, {"org.jsoup.nodes.Document", "title", "java.lang.String", "201"}, {"org.jsoup.nodes.Document", "title", "java.lang.String", " "}}, 2), new String[][]{{"normalise", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head>\n  <title> </title>\n </head>\n <body>\n  aaaaaaaaaaaaaaaaaaaaabaaaaaa1L \n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head>\n  <title> </title>\n </head>\n <body>\n  aaaaaaaaaaaaaaaaaaaaabaaaaaa1L \n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "before", "java.lang.String", "title"}}), new String[][]{{"prettyPrint", "", "6"}, {"charset", "java.nio.charset.Charset", "6"}, {"charset", "", "3"}});
  assertNotNull(actual);
  assertEquals("sun.nio.cs.UTF_8", actual.getClass().getName());
  assertEquals("UTF-8 {canEncode=true, isRegistered=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "append", new String[]{"java.lang.String"}, new String[]{"1\n123455_578"}, false, 0, null, 1), new String[][]{{"outputSettings", "", "4"}, {"escapeMode", "org.jsoup.nodes.Entities$EscapeMode", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "1 123455_578 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{}, new String[]{}, false), new String[][]{{"prettyPrint", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "append", new String[]{"java.lang.String"}, new String[]{"><head<<ab</h`>12:e0541[12345678901234567"}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:5>", "-1", "<sample:6>"}, {"org.jsoup.nodes.Document", "getElementsByAttributeStarting", "java.lang.String", "-11.023456688"}}), new String[][]{{"normalise", "", "1"}, {"getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "2"}, {"add", "org.jsoup.nodes.Element", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<ab>\n 12:e0541[12345678901234567\n</ab>\n<html>\n <head></head>\n <body>\n  &gt; \n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"><head<\"buta>00:eee4202F1-026-30T2"}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "hasAttr", "java.lang.String", "1.53300"}}), new String[][]{{"outputSettings", "", "6"}, {"indentAmount", "int", "7"}, {"charset", "", "1"}, {"encode", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=1 cap=1] {get=97, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnderflowException, getLon...#333#-589539483", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "&gt; {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "nodeName", ""}}), new String[][]{{"indentAmount", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{"1.12345678http://example.om/a?b=c"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"-0."}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<-0.></-0.> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<-0.></-0.> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "elementSiblingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "hasText", ""}, {"org.jsoup.nodes.Document", "classNames", "java.util.Set", "<null>"}, {"org.jsoup.nodes.Document", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "12:30:45", "\t"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "elementSiblingIndex", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "hasText", ""}, {"org.jsoup.nodes.Document", "classNames", "java.util.Set", "<null>"}, {"org.jsoup.nodes.Document", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "12:30:45", "\t"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "removeClass", "java.lang.String", "\u00e9"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("&eacute; {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "&eacute; {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 9, new String[][]{{"org.jsoup.nodes.Document", "removeClass", "java.lang.String", "\u00e9"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"\u00e9abc"}, false, 9, new String[][]{{"org.jsoup.nodes.Document", "firstElementSibling", ""}, {"org.jsoup.nodes.Document", "setSiblingIndex", "int", "-1"}, {"org.jsoup.nodes.Document", "removeClass", "java.lang.String", "\u00e9"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("&eacute;abc {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "&eacute;abc {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"body"}, false, 9, new String[][]{{"org.jsoup.nodes.Document", "firstElementSibling", ""}, {"org.jsoup.nodes.Document", "setSiblingIndex", "int", "-1"}, {"org.jsoup.nodes.Document", "removeClass", "java.lang.String", "\u00e9"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("body {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "body {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"\u00eb"}, false, 9, new String[][]{{"org.jsoup.nodes.Document", "setSiblingIndex", "int", "-1"}, {"org.jsoup.nodes.Document", "removeClass", "java.lang.String", "\u00e9"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("&euml; {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "&euml; {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"f"}, false, 9, new String[][]{{"org.jsoup.nodes.Document", "removeClass", "java.lang.String", "\u00e9"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("f {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "f {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"W/#5##dclmeht-12020-02-3TT25:61:61htl"}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "append", "java.lang.String", "2020-02-30T25:c61:61[1,2]"}, {"org.jsoup.nodes.Document", "title", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("W/#5##dclmeht-12020-02-3TT25:61:61htl {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "W/#5##dclmeht-12020-02-3TT25:61:61htl {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"W/#5##dclmeht-12020-02-3TT25:61:61htl"}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "append", "java.lang.String", "2020-02-30T25:c61:61[1,2]"}, {"org.jsoup.nodes.Document", "title", ""}}, 2), new String[][]{{"classNames", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "W/#5##dclmeht-12020-02-3TT25:61:61htl {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"V/#5##dclmeht-12020-002-3TT25:61:61htl"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "append", "java.lang.String", "-1"}, {"org.jsoup.nodes.Document", "title", ""}}, 2), new String[][]{{"classNames", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "V/#5##dclmeht-12020-002-3TT25:61:61htl {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"V/#5##dclmeht-12020-002-3TT25:61:61htl"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "append", "java.lang.String", "-1"}, {"org.jsoup.nodes.Document", "title", ""}}, 2), new String[][]{{"classNames", "", "5"}, {"removeAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "V/#5##dclmeht-12020-002-3TT25:61:61htl {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"V/#5##dclmeht-12020-002-3TT25:61:61htlTITLE"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "append", "java.lang.String", "-1"}, {"org.jsoup.nodes.Document", "title", ""}}, 2), new String[][]{{"classNames", "", "5"}, {"removeAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "V/#5##dclmeht-12020-002-3TT25:61:61htlTITLE {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "append", "java.lang.String", "-1"}}, 2), new String[][]{{"classNames", "", "5"}, {"removeAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1.5e300 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "absUrl", "java.lang.String", "-1T\t"}, {"org.jsoup.nodes.Document", "outputSettings", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a\n<!--a--><!a> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "absUrl", "java.lang.String", "-1T\t"}, {"org.jsoup.nodes.Document", "outputSettings", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<#root></#root>a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "after", "java.lang.String", "-1"}, {"org.jsoup.nodes.Document", "absUrl", "java.lang.String", "-1T\t"}, {"org.jsoup.nodes.Document", "outputSettings", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "after", "java.lang.String", "-1"}, {"org.jsoup.nodes.Document", "absUrl", "java.lang.String", "-1T\t"}, {"org.jsoup.nodes.Document", "outputSettings", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "after", "java.lang.String", "-1"}, {"org.jsoup.nodes.Document", "absUrl", "java.lang.String", "-1T\t"}, {"org.jsoup.nodes.Document", "outputSettings", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}, {"org.jsoup.nodes.Document", "after", "java.lang.String", "-1"}, {"org.jsoup.nodes.Document", "outputSettings", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<empty>"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "normalise", ""}, {"org.jsoup.nodes.Document", "after", "java.lang.String", "-1"}, {"org.jsoup.nodes.Document", "outputSettings", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNode", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "classNames", "java.util.Set", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "previousSibling", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Document", "hashCode", ""}, {"org.jsoup.nodes.Document", "prependChild", "org.jsoup.nodes.Node", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "body", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "html", ""}, {"org.jsoup.nodes.Document", "outputSettings", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "body", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "outputSettings", ""}, {"org.jsoup.nodes.Document", "siblingIndex", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<body></body> {hasText=false, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-01-01", "a,b,c"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "2147483647", "<sample:6>"}, {"org.jsoup.nodes.Document", "dataset", ""}}, 1), new String[][]{{"last", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<body></body> {hasText=false, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"22030-02e-0", ".5PS1H"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "2147483647", "<sample:6>"}}, 1), new String[][]{{"last", "", "6"}, {"hasAttr", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"nuul]", "<sample:2>"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "nextElementSibling", ""}, {"org.jsoup.nodes.Document", "getElementsMatchingText", "java.lang.String", "{\"a\":1}"}, {"org.jsoup.nodes.Document", "elementSiblingIndex", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"ul]", "<sample:5>"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "nextElementSibling", ""}, {"org.jsoup.nodes.Document", "getElementsMatchingText", "java.lang.String", "{\"a\":1}"}, {"org.jsoup.nodes.Document", "elementSiblingIndex", ""}}, 2), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"ul", "<sample:2>"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "getElementsMatchingText", "java.lang.String", "{\"a\":1}"}, {"org.jsoup.nodes.Document", "elementSiblingIndex", ""}}, 2), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "ownText", ""}, {"org.jsoup.nodes.Document", "preserveWhitespace", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "ownText", ""}, {"org.jsoup.nodes.Document", "previousSibling", ""}, {"org.jsoup.nodes.Document", "preserveWhitespace", ""}}, 3), new String[][]{{"body", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<body></body> {hasText=false, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Document", "prependElement", "java.lang.String", "1.5"}, {"org.jsoup.nodes.Document", "ownText", ""}, {"org.jsoup.nodes.Document", "previousSibling", ""}}, 3), new String[][]{{"body", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<body></body> {hasText=false, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<1.5></1.5>\n<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "prependElement", "java.lang.String", "1.4"}}, 2), new String[][]{{"getElementsByClass", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<1.4></1.4>\n<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsContainingText", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "prependElement", "java.lang.String", "1.#"}}, 2), new String[][]{{"getElementsByClass", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<1.#></1.#>\n<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Document", "prependElement", "java.lang.String", "0.#"}}, 3), new String[][]{{"getElementsByClass", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0.#></0.#>\n<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Document", "prependElement", "java.lang.String", "0.#Title"}}, 3), new String[][]{{"getElementsByClass", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0.#title></0.#title>\n<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Document", "prependElement", "java.lang.String", "0.#Title"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<0.#title></0.#title>\n<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0.#title></0.#title>\n<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Document", "prependElement", "java.lang.String", "0.$Title"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<0.$title></0.$title>\n<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0.$title></0.$title>\n<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "siblingNodes", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Document", "data", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"u"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "siblingIndex", ""}}, 1), new String[][]{{"clear", "", "1"}, {"attr", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingOwnText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "baseUri", ""}, {"org.jsoup.nodes.Document", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:5>", "<sample:0>"}}, 3), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "classNames", new String[]{"java.util.Set"}, new String[]{"<null>"}, false, 15, new String[][]{{"org.jsoup.nodes.Document", "prependText", "java.lang.String", "html"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "classNames", new String[]{"java.util.Set"}, new String[]{"<empty>"}, false, 15, new String[][]{{"org.jsoup.nodes.Document", "prependText", "java.lang.String", "html"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("html {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "html {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "before", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"CtLll2020-02-30T25:61:61"}, false, 0, null, 3), new String[][]{{"empty", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"CtLll2020-02-"}, false, 13, new String[][]{}, 3), new String[][]{{"empty", "", "5"}, {"getElementsByAttributeStarting", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"CttLkl "}, false, 13, new String[][]{{"org.jsoup.nodes.Document", "title", ""}}, 3), new String[][]{{"empty", "", "5"}, {"attributes", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"#root"}, false, 13, new String[][]{{"org.jsoup.nodes.Document", "title", ""}}, 3), new String[][]{{"empty", "", "5"}, {"attributes", "", "2"}, {"hasKey", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hasClass", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "classNames", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "val", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "dataset", ""}, {"org.jsoup.nodes.Document", "ownerDocument", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"0S-0/20"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "className", ""}, {"org.jsoup.nodes.Document", "attributes", ""}}, 2), new String[][]{{"select", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "id", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "id", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"2147483647", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "after", new String[]{"java.lang.String"}, new String[]{"010"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "getElementsContainingOwnText", "java.lang.String", "[1,2]"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String"}, new String[]{"i"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "i", "--1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "parents", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "hasClass", "java.lang.String", "0xFFFFFFFF"}, {"org.jsoup.nodes.Document", "child", "int", "2147483647"}}, 3), new String[][]{{"addClass", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "toggleClass", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaabaaaaaaaaaaa"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "toggleClass", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaa`aaaabaaaaaaaaaaa"}, false, 14, new String[][]{{"org.jsoup.nodes.Document", "absUrl", "java.lang.String", ""}, {"org.jsoup.nodes.Document", "hashCode", ""}}, 2), new String[][]{{"isBlock", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "toggleClass", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaa`aa2baaaaaaaaaa123456789012345678901234567890"}, false, 14, new String[][]{{"org.jsoup.nodes.Document", "absUrl", "java.lang.String", ""}, {"org.jsoup.nodes.Document", "hashCode", ""}}, 1), new String[][]{{"isBlock", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "toggleClass", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaa`aa2baaaaaaaaaa123456789012345678901234567890"}, false, 14, new String[][]{{"org.jsoup.nodes.Document", "absUrl", "java.lang.String", ""}, {"org.jsoup.nodes.Document", "hashCode", ""}}, 1), new String[][]{{"isBlock", "", "5"}, {"getElementsMatchingOwnText", "java.util.regex.Pattern", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "data", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "data", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "outputSettings", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:1>", "<sample:7>"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "indent", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "-2147483648", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hasClass", new String[]{"java.lang.String"}, new String[]{"ac-1.5 "}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "select", "java.lang.String", "0x1BF"}, {"org.jsoup.nodes.Document", "ownText", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeAttr", new String[]{"java.lang.String"}, new String[]{"b\tdyhttp://example.com/a?b=c"}, false, 12, new String[][]{}, 3), new String[][]{{"getAllElements", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "after", new String[]{"java.lang.String"}, new String[]{"i"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "wrap", "java.lang.String", "head"}, {"org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "I", "2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeAttr", new String[]{"java.lang.String"}, new String[]{"214658348"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "removeClass", "java.lang.String", "0.35"}}, 1), new String[][]{{"ownText", "", "1"}, {"className", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeStarting", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<-0.0></-0.0> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<-0.0></-0.0> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"-0.01e10"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<-0.01e10></-0.01e10> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<-0.01e10></-0.01e10> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"-0.02e10"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<-0.02e10></-0.02e10> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<-0.02e10></-0.02e10> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"-0.0210"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<-0.0210></-0.0210> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<-0.0210></-0.0210> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"-0."}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<-0.></-0.> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<-0.></-0.> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"--0.Title"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<--0.title></--0.title> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<--0.title></--0.title> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"--0.Title"}, false, 11, new String[][]{}), new String[][]{{"getElementsByClass", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<--0.title></--0.title> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"--0.Titme"}, false, 11, new String[][]{{"org.jsoup.nodes.Document", "classNames", "java.util.Set", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<--0.titme></--0.titme> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<--0.titme></--0.titme> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependElement", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<<a>b</a>></<a>b</a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a>b</a>></<a>b</a>> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "elementSiblingIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "childNodesAsArray", ""}, {"org.jsoup.nodes.Document", "attr", "java.lang.String", "2020-02-30T25:61:61"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByTag", "java.lang.String", "-1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "dataset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "prependChild", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.Document", "childNode", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<#root></#root> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "dataset", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Document", "prependChild", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.Document", "childNode", "int", "2147483647"}}), new String[][]{{"values", "", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "<#root></#root> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "dataset", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Document", "prependChild", "org.jsoup.nodes.Node", "<sample:1>"}, {"org.jsoup.nodes.Document", "childNode", "int", "2147483647"}}), new String[][]{{"values", "", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "a {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addClass", new String[]{"java.lang.String"}, new String[]{"#root"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"\u00eb"}, false, 9, new String[][]{{"org.jsoup.nodes.Document", "removeClass", "java.lang.String", "\u00e9"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("&euml; {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "&euml; {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"\u00eb"}, false, 9, new String[][]{}), new String[][]{{"getElementsByTag", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "&euml; {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"\u00ec"}, false, 9, new String[][]{}), new String[][]{{"getElementsByTag", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "&igrave; {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"]"}, false, 8, new String[][]{}), new String[][]{{"getElementsByTag", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "] {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{""}, false, 8, new String[][]{}), new String[][]{{"getElementsByTag", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{""}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"h"}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("h {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "h {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"f"}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("f {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "f {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "val", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"W"}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("W {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "W {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"W#document"}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("W#document {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "W#document {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"W##document"}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("W##document {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "W##document {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "html", new String[]{"java.lang.String"}, new String[]{"W/##document"}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("W/##document {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "W/##document {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexLessThan", new String[]{"int"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNode", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "hashCode", ""}, {"org.jsoup.nodes.Document", "previousSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "head", ""}, {"org.jsoup.nodes.Document", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "1", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html><#root></#root>a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "head", ""}, {"org.jsoup.nodes.Document", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "1", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html>a\n<!--a--><!a> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"org.jsoup.nodes.Document", "head", ""}, {"org.jsoup.nodes.Document", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "1", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a\n<!--a--><!a> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:5>"}, false, 11, new String[][]{{"org.jsoup.nodes.Document", "head", ""}, {"org.jsoup.nodes.Document", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "1", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!--a-->0\n<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"org.jsoup.nodes.Document", "head", ""}, {"org.jsoup.nodes.Document", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "1", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a>\n<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<null>"}, false, 11, new String[][]{{"org.jsoup.nodes.Document", "absUrl", "java.lang.String", "-1"}, {"org.jsoup.nodes.Document", "head", ""}, {"org.jsoup.nodes.Document", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "1", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<#root></#root> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<#root></#root> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false), new String[][]{{"getElementsByClass", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<#root></#root> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "title", "java.lang.String", "1.1234567"}, {"org.jsoup.nodes.Document", "val", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "title", "java.lang.String", "1.1234567"}, {"org.jsoup.nodes.Document", "val", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<html>\n <head>\n  <title>1.1234567</title>\n </head>\n <body></body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outputSettings", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "title", "java.lang.String", "1.1234567"}, {"org.jsoup.nodes.Document", "val", ""}}), new String[][]{{"charset", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("0 {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "body", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "body", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<body></body> {hasText=false, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "previousSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "childNodes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "children", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:5>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("753707963", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeAttr", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "val", ""}, {"org.jsoup.nodes.Document", "empty", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeAttr", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "val", ""}, {"org.jsoup.nodes.Document", "empty", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeAttr", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "empty", ""}}), new String[][]{{"normalise", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+1", "PT1H"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "removeChild", "org.jsoup.nodes.Node", "<sample:6>"}, {"org.jsoup.nodes.Document", "empty", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567", "a"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345671.5d", ""}, false), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "select", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "select", new String[]{"java.lang.String"}, new String[]{""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "select", new String[]{"java.lang.String"}, new String[]{"/B"}, false, 13, new String[][]{{"org.jsoup.nodes.Document", "remove", ""}, {"org.jsoup.nodes.Document", "getElementsByClass", "java.lang.String", "--1010"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "select", new String[]{"java.lang.String"}, new String[]{"5"}, false, 13, new String[][]{{"org.jsoup.nodes.Document", "setBaseUri", "java.lang.String", "/5"}, {"org.jsoup.nodes.Document", "getElementsByClass", "java.lang.String", "a,Eb,c"}}), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "select", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 13, new String[][]{{"org.jsoup.nodes.Document", "setBaseUri", "java.lang.String", "/5"}, {"org.jsoup.nodes.Document", "getElementsByClass", "java.lang.String", "a,Eb,"}, {"org.jsoup.nodes.Document", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}}), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<#root></#root>a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TITLE", "i"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByClass", "java.lang.String", "[1,2]"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "lastElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<!a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nodeName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#document", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-01-01", "a,b,c"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-01-01", "a,b,c"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body></body>\n</html>, \n<html>\n <head></head>\n <body></body>\n</html>, \n<head></head>, \n<body></body>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-01-01", "a,b,c"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "2147483647", "<sample:6>"}, {"org.jsoup.nodes.Document", "dataset", ""}}), new String[][]{{"last", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<body></body> {hasText=false, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"22030-02e-0", ".5PS1H"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "2147483647", "<sample:6>"}}), new String[][]{{"last", "", "6"}, {"hasAttr", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"2147483648", "<empty>"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "text", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "ownText", ""}, {"org.jsoup.nodes.Document", "preserveWhitespace", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "classNames", new String[]{"java.util.Set"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Document", "prependElement", "java.lang.String", "1.5"}, {"org.jsoup.nodes.Document", "ownText", ""}, {"org.jsoup.nodes.Document", "previousSibling", ""}}), new String[][]{{"body", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("\n<body></body> {hasText=false, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<1.5></1.5>\n<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Document", "prependElement", "java.lang.String", "1.5"}, {"org.jsoup.nodes.Document", "ownText", ""}, {"org.jsoup.nodes.Document", "previousSibling", ""}}), new String[][]{{"getElementsByClass", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<1.5></1.5>\n<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "prependElement", "java.lang.String", "1.5"}, {"org.jsoup.nodes.Document", "previousSibling", ""}}), new String[][]{{"getElementsByClass", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "prependElement", "java.lang.String", "1.4"}, {"org.jsoup.nodes.Document", "previousSibling", ""}}), new String[][]{{"getElementsByClass", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<1.4></1.4>\n<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "prependElement", "java.lang.String", "1.#"}}), new String[][]{{"getElementsByClass", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<1.#></1.#>\n<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "normalise", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Document", "prependElement", "java.lang.String", "0.#"}}), new String[][]{{"getElementsByClass", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0.#></0.#>\n<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nextElementSibling", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodesAsArray", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "siblingNodes", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "10", "<sample:7>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "appendElement", "java.lang.String", "1L"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<1l></1l> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "10", "<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "appendElement", "java.lang.String", "1L"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "wrap", "java.lang.String", "html"}, {"org.jsoup.nodes.Document", "outputSettings", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsContainingOwnText", "java.lang.String", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingOwnText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "baseUri", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingOwnText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "baseUri", ""}, {"org.jsoup.nodes.Document", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:5>", "<sample:0>"}}), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "ownerDocument", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<#root></#root>a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"1", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "ownerDocument", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "empty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "html", ""}, {"org.jsoup.nodes.Document", "firstElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "empty", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "html", ""}, {"org.jsoup.nodes.Document", "firstElementSibling", ""}}), new String[][]{{"absUrl", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "classNames", new String[]{"java.util.Set"}, new String[]{"<sample:0>"}, false, 15, new String[][]{{"org.jsoup.nodes.Document", "prependText", "java.lang.String", "html"}, {"org.jsoup.nodes.Document", "val", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("html {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "html {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "classNames", new String[]{"java.util.Set"}, new String[]{"<null>"}, false, 15, new String[][]{{"org.jsoup.nodes.Document", "prependText", "java.lang.String", "html"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "nextSibling", ""}, {"org.jsoup.nodes.Document", "id", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "text", new String[]{"java.lang.String"}, new String[]{""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getAllElements", ""}, {"org.jsoup.nodes.Document", "getAllElements", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hasText", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tag", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Tag", actual.getClass().getName());
  assertEquals("#root {canContainBlock=true, getName=#root, isBlock=false, isData=false, isEmpty=false, isInline=true, isKnownTag=false, isSelfClosing=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "tag", new String[]{}, new String[]{}, false), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{" "}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"}"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("} {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "} {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"~"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("~ {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "~ {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "prepend", new String[]{"java.lang.String"}, new String[]{"+"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("+ {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "+ {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "parents", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsContainingOwnText", "java.lang.String", "0x123456789"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "append", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "classNames", ""}, {"org.jsoup.nodes.Document", "siblingNodes", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1E-5 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1E-5 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "append", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsContainingText", "java.lang.String", "html"}, {"org.jsoup.nodes.Document", "classNames", ""}}), new String[][]{{"getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "append", new String[]{"java.lang.String"}, new String[]{"I"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "body", ""}, {"org.jsoup.nodes.Document", "classNames", ""}}), new String[][]{{"getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "5"}, {"removeAll", "java.util.Collection", "4"}, {"addClass", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "I {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "append", new String[]{"java.lang.String"}, new String[]{"H"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "body", ""}, {"org.jsoup.nodes.Document", "classNames", ""}}), new String[][]{{"getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "5"}, {"removeAll", "java.util.Collection", "4"}, {"addClass", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "H {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "ownText", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "append", new String[]{"java.lang.String"}, new String[]{"II"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "body", ""}, {"org.jsoup.nodes.Document", "classNames", ""}, {"org.jsoup.nodes.Document", "title", "java.lang.String", "http://example.com/a?b=c"}}), new String[][]{{"getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "5"}, {"removeAll", "java.util.Collection", "4"}, {"addClass", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "II {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "title", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementById", "java.lang.String", "2020-01-01"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "append", new String[]{"java.lang.String"}, new String[]{"III"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "body", ""}, {"org.jsoup.nodes.Document", "classNames", ""}, {"org.jsoup.nodes.Document", "title", "java.lang.String", "http://example.com/a?b=c"}}), new String[][]{{"getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "5"}, {"removeAll", "java.util.Collection", "4"}, {"addClass", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "III {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "append", new String[]{"java.lang.String"}, new String[]{"IIhtml"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "body", ""}, {"org.jsoup.nodes.Document", "classNames", ""}, {"org.jsoup.nodes.Document", "title", "java.lang.String", "http://example.com/a?b=c"}}), new String[][]{{"getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "5"}, {"removeAll", "java.util.Collection", "4"}, {"addClass", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "IIhtml {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "append", new String[]{"java.lang.String"}, new String[]{"IehtnLkl--1"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "body", ""}}), new String[][]{{"getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "5"}, {"removeAll", "java.util.Collection", "4"}, {"addClass", "java.lang.String", "2"}, {"attr", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "IehtnLkl--1 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "append", new String[]{"java.lang.String"}, new String[]{"IehxnLkl--0a"}, false, 2, new String[][]{{"org.jsoup.nodes.Document", "body", ""}}), new String[][]{{"getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "5"}, {"removeAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "IehxnLkl--0a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "dataset", new String[]{}, new String[]{}, false), new String[][]{{"entrySet", "", "5"}, {"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "dataset", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"entrySet", "", "5"}, {"isEmpty", "", "7"}, {"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "id", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "children", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "wrap", new String[]{"java.lang.String"}, new String[]{"title"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtmlTail", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "10", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtml", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtml", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "siblingIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtml", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "siblingIndex", ""}, {"org.jsoup.nodes.Document", "prependElement", "java.lang.String", ".5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<.5></.5>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<.5></.5> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtml", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "parents", ""}, {"org.jsoup.nodes.Document", "prependElement", "java.lang.String", ".5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<.5></.5>\n<html>\n <head></head>\n <body></body>\n</html>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<.5></.5>\n<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "data", ""}, {"org.jsoup.nodes.Document", "prependElement", "java.lang.String", "Title"}}), new String[][]{{"empty", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<title></title> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexEquals", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "data", ""}, {"org.jsoup.nodes.Document", "prependElement", "java.lang.String", "Title\u00e9"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<title\u00e9></title\u00e9> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "siblingIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "nextSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "elementSiblingIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "createElement", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "+1", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "elementSiblingIndex", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "createElement", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaa\raaaaaa"}, {"org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "+1", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "after", new String[]{"java.lang.String"}, new String[]{"\t\t"}, false, 12, new String[][]{{"org.jsoup.nodes.Document", "text", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getAllElements", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "tag", ""}, {"org.jsoup.nodes.Document", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "1.5e300", "http://example.com/a?b=c"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "nodeName", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Document", "outerHtml", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#document", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "toggleClass", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "toggleClass", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaa`aa2baaaaaaaaaa123456789012345678901234567890"}, false, 14, new String[][]{{"org.jsoup.nodes.Document", "absUrl", "java.lang.String", ""}, {"org.jsoup.nodes.Document", "hashCode", ""}}), new String[][]{{"isBlock", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"http://example.com/a?b=c123456789012345678901234567890", "<null>"}, false), new String[][]{{"html", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "data", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsContainingOwnText", new String[]{"java.lang.String"}, new String[]{"head"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "previousElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueContaining", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Title", "--1"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "nodeName", ""}}), new String[][]{{"after", "java.lang.String", "6"}, {"add", "org.jsoup.nodes.Element", "1"}, {"add", "org.jsoup.nodes.Element", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "children", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "removeChild", "org.jsoup.nodes.Node", "<sample:6>"}}), new String[][]{{"text", "", "7"}, {"remove", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "children", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "removeChild", "org.jsoup.nodes.Node", "<sample:6>"}}), new String[][]{{"text", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "dataset", new String[]{}, new String[]{}, false), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "parents", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "setParentNode", "org.jsoup.nodes.Node", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "i"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "createElement", "java.lang.String", "0x1F"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "firstElementSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "prependText", "java.lang.String", "#root"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "tag", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.util.regex.Pattern"}, new String[]{"TITLE", "<empty>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsMatchingOwnText", "java.lang.String", "1.1234567890123456"}, {"org.jsoup.nodes.Document", "parent", ""}}), new String[][]{{"contains", "java.lang.Object", "0"}, {"html", "", "1"}, {"select", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "childNodesAsArray", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[\n<html>\n <head></head>\n <body></body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "hasClass", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"title"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"tWitlee"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "siblingIndex", ""}}), new String[][]{{"add", "int,org.jsoup.nodes.Element", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "i", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "siblingIndex", ""}, {"org.jsoup.nodes.Document", "tag", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtml", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "siblingIndex", ""}, {"org.jsoup.nodes.Document", "addChildren", "int,org.jsoup.nodes.Node[]", "0", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeAttr", new String[]{"java.lang.String"}, new String[]{"body"}, false), new String[][]{{"getAllElements", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "children", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a", "12:30:45"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "lastElementSibling", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeAttr", new String[]{"java.lang.String"}, new String[]{"Hep\tlo, World"}, false, 3, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttribute", "java.lang.String", "1e1/"}}), new String[][]{{"ownText", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "removeAttr", new String[]{"java.lang.String"}, new String[]{"214658348"}, false, 8, new String[][]{{"org.jsoup.nodes.Document", "removeClass", "java.lang.String", "0.35"}}, 1), new String[][]{{"ownText", "", "1"}, {"className", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "before", "java.lang.String", "<a>b</a>"}}), new String[][]{{"remove", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"-0p"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "before", "java.lang.String", "<a>b</a>"}}, 2), new String[][]{{"remove", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a", "0xFFFFFFFF"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a", "0xFFFFFFFF"}, false), new String[][]{{"getElementsByAttribute", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Title", "\n"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "removeChild", "org.jsoup.nodes.Node", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\n", "tEitle"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementById", "java.lang.String", "PT1H"}}, 2), new String[][]{{"after", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "select", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttribute", "java.lang.String", "a b"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "select", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaa\raaaaaa"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "select", new String[]{"java.lang.String"}, new String[]{"abc#root"}, false, 2, new String[][]{}, 3), new String[][]{{"hasAttr", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "siblingNodes", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Document", "prepend", "java.lang.String", "Titld"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PT1H", "0xFFFFFFFF"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "previousSibling", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Document", "getAllElements", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"html", "\u00e9"}, false), new String[][]{{"listIterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "title", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "outerHtmlHead", "java.lang.StringBuilder,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "2147483647", "<sample:4>"}, {"org.jsoup.nodes.Document", "wrap", "java.lang.String", "1.5c"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "before", new String[]{"java.lang.String"}, new String[]{"0"}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", "int", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "val", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "prependText", "java.lang.String", "body"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "body {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "val", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Document", "prependText", "java.lang.String", "body"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "body {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "val", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "val", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "parents", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "parents", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtml", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtml", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/a/b", "0x1F"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "hasAttr", "java.lang.String", "1E-5"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "appendText", "java.lang.String", "UTF-8"}, {"org.jsoup.nodes.Document", "getElementById", "java.lang.String", "true"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "UTF-8 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "appendText", "java.lang.String", "UTF-8"}, {"org.jsoup.nodes.Document", "getElementById", "java.lang.String", "true"}}), new String[][]{{"removeAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "UTF-8 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.jsoup.nodes.Document", "appendText", "java.lang.String", "UTF-8"}, {"org.jsoup.nodes.Document", "prependText", "java.lang.String", "<a>b</a>"}, {"org.jsoup.nodes.Document", "getElementById", "java.lang.String", "true"}}), new String[][]{{"removeAll", "java.util.Collection", "0"}, {"clear", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "&lt;a&gt;b&lt;/a&gt;UTF-8 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "setParentNode", "org.jsoup.nodes.Node", "<sample:1>"}, {"org.jsoup.nodes.Document", "previousSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"title", "010"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567", "0xFFFFXFFF"}, false), new String[][]{{"retainAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567", "0xFFFFXFFF1L"}, false), new String[][]{{"retainAll", "java.util.Collection", "2"}, {"listIterator", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234568", "0xFF#FXFFF1L"}, false), new String[][]{{"retainAll", "java.util.Collection", "2"}, {"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1135567", "1350{\"a\":1}1.21"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "1.5f", "<null>"}}, 3), new String[][]{{"retainAll", "java.util.Collection", "2"}, {"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"T", "[d,3]"}, false, 12, new String[][]{{"org.jsoup.nodes.Document", "hasAttr", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaa\raaaaaa"}, {"org.jsoup.nodes.Document", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "\nP", "1.12345678401234567"}, {"org.jsoup.nodes.Document", "parent", ""}}, 1), new String[][]{{"retainAll", "java.util.Collection", "1"}, {"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TTSITLE", "[d,3]"}, false, 11, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "\nP", "1.12345678401234567"}, {"org.jsoup.nodes.Document", "appendChild", "org.jsoup.nodes.Node", "<sample:0>"}, {"org.jsoup.nodes.Document", "parent", ""}}, 1), new String[][]{{"retainAll", "java.util.Collection", "1"}, {"eq", "int", "4"}, {"retainAll", "java.util.Collection", "5"}, {"text", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!--a--> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TTSITLE", "[d,3]"}, false, 13, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "\nP", "1.12345678401234567"}, {"org.jsoup.nodes.Document", "appendChild", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.Document", "parent", ""}}, 1), new String[][]{{"retainAll", "java.util.Collection", "1"}, {"eq", "int", "4"}, {"retainAll", "java.util.Collection", "5"}, {"text", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TTSITE", "[d4^"}, false, 11, new String[][]{{"org.jsoup.nodes.Document", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "h\nP", "1.12345678401234567"}, {"org.jsoup.nodes.Document", "appendChild", "org.jsoup.nodes.Node", "<sample:7>"}, {"org.jsoup.nodes.Document", "parent", ""}}, 1), new String[][]{{"retainAll", "java.util.Collection", "1"}, {"eq", "int", "4"}, {"retainAll", "java.util.Collection", "5"}, {"text", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendText", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("2020-01-01 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2020-01-01 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "appendText", new String[]{"java.lang.String"}, new String[]{"20200-01-01"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "nextElementSibling", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("20200-01-01 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "20200-01-01 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setSiblingIndex", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "setSiblingIndex", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsContainingOwnText", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false), new String[][]{{"first", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "addChildren", "int,org.jsoup.nodes.Node[]", "0", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a\n<!--a--><!a> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "getElementsByAttributeValueNot", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x1234567892147483648", "\n"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "prependChild", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.Document", "preserveWhitespace", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Document", "org.jsoup.nodes.Document", "outerHtmlHead", new String[]{"java.lang.StringBuilder", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "10", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Document", "addChildren", "org.jsoup.nodes.Node[]", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
