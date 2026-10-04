package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "isValid", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"T0.0", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseXmlFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-01-01", "1ello, World"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n2020-01-01]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"T0.0", "1.123456781"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  T0.0\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{" ", "` b", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String"}, new String[]{"1.5"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  1.5\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"a", "0x12345679\n", "<sample:0>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String"}, new String[]{"nu\u00e9\""}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  nu\u00e9\"\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.net.URL", "int"}, new String[]{"<sample:5>", "20"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1", ""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "connect", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"T0.[", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T0.[", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"<a>b</a>5.", ".5PT2H", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a rel=\"nofollow\">b</a>5.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValidBodyHtml", new String[]{"java.lang.String"}, new String[]{"a>b</a"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTreeBuilder", new String[]{"org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "setTrackErrors", "int", "27"}, {"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "1e10", "1.1T345678"}}), new String[][]{{"parseInput", "java.lang.String,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("0 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"<a>b</53.0x1F", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "<null>", "12:30:451.1234567890123456"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:7>"}, {"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", "<a>b</a>-1123456789012345678901234567890"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:6>", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "<null>", "1.5f", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "<null>", "abcJ"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "settings", new String[]{"org.jsoup.parser.ParseSettings"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.jsoup.parser.Parser", "getErrors", ""}}, 3), new String[][]{{"parseInput", "java.lang.String,java.lang.String", "3"}, {"appendElement", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValidBodyHtml", new String[]{"java.lang.String"}, new String[]{"<a/b</a>-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1e10", "[,2]"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  1e10\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "isValid", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"15", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "isValid", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"aaaaaaaaaaaaaaaaaaaaa", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x1F", "a,b,"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  0x1F\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.123\t45678901234567", "1x12345679\n"}, true, 0, null, 1), new String[][]{{"childNodesCopy", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  1.123 45678901234567\n </body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1-5d", "TITLE"}, true, 0, null, 1), new String[][]{{"addClass", "java.lang.String", "5"}, {"childNodeSize", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "htmlParser", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"B", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("B", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "T2H", "Ti1le\t"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseErrorList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<empty>", " ", "1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String"}, new String[]{"x123456789", "<sample:7>", "http://example.com/a?b=c"}, true, 0, null, 1), new String[][]{{"add", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"o", "+xa", "<sample:5>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("o", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "1.1234567", "+1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-02-30T25:51:61", "d5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  2020-02-30T25:51:61\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"PT1H", "/5f", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT1H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "i"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "isTrackErrors", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1ello, Worlda", "1Li"}, true, 0, null, 2), new String[][]{{"getElementsByClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseXmlFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1ello, World", "0x123456789"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n1ello, World]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"1.1234567", "+1?", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "connect", new String[]{"java.lang.String"}, new String[]{"tru"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  123456789012345678901234567890\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1ello, Wrld", ".1."}, true, 0, null, 2), new String[][]{{"getElementsByClass", "java.lang.String", "7"}, {"hasAttr", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1F-5", "L\n"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "settings", "org.jsoup.parser.ParseSettings", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1F-5 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"PS1H", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PS1H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"--8", "--1"}, true, 0, null, 2), new String[][]{{"childNodes", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  --8\n </body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:0>", "1.1234567true"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValidBodyHtml", new String[]{"java.lang.String"}, new String[]{"T0.?"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"0x2F", "0x123456789Title", "<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x2F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TITLEm", "T0.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  TITLEm\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"5", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "isValid", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"x", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "connect", new String[]{"java.lang.String"}, new String[]{"010"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "isValid", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"1Euh", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValidBodyHtml", new String[]{"java.lang.String"}, new String[]{"a "}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "1.023456681", "PT1H"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1A-5", "1.1X34567a b"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  1A-5\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"T00", "T0.0", "<sample:8>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"x12345679\n", "1.5e310", "<sample:2>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x12345679", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.net.URL", "int"}, new String[]{"<sample:1>", "0"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "abbc", "-1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "srue", "!"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", ""}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "getErrors", ""}, {"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", ".5", "2.12345678"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567{\"a\":1}"}, true, 0, null, 2), new String[][]{{"appendText", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  1.12345678901234567{\"a\":1}\n </body>\n</html>a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", "010` "}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"8173"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-0:.0", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1Hello, World"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("-0:.0 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"--11.12234567890123456", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--11.12234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2.5f", ""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  2.5f\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"htttp//example.com/a?b=c", "T0.[/a/", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("htttp//example.com/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "2147483648", "[0,2\\", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String"}, new String[]{"nu.ll"}, true, 0, null, 2), new String[][]{{"getElementById", "java.lang.String", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"0T0.[", "1.1234567890123456true", "<null>", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getTreeBuilder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "getTreeBuilder", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.XmlTreeBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"2:30:45", "Title", "<sample:3>"}, true, 0, null, 1), new String[][]{{"getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "settings", new String[]{"org.jsoup.parser.ParseSettings"}, new String[]{"<sample:8>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0xlFFFFFFF<F", "iI"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  0xlFFFFFFF\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"-15", "T0.[/a/b", "<sample:10>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{".a/b", "\n", "<sample:5>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".a/b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String"}, new String[]{"a"}, true, 0, null, 2), new String[][]{{"getElementsByAttributeStarting", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"0", "1.12345678901234567--1-1", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  0\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"3", "--2", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("3 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "H+\""}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:10>"}, false, 6, new String[][]{{"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", "1.1234.567"}, {"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", "<a>b</a>-1"}}, 2), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "7"}, {"listIterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"2020-02-30T25:61:61", "ttrue", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String"}, new String[]{"0x1F1.1234567890123456"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  0x1F1.1234567890123456\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"<a>b</ia53.", "a,bc", "<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "htmlParser", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"1 1.25", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 1.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678--1", " 1.25"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  1.12345678--1\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "xmlParser", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{",1T", "2020-02-30T25:61:61"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  ,1T\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:0>", "http://example.com/a?b=c", "http//example.com/a?b=c", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"010", "0x12345679\n"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  010\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"?", "<a>b</a"}, true), new String[][]{{"before", "org.jsoup.nodes.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"21474X3648", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21474X3648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "settings", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String"}, new String[]{"-1.5", "<sample:4>", "/a/b"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n-1.5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getErrors", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTreeBuilder", new String[]{"org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "settings", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.Parser", "getTreeBuilder", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValidBodyHtml", new String[]{"java.lang.String"}, new String[]{"2020-01-30T25:61:61"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTreeBuilder", new String[]{"org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.jsoup.parser.Parser", "getErrors", ""}, {"org.jsoup.parser.Parser", "setTreeBuilder", "org.jsoup.parser.TreeBuilder", "<sample:7>"}}), new String[][]{{"setTrackErrors", "int", "4"}, {"settings", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getTreeBuilder", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.XmlTreeBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "settings", new String[]{"org.jsoup.parser.ParseSettings"}, new String[]{"<sample:5>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "1.12345681TITLE", "http//example.com/a?b=c"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseErrorList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"1-1234567890123456", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1-1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"1.5d", "Tit\re", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<empty>", "i1.1234567", "0x12345678:"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"217483648", "abc", "<sample:9>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("217483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "1.123456782020-02-30T25:61:61", "\n"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "connect", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:1>", "a-b,c"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:7>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "1", "214748", "<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.net.URL", "int"}, new String[]{"<sample:5>", "-19"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "{\"a\":1}", "TITL:"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a", "2020-01.01"}, true), new String[][]{{"dataset", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"null", "\t"}, true), new String[][]{{"after", "org.jsoup.nodes.Node", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"1.12345678", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"a,b,c", "-1.5", "<sample:2>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1B.5", "1.123456781"}, true), new String[][]{{"className", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"0x123456789", "<sample:2>", "1.3e300", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n0x123456789]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"1.1234567890123456<", "15d", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  1.1234567890123456&lt;\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "0x12345679\n5.", "1e10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" ", "1.1234567890123456a b"}, true), new String[][]{{"getElementsByClass", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"null", "a,b,da", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"\t", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "214474X3648null", "t1474X3648123456789012345678901234567890"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"J", "nt\u00e9\""}, true), new String[][]{{"cssSelector", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#root", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5f", ""}, true), new String[][]{{"baseUri", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "htmlParser", new String[]{}, new String[]{}, true), new String[][]{{"setTreeBuilder", "org.jsoup.parser.TreeBuilder", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"{51", "_0", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{51", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"0x123456789", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"nulD", "2020-02-30T25:61:61i", "<sample:0>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nulD", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"1-5d", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1-5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:4>"}}), new String[][]{{"hasAttr", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"[1,22]", "1.}5a b", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseXmlFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true), new String[][]{{"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseXmlFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0xFFFFFFFF", "Tittfle"}, true), new String[][]{{"retainAll", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "htmlParser", new String[]{}, new String[]{}, true), new String[][]{{"parseInput", "java.lang.String,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  a\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "isTrackErrors", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"aT0.0", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aT0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"0x123456789", "1.1234567812345678901234567890123456789/0", "<sample:1>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"0.5a", "\u00e9Hello, World", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.5a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"010", "0>", "<sample:5>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1234556789012345678901234567890", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1.5", "<sample:5>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1234556789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String"}, new String[]{"1.112345678"}, true), new String[][]{{"childNodes", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  1.112345678\n </body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "{\"a\"-1}i"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"a,b,c", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:2>", ""}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String"}, new String[]{"0\"10", "<sample:1>", "-1.6TITLE"}, true), new String[][]{{"containsAll", "java.util.Collection", "4"}, {"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"1G", "1.5d", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1G", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x1234567890xFFFFFFFF", "1ello, World1ello, World"}, true), new String[][]{{"childNodesCopy", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  0x1234567890xFFFFFFFF\n </body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"{\"a\":1}", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"null", "T0.[ 2020-02-30T25:61:61"}, true), new String[][]{{"addClass", "java.lang.String", "4"}, {"getElementsContainingText", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<null>", "bbc"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-00.0", "PT1H"}, true), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  -00.0\n </body>\n</html>, <html>\n <head></head>\n <body>\n  -00.0\n </body>\n</html>, <head></head>, <body>\n -00.0\n</body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String"}, new String[]{"/xFFFFFFFF-0.0"}, true), new String[][]{{"getElementsByIndexGreaterThan", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseXmlFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.25", "+,"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n1.25]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "2147483648", "21474X36488"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"0x12345679\n", "\n.", "<sample:3>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x12345679", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "isValid", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"0x1234256789", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String"}, new String[]{"PT1H"}, true), new String[][]{{"elementSiblingIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", "I1.234567890123456"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"-11E-5", "-1-1", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-11E-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"t-1", "1.5e3001.5e300null", "<sample:7>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("t-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"Hello, Worlda", "", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, Worlda", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"p1.2_", ""}, true), new String[][]{{"clone", "", "5"}, {"classNames", "java.util.Set", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  p1.2_\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:6>"}, false, 2, new String[][]{}), new String[][]{{"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <head></head>, <body></body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String"}, new String[]{"0", "<sample:1>", "1.5d2020-01-01"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1", "1.12345678--1", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseXmlFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678--1", "123456789012345678901234567890"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n1.12345678--1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/a/b", "0\ni"}, true), new String[][]{{"getElementsByIndexGreaterThan", "int", "5"}, {"removeClass", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String"}, new String[]{"0x1F"}, true), new String[][]{{"hasSameValue", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String"}, new String[]{"--1"}, true), new String[][]{{"getElementsByTag", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String"}, new String[]{"true8"}, true), new String[][]{{"className", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "0x12T456789"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseXmlFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345578--1", "[1,2]"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n1.12345578--1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:5>"}, false), new String[][]{{"charset", "", "0"}});
  assertNotNull(actual);
  assertEquals("sun.nio.cs.UTF_8", actual.getClass().getName());
  assertEquals("UTF-8 {canEncode=true, isRegistered=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{\"a\":1}1.5d", "1234567789012345678901234567890010"}, true), new String[][]{{"childNodes", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  {\"a\":1}1.5d\n </body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "htmlParser", new String[]{}, new String[]{}, true), new String[][]{{"getErrors", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String"}, new String[]{"nu.l"}, true), new String[][]{{"getElementsContainingText", "java.lang.String", "4"}, {"hasText", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"21474836485.", "1.12345678--1"}, true), new String[][]{{"childNodesCopy", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  21474836485.\n </body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-02-30T25:61:610x12345679\n", "a b"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "010f", ""}}), new String[][]{{"getElementsContainingText", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>b</a>1.123456781", "21474836481.12345679901234567"}, true), new String[][]{{"baseUri", "", "4"}, {"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"-0.01.12345678901234567", "<null>", "1.112", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  -0.01.12345678901234567\n </body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"2147483640"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "htmlParser", new String[]{}, new String[]{}, true), new String[][]{{"setTrackErrors", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://example.com/a?b=c1L", "nul"}, true), new String[][]{{"childNodes", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  http://example.com/a?b=c1L\n </body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"<a>b</a53.", "010", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String"}, new String[]{"0x12345679\n"}, true), new String[][]{{"getElementsByAttributeStarting", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getTreeBuilder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "setTrackErrors", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.XmlTreeBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", ".5PT2H", "1.1c345678"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:330:", "-1.5"}, true), new String[][]{{"children", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  12:330:\n </body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "htmlParser", new String[]{}, new String[]{}, true), new String[][]{{"settings", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"` bhttp///example.com/a?b=c", "21474836448"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "getErrors", ""}}), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("` bhttp///example.com/a?b=c\n<!--a--> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String"}, new String[]{"` c"}, true), new String[][]{{"appendText", "java.lang.String", "7"}, {"createElement", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<0></0> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1474836481.5f", "1.1234567890123456 "}, true), new String[][]{{"elementSiblingIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:8>"}}), new String[][]{{"empty", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"i", "<sample:5>", "<a>b</a>5.abc", "<null>"}, true), new String[][]{{"addAll", "int,java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"-14"}, false, 4, new String[][]{}), new String[][]{{"getTreeBuilder", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.HtmlTreeBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseXmlFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1a", "baaaaaaaaaaaaaaaaaaaaaaaaaaaaa\n"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseXmlFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"--1", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1/a/b"}, true), new String[][]{{"listIterator", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:1>"}}), new String[][]{{"attributes", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "", "Hello, World5/"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"1.5I", "+12020-02-30T25:61:61", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1.5I {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:4>"}}), new String[][]{{"attr", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String"}, new String[]{"1-5-1.5"}, true), new String[][]{{"attributes", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:8>"}, false), new String[][]{{"after", "org.jsoup.nodes.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "htmlParser", new String[]{}, new String[]{}, true), new String[][]{{"getTreeBuilder", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.HtmlTreeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String"}, new String[]{"1.1133567", "<sample:0>", "2137483648"}, true), new String[][]{{"add", "int,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1.5", "d"}, true), new String[][]{{"body", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body>\n -1.5\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaa`a11.25", "1.25abc"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaa`a11.25 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-/./", " 1.25aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true), new String[][]{{"children", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  -/./\n </body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseXmlFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"T0.01.123456781", "<a>b</a>-1{\"a\"W1}"}, true, 0, null, 2), new String[][]{{"addAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "\n", "1.12345671.12345678"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"/a/b", "T0[", "<sample:3>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseXmlFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1E-5"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "0xF>FFFFFFFF", "1.5"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:7>", "1.1234567890123456\u00e9", "1", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1F5f", "a"}, true), new String[][]{{"absUrl", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.net.URL", "int"}, new String[]{"<sample:2>", "20"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "isValid", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"a<a>b</a>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "htmlParser", new String[]{}, new String[]{}, true), new String[][]{{"isTrackErrors", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseXmlFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567890123456", ""}, true, 0, null, 3), new String[][]{{"get", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"1.12345678901234567", "<sample:9>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"123456789012345678901234567880", "<sample:10>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123456789012345678901234567880", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"nu\u00e9\"", "-1.51.1234567890123456", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nu\u00e9\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String"}, new String[]{"1.1234557811"}, true), new String[][]{{"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{\"a\":1~", "http://example.com/a?b=cTITLE"}, true), new String[][]{{"childNodeSize", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String"}, new String[]{"61"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  61\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"null", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"1.1224567", "<sample:9>", "?", "<null>"}, true), new String[][]{{"contains", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String"}, new String[]{"1.25010"}, true), new String[][]{{"getElementsByIndexGreaterThan", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  1.25010\n </body>\n</html>, <html>\n <head></head>\n <body>\n  1.25010\n </body>\n</html>, <head></head>, <body>\n 1.25010\n</body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"3T1H", "--n", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1\t", "nulla b"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  1 \n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "htmlParser", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String"}, new String[]{"<a>b</a>5.2020-02-30T25:61:61"}, true, 0, null, 1), new String[][]{{"children", "", "6"}, {"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "isValid", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"Title", "IT0.[", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  Title\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.123456781.12345678", "1.12345678901234567"}, true, 0, null, 1), new String[][]{{"child", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  1.123456781.12345678\n </body>\n</html> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"1ello, World", "1.12345678true1.1234567890123456", "<sample:9>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1ello, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"01/", "PT1H", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("01/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String"}, new String[]{"--11.12345678"}, true), new String[][]{{"dataset", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:3>"}, false, 0, null, 3), new String[][]{{"addClass", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "settings", new String[]{"org.jsoup.parser.ParseSettings"}, new String[]{"<sample:1>"}, false), new String[][]{{"settings", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<ab</a>5.\n", "1/12345678", "<sample:2>"}, true, 0, null, 2), new String[][]{{"html", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<ab< a=\"\">\n 5. \n</ab<>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PT1H1e10", " 1.25"}, true), new String[][]{{"getElementById", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseXmlFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Hello, World", "2.25"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\nHello, World]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"0x1Fa,a,c", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1Fa,a,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"<a>b</53.", "0x123456789\u00e9", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "I-1", "<a>b</a>-1", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"oacc", "Ih", "<sample:2>"}, true), new String[][]{{"attr", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("oacc {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getErrors", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"Hello, World1.5f1.5", "<a>b</a5.", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World1.5f1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String"}, new String[]{"1", "<sample:6>", "` b"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist"}, new String[]{"1.1234567811.123456781", "2020-02-30T25:61:61", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567811.123456781", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"nuul0l", "<>b</a53."}, true, 0, null, 2), new String[][]{{"childNodes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  nuul0l\n </body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"52"}, false, 7, new String[][]{{"org.jsoup.parser.Parser", "getErrors", ""}}), new String[][]{{"settings", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.safety.Cleaner", "isValidBodyHtml", "java.lang.String", "PT1H"}, {"org.jsoup.safety.Cleaner", "clean", "org.jsoup.nodes.Document", "<sample:3>"}}, 2), new String[][]{{"dataNodes", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String"}, new String[]{"<a>b</a53.1L"}, true), new String[][]{{"childNodes", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  <a>b</a>\n </body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.jsoup.safety.Cleaner", "isValid", "org.jsoup.nodes.Document", "<sample:1>"}}), new String[][]{{"firstElementSibling", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1ellln, World", "Lello, Worldnull"}, true), new String[][]{{"classNames", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "xmlParser", new String[]{}, new String[]{}, true), new String[][]{{"getErrors", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:1>"}, false, 0, null, 2), new String[][]{{"children", "", "4"}, {"remove", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body></body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"` bb", "1", "<sample:8>", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("` bb", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<sample:3>", "true"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String"}, new String[]{"6-5f"}, true, 0, null, 2), new String[][]{{"after", "org.jsoup.nodes.Node", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "2020-02-30T25:61:u61", "\n", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"..5d", "1L", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("..5d {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String"}, new String[]{"` bnull"}, true), new String[][]{{"child", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"-1", "-11.1234567", "<sample:0>", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.io.File", "java.lang.String"}, new String[]{"<null>", "1.24"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parseBodyFragment", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 2), new String[][]{{"getElementsContainingText", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaa`aaaaa1", "PT1H", "<sample:1>"}, true), new String[][]{{"absUrl", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String"}, new String[]{"", "<sample:0>", "`"}, true), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"H1.5", "1.\"1234567890123456", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("H1.5 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Title1.5f", "11"}, true, 0, null, 2), new String[][]{{"getElementById", "java.lang.String", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"T0.0", "abc>-0.0"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "getErrors", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("T0.0 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"0"}, false), new String[][]{{"parseInput", "java.lang.String,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("0 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"_e10\u00e9", "` b0x123456789", "<sample:7>", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("_e10\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "connect", new String[]{"java.lang.String"}, new String[]{"1.1234.567"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.Jsoup", "org.jsoup.Jsoup", "clean", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.safety.Whitelist", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"-.1", "http//example.com/a?b<c", "<sample:10>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-.1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.safety.Cleaner", "org.jsoup.safety.Cleaner", "clean", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:6>"}, false, 0, null, 1), new String[][]{{"before", "org.jsoup.nodes.Node", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
}
