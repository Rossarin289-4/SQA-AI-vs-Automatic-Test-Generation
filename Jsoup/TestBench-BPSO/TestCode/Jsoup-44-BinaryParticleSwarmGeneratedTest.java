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
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"123456789012345678901234567890true", "-"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "currentElement", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  123456789012345678901234567890true\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".4d", "1e10"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", ">0.5d", "abc1.5d1.25"}}), new String[][]{{"attr", "java.lang.String,java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567", "tBue"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "2"}, {"org.jsoup.parser.TreeBuilder", "process", "org.jsoup.parser.Token", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  1.1234567\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"-1.5", "<sample:3>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "12345678901234567m901234567890", "123456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body>\n 12345678901234567m901234567890\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"\n{\"a\":1}"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "PT1I", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "ai", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".5e400", "20474836448"}, false), new String[][]{{"classNames", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "\u00e9", "2020-02-30T25:61<:61"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"nll", "<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "process", "org.jsoup.parser.Token", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{" ", "P1", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "runParser", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=null, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1\010", "1.12345678901234567"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "1.5e3/0"}}, 1), new String[][]{{"firstElementSibling", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"!", "1.250101.1234567890123456"}, false, 2, new String[][]{{"org.jsoup.parser.TreeBuilder", "runParser", ""}}), new String[][]{{"charset", "", "3"}});
  assertNotNull(actual);
  assertEquals("sun.nio.cs.UTF_8", actual.getClass().getName());
  assertEquals("UTF-8 {canEncode=true, isRegistered=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\n{\"a\":1}1", "\u00e9"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "runParser", ""}}, 1), new String[][]{{"getElementsByIndexEquals", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Hello, World", "123456789012345678901234567890"}, false, 4, new String[][]{}), new String[][]{{"getElementsMatchingText", "java.util.regex.Pattern", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  Hello, World\n </body>\n</html>, <html>\n <head></head>\n <body>\n  Hello, World\n </body>\n</html>, <head></head>, <body>\n Hello, World\n</body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"bc"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "5.2147483648", "Hello, WorlE"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</bc>, state=InBody, currentElement=<body>\n 5.2147483648\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1.5e400", "PT2H"}}), new String[][]{{"children", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".25", "truee"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "trte", "<sample:0>"}, {"org.jsoup.parser.TreeBuilder", "runParser", ""}}), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"1F.5", "<sample:9>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String", "1.122345678"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "\n{"}, false, 7, new String[][]{{"org.jsoup.parser.TreeBuilder", "runParser", ""}}), new String[][]{{"cssSelector", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#root", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.", "123456789/12345678901234567890true"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "initialiseParse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "\u00e8", "8T1IP1", "<sample:0>"}, {"org.jsoup.parser.TreeBuilder", "initialiseParse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "2R020-02-30T25:51:61", "a,b,c1.12234578", "<null>"}}), new String[][]{{"attributes", "", "5"}, {"get", "java.lang.String", "5"}, {"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/a/b-", "0"}, false, 5, new String[][]{}), new String[][]{{"hasText", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"12345678901234567890123456A7890true"}, false, 7, new String[][]{{"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E-5", "PS"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "20i20-02-30T26:61:61", ".U", "<sample:9>"}}, 2), new String[][]{{"body", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body>\n 1E-5\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1T1H", "55"}, false, 2, new String[][]{}, 1), new String[][]{{"getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"1.122345678a`aaaaaaaaaaaaaaaaaaaaaaaaaaa", "http://eample.com/a?b<c", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa>, state=null, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"]L", "1..122345678", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  ]L\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "initialiseParse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "0x12356789", "1.12345678901234567/a/b", "<null>"}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "/a/b+1", ",0.0", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=null, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"1;.5d"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "1x123456789", "12:30:45", "<sample:6>"}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "\u00e9<a>b</a>", "0x113456789"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<1;.5d>, state=InBody, currentElement=<1;.5d></1;.5d>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"X.", "1.12345678901234567"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "=a>b</a>,", "/a/b", "<sample:2>"}, {"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 2), new String[][]{{"body", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body>\n X.\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 3, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "123456789012345678901134567890", "1e1123456789012345678901234567890"}, {"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "123456789012335678901234567890true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<aaaaaaaaaaaaaaaaaaaaaaaaaaaaa>, state=InBody, currentElement=<aaaaaaaaaaaaaaaaaaaaaaaaaaaaa></aaaaaaaaaaaaaaaaaaaaaaaaaaaaa>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"11.-f", "0E-5"}, false, 3, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "0x0", "0xx1F", "<sample:4>"}}, 2), new String[][]{{"absUrl", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "aaaaaaaaaaBaaaaaaaaaaaaaaaaaaa\n{\"a\":1}", "PT"}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "aubc", "-[1,2]", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".251L", "H"}, false, 0, null, 2), new String[][]{{"createElement", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<0></0> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http:/", "1234567890123456789012p3456A7890true"}, false, 6, new String[][]{{"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "\n{\"a!:0}"}}, 1), new String[][]{{"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  http:/\n </body>\n</html>, <html>\n <head></head>\n <body>\n  http:/\n </body>\n</html>, <head></head>, <body>\n http:/\n</body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a", "."}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "currentElement", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  a\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "1L-1.5"}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "12:30:45 ", "0xFFFFFFFF", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body>\n 12:30:45 \n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1xFFFGFFFF", "Hlln, World"}, false, 0, null, 3), new String[][]{{"getElementsMatchingOwnText", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1.5", "Hello+ World"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String", "HT10"}}, 2), new String[][]{{"getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "\t\u00e9", "a c"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body>\n  \u00e9\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "0x1234579789"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "123456789012345678901234567890", "1.122345678"}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "Ftrue", ".55", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1.5c1E-5", "1F.5"}}, 2), new String[][]{{"before", "org.jsoup.nodes.Node", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body>\n 1.5c1E-5\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"9", "1.5d"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "{\"a\":1}.5", "abc"}, {"org.jsoup.parser.TreeBuilder", "currentElement", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  9\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"BeaseURI must not be null", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "1.12345678901234567aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "01;0", "<sample:2>"}, {"org.jsoup.parser.TreeBuilder", "runParser", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Title", "0"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "runParser", ""}}, 2), new String[][]{{"children", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  Title\n </body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"1.1234567890d1234567"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "6"}, {"org.jsoup.parser.TreeBuilder", "currentElement", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "urue"}, false, 0, null, 1), new String[][]{{"childNodeSize", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"|\"a\":1}", "2030-02-30T25:61:61"}, false, 0, null, 3), new String[][]{{"childNodesCopy", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  |\"a\":1}\n </body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "-1", "1.1233567890123456"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<{\"a\":1}>, state=InBody, currentElement=<{\"a\":1}></{\"a\":1}>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"BaseURI must not be null"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "{!", "1e10"}, {"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "--"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</BaseURI must not be null>, state=InBody, currentElement=<body>\n {!\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "0x1F", "\u00e8", "<sample:7>"}, {"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa010[1,2]"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "process", "org.jsoup.parser.Token", "<sample:7>"}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1.5", "1/1234567X"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "\t1.12", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</+1>, state=InBody, currentElement=<body>\n  1.12\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1d12345678900234567", "1.1234567"}, {"org.jsoup.parser.TreeBuilder", "runParser", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "5."}, false, 0, null, 2), new String[][]{{"classNames", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"1.5dabc+1"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "", "1.1234567c8901234567"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</1.5dabc+1>, state=InBody, currentElement=<body></body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"X.5"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "abca,b,c"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "TITLE", "[1,2]Hello, World"}}), new String[][]{{"child", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+1<a>b</a>", "b,b,c"}, false, 0, null, 3), new String[][]{{"attributes", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"t1.5", "1e1/", "<null>"}, false), new String[][]{{"appendText", "java.lang.String", "5"}, {"getElementsByTag", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{".F5"}, false, 5, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "TITLE", "2.12345671.25"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "1.2020-01-01", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<.F5>, state=InBody, currentElement=<.f5></.f5>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"?--1", "null"}, false, 3, new String[][]{}, 3), new String[][]{{"getElementsByAttributeStarting", "java.lang.String", "1"}, {"hasText", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "process", "org.jsoup.parser.Token", "<sample:0>"}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "0a/b", "1"}}), new String[][]{{"lastElementSibling", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body>\n 0a/b\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "currentElement", ""}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "0xFFFFFFRF", "BaseURI must not be null"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"1.1345678901234567", "<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "TITLE", "+11.5"}, {"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "{!"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<1.1345678901234567>, state=InBody, currentElement=<1.1345678901234567></1.1345678901234567>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"1.1234567890023456"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "0", "081F", "<sample:2>"}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "true1", "{!"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<1.1234567890023456>, state=InBody, currentElement=<1.1234567890023456></1.1234567890023456>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"1.2/20-01-01PT1I", "nvll", "<null>"}, false, 3, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String", "1e10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<1e10>, state=null, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"ab", "<sample:7>"}, false, 6, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String", "0xFFFF\nFFFFTitle"}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "123456789012345678901234567890true", "1234567890123456789/1234567890"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<ab>, state=InBody, currentElement=<ab></ab>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"I--1"}, false, 3, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", ".F51e10i", "\t"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<I--1>, state=InBody, currentElement=<i--1></i--1>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"II", "010"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "abc", "<sample:6>"}}, 3), new String[][]{{"createElement", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<0></0> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5", "1/1234567890123456"}, false, 7, new String[][]{}, 1), new String[][]{{"charset", "java.nio.charset.Charset", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head>\n  <meta charset=\"UTF-8\">\n </head>\n <body>\n  1.5\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"Tile", "<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "process", "org.jsoup.parser.Token", "<sample:8>"}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "6.", "aaaaaaaaaaaaaaaaaaaaaaaa`aaaaa"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<Tile>, state=InBody, currentElement=<tile></tile>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"00xFFFFFFFF"}, false, 4, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "PT1H", "fbcBaseURI must not be null"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</00xFFFFFFFF>, state=InBody, currentElement=<body>\n PT1H\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"`,b,c"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "[1,2]"}, false, 0, null, 1), new String[][]{{"body", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body>\n aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"-", "<sample:0>"}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1/.6f", "2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<->, state=InBody, currentElement=<-></->}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"1.5e304"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "runParser", ""}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "PT1I", "-\"-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</1.5e304>, state=InBody, currentElement=<body>\n PT1I\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"TITLE", "<sample:3>"}, false, 7, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1.25", "1.12374567"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<TITLE>, state=InBody, currentElement=<t\u0131tle></t\u0131tle>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"P2", "123456789012345678901234567890true"}, false, 0, null, 3), new String[][]{{"clone", "", "3"}, {"cssSelector", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#root", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{" \n{\"a\":1}", "<sample:8>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "", "9{\"a\":1}"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=< \n{\"a\":1}  comment=\"a\">, state=InBody, currentElement=<{\"a\":1} comment=\"a\"></{\"a\":1}>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"Xa b1e10"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "[1,2]+1", "b,b,c "}, {"org.jsoup.parser.TreeBuilder", "runParser", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</Xa b1e10>, state=InBody, currentElement=<body>\n [1,2]+1\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"1eP1"}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "a b", "+11.1p2345678"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</1eP1>, state=InBody, currentElement=<body>\n a b\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"1.\t1234567890123456", "1.1234567890123456", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "0xFFFFFFFF"}}), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "0"}, {"id", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12345678901234567890123567890true", "PT1H"}, false, 7, new String[][]{}, 3), new String[][]{{"getElementsByAttributeStarting", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"a2", "<sample:2>"}, false, 7, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "+1", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<a2>, state=InBody, currentElement=<a2></a2>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"123456789012345678900234567890true"}, false, 5, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "", "1e1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</123456789012345678900234567890true>, state=InBody, currentElement=<body></body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "2020-02-30T25:61:61", "1"}, {"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "-0./[1,2]"}}), new String[][]{{"getElementsByClass", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</-0./[1,2]>, state=InBody, currentElement=<body>\n 2020-02-30T25:61:61\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.TreeBuilder", "process", "org.jsoup.parser.Token", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"x.5--1", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "-11.5", ".G5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<x.5--1  comment=\"a\">, state=InBody, currentElement=<x.5--1 comment=\"a\"></x.5--1>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "http://example.com/a?b=c12:30:451.5e300", "1.2020-021-011.25"}, {"org.jsoup.parser.TreeBuilder", "currentElement", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<body>\n http://example.com/a?b=c12:30:451.5e300\n <!---->\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"PT1HBaseURI must not be null", "2020-0}-30T25:61:61", "<null>"}, false), new String[][]{{"getElementById", "java.lang.String", "3"}, {"child", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{" ", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"1xFFFFFFFF"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "202001-01", "/a/b1.5d"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String", "0x123567895."}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</1xFFFFFFFF>, state=InBody, currentElement=<0x123567895.></0x123567895.>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "currentElement", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"-0.0+1"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1.2020-01601", "BaseURI must8not be null2147483648"}, {"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "123456789012344678901234567890true<a>b</a>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</-0.0+1>, state=InBody, currentElement=<body>\n 1.2020-01601\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"1.15fhttp://example.com/a?b=c"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "a,b-c", "01x0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</1.15fhttp://example.com/a?b=c>, state=InBody, currentElement=<body>\n a,b-c\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "runParser", ""}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "\nPT1H", "12345678901234567890123456789/"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body>\n  PT1H\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"2020-02-30T25:61:61", "http://example.com/a?b=c", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "9147483648", "<sample:4>"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "<a>b</a>BaseURI must oot be null", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<<a>b</a>BaseURI must oot be null  comment=\"a\">, state=null, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "runParser", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"1.122345678123456789012345678901234567890true"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String", "--1"}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "P", "\u00e9"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<1.122345678123456789012345678901234567890true>, state=InBody, currentElement=<1.122345678123456789012345678901234567890true></1.122345678123456789012345678901234567890true>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "Title0x1F", "1.5f"}}, 3), new String[][]{{"appendText", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body>\n Title0x1F0\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"TJTLD"}, false, 6, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "\n", ""}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "", "2020-01-01", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</TJTLD>, state=InBody, currentElement=<body></body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"PT1H1F.5", "<sample:6>"}, false, 4, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "Title", "PT"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<PT1H1F.5  comment=\"a\">, state=InBody, currentElement=<pt1h1f.5 comment=\"a\"></pt1h1f.5>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"tru", "2020-02-30T25:61:61", "<null>"}, false, 5, new String[][]{{"org.jsoup.parser.TreeBuilder", "initialiseParse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "-1.5", "214748364L8-1.5", "<sample:5>"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String", "02L"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<02L>, state=null, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"\n{\"`\":1}", "1.5f", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "11.51.12345678"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</11.51.12345678>, state=null, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"01.1234567812345678901234567890123456A7890true"}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1K", "/a/b1.1234567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<01.1234567812345678901234567890123456A7890true>, state=InBody, currentElement=<01.1234567812345678901234567890123456a7890true></01.1234567812345678901234567890123456a7890true...#202#-1731237841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"\010"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "l--", "1. 5"}, {"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "abc1.12345678"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"2137A483648", "1", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "runParser", ""}}), new String[][]{{"hasClass", "java.lang.String", "2"}, {"hasText", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "TITLE123456789012345678901234567890true-1.5", "1.12345678901234567"}}, 1), new String[][]{{"getElementById", "java.lang.String", "7"}, {"getAllElements", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<body>\n TITLE123456789012345678901234567890true-1.5\n</body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", ",.5d"}, {"org.jsoup.parser.TreeBuilder", "currentElement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"1.122345678", "1.25", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "currentElement", ""}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "/.5", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</.5  comment=\"a\">, state=null, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"<a>b</a>1.122345678", "<sample:9>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "pa b", "1.5d"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String", "Pl"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<<a>b</a>1.122345678>, state=InBody, currentElement=<<a>b</a>1.122345678></<a>b</a>1.122345678>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"{!", "10\r", "<null>"}, false), new String[][]{{"firstElementSibling", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{".5", "http://example.com/a?b=c", "<null>"}, false, 0, null, 3), new String[][]{{"after", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"TITLE", "0x1F1F.5", "<null>"}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "II+1", "--0"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  TITLE\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"2020-s01-01true", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "\n{a\":1}", "-1.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<2020-s01-01true>, state=InBody, currentElement=<2020-s01-01true></2020-s01-01true>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.TreeBuilder", "initialiseParse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "214748368", "1E-5-", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=null, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "0x", "1.12345678901234567-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"PT\rI", "<sample:2>"}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "\"", "1.12345678"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<PT\rI>, state=InBody, currentElement=<pt\ri></pt\ri>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{" 12345678901234567890123456A7890true", "", "<null>"}, false, 5, new String[][]{{"org.jsoup.parser.TreeBuilder", "currentElement", ""}, {"org.jsoup.parser.TreeBuilder", "process", "org.jsoup.parser.Token", "<sample:4>"}}), new String[][]{{"getElementsByIndexLessThan", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n   12345678901234567890123456A7890true\n </body>\n</html>, <html>\n <head></head>\n <body>\n   12345678901234567890123456A7890true\n </body>\n</html>, <head></head>, <body>\n  1...#243#887199448", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"++1", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "-.1", "<sample:9>"}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1-5f1.5f", "1E-5"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"12345678901234567890123456A7890true"}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "011.5d", "<sample:1>"}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", ".1", "5."}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<12345678901234567890123456A7890true>, state=InBody, currentElement=<12345678901234567890123456a7890true></12345678901234567890123456a7890true>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "0yFFFFFFFF", "-0.00xFFFFFFFF"}}, 1), new String[][]{{"classNames", "java.util.Set", "0"}, {"children", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"010"}, false, 3, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "\t", "Hello, World1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</010>, state=InBody, currentElement=<body></body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"20u0-01-01", "1.1234567", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "1\u00e95f1.5", "<sample:8>"}}), new String[][]{{"after", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"-i", "-0.01.12345678", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "{\"a\":2}", "{\"a\"W1}"}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "2020-02-30TT25:61:61", "1.1235678a,b,c"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "{!<a>b</a>", "-1-1.5"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "PT2I", "<sample:3>"}}), new String[][]{{"empty", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<pt2i></pt2i> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<PT2I>, state=InBody, currentElement=<pt2i></pt2i>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "HTitle", "5."}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"12:30:45aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "2020-01-01", "--"}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1./da,b,c", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<12:30:45aaaaaaaaaaaaaaaaaaaaaaaaaaaaa>, state=InBody, currentElement=<12:30:45aaaaaaaaaaaaaaaaaaaaaaaaaaaaa></12:30:45aaaaaaaaaaaaaaaaaaaaaaaaaaaaa>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"123456789012345678901234567890", "", "<null>"}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String", ""}, {"org.jsoup.parser.TreeBuilder", "process", "org.jsoup.parser.Token", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=null, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"-2", "p1a b\t", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "2020-02-30T25:61:61", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1.25"}, {"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "1.12345678901244567"}}, 3), new String[][]{{"firstElementSibling", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"PT1I"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "null1.12345678901234567", "1.12345678"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</PT1I>, state=InBody, currentElement=<body>\n null1.12345678901234567\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1.12345678901234567", "t"}, {"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"1.12345678901234567", "UPT1I", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "4..", ".51.5f"}, {"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "e10"}}, 2), new String[][]{{"createElement", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "-.1", "9"}, {"org.jsoup.parser.TreeBuilder", "currentElement", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"\t", "Hello, World", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "runParser", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"."}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1.51L", "Hello, Wo?rld"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<.>, state=InBody, currentElement=<.></.>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"1.1234567890123456", "2.12345671.2<5", "<null>"}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilder", "initialiseParse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "F.5", "Pl", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=null, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "5.", "1."}, {"org.jsoup.parser.TreeBuilder", "currentElement", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"P1"}, false, 3, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "0101.12345678901234567", "1.123456778901234567"}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "X55", "-1.5", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<P1>, state=InBody, currentElement=<p1></p1>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "--1+1", "-1.5.55."}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body>\n --1+1\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "PT1I", "\013"}, {"org.jsoup.parser.TreeBuilder", "initialiseParse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "b{!", "2020-01-01", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "\u00e9", "1F.512345678901234567890123456A7890true"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String", "PT0H"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<pt0h></pt0h> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<PT0H>, state=InBody, currentElement=<pt0h></pt0h>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"."}, false, 5, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "null", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:4>"}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "[2,2]", "PT1G"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</.>, state=InBody, currentElement=<body>\n [2,2]\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1L", "iab9"}}, 1), new String[][]{{"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "12:30:45", "PT2H"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<body>\n 12:30:45\n <!---->\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"LxFFFFFFFF"}, false, 7, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "pa a"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<LxFFFFFFFF>, state=InBody, currentElement=<lxffffffff></lxffffffff>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "1e110", "1.5", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<body>\n 1e110\n <!---->\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "HellPo, Wor;d", "//a/c"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<1.5>, state=InBody, currentElement=<1.5></1.5>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"1.3]5"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "H", "1/5e3000"}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "12:30:451.12345678901234567\u00e9", "1.25"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</1.3]5>, state=InBody, currentElement=<body>\n 12:30:451.12345678901234567\u00e9\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"", "aaaaaaaaaaaaaaaaaaaaaa:aaaaaa", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "a0x123456789"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</a0x123456789>, state=null, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "--1", "12345678901234567890123456A7890true"}, {"org.jsoup.parser.TreeBuilder", "currentElement", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body>\n --1\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", ">x1F", ",-1"}}, 2), new String[][]{{"after", "org.jsoup.nodes.Node", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body>\n &gt;x1F\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 2, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "71,3]", "0x1F"}, {"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "A/a/b"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<1.1234567>, state=InBody, currentElement=<1.1234567></1.1234567>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "12345678901234567890123456A7890true", "b"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body>\n 12345678901234567890123456A7890true\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1e10", "<aa>b</a>1.122345678[1,2]"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<body>\n 1e10\n <!---->\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TreeBuilder", "initialiseParse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "abc", "0x123456789", "<null>"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "a,b,c1?E-5", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<a,b,c1?E-5>, state=null, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1.202001-01", ""}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "<a>b</a>1.12234567812:30:45", "<sample:5>"}}, 2), new String[][]{{"empty", "", "0"}, {"getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<<a>b</a>1.12234567812:30:45>, state=InBody, currentElement=<<a>b</a>1.12234567812:30:45></<a>b</a>1.12234567812:30:45>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "currentElement", ""}, {"org.jsoup.parser.TreeBuilder", "initialiseParse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "11345678901234567890123456A7890true", "/5", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=null, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"1.2020-01-01/a/b"}, false, 2, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "Hello, Workd", "<sample:9>"}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "PT1H", "PU1I"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<1.2020-01-01/a/b>, state=InBody, currentElement=<1.2020-01-01/a/b></1.2020-01-01/a/b>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"", "<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1e1H", "PT1H"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1LL", "nul]"}, {"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "BaseURRH must not be null"}}), new String[][]{{"after", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body>\n 1LL\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</BaseURRH must not be null>, state=InBody, currentElement=<body>\n 1LL\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "<a>b</a>", "1<.2020-01-01"}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "2147483648", "1.12345667890123456", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body>\n <a>b</a>\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "0x123446789", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"8A", ",1.5BaseURI must not be null", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "aXb"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</aXb>, state=null, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "12:3:45", "I"}}, 3), new String[][]{{"childNodes", "", "5"}, {"clear", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "runParser", ""}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "1.122345678", "-1.5", "<null>"}}, 1), new String[][]{{"lastElementSibling", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body>\n 1.122345678\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1", "0x123456789"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</\n>, state=InBody, currentElement=<body>\n aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "0.12345678901334567", "<a>b</a>1.122345178"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String", "1.2020-01,01"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<1.2020-01,01>\n <!---->\n</1.2020-01,01>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "<a>b</a>null", "pa b"}}, 3), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "5"}, {"getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "6"}, {"get", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"LL", "-2020-02-30T25:61:61", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "a,b,c", "<sample:9>"}, {"org.jsoup.parser.TreeBuilder", "process", "org.jsoup.parser.Token", "<sample:2>"}}, 3), new String[][]{{"charset", "", "7"}});
  assertNotNull(actual);
  assertEquals("sun.nio.cs.UTF_8", actual.getClass().getName());
  assertEquals("UTF-8 {canEncode=true, isRegistered=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"11F."}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "a b1D.5d", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<11F.>, state=InBody, currentElement=<11f.></11f.>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1.2020-01-01", "aaaaaaaaaaaaaaaHaaaaaaaaaaaaa"}, {"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "13:30:45"}}, 2), new String[][]{{"append", "java.lang.String", "0"}, {"getElementsMatchingText", "java.util.regex.Pattern", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<body>\n 1.2020-01-01\n</body>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</13:30:45>, state=InBody, currentElement=<body>\n 1.2020-01-01\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "<a>b</a>1.122345678", "2147483648"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String", "Hello, World"}}, 1), new String[][]{{"addClass", "java.lang.String", "1"}, {"getAllElements", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<hello, world class=\"a\"></hello, world>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<Hello, World  class=\"a\">, state=InBody, currentElement=<hello, world class=\"a\"></hello, world>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"123456789012345678901234567990", "<sample:5>"}, false, 6, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "1.123456781", "1.10234567890123456", "<sample:5>"}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "0E-5", "<a>b</at>1.122345678"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<123456789012345678901234567990>, state=InBody, currentElement=<123456789012345678901234567990></123456789012345678901234567990>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"-1.5", "2147483648", "<null>"}, false, 5, new String[][]{{"org.jsoup.parser.TreeBuilder", "runParser", ""}}, 1), new String[][]{{"childNode", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  -1.5\n </body>\n</html> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{",1-0.0", "a", "<null>"}, false, 4, new String[][]{{"org.jsoup.parser.TreeBuilder", "currentElement", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=null, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "currentElement", ""}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1.12345678901234567", "0dL"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<1.12345678>, state=InBody, currentElement=<1.12345678></1.12345678>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"P111", "12345678901234567890123456A7890true", "<null>"}, false, 2, new String[][]{{"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "1212345678901234567"}}, 1), new String[][]{{"firstElementSibling", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "{!PT1H"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "{![1,2]", "<null>"}}, 1), new String[][]{{"append", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body>\n aaaaaaaaaaaaaaaaaaaaaaaaaaaaasample\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<{![1,2]>, state=InBody, currentElement=<body>\n aaaaaaaaaaaaaaaaaaaaaaaaaaaaasample\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"FF", "{!", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String", "--"}}, 1), new String[][]{{"classNames", "java.util.Set", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  FF\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "a\u00e9", "\u00e9"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "Eabc", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<eabc comment=\"a\">\n <!---->\n</eabc>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1/1234367", "\u00ea"}}, 3), new String[][]{{"appendElement", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"1.12345678", "0x0F2147483648", "<null>"}, false, 7, new String[][]{{"org.jsoup.parser.TreeBuilder", "currentElement", ""}}, 2), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "4"}, {"unwrap", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"", "<sample:9>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "1.5d", "0xFFFFFFFF", "<null>"}, {"org.jsoup.parser.TreeBuilder", "initialiseParse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "4.--1", "<a>b<.a>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "initialiseParse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "-0.0", "{\"a\":1}", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=null, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"aseURI must not be null", "1L", "<null>"}, false, 6, new String[][]{{"org.jsoup.parser.TreeBuilder", "runParser", ""}}, 3), new String[][]{{"child", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  aseURI must not be null\n </body>\n</html> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"1.12", "1.", "<null>"}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String", "\t"}, {"org.jsoup.parser.TreeBuilder", "currentElement", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<\t>, state=null, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"[1,2"}, false, 2, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "b-X0.0", "2.12345671.25", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<[1,2>, state=InBody, currentElement=<[1,2></[1,2>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"a5.", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "initialiseParse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "", "2-1", "<sample:7>"}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "0.12345678901234567", "2.12346671.25"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<a5.>, state=InBody, currentElement=<a5.></a5.>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "runParser", ""}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa-", "2020-02-30T25:61:611.25"}}, 2), new String[][]{{"hasText", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"http://example.com/a?b=ca,b,c1L", "<sample:5>"}, false, 2, new String[][]{{"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "a b"}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "abc", "12345678901234567890123456A7890true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<http://example.com/a?b=ca,b,c1L>, state=InBody, currentElement=<http://example.com/a?b=ca,b,c1l></http://example.com/a?b=ca,b,c1l>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "175d", "{!"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String", "123456789012345678901234567890true "}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<123456789012345678901234567890true></123456789012345678901234567890true> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<123456789012345678901234567890true >, state=InBody, currentElement=<123456789012345678901234567890true></123456789012345678901234567890true>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"1.5e300", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1F-5", "1.25"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<1.5e300  comment=\"a\">, state=InBody, currentElement=<1.5e300 comment=\"a\"></1.5e300>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"PT1I.5", "-b", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "{\"a\":1}", "<sample:2>"}}, 1), new String[][]{{"charset", "", "0"}});
  assertNotNull(actual);
  assertEquals("sun.nio.cs.UTF_8", actual.getClass().getName());
  assertEquals("UTF-8 {canEncode=true, isRegistered=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "+1<a>b</a>"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "1e10", "<sample:13>"}}, 1), new String[][]{{"nextSibling", "", "0"}, {"childNodesCopy", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<1e10>, state=InBody, currentElement=<1e10></1e10>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"1.1234567R"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "process", "org.jsoup.parser.Token", "<sample:0>"}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "0x1234567890x1F", "P1I"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</1.1234567R>, state=InBody, currentElement=<body>\n 0x1234567890x1F\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"\t", "a b", "<null>"}, false, 7, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String", "-0.0"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "a,b,c", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<a,b,c>, state=null, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"0.25aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 2, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "2", ".5e300"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String", "1.1345678"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</0.25aaaaaaaaaaaaaaaaaaaaaaaaaaaaa>, state=InBody, currentElement=<1.1345678></1.1345678>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"12345678901234567890123456A7890true2147483648", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1.5f", "0xFFFGFFFFa,b,c"}, {"org.jsoup.parser.TreeBuilder", "process", "org.jsoup.parser.Token", "<sample:10>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<12345678901234567890123456A7890true2147483648>, state=InBody, currentElement=<12345678901234567890123456a7890true2147483648></12345678901234567890123456a7890true2147483648>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"null", "<sample:6>"}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "5.1.5", "Pl123456789012345678901234567890"}, {"org.jsoup.parser.TreeBuilder", "currentElement", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<null  comment=\"a\">, state=InBody, currentElement=<null comment=\"a\"></null>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"12:3/:45"}, false, 3, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String", "-1.5"}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "", "1.2F"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<12:3/:45>, state=InBody, currentElement=<12:3/:45></12:3/:45>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"12:30:45[1,2]", "<sample:4>"}, false, 3, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "-F5", "http://example.com/a?bTc"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<12:30:45[1,2]  comment=\"a\">, state=InBody, currentElement=<12:30:45[1,2] comment=\"a\"></12:30:45[1,2]>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"--1.5", "m<a>b</a>", "<null>"}, false, 2, new String[][]{{"org.jsoup.parser.TreeBuilder", "currentElement", ""}}, 3), new String[][]{{"childNodeSize", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"<null>", "", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "currentElement", ""}, {"org.jsoup.parser.TreeBuilder", "runParser", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"PT11H"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1,2]", "http://examqle.com/a?b=c"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<PT11H>, state=InBody, currentElement=<pt11h></pt11h>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "http://example.cm/a?b=c", ""}, {"org.jsoup.parser.TreeBuilder", "initialiseParse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", ".", "aaaaaa\"aaaaaaaaaaaaaaaaaaaaaa", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"a", "1[1,2]", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "P1", "0x1F1.5f", "<sample:1>"}}, 1), new String[][]{{"body", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body>\n a\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1.25", "null1"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "[1,2]\n", "<sample:7>"}}, 2), new String[][]{{"id", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<[1,2]\n>, state=InBody, currentElement=<[1,2]></[1,2]>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"abc", "I", "<null>"}, false, 4, new String[][]{{"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "0x]F1.5d"}}, 3), new String[][]{{"classNames", "", "3"}, {"removeAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"<null>", "123456789012345678901234567890true", "<null>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "1234567890>2345678901234567890true", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "P1", "-1", "<null>"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String", "1L"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<1L>, state=InBody, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"PT1H", "--", "<null>"}, false, 3, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "1.222345678", "<sample:3>"}}, 3), new String[][]{{"getElementsByIndexEquals", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"pb b", "5.", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "2.12345671.251e10"}}, 2), new String[][]{{"childNodesCopy", "", "6"}, {"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"i", "1.1234567890123456http://example.com/a?b=caaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<null>"}, false, 3, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1.5e200", "2147483648\n"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", ".1/5", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<.1/5  comment=\"a\">, state=InBody, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"", "1e10BaseURI must not be null", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String", "Hello, World"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<Hello, World>, state=null, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1L1.1234567890123456", "123456789012345678901234567890\t"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "pa b", "<sample:2>"}}, 2), new String[][]{{"cssSelector", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("html > body > pa b", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<pa b>, state=InBody, currentElement=<pa b></pa b>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"[1,>]", "?", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "Pl"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</Pl>, state=null, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"a,b,c", "11p25", "<null>"}, false, 5, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String", "2020-01-01"}, {"org.jsoup.parser.TreeBuilder", "initialiseParse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "1L", "1.250x1F", "<sample:4>"}}, 1), new String[][]{{"absUrl", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "2.{12345661.25", "2020-01-/1"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "1X", "<sample:0>"}}, 1), new String[][]{{"getElementsContainingOwnText", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<1X>, state=InBody, currentElement=<1x></1x>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "/x1F", "T{"}, {"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "1/12345678"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body>\n /x1F\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</1/12345678>, state=InBody, currentElement=<body>\n /x1F\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "i", "1.12345678901234>56"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"TPT1I", "1.5faaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<null>"}, false, 4, new String[][]{{"org.jsoup.parser.TreeBuilder", "runParser", ""}, {"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "aabaaaaaaaaaaaaaaaaaaaaaaaaaaai"}}, 2), new String[][]{{"dataNodes", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"h"}, false, 5, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "Ql", "<null>"}, {"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "Hello, World"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "BaseUR] must not be null", "PT1I0xFFFFFFFF"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String", "0x1Fi"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"0.5", "PS1H12:30:45", "<null>"}, false, 3, new String[][]{}, 1), new String[][]{{"cssSelector", "", "3"}, {"getElementsByTag", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"1.5g", "1.25", "<null>"}, false, 6, new String[][]{}, 2), new String[][]{{"charset", "", "4"}, {"displayName", "java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "0x1F", "2.12345671.R5"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String", "1.12345678-0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<1.12345678-0.0>\n <!---->\n</1.12345678-0.0>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "0x123456789-0.0", "-}"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<body>\n 0x123456789-0.0\n <!---->\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "I", "1.25.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<body>\n I\n <!---->\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"<a>W</a>", "z\"a\":1}", "<null>"}, false, 3, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", ".5{\"a\":1}", "1.2020-01-01", "<sample:5>"}}, 2), new String[][]{{"baseUri", "", "3"}, {"getElementsMatchingOwnText", "java.util.regex.Pattern", "7"}, {"ensureCapacity", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  <a>W</a>\n </body>\n</html>, <html>\n <head></head>\n <body>\n  <a>W</a>\n </body>\n</html>, <head></head>, <body>\n <a>W</a>\n</body>, <a>W</a>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "", "\n{\"ra:1}"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "Cbc", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<cbc>\n <!---->\n</cbc>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "11.47483648", "0x123456789"}, {"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "1.123456785."}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<body>\n 11.47483648\n <!---->\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilder", "currentElement", ""}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "abc1.1234567", "+\"71"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<body>\n abc1.1234567\n <!---->\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "nukl", "\\1,2]"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "[1,2]aaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue", "<sample:2>"}}, 3), new String[][]{{"cssSelector", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("html > body > [1,2]aaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<[1,2]aaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue>, state=InBody, currentElement=<[1,2]aaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue></[1,2]aaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"000", "gttp://example.com", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "processEndTag", "java.lang.String", "\nHello, lorld"}}, 1), new String[][]{{"childNodesCopy", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  000\n </body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", ".E5", "a,b,d1.5d"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<body>\n .E5\n <!---->\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"2020-02-30T25:61:61", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "12:30:451.1234567", "2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<2020-02-30T25:61:61>, state=InBody, currentElement=<2020-02-30t25:61:61></2020-02-30t25:61:61>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "2020-01-01", "`,b-c"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<body>\n 2020-01-01\n <!---->\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"1.5f", "<sample:9>"}, false, 3, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "123456789012345678901134567890true", "1.123456L7"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<1.5f>, state=InBody, currentElement=<1.5f></1.5f>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "process", "org.jsoup.parser.Token", "<sample:7>"}, {"org.jsoup.parser.TreeBuilder", "initialiseParse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "pa c", "null", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=null, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.jsoup.parser.TreeBuilder", "runParser", ""}, {"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1.123456890123456", "2.p25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<body>\n 1.123456890123456\n <!---->\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1", "1.122345678"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1234567890123456789012345678901.5d--1", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<body>\n 1234567890123456789012345678901.5d--1\n <!---->\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1.1234567", "[0,2]"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<body>\n 1.1234567\n <!---->\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"Hel<o, World", "PXT1I", "<null>"}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String", ""}, {"org.jsoup.parser.TreeBuilder", "initialiseParse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "12345678901234567890123456A7890true3", "--1", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"+1", "<null>"}, false, 5, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "01u00xFFFFFFFF", "[1,2]1.1234567\n"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "123456789012345678901234567890true", "TITE"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String", "1.12345678"}}, 3), new String[][]{{"before", "org.jsoup.nodes.Node", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<1.12345678></1.12345678> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<1.12345678>, state=InBody, currentElement=<1.12345678></1.12345678>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "12345678901234567890123456A7890true", "2030-01-01+1", "<null>"}, {"org.jsoup.parser.TreeBuilder", "currentElement", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<body>\n 12345678901234567890123456A7890true\n <!---->\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"<null>", "a,bc", "<null>"}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String", "[1,,2]"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"1.5fP1"}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "--1", "PT1H"}, {"org.jsoup.parser.TreeBuilder", "initialiseParse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "tsue", "a6c-", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</1.5fP1>, state=InBody, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{""}, false, 4, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1E-5http://example.com/a?b=c.5", "P1I2"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1.5xx", "1.2345678"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "1.ed", "", "<null>"}, {"org.jsoup.parser.TreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "1.123456788901234567BaseURI must not be null", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<1.123456788901234567baseuri must not be null>\n <!---->\n</1.123456788901234567baseuri must not be null>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"oa b"}, false, 2, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "truea b", "123456789012345678901234567891"}, {"org.jsoup.parser.TreeBuilder", "initialiseParse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "-1.5.5", ",23456789022345678901234567890", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</oa b>, state=InBody, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"<null>", "1E--5", "<null>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 0, new String[][]{{"org.jsoup.parser.TreeBuilder", "parse", "java.lang.String,java.lang.String", "1.1234567890123456", "1.5"}, {"org.jsoup.parser.TreeBuilder", "initialiseParse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "BaseURI must not be null", "1.5+1", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</Hello, World>, state=InBody, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
}
