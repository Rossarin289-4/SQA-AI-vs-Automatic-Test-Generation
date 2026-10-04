package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"12:30:45", "Title", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  12:30:45\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "isValid", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"123456789012345678901234567890", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"I", "Hello, World"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  I\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.net.URL", "int"}, new String[]{"<sample:1>", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"1.25", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"10"}, false, 13, new String[][]{{"org.jsoup.parser.Parser", "getErrors", ""}, {"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "0x1F", "\t"}, {"org.jsoup.parser.Parser", "setTreeBuilder", "org.jsoup.parser.TreeBuilder", "<sample:6>"}}, 1), new String[][]{{"settings", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"2147483646"}, false, 10, new String[][]{{"org.jsoup.parser.Parser", "settings", "org.jsoup.parser.ParseSettings", "<sample:5>"}}), new String[][]{{"parseInput", "java.lang.String,java.lang.String", "3"}, {"head", "", "0"}, {"append", "java.lang.String", "6"}, {"empty", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseXmlFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{\"a\":1}", "a b"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n{\"a\":1}]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  1.12345678901234567\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1.5f", "a,b,c", "<sample:0>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"--1", "null"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  --1\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String"}, new String[]{".5"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  .5\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "connect", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"<a>b</a>010", "<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValidBodyHtml", new String[]{"java.lang.String"}, new String[]{"<a\t[6>Cac</^>"}, false, 9, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:8>"}, {"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", "h5A]G{I\n2z2D\t <<<a>\010m>=X.a"}, {"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "<null>", "http://exampleF.com/a?b=c12:30:45"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:0>", "<null>", "1.5f", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "<null>", "h5A]G{I\n2z2D\t <<<a>\010m>=X.a"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  a b \n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getErrors", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValidBodyHtml", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 1, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "settings", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.parser.Parser", "getErrors", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "http:/example.com/a?b=c", "Title", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "http:/example.com/a?b=c", "3", "<sample:7>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:5>", "2020-02-30T25:61:61", "3", "<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "isValid", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"123456789012345678901234567890", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "connect", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"H", "Hello, World"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  H\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", ""}}, 2), new String[][]{{"hasText", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", "-0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", "-0.0"}}, 2), new String[][]{{"children", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body></body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", "11.5f"}}, 2), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", "11.5f"}}, 2), new String[][]{{"attr", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}, 2), new String[][]{{"attr", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "0x1F", "\t"}, {"org.jsoup.parser.Parser", "setTreeBuilder", "org.jsoup.parser.TreeBuilder", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"-53"}, false, 13, new String[][]{{"org.jsoup.parser.Parser", "getErrors", ""}, {"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "0x1F", "\t"}, {"org.jsoup.parser.Parser", "setTreeBuilder", "org.jsoup.parser.TreeBuilder", "<sample:6>"}}, 1), new String[][]{{"settings", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"-53"}, false, 12, new String[][]{{"org.jsoup.parser.Parser", "getErrors", ""}, {"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "0x1F", "\010"}, {"org.jsoup.parser.Parser", "setTreeBuilder", "org.jsoup.parser.TreeBuilder", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"8"}, false, 12, new String[][]{{"org.jsoup.parser.Parser", "getErrors", ""}, {"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "0x1F", "\007"}, {"org.jsoup.parser.Parser", "setTreeBuilder", "org.jsoup.parser.TreeBuilder", "<sample:6>"}}, 1), new String[][]{{"isTrackErrors", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"-536870904"}, false, 12, new String[][]{{"org.jsoup.parser.Parser", "getErrors", ""}, {"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "0x1F", "e"}, {"org.jsoup.parser.Parser", "setTreeBuilder", "org.jsoup.parser.TreeBuilder", "<sample:6>"}}, 1), new String[][]{{"isTrackErrors", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  1.12345678901234567\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "settings", new String[]{"org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "getTreeBuilder", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "htmlParser", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<empty>", "+1", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1\n.5fC12:_30:45", "a,b,b", "<sample:0>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 .5fC12:_30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1A.5fC12:_30:45", "a,b,b", "<sample:0>", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1A.5fC12:_30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1A.5fC12:_30:45", "2020-01-01", "<sample:0>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"-0./", "<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0./", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"http://example.com/a?b=c", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"1.25", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"1.24", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.24", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"m1.24", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("m1.24", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"m1.24", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"a,b,c", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"`,b,c", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"`,b,c0x1F", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`,b,c0x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"`,b,d0x1F", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`,b,d0x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"`,bb,d0x1F", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`,bb,d0x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"`,cb,d0x1F", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`,cb,d0x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"_,cb,d0x1F", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("_,cb,d0x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"1e10", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTreeBuilder", new String[]{"org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.jsoup.parser.Parser", "getTreeBuilder", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", ""}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", ""}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"2020-02d-30T25:61:61", "-1.5", "<sample:3>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"2020-02d-30T25:61:61", "-1.5", "<sample:2>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02d-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"20H20-02d-30T25:61:61", "-1.5", "<sample:2>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("20H20-02d-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{",1[1-=2]}", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",1[1-=2]}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"1L", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"a`aaa:aaaaaa", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a`aaa:aaaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"a`aaa:aaaaaa.5", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a`aaa:aaaaaa.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"3dHfmllo,?World", "Ff", "<sample:9>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3dHfmllo,?World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"--1", "Ff", "<sample:9>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"--10", "Ff", "<sample:9>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"-.10", "Ff", "<sample:10>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-.10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"-.1", "Xfft", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-.1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{",.1", "2020-01.01", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",.1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"+1", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"\t", "1e10", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"\t-1.5", "a bb", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"\t--1-5", "a bb", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"\t--1-", "aa bc", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"\t--W-", "aa bb1.5", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--W-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "htmlParser", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"\t-,W-", "aa b", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-,W-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"+1", "/a/b", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"+1", "<null>", "<sample:7>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"null", "2020-02-30T25:61:61"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  null\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"null", "2/20-03-30T25:61:61"}, true, 0, null, 2), new String[][]{{"hasClass", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"null", "2/20-03-30T25:61:610xFFFFFFFF"}, true, 0, null, 2), new String[][]{{"hasClass", "java.lang.String", "5"}, {"elementSiblingIndex", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x+:/123456789", "{\"a\":1}1E-6"}, true, 0, null, 1), new String[][]{{"getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String"}, new String[]{".5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  .5\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "settings", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.Parser", "setTrackErrors", "int", "0"}, {"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "\u00e9", "1L"}, {"org.jsoup.parser.Parser", "getErrors", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"abc", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"abb", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abb", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:0>", "null", "1e10", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getErrors", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getErrors", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getErrors", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "connect", new String[]{"java.lang.String"}, new String[]{"a b"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValidBodyHtml", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "settings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "getErrors", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:0>", "http://example.com/a?b=c", "Title", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "http:/example.com/a?b=c", "Title", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1", "null"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  1\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "-0.0", "I"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String"}, new String[]{"\u00e9", "<null>", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  \u00e9\n </body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String"}, new String[]{"\u00e9", "<sample:6>", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n\u00e9]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String"}, new String[]{"\u00e9", "<sample:2>", ".1"}, true), new String[][]{{"listIterator", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "isTrackErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "setTreeBuilder", "org.jsoup.parser.TreeBuilder", "<sample:0>"}, {"org.jsoup.parser.Parser", "getErrors", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "settings", new String[]{"org.jsoup.parser.ParseSettings"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "PT1H"}, true), new String[][]{{"before", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:4>"}, {"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:4>"}}), new String[][]{{"hasText", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}), new String[][]{{"attr", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", "tr\"ue"}}), new String[][]{{"getElementsMatchingOwnText", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <head></head>, <body></body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.net.URL", "int"}, new String[]{"<sample:0>", "-59"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a b", "-1"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a b {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a ", "-1"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"true", "-."}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("true {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getTreeBuilder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "\n", "\t"}, {"org.jsoup.parser.Parser", "isTrackErrors", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.XmlTreeBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getTreeBuilder", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "\n", "\t"}, {"org.jsoup.parser.Parser", "isTrackErrors", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.HtmlTreeBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"0"}, false), new String[][]{{"getTreeBuilder", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.XmlTreeBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"44"}, false, 10, new String[][]{}), new String[][]{{"getTreeBuilder", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.XmlTreeBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"23"}, false, 10, new String[][]{{"org.jsoup.parser.Parser", "settings", "org.jsoup.parser.ParseSettings", "<sample:6>"}}), new String[][]{{"parseInput", "java.lang.String,java.lang.String", "3"}, {"head", "", "0"}, {"hasClass", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"23"}, false, 10, new String[][]{{"org.jsoup.parser.Parser", "settings", "org.jsoup.parser.ParseSettings", "<sample:0>"}}), new String[][]{{"parseInput", "java.lang.String,java.lang.String", "3"}, {"head", "", "0"}, {"hasClass", "java.lang.String", "6"}, {"getElementsByAttributeStarting", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-01-01", "TITLE"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  2020-01-01\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"/a/b", "Hello, World", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"/a/bhttp://example.com/a?b=c", "Hello, Worlda", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("/a/bhttp://example.com/a?b=c {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "htmlParser", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "settings", new String[]{"org.jsoup.parser.ParseSettings"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "settings", "org.jsoup.parser.ParseSettings", "<sample:3>"}, {"org.jsoup.parser.Parser", "getTreeBuilder", ""}}), new String[][]{{"setTrackErrors", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseXmlFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "<a>b</a>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseXmlFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+1", "<a>b</ha>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n+1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseXmlFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+1", "<a>b<0ha>"}, true), new String[][]{{"get", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1.i5f", "a,b,b", "<sample:0>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.i5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1.5f12:30:45", "a,b,b", "<sample:0>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5f12:30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1\n.5fC12:30:45", "a,b,b", "<sample:0>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 .5fC12:30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1\n.5fC12:_30:45", "a,b,b", "<sample:0>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 .5fC12:_30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"-1", "<null>", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{".o+1", "5.", "<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(".o+1 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{".o+1", "5.", "<sample:10>"}, true), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(".o+1\n<#root></#root> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{".o+6", "5.", "<sample:6>"}, true), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(".o+6\n<#root></#root> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{".o+4", "5.", "<sample:2>"}, true), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(".o+4\n<#root></#root> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{".+4", "5/", "<sample:2>"}, true), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(".+4\n<#root></#root> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"1.5e300", "-0.0", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"1.5e300http://example.com/a?b=c", "-0.1", "<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e300http://example.com/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"1.6e300", "-0.1", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.6e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"12:30:45", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"12:30:451E-5", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:451E-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"12:T0:45", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:T0:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"12:T0t:45", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:T0t:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"0", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"I", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"I", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"-0.0", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"-0./", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0./", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "a"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", "PT61H]"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTreeBuilder", new String[]{"org.jsoup.parser.TreeBuilder"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.jsoup.parser.Parser", "getTreeBuilder", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String"}, new String[]{"TI"}, true), new String[][]{{"getElementsByAttributeStarting", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String"}, new String[]{"P41H0.5ff"}, true), new String[][]{{"data", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<null>", "\t"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", ""}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1e10", "1.5e300"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  1e10\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1e10", "1.5e300"}, true), new String[][]{{"baseUri", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1.25"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "settings", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" \u00e9", "0.251e10"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("\u00e9 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" \u00e9a", "0.251e10"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("\u00e9a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"2020-02-30T25:61:61", "-1.5", "<sample:3>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"PT1H", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT1H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"PT12H", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT12H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"-1", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{",1", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{",1[1,2]", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",1[1,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{",1[1,2]a", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",1[1,2]a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{",1[1-2]}", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",1[1-2]}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{",1[1-=2]}", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",1[1-=2]}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTreeBuilder", new String[]{"org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:4>"}, false), new String[][]{{"getErrors", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"1E-5", "i", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"abc", "i", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"a4c", "i", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a4c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"4c", "i", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"4cc", "i", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4cc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"4cc", "010", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "xmlParser", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", "--1"}}), new String[][]{{"getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", "[1,2]a b"}}), new String[][]{{"getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseXmlFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1", "0"}, true), new String[][]{{"removeAll", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "0xFFFFFFFF", "5."}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "+1", "http://example.com/a?b=c"}, {"org.jsoup.parser.Parser", "settings", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseErrorList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"[1,2}010", "0x1F"}, true), new String[][]{{"after", "org.jsoup.nodes.Node", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"[1,2}010", "0x1F"}, true), new String[][]{{"getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"[1,2}010--1", "0x2F"}, true), new String[][]{{"getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "6"}, {"listIterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1\t--1", ".!2.+f"}, true), new String[][]{{"getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "6"}, {"html", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1L0W12344679.9[1,2]1e0022020-02-30T25:E1:H1--1", ":f81e10"}, true), new String[][]{{"attr", "java.lang.String,java.lang.String", "1"}, {"addClass", "java.lang.String", "6"}, {"charset", "java.nio.charset.Charset", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head>\n  <meta charset=\"UTF-8\">\n </head>\n <body>\n  1L0W12344679.9[1,2]1e0022020-02-30T25:E1:H1--1\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a b", "1.5d"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "5.", "1.5e300"}}), new String[][]{{"getElementsByClass", "java.lang.String", "6"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1", "true"}, true), new String[][]{{"absUrl", "java.lang.String", "6"}, {"absUrl", "java.lang.String", "2"}, {"childNodesCopy", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  1\n </body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"2147483646"}, false, 3, new String[][]{{"org.jsoup.parser.Parser", "getTreeBuilder", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"-1"}, false, 3, new String[][]{{"org.jsoup.parser.Parser", "getTreeBuilder", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0p", " 1.5c"}, true), new String[][]{{"hasSameValue", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"0", "i", "<sample:1>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"abbnull", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abbnull", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"abbnul", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abbnul", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"abbnu/l", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abbnu/l", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"i.5", "-0.0"}, true), new String[][]{{"charset", "", "3"}});
  assertNotNull(actual);
  assertEquals("sun.nio.cs.UTF_8", actual.getClass().getName());
  assertEquals("UTF-8 {canEncode=true, isRegistered=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5enull2020-01-01", "-0.05."}, true, 0, null, 2), new String[][]{{"charset", "", "3"}});
  assertNotNull(actual);
  assertEquals("sun.nio.cs.UTF_8", actual.getClass().getName());
  assertEquals("UTF-8 {canEncode=true, isRegistered=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5e300I1E.5", "-0.05.2147483648"}, true, 0, null, 2), new String[][]{{"charset", "", "3"}, {"historicalName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2147483648", "--0.0]5-\r147583648"}, true, 0, null, 2), new String[][]{{"charset", "", "3"}, {"historicalName", "", "7"}, {"canEncode", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"214F5836481L", "--0.0]5-\r147583648"}, true, 0, null, 2), new String[][]{{"charset", "", "3"}, {"historicalName", "", "7"}, {"canEncode", "", "7"}, {"name", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"--1", "--0.0]5-\r1475836481E-5"}, true), new String[][]{{"charset", "", "3"}, {"historicalName", "", "7"}, {"canEncode", "", "7"}, {"name", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, true), new String[][]{{"createElement", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<empty>", "2020-02-30T25:61:61", "0x123456789", "<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "2020-02-30T25:61:6c1a,b,c", "0x123+1", "<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String"}, new String[]{"\t"}, true), new String[][]{{"html", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body> \n </body>\n</html>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TITLE", "1.5e301"}, true, 0, null, 2), new String[][]{{"cssSelector", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#root", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String"}, new String[]{"a,,b,c"}, true), new String[][]{{"head", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<head></head> {hasText=false, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String"}, new String[]{"a,b,4c1D-51.5f"}, true), new String[][]{{"head", "", "2"}, {"insertChildren", "int,java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayStoreException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String"}, new String[]{"Ia,b4c1D.51.5f.L1LTITLE"}, true, 0, null, 3), new String[][]{{"head", "", "1"}, {"insertChildren", "int,java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayStoreException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String"}, new String[]{"Ia,b4c1D.41.5f.L1LTITLE"}, true, 0, null, 3), new String[][]{{"getElementsByClass", "java.lang.String", "1"}, {"val", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3), new String[][]{{"getElementsByClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"i", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTreeBuilder", new String[]{"org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "\t", "0x123456789"}}), new String[][]{{"setTrackErrors", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", "010"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", "010"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-02-30T25:61:61", "i"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "settings", "org.jsoup.parser.ParseSettings", "<sample:0>"}, {"org.jsoup.parser.Parser", "settings", ""}}), new String[][]{{"before", "org.jsoup.nodes.Node", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://example.com/a?b=c", "0x123456789"}, true, 0, null, 1), new String[][]{{"getElementById", "java.lang.String", "2"}, {"empty", "", "6"}, {"getElementsMatchingOwnText", "java.util.regex.Pattern", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValidBodyHtml", new String[]{"java.lang.String"}, new String[]{"{{/a\"mB12d"}, false, 7, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:5>"}, {"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValidBodyHtml", new String[]{"java.lang.String"}, new String[]{"{.1234567890123456"}, false, 15, new String[][]{{"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", "1f"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseXmlFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678901234567", "-1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n1.12345678901234567]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "settings", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.Parser", "getErrors", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"`1.12345678", "0E-5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  `1.12345678\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"`1.12345678", " "}, true, 0, null, 3), new String[][]{{"className", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "1.12345678801245>", "TITLE"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x123456789", "1.1234567890123456aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0"}, true), new String[][]{{"getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String"}, new String[]{"1", "<sample:2>", "2147483648"}, true), new String[][]{{"add", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"a,b,c", "+1", "<sample:6>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"a,b,c", "a", "<sample:8>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"a,a,c", "b", "<sample:8>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,a,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"aa,c", "c", "<sample:8>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aa,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"aa,d", "\n", "<sample:8>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aa,d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"aad", "\n", "<sample:8>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aad", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"202X-01-010xFFFFFFFF", "\n<a>b</a>", "<sample:11>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("202X-01-010xFFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, true), new String[][]{{"attributes", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567890123456", "1.5f"}, true), new String[][]{{"attr", "java.lang.String,boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{" ", "\n<?aa>c</ar>", "<sample:13>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"59", "\n<?aa>c</ar>", "<sample:3>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("59", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1.12345678901234567", "\n<?aa>c</ar>", "<sample:7>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1.25", "\n<?aa>c</ar>", "<sample:7>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "isValid", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"0", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "isTrackErrors", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "isTrackErrors", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.jsoup.parser.Parser", "setTreeBuilder", "org.jsoup.parser.TreeBuilder", "<null>"}, {"org.jsoup.parser.Parser", "setTreeBuilder", "org.jsoup.parser.TreeBuilder", "<sample:8>"}, {"org.jsoup.parser.Parser", "getErrors", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "isTrackErrors", new String[]{}, new String[]{}, false, 31, new String[][]{{"org.jsoup.parser.Parser", "getErrors", ""}, {"org.jsoup.parser.Parser", "setTrackErrors", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "isTrackErrors", new String[]{}, new String[]{}, false, 31, new String[][]{{"org.jsoup.parser.Parser", "getErrors", ""}, {"org.jsoup.parser.Parser", "setTrackErrors", "int", "1"}, {"org.jsoup.parser.Parser", "getTreeBuilder", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "0x1F"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5e300", "0x1F-0.0"}, true, 0, null, 3), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<a>b</a>", "[1,2]", "<sample:5>"}, true, 0, null, 1), new String[][]{{"hasClass", "java.lang.String", "0"}, {"body", "", "1"}, {"html", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b</a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"1.1234567890123456", "[,2]", "<sample:5>"}, true, 0, null, 1), new String[][]{{"hasClass", "java.lang.String", "0"}, {"body", "", "1"}, {"html", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseXmlFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2147483648", "/a/b"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n2147483648]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"1.4i45", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.4i45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "12:30:45", "a,b,c"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "12:30:45", "a,b,c"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"202;-01-01-1.5htt://example.com/a?b=c", "23-10"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  202;-01-01-1.5htt://example.com/a?b=c\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "settings", new String[]{"org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:1>", "1.5e300", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaa]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTreeBuilder", new String[]{"org.jsoup.parser.TreeBuilder"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "setTreeBuilder", "org.jsoup.parser.TreeBuilder", "<sample:2>"}}), new String[][]{{"setTrackErrors", "int", "2"}, {"parseInput", "java.lang.String,java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getTreeBuilder", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.HtmlTreeBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getTreeBuilder", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.Parser", "isTrackErrors", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.XmlTreeBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\t", "a,b,c"}, true), new String[][]{{"getAllElements", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body> \n </body>\n</html>, <html>\n <head></head>\n <body> \n </body>\n</html>, <head></head>, <body> \n</body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "a,b,c"}, true), new String[][]{{"getAllElements", "", "0"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30:45", "aa,b,c"}, true, 0, null, 1), new String[][]{{"getAllElements", "", "0"}, {"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1g2:30:45-1;", "a7 b"}, true, 0, null, 1), new String[][]{{"getAllElements", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  1g2:30:45-1;\n </body>\n</html>, <html>\n <head></head>\n <body>\n  1g2:30:45-1;\n </body>\n</html>, <head></head>, <body>\n 1g2:30:45-1;\n</body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"h2-0:tru=e", "THTTLE--A"}, true), new String[][]{{"firstElementSibling", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a  :", "m\u00e9\010\0101.5e300"}, true, 0, null, 1), new String[][]{{"hasAttr", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"2147483647"}, false), new String[][]{{"parseInput", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("sample {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "settings", ""}, {"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "+1", "[1,2]"}}), new String[][]{{"isTrackErrors", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"2147483615"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "settings", ""}, {"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "+1", "[1,2]"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"2147483615"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "+1", "[1,2]"}, {"org.jsoup.parser.Parser", "isTrackErrors", ""}}), new String[][]{{"parseInput", "java.lang.String,java.lang.String", "4"}, {"head", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"-51"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "+1", "[1,2]"}, {"org.jsoup.parser.Parser", "isTrackErrors", ""}}, 3), new String[][]{{"parseInput", "java.lang.String,java.lang.String", "4"}, {"head", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"67108813"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "+1", "[1,2]"}, {"org.jsoup.parser.Parser", "isTrackErrors", ""}}, 3), new String[][]{{"parseInput", "java.lang.String,java.lang.String", "4"}, {"head", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "+1", "[1,2]"}, {"org.jsoup.parser.Parser", "isTrackErrors", ""}}, 3), new String[][]{{"parseInput", "java.lang.String,java.lang.String", "4"}, {"hasText", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"-1073741836"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "+1", "[1,2]"}, {"org.jsoup.parser.Parser", "settings", "org.jsoup.parser.ParseSettings", "<sample:0>"}, {"org.jsoup.parser.Parser", "isTrackErrors", ""}}, 3), new String[][]{{"parseInput", "java.lang.String,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"2147483642"}, false, 13, new String[][]{{"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "+1", "[1,2]"}, {"org.jsoup.parser.Parser", "settings", "org.jsoup.parser.ParseSettings", "<sample:0>"}, {"org.jsoup.parser.Parser", "isTrackErrors", ""}}, 3), new String[][]{{"parseInput", "java.lang.String,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"aaaaaaaaaaaaaaaaaabaaaaaaaaaHaa", "0xFFFFFF>F", "<sample:1>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaabaaaaaaaaaHaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1.5f", "0xFFFFFFIF", "<sample:4>", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"]1.5f", "0xoFFFFFFIF", "<sample:4>", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("]1.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"]1/5f", "0xoFFFFFFIF", "<sample:4>", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("]1/5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", "i"}, {"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", "<a>b</a>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", "i"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:2>"}, {"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", "<b>bC/a>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", "j"}, {"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", "<b>bC/a>0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", "\u00e8"}, {"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", "z\"a\":1}"}, {"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"nm", "302F0-/015.1.12345P678901234567", "<sample:3>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nm", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "\u00e9"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"xFGFGFFFF", "-_", "<sample:2>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("xFGFGFFFF", String.valueOf(actual));
 }
}
