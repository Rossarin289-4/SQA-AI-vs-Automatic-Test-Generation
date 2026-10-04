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
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String"}, new String[]{"a", "<sample:6>", "1.123-5678901234567"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "unescapeEntities", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:6>"}, {"org.jsoup.parser.Tokeniser", "getState", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "xmlParser", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createCommentPending", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "currentNodeInHtmlNS", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "acknowledgeSelfClosingFlag", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.Tokeniser", "isAppropriateEndTagToken", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1-5&#", "1.123567"}, true, 0, null, 1), new String[][]{{"getElementsMatchingText", "java.util.regex.Pattern", "0"}, {"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  1-5&amp;#\n </body>\n</html>, <html>\n <head></head>\n <body>\n  1-5&amp;#\n </body>\n</html>, <head></head>, <body>\n 1-5&amp;#\n</body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "htmlParser", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createTempBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"1-5&#2147483648", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1-5\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"15&", "2147748264855296"}, true), new String[][]{{"dataNodes", "", "7"}, {"containsAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTreeBuilder", new String[]{"org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "<a>b</a>1.5f1e10", "65533"}}), new String[][]{{"getTreeBuilder", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.HtmlTreeBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<`>b</a>", "fxtended"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("&lt;`&gt;b {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitCommentPending", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "createCommentPending", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TPt&le", "0;"}, true), new String[][]{{"firstElementSibling", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitDoctypePending", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.Tokeniser", "createDoctypePending", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"&;a,b,c", "12345678901123355678901234667890"}, false, 1, new String[][]{{"org.jsoup.parser.Parser", "setTrackErrors", "int", "57344"}}), new String[][]{{"hasClass", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1&5&#21474;8354", "1.1335567829001234567PT1H"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  1&amp;5\u53e28354\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getErrors", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "<aaa`aaaaaaaaaaaaaaaaaaaaaaaaa", "2.5"}, {"org.jsoup.parser.Parser", "setTreeBuilder", "org.jsoup.parser.TreeBuilder", "<sample:7>"}}), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"1-5&F#&quot-1.5", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1-5&F#&quot-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"1-P&#X1", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1-P\001", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"1-5&F#&&quot;", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1-5&F#&\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"1&51&#2147483548"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1&51\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<aaaaaaaaaaaaaaaa3aaaaaaaa1aaaaa", "\""}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "setTrackErrors", "int", "13"}}), new String[][]{{"head", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "appropriateEndTagName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "org.jsoup.parser.Token", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1-5&F$&&quot:", "\"0x12345<789"}, true, 0, null, 2), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  1-5&amp;F$&amp;&quot;:\n </body>\n</html>, <html>\n <head></head>\n <body>\n  1-5&amp;F$&amp;&quot;:\n </body>\n</html>, <head></head>, <body>\n 1-5&amp;F$&amp;&quot;:\n</body>...#201#1265169523", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{",11.5&#57343", "2\"020-0"}, true, 0, null, 1), new String[][]{{"appendText", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  ,11.5\ufffd\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TPt&le;", "1-P%#X1"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "isTrackErrors", ""}, {"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "[1", "1.1234567890123456"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("TPt\u2264 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a/>bD</a>", "apos"}, false, 1, new String[][]{{"org.jsoup.parser.Parser", "getErrors", ""}}), new String[][]{{"childNodes", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  <a>bD</a>\n </body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a/>b<:/a>", "1.5e3000"}, false, 5, new String[][]{{"org.jsoup.parser.Parser", "setTrackErrors", "int", "57343"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  <a>b&lt;:/a&gt;</a>\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{";"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getTreeBuilder", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.XmlTreeBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "unescapeEntities", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{a\":1", "#"}, true, 0, null, 1), new String[][]{{"getAllElements", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  {a&quot;:1\n </body>\n</html>, <html>\n <head></head>\n <body>\n  {a&quot;:1\n </body>\n</html>, <head></head>, <body>\n {a&quot;:1\n</body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"a b123456789012345678901234567890", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a b123456789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "appropriateEndTagName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "appropriateEndTagName", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "isTrackErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "1.5quou", "exten7ed"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "isAppropriateEndTagToken", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"\t", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "transition", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"12:_30:5", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:_30:5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.123456789012345671.12345678901234567", ""}, true, 0, null, 3), new String[][]{{"getElementsByIndexGreaterThan", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "appropriateEndTagName", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "error", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:3>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createCommentPending", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "gtquot"}, false, 6, new String[][]{{"org.jsoup.parser.Parser", "setTreeBuilder", "org.jsoup.parser.TreeBuilder", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitTagPending", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "createCommentPending", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "getState", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2147483648", "TITLD"}, true, 0, null, 2), new String[][]{{"head", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<head></head> {hasText=false, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a b12345n789012345678901234567890", "fxten7ed"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  a b12345n789012345678901234567890\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "consumeCharacterReference", new String[]{"java.lang.Character", "boolean"}, new String[]{"m", "true"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"1.5damp", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5damp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "xmlParser", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"isTrackErrors", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitDoctypePending", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String"}, new String[]{"11144111-1.5", "<sample:4>", "t"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String"}, new String[]{"1.5e00", "<sample:5>", "H"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[\n1.5e00]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"java.lang.String"}, new String[]{"12x456789012345678901234567890missing semicolon"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "error", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.jsoup.parser.Tokeniser", "error", "org.jsoup.parser.TokeniserState", "<sample:3>"}, {"org.jsoup.parser.Tokeniser", "currentNodeInHtmlNS", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1"}, true, 0, null, 3), new String[][]{{"createElement", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<0></0> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"missinh semicolon", "<sample:0>", "<sample:6>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isNamedEntity", new String[]{"java.lang.String"}, new String[]{"n\013ll"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Tile", "010"}, true, 0, null, 1), new String[][]{{"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  Tile\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"0x12u3456789"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x12u3456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitTagPending", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.Tokeniser", "createTagPending", "boolean", "true"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"22020-01-01", "2020-02-30T25:61:61amp5."}, true, 0, null, 3), new String[][]{{"getElementsMatchingText", "java.util.regex.Pattern", "0"}, {"clone", "", "1"}, {"not", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "isTrackErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "I.123456789012345678901234567890", "gt#"}, {"org.jsoup.parser.Parser", "getErrors", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "acknowledgeSelfClosingFlag", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitTagPending", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "acknowledgeSelfClosingFlag", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1234567890123456789012{34567790"}, true, 0, null, 2), new String[][]{{"clone", "", "6"}, {"child", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "xmlParser", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"parseInput", "java.lang.String,java.lang.String", "0"}, {"addClass", "java.lang.String", "1"}, {"getElementsMatchingText", "java.util.regex.Pattern", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "xmlParser", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1114101", "552E"}, true, 0, null, 1), new String[][]{{"dataNodes", "", "1"}, {"add", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"0x,F", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x,F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "isAppropriateEndTagToken", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"65533", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("65533", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isBaseNamedEntity", new String[]{"java.lang.String"}, new String[]{"1.1334567829001234567"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isBaseNamedEntity", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"ntitifs", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ntitifs", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"PT1Hbase#", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT1Hbase#", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isNamedEntity", new String[]{"java.lang.String"}, new String[]{"PT1H"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitTagPending", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.Tokeniser", "appropriateEndTagName", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{a\"", "1.12356"}, true, 0, null, 3), new String[][]{{"baseUri", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12356", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "advanceTransition", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"131064"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "getTreeBuilder", ""}}, 3), new String[][]{{"setTreeBuilder", "org.jsoup.parser.TreeBuilder", "1"}, {"setTrackErrors", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "xmlParser", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getTreeBuilder", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.XmlTreeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"2147748364855296", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147748364855296", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"java.lang.String"}, new String[]{"0x1\r3456789"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "java.lang.String", "0x1FTITLE"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "isTrackErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "getErrors", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "eofError", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitCommentPending", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"&#I", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"H-"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "acknowledgeSelfClosingFlag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "consumeCharacterReference", "java.lang.Character,boolean", "f", "true"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"char"}, new String[]{"H"}, false, 3, new String[][]{{"org.jsoup.parser.Tokeniser", "transition", "org.jsoup.parser.TokeniserState", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"214774826485529", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("214774826485529", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "setTreeBuilder", "org.jsoup.parser.TreeBuilder", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"1.5ftrue", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5ftrue", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"0>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5d0", "1.123456789012{345657343"}, true, 0, null, 1), new String[][]{{"getElementsByIndexEquals", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "advanceTransition", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "read", ""}, {"org.jsoup.parser.Tokeniser", "getState", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"1.023567", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.023567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getTreeBuilder", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.XmlTreeBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"exte7ed", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("exte7ed", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getTreeBuilder", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.Parser", "getTreeBuilder", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.HtmlTreeBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"10"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createTagPending", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$EndTag", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isNamedEntity", new String[]{"java.lang.String"}, new String[]{"H."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2147748364855296", "exten7ed"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  2147748364855296\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"57343abc"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"char"}, new String[]{";"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getErrors", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "read", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a,b\tc", "I"}, true), new String[][]{{"hasText", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createCommentPending", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:2>"}, false, 6, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "consumeCharacterReference", new String[]{"java.lang.Character", "boolean"}, new String[]{"0", "false"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "acknowledgeSelfClosingFlag", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "advanceTransition", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TITTLE", "[1,2]"}, true), new String[][]{{"hasAttr", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "xmlParser", new String[]{}, new String[]{}, true), new String[][]{{"getTreeBuilder", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.XmlTreeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"32766"}, false, 3, new String[][]{}), new String[][]{{"isTrackErrors", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getTreeBuilder", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.XmlTreeBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "isAppropriateEndTagToken", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "appropriateEndTagName", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"PPT1H0xFFFFFFFF", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PPT1H0xFFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"HX", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("HX", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "transition", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "org.jsoup.parser.Token", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"java.lang.String"}, new String[]{"\rxtended0x1F"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.13345678901234567", "i"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  1.13345678901234567\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "isTrackErrors", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678", "e10"}, true), new String[][]{{"baseUri", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("e10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"-11.5&#", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-11.5&#", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a b1234567b89012345678901234567890", "1.123467890123456"}, true), new String[][]{{"html", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "getState", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"0x1FTitle", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1FTitle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Heelloo, World", "0xFFFFFFFF"}, true), new String[][]{{"baseUri", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"exte7nded", "extended--11.1234567"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  exte7nded\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-0/00", "i"}, true), new String[][]{{"getElementsByIndexEquals", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"<1.", "<sample:2>", "<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"1/123-56789012345671.5f", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/123-56789012345671.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-", "12:30:45"}, true), new String[][]{{"getElementsByAttributeStarting", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "currentNodeInHtmlNS", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createDoctypePending", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "xmlParser", new String[]{}, new String[]{}, true), new String[][]{{"isTrackErrors", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5e300", "PT1HH"}, true), new String[][]{{"children", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  1.5e300\n </body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitDoctypePending", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.Tokeniser", "isAppropriateEndTagToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"PT1", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"QT1H", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("QT1H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.123-567890123456", "123455789012345678901234567890"}, true), new String[][]{{"baseUri", "", "3"}, {"id", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"a b2147483648", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a b2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"QU1H", "1.2"}, true), new String[][]{{"getElementsByClass", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"1E-5TITLE", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E-5TITLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"113345678901134567", "123456789012345678901234567890"}, true), new String[][]{{"elementSiblingIndex", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "error", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"65532"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "setTreeBuilder", "org.jsoup.parser.TreeBuilder", "<sample:0>"}}), new String[][]{{"parseInput", "java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  a\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-01-01", "Ai"}, true), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  2020-01-01\n </body>\n</html>, <html>\n <head></head>\n <body>\n  2020-01-01\n </body>\n</html>, <head></head>, <body>\n 2020-01-01\n</body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"X1.12345678901234567", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("X1.12345678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String"}, new String[]{"1E-5entities-base.properties", "<sample:7>", "truIe"}, true), new String[][]{{"add", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "eofError", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"<a>b<b>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b<b>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getTreeBuilder", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.HtmlTreeBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"1-5&F#b", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1-5&F#b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTreeBuilder", new String[]{"org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:1>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitCommentPending", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2-5&#1.25", ""}, true), new String[][]{{"dataNodes", "", "1"}, {"listIterator", "int", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "htmlParser", new String[]{}, new String[]{}, true), new String[][]{{"getErrors", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"57343", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("57343", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"0xx1", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xx1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragment", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0xFF_FFFFF", "-1"}, true), new String[][]{{"baseUri", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1E-5i", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E-5i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitCommentPending", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "emitCommentPending", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "unescapeEntities", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "createTempBuffer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.Ff", "2020-01-1"}, true), new String[][]{{"head", "", "7"}, {"data", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"-1.51.1234567f901234567", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.51.1234567f901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"xhtmWl", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("xhtmWl", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"1.123r4567890123456", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.123r4567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "xmlParser", new String[]{}, new String[]{}, true), new String[][]{{"parseInput", "java.lang.String,java.lang.String", "2"}, {"children", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"0", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{".0.0", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5f", "amp"}, false, 1, new String[][]{}), new String[][]{{"getElementsByAttributeStarting", "java.lang.String", "5"}, {"hasClass", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"H.h--1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H.h--1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "htmlParser", new String[]{}, new String[]{}, true), new String[][]{{"getTreeBuilder", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.HtmlTreeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".", "+1entities-full.prooerties"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(". {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"1114111", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1114111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"2147483647"}, false), new String[][]{{"getTreeBuilder", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.XmlTreeBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String"}, new String[]{"0xFFFGFFFF", "<sample:5>", "p"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[\n0xFFFGFFFF]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"H.", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"1.123-5678901234567", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.123-5678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{".6", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"j", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("j", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"abclt", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abclt", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"1073741823"}, false, 7, new String[][]{}), new String[][]{{"parseInput", "java.lang.String,java.lang.String", "7"}, {"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  sample\n </body>\n</html>, <html>\n <head></head>\n <body>\n  sample\n </body>\n</html>, <head></head>, <body>\n sample\n</body>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isBaseNamedEntity", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String"}, new String[]{"l.6f", "<sample:3>", "."}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[\nl.6f]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getErrors", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"1"}, false, 0, null, 3), new String[][]{{"parseInput", "java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"--1.5", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{}), new String[][]{{"setTreeBuilder", "org.jsoup.parser.TreeBuilder", "5"}, {"parseInput", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("sample {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1-5e3\u00e900", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1-5e3&eacute;00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"xhtml", "0xFFFFEFFF"}, true, 0, null, 2), new String[][]{{"nodeName", "", "7"}, {"classNames", "java.util.Set", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  xhtml\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTreeBuilder", new String[]{"org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}), new String[][]{{"getTreeBuilder", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.XmlTreeBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"1114145"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "1.1234567890123456", "true1.5f.5"}}, 3), new String[][]{{"isTrackErrors", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"21477483W64855296quot", "1L"}, true), new String[][]{{"isBlock", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"1X"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1X", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"1f10", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1f10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String"}, new String[]{"a:", "<sample:5>", "##"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[\na:]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String"}, new String[]{"abc1.25", "<null>", "a b"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  abc1.25\n </body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "htmlParser", new String[]{}, new String[]{}, true), new String[][]{{"parseInput", "java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  a\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2-5&#31.25X", "\u00e9a\u00e9mp"}, true), new String[][]{{"nextSibling", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"114614"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2147748236485I5296", "1.123"}, false), new String[][]{{"childNodes", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[\n2147748236485I5296]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"X1477483648552961.25", "entities-base.propertie"}, true, 0, null, 2), new String[][]{{"appendText", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  X1477483648552961.25\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "htmlParser", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitTagPending", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "currentNodeInHtmlNS", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"Helmo, World"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Helmo, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getTreeBuilder", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.Parser", "setTreeBuilder", "org.jsoup.parser.TreeBuilder", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"1048575"}, false, 4, new String[][]{}, 2), new String[][]{{"getTreeBuilder", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.HtmlTreeBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isBaseNamedEntity", new String[]{"java.lang.String"}, new String[]{"1.122-5678901234567"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1.5s"}, false, 3, new String[][]{}), new String[][]{{"classNames", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "htmlParser", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"setTreeBuilder", "org.jsoup.parser.TreeBuilder", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"5.", "12:30:45"}, true), new String[][]{{"hasText", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ramb", "1/123-56789012345"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  ramb\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitCommentPending", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTreeBuilder", new String[]{"org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"EntFties"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("EntFties", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createTagPending", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$StartTag", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"59429"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "getErrors", ""}}, 2), new String[][]{{"getTreeBuilder", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.XmlTreeBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"57388"}, false, 6, new String[][]{}, 2), new String[][]{{"parseInput", "java.lang.String,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTreeBuilder", new String[]{"org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "1.123-5678901234567Entities", ""}}, 3), new String[][]{{"getErrors", "", "3"}, {"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "xmlParser", new String[]{}, new String[]{}, true), new String[][]{{"setTrackErrors", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "advanceTransition", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "emitDoctypePending", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTreeBuilder", new String[]{"org.jsoup.parser.TreeBuilder"}, new String[]{"<sample:3>"}, false, 0, null, 1), new String[][]{{"getErrors", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"1.13345678901234567", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.13345678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"-65533"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "0x12u34566789", "exten7ee1L"}}), new String[][]{{"setTrackErrors", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createTempBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "emitDoctypePending", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"12:30:45", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isNamedEntity", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"131090"}, false, 2, new String[][]{}, 3), new String[][]{{"setTreeBuilder", "org.jsoup.parser.TreeBuilder", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getErrors", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"\n"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "createTempBuffer", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.Tokeniser", "error", "org.jsoup.parser.TokeniserState", "<sample:7>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitDoctypePending", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"-1114110"}, false, 0, null, 2), new String[][]{{"isTrackErrors", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"{\"a\":1", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"-00", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"HF", "<empty>", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"java.lang.String"}, new String[]{"655331.5f"}, false, 6, new String[][]{{"org.jsoup.parser.Tokeniser", "error", "org.jsoup.parser.TokeniserState", "<sample:5>"}, {"org.jsoup.parser.Tokeniser", "advanceTransition", "org.jsoup.parser.TokeniserState", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "setTrackErrors", "int", "2147483647"}, {"org.jsoup.parser.Parser", "isTrackErrors", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{";", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(";", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emit", new String[]{"char"}, new String[]{"C"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "unescapeEntities", "boolean", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"0.12", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1e0", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-11.&#", ""}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "parseInput", "java.lang.String,java.lang.String", "a b", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("-11.&amp;# {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "xmlParser", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"isTrackErrors", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "transition", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "org.jsoup.parser.Token", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "xmlParser", new String[]{}, new String[]{}, true), new String[][]{{"getErrors", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"/5lt", "<sample:5>", "<sample:7>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"1.5d1.123e45678901234567", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5d1.123e45678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"1.1234667890023456", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234667890023456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"2147483647"}, false), new String[][]{{"parseInput", "java.lang.String,java.lang.String", "5"}, {"classNames", "java.util.Set", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "eofError", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1233567", "trueabc"}, true), new String[][]{{"getElementById", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"214774864855296"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("214774864855296", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTreeBuilder", new String[]{"org.jsoup.parser.TreeBuilder"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "getErrors", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "htmlParser", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"setTreeBuilder", "org.jsoup.parser.TreeBuilder", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"<null>", "true"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "unescapeEntities", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"org.jsoup.parser.Tokeniser", "getState", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String"}, new String[]{"o", "<sample:7>", "0x12q456789"}, true, 0, null, 1), new String[][]{{"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "error", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "org.jsoup.parser.Token", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"55297"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"quo", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("quo", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "eofError", new String[]{"org.jsoup.parser.TokeniserState"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.parser.Tokeniser", "emit", "org.jsoup.parser.Token", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-11.5&#+1", "\""}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "getTreeBuilder", ""}}, 3), new String[][]{{"getAllElements", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[-11.5&amp;#+1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"g1.5f", "gt"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("g1.5f {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x123456789", "trd"}, true), new String[][]{{"getElementsByIndexEquals", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "emitCommentPending", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"T6TLE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T6TLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://example.com/a?c=c", "1.5e3/0"}, true), new String[][]{{"elementSiblingIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getTreeBuilder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "getErrors", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.XmlTreeBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E-51.5f", "1.5&#"}, true, 0, null, 3), new String[][]{{"getElementsMatchingOwnText", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"amp"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("amp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Parser", "setTrackErrors", "int", "131066"}, {"org.jsoup.parser.Parser", "setTrackErrors", "int", "131066"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{}), new String[][]{{"getTreeBuilder", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.HtmlTreeBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "xmlParser", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"parseInput", "java.lang.String,java.lang.String", "3"}, {"id", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getTreeBuilder", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.HtmlTreeBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2147748364855296PT1H", "truf"}, false), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[2147748364855296PT1H]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ab2c", "ampa,b,c"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  ab2c\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "currentNodeInHtmlNS", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseBodyFragmentRelaxed", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"1.1235671114111", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1235671114111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "getTreeBuilder", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.HtmlTreeBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"nv", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nv", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tokeniser", "org.jsoup.parser.Tokeniser", "getState", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "setTrackErrors", new String[]{"int"}, new String[]{"55296"}, false, 1, new String[][]{{"org.jsoup.parser.Parser", "getErrors", ""}}), new String[][]{{"getErrors", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isTrackErrors=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String"}, new String[]{"1E-5", "<sample:3>", "1-5&#21474836470x1F"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[\n1E-5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "unescapeEntities", new String[]{"java.lang.String", "boolean"}, new String[]{"abc1114111", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc1114111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String"}, new String[]{"1.2/", "<sample:7>", "gg"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[\n1.2/]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parseInput", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PT1H", ""}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("PT1H {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isTrackErrors=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "xmlParser", new String[]{}, new String[]{}, true), new String[][]{{"parseInput", "java.lang.String,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.Parser", "org.jsoup.parser.Parser", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1;5d2147483648", "entities-base.properties55296Entities"}, true, 0, null, 2), new String[][]{{"nodeName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#document", String.valueOf(actual));
 }
}
