package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:0>", "{\"a\":1}", "<sample:5>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:0>", "{\"a\":1}", "<sample:5>", "<sample:1>"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "1.12345678", "Title"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<empty>", "5.", "<null>", "<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "0x1F", "1e10", "<sample:0>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "0x1F", "1e10", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"p"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5f", "<a>b</a>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1.5f {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5f", "<a>b</a>"}, false), new String[][]{{"body", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1..5f", "<a>b</b>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1..5f {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5e", "<a>b</b>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1.5e {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5", "<"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1.5 {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"15", ""}, false), new String[][]{{"addClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("15 {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"X5", ""}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "defaultSettings", ""}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:2>", "Unexpected token type: ", "<sample:2>", "<sample:6>"}}), new String[][]{{"addClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("X5 {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"FX5", ""}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:2>", "Unexpected token type: ", "<sample:2>", "<sample:6>"}}), new String[][]{{"addClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("FX5 {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Doctype"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>b</a>", ""}, false, 12, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:5>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:6>"}}), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<p>b</a>1", "202/-02-30T25:61;61"}, false, 12, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<null>", "<", "<null>", "<sample:4>"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:5>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:6>"}}), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2\n01/-02-30T25:61;61abc", " "}, false, 13, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<null>", "<", "<null>", "<sample:4>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:7>"}}, 2), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "defaultSettings", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"\u00e9", "?", "<null>", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "defaultSettings", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n\u00e9]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"--1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"1.12-345678"}, false, 15, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:1>", "0", "<null>", "<sample:5>"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "a,b,c"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"1.12-e345678"}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:1>", "0", "<null>", "<sample:5>"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "a,b,c"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<sample:3>", "1"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a b {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:7>"}, {"org.jsoup.parser.XmlTreeBuilder", "processEndTag", "java.lang.String", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<sample:1>", "12:30:45"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<sample:3>", "1.25"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<sample:2>", "I12:30:461.25"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "a,b,c"}}), new String[][]{{"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[a b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<sample:5>", "J1a2:30:461.25"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "a,b,c"}}), new String[][]{{"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[a,b 1,2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<sample:5>", "J1a2:30:461.25"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "a,b,c"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a,b 1,2 {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"1.5e300", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{".V4d3-1.5", "<sample:3>"}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "1.12345678", " "}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "1.123y5678", ""}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "-1.5"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "-1.5"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"30"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:2>", "1.5", "<null>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Doctype"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "I"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "2010-01-01"}, {"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1.5e300", "Hello, World", "<sample:0>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<sample:1>", "I"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:2>", "{\"a\":1}", "<sample:6>", "<sample:2>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:2>"}}), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"1"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<empty>", "1E-5"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<!DOCTYPE> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "2147483648"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "runParser", ""}, {"org.jsoup.parser.XmlTreeBuilder", "processEndTag", "java.lang.String", "\n"}}, 3), new String[][]{{"childNodeSize", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\n", "aa"}, false, 5, new String[][]{}, 1), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "currentElement", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:4>"}, {"org.jsoup.parser.XmlTreeBuilder", "runParser", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<>b</a>12345167790123456789012345679]0", "<a>b</a>"}, false, 1, new String[][]{}, 2), new String[][]{{"createElement", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12-345678", "<a>b</a>2020-01-01"}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<sample:1>", ".5"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<sample:0>", "202/-02-30T25:61;61"}}, 2), new String[][]{{"createElement", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Doctype"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "PT1H", "<sample:7>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678901234567", "[1,2]"}, false, 0, null, 2), new String[][]{{"appendTo", "org.jsoup.nodes.Element", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1.12345678901234567 {hasParent=true, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1345678901234\r567", "[12]"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:7>"}}, 2), new String[][]{{"appendTo", "org.jsoup.nodes.Element", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1.1345678901234 567 {hasParent=true, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678901234567", "1.x1224567"}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "<"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:6>"}}, 2), new String[][]{{"childNodesCopy", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[1.12345678901234567]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678901234567", "1.x1224567"}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "<"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:6>"}}, 2), new String[][]{{"dataNodes", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"1..12345678d1h34561_.12345678+1-1"}, false, 13, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "defaultSettings", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "<", "true"}, {"org.jsoup.parser.XmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:7>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processEndTag", "java.lang.String", "\n"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<sample:1>", "[1,2]"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"Undaxx"}, false, 5, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<sample:0>", "1e10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"-1.5", "<sample:3>"}, false, 7, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "http://example.com/a?b=c", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:3>", "<p>b<a>1", "<sample:4>", "<null>"}, {"org.jsoup.parser.XmlTreeBuilder", "defaultSettings", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "defaultSettings", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "currentElement", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<null>", "1.5e300"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<empty>", "\n0"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<sample:2>", "\u00e9\u00e9"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1.5d", "1.5f", "<sample:5>", "<sample:6>"}, {"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1.5e300", "<p>b</a>1", "<sample:2>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a b {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<sample:2>", "\u00e9"}, false, 6, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1.5d", "1.5f", "<sample:5>", "<sample:6>"}, {"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1.5e300", "<p>b</a>1", "<sample:2>", "<sample:3>"}}, 2), new String[][]{{"getElementsByClass", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<sample:2>", "\u00e9"}, false, 6, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1.5d", "1.5f", "<sample:5>", "<sample:6>"}, {"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1.5e300", "<p>b</a>1", "<sample:2>", "<sample:3>"}}), new String[][]{{"getElementsByClass", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<sample:0>", "\u00e9\u00e9"}, false, 9, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1.5d", "1.5f", "<sample:5>", "<sample:6>"}, {"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1.5e300", "<p>b</`>1", "<sample:2>", "<sample:3>"}}, 1), new String[][]{{"getElementsByClass", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<null>", "\u00e9"}, false, 9, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1.5d", "1.5f", "<sample:5>", "<sample:6>"}, {"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1.5e300", "<p>b</`>1", "<sample:2>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Doctype"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<sample:0>", "12:30:45"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:0>", "-.1", "<null>", "<null>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:2>"}, false, 14, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<empty>", "1.1234567"}, {"org.jsoup.parser.XmlTreeBuilder", "currentElement", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:3>"}, false, 14, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<empty>", "1.1234567"}, {"org.jsoup.parser.XmlTreeBuilder", "currentElement", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:3>", "1.5", "<null>", "<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "1.12345678", "<sample:6>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a b {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:4>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:4>"}, {"org.jsoup.parser.XmlTreeBuilder", "defaultSettings", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:3>", " ", "<null>", "<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a b {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:5>", " ", "<null>", "<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a,b 1,2 {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:0>", " ", "<null>", "<sample:2>"}, false, 0, null, 1), new String[][]{{"addClass", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:0>", " ", "<null>", "<sample:2>"}, false, 0, null, 1), new String[][]{{"childNode", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<sample:6>", "r"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processEndTag", "java.lang.String", "1.5"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "!"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:2>"}}, 3), new String[][]{{"hasParent", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<sample:6>", "t"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processEndTag", "java.lang.String", "1.45"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:2>"}}, 3), new String[][]{{"attr", "java.lang.String,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<a><b>t</b></a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<sample:2>", "t"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processEndTag", "java.lang.String", "12:30:45"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<null>"}, {"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "-1", "1.12-345678", "<sample:5>", "<sample:5>"}}, 1), new String[][]{{"attr", "java.lang.String,boolean", "7"}, {"absUrl", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<sample:2>", "s"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processEndTag", "java.lang.String", "12:30:45"}, {"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "-<1", "1.12-345678", "<sample:5>", "<sample:5>"}}, 1), new String[][]{{"attr", "java.lang.String,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a b {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<sample:2>", "s"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processEndTag", "java.lang.String", "12:30:45"}, {"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "-<1", "1.12-345678", "<sample:5>", "<sample:5>"}}, 1), new String[][]{{"attr", "java.lang.String,boolean", "7"}, {"charset", "", "0"}});
  assertNotNull(actual);
  assertEquals("sun.nio.cs.UTF_8", actual.getClass().getName());
  assertEquals("UTF-8 {canEncode=true, isRegistered=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"1.1234567", "<p>b</a>1", "<null>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n1.1234567]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"--1", "<p>b</a>1", "<null>", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n--1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"--1", "<p>b</b>1", "<null>", "<sample:2>"}, false), new String[][]{{"add", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1.12-345678", "0", "<sample:4>", "<null>"}, {"org.jsoup.parser.XmlTreeBuilder", "processEndTag", "java.lang.String", "null"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processEndTag", "java.lang.String", "null"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<empty>", "[1,2]", "<null>", "<sample:6>"}, false), new String[][]{{"getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "5"}, {"text", "", "6"}, {"lastIndexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<empty>", "[1,2]", "<null>", "<sample:6>"}, false, 0, null, 1), new String[][]{{"getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "5"}, {"text", "", "6"}, {"lastIndexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<null>", "[1,2]", "<null>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "Unexpected token type: ", "2020-02-30T25:61:61"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("Unexpected token type: {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "Unexpected token type: ", "2020-02-30T25:61:61"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "+1", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<+1></+1> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "I", "i", "<sample:2>", "<sample:4>"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "Unexpected token type: ", "2020-02-30T25:61:61"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "+1", "<null>"}}, 3), new String[][]{{"after", "org.jsoup.nodes.Node", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<+1></+1> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "I", "", "<sample:2>", "<sample:4>"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "Unexpected token type: ", "2020-02-30T25:61:61"}}), new String[][]{{"after", "org.jsoup.nodes.Node", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "I", "", "<sample:2>", "<sample:4>"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "Unexpected token type: ", "2020-02-30T25:61:61"}}, 3), new String[][]{{"after", "org.jsoup.nodes.Node", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:2>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"I", "<null>"}, false, 3, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "/a/b", "a b"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/", "a,b,c"}, false, 4, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("/ {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"I", "a,b,c"}, false, 4, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("I {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"H", "a,b,c"}, false, 3, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:7>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:1>"}, {"org.jsoup.parser.XmlTreeBuilder", "currentElement", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("H {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"H", "a,b,c"}, false, 3, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:7>"}, {"org.jsoup.parser.XmlTreeBuilder", "currentElement", ""}}, 3), new String[][]{{"dataNodes", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "1E-5", "0xFFFFFFFF"}, {"org.jsoup.parser.XmlTreeBuilder", "defaultSettings", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<null>"}, false, 13, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "1E--5", "0xFFFFFFFF"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "i"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:6>"}, false, 8, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<null>", "hutp://example.com/a?b=c", "<sample:0>", "<sample:1>"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<sample:3>", "Hello, WWorld"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:1>", "[1,2]", "<null>", "<sample:4>"}, {"org.jsoup.parser.XmlTreeBuilder", "processEndTag", "java.lang.String", "Title"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:1>", "[1,22]", "<null>", "<sample:4>"}, {"org.jsoup.parser.XmlTreeBuilder", "processEndTag", "java.lang.String", "Title"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"/a/b", "1.1234567890123456", "<null>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n/a/b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"/a/b", "1.1234567890123456", "<null>", "<sample:1>"}, false), new String[][]{{"listIterator", "", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"/a.b", "14.1234567890123456", "<null>", "<null>"}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:3>"}}, 1), new String[][]{{"add", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"/a.b", "14.12345678901234561.5e300", "<null>", "<null>"}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:6>"}}, 1), new String[][]{{"listIterator", "", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"/a.b", "14.123446789012[3461.5e300", "<null>", "<sample:7>"}, false, 2, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:7>"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "010", "<sample:0>"}}, 2), new String[][]{{"listIterator", "", "4"}, {"add", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"0-55", "<sample:0>"}, false, 5, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:1>"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "1.5d", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Doctype"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:0>"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "!", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234565", "n"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1.1234565 {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345>5", "n"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1.12345&gt;5 {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345>5-1", "n"}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1.12345&gt;5-1 {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<sample:4>", "202/-02U30T25;61 61"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "1.25", "/a-/b"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<sample:4>", "202/-02U30T25;61 61"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "1.25", "/a-/b"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"-y.{1", "<sample:2>"}, false, 6, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:2>"}, {"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:3>", "0", "<sample:1>", "<sample:7>"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<sample:5>", "12:30:45"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<empty>", "3020,01-01"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<null>", "!", "<null>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<sample:6>", "ib"}, false, 0, null, 2), new String[][]{{"getElementsMatchingText", "java.util.regex.Pattern", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<a><b>t</b></a>, <a><b>t</b></a>, <b>t</b>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "defaultSettings", ""}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<sample:0>", "!"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "htp://example.com/a?b=c", "2020-01-01"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "defaultSettings", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Doctype"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "defaultSettings", ""}, {"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "?", "-1.5", "<null>", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".5", "!Title"}, false, 7, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<sample:2>", "<p>b</a>1"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(".5 {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"/a/bo"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:1>", "2020-02-30T25:61:61", "<null>", "<sample:7>"}, {"org.jsoup.parser.XmlTreeBuilder", "currentElement", ""}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "\t", "1.5f"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<null>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<sample:3>", "aaaaaaaaaaaaaaaaaaaaaabaaaaaa"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processEndTag", "java.lang.String", "a b"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "1e10", "1.5d"}}, 3), new String[][]{{"getElementsByIndexGreaterThan", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"abc", "123456789012345678901234567890", "<null>", "<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:4>"}, {"org.jsoup.parser.XmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\nabc]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>b<</`>", "true>123456789012445678901234567890"}, false, 14, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:2>"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "abc"}}), new String[][]{{"getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"P<a>Fb<</a>abc", "bLfTITLE010"}, false, 5, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("P\n<a>Fb&lt;</a>abc {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.3U6;c7>1.25", "t"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1.3U6;c7&gt;1.25 {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.3U6<c7>1.25", "t"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1.3U6\n<c7>\n 1.25\n</c7> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.3U6<c7>1.2", "t1.5"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1.3U6\n<c7>\n 1.2\n</c7> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.3U6r<c7>1.2", "t1.5"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1.3U6r\n<c7>\n 1.2\n</c7> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"true>123456789012445678901234567890", "0x123456789", "<null>", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\ntrue&gt;123456789012445678901234567890]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"truea>123456789012445678901234567890", "0x123456789", "<null>", "<sample:5>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\ntruea&gt;123456789012445678901234567890]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"2147483648", "0x123456789", "<null>", "<sample:6>"}, false, 6, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", ".5"}}), new String[][]{{"iterator", "", "5"}, {"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"21474836D48", "0x123456789", "<null>", "<sample:9>"}, false, 6, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", ".5"}}, 2), new String[][]{{"iterator", "", "5"}, {"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<empty>", ".5", "<null>", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<empty>", "\n", "<null>", "<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "defaultSettings", ""}}), new String[][]{{"appendTo", "org.jsoup.nodes.Element", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<empty>", "\t", "<null>", "<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "defaultSettings", ""}}, 1), new String[][]{{"appendTo", "org.jsoup.nodes.Element", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:2>", "<ab5.a>>", "<null>", "<sample:7>"}, false, 10, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:1>"}}, 1), new String[][]{{"dataNodes", "", "2"}, {"iterator", "", "5"}, {"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<sample:3>", "q"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a b {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<sample:1>", "d1.5"}, false, 6, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<empty>", "i"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<sample:0>", "d11.5"}, false, 6, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<empty>", "i"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<sample:0>", "d11.5!"}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<empty>", "i"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:4>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<null>", "null", "<sample:7>", "<sample:6>"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "0xFFFFFFFF", "TITLE"}, {"org.jsoup.parser.XmlTreeBuilder", "runParser", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<null>"}, false, 9, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "0w123456789202/-02-30T25:61;61", "<sample:3>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:7>"}, {"org.jsoup.parser.XmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<empty>", "1.12345678"}}), new String[][]{{"getElementsByTag", "java.lang.String", "2"}, {"subList", "int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<empty>", "1.12345678"}}, 1), new String[][]{{"getElementsByTag", "java.lang.String", "2"}, {"subList", "int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<null>", "1.1_345678"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Doctype"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:0>", " ", "<null>", "<sample:1>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"hPtp://example.com/a?b=c", "n"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("hPtp://example.com/a?b=c {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "initialiseParse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:2>", "--1", "<null>", "<sample:7>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "2147483648", "1e10"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("2147483648 {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "2147483648", "1e10"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "a,b,c"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a,b,c></a,b,c> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "2147483648", "1e10"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "a,b,c"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a,b,c></a,b,c> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"1L", "<sample:0>"}, false, 2, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "0x1F", "2020-02-30T25:61:61", "<sample:4>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>b<//a> [1,2]", ".W\n"}, false, 12, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processEndTag", "java.lang.String", "1E-5"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "1.5f", "<sample:1>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:6>"}}, 2), new String[][]{{"getElementsContainingText", "java.lang.String", "5"}, {"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a><?abc", "10<a>b</a>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "a", "PT1H", "<sample:3>", "<sample:6>"}}), new String[][]{{"after", "org.jsoup.nodes.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{";[><?cbc<gp1-p21\"345577701", "iaaaaaaaaabaaIaaabaaaa`a`?aaa"}, false, 15, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "PT1H", "<sample:8>"}, {"org.jsoup.parser.XmlTreeBuilder", "currentElement", ""}}, 1), new String[][]{{"getAllElements", "", "5"}, {"html", "", "3"}, {"subList", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{";[><?cbcF<gp1-p21\"34657777/1", "iaaaaaaaaabaaIababaaaa`3H`?aa`"}, false, 16, new String[][]{}), new String[][]{{"getAllElements", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[;[&gt;<?cbcF<gp1-p21\"34657777?>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<null>", "1.5"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "runParser", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"-1.5", "!", "<null>", "<sample:5>"}, false, 4, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:3>", "i", "<sample:6>", "<null>"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "<a>b</a>", "/a/b"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n-1.5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\007\010C{?EE0n\"/kC=>lcq\u00e9[2fPXCCYDe:<??<ooEdA\037X\013V-VU422T !o1lm624FtBc^nDBnnpH28E6AE//.", "aaa`aaaaaaaaaaaaaaaa>aaaaaaa1a0x1F"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "\"<<a>b<Aa><ssrnud<a>b</a>", "P3d.\01425+11"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "1.123456780901234568T-0.0", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<null>", "abc"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "<a><?abc"}, {"org.jsoup.parser.XmlTreeBuilder", "runParser", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<sample:1>", " "}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:1>"}, {"org.jsoup.parser.XmlTreeBuilder", "process", "org.jsoup.parser.Token", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"PT1HH]", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:2>"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "0x1F", "P3d.\01425+11"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<sample:1>", "123456789012345678901"}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:4>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"1", "0x123C56789", "<null>", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "defaultSettings", ""}, {"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:1>", "--1", "<sample:6>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "+1", ".5", "<null>", "<null>"}, {"org.jsoup.parser.XmlTreeBuilder", "processEndTag", "java.lang.String", "1.1234567"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<pab</a>", "\007\010C{?}E0n\"/kC=>lcq\u00e9[2fPXCCYDe:<??<ooEdA\037X\013V-VU422T !o1l624FtBc^nDBnnpH28E6AE//.", "<null>", "<sample:5>"}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "{\"a\":1}", " ", "<sample:2>", "<sample:6>"}, {"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:0>", "1.5d", "<sample:1>", "<sample:7>"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<null>", "p/a/b", "<null>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "initialiseParse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<null>", ">", "<null>", "<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "PT1H", "1.12345678901234567"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "p", "+1"}, {"org.jsoup.parser.XmlTreeBuilder", "runParser", ""}}, 2), new String[][]{{"addClass", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("p {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "currentElement", ""}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "pI", "+1"}}, 2), new String[][]{{"addClass", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("pI {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:1>"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "{\"", "\t"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "i", "123456789012345678901234567890"}}), new String[][]{{"empty", "", "1"}, {"getElementsByClass", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"b"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"1.5d", "PT1H", "<null>", "<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n1.5d]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"iaaaaaaaaabaaIababaaaa`3H`>aa`"}, false, 11, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:3>"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<sample:0>", "U?nexpected token "}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<sample:1>", "1?34567890123456;8901234567890"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "t.5", "<sample:0>", "<null>"}, {"org.jsoup.parser.XmlTreeBuilder", "currentElement", ""}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<null>"}}, 3), new String[][]{{"charset", "", "4"}, {"newDecoder", "", "2"}});
  assertNotNull(actual);
  assertEquals("sun.nio.cs.UTF_8$Decoder", actual.getClass().getName());
  assertEquals("{isAutoDetecting=false, isCharsetDetected=!UnsupportedOperationException}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "initialiseParse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:3>", "[1,,2]", "<null>", "<null>"}, false, 6, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:9>"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "4"}, {"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<null>", "1.12\n35678901234567", "<sample:6>", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "initialiseParse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<null>", "[1,,2]", "<null>", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:0>"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "4"}, {"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<null>", "1.12\n35678901234567", "<sample:5>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", ";[><?cbcF<gp1-p21\"34657777/1", "+1"}, {"org.jsoup.parser.XmlTreeBuilder", "runParser", ""}}, 2), new String[][]{{"getAllElements", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[;[&gt;<?cbcF<gp1-p21\"34657777?>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", ";[><?cbcF<gp1-p21\"34657777/1", "+1"}, {"org.jsoup.parser.XmlTreeBuilder", "defaultSettings", ""}, {"org.jsoup.parser.XmlTreeBuilder", "runParser", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(";[&gt;<?cbcF<gp1-p21\"34657777?> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", ";[><?cbcF<gp1-p21\"34657777/1", "+1"}, {"org.jsoup.parser.XmlTreeBuilder", "runParser", ""}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "1E-5", "1e10"}}, 1), new String[][]{{"baseUri", "", "0"}, {"getElementsMatchingText", "java.lang.String", "4"}, {"tagName", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[1E-5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "-0.0", "12:30:45"}, {"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:3>", "0xFFFFFFFF", "<null>", "<sample:5>"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<sample:3>", "-0.0"}}, 3), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"", "abc1.1234567", "<null>", "<sample:6>"}, false, 0, null, 3), new String[][]{{"add", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "iaaaaaaaaabaaIababaaaa`3H`?aa`", ".W\n"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("iaaaaaaaaabaaIababaaaa`3H`?aa` {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:3>", "<", "<null>", "<sample:7>"}, false), new String[][]{{"getElementsByTag", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "defaultSettings", ""}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<empty>", "1.1234567"}, {"org.jsoup.parser.XmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:0>"}}, 3), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<![CDATA[a]]>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<empty>", "/a/b"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "defaultSettings", ""}}, 1), new String[][]{{"dataset", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:0>", "1.5d", "<null>", "<sample:3>"}, false, 0, null, 2), new String[][]{{"hasClass", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:0>", "1.5d", "<null>", "<sample:3>"}, false, 0, null, 2), new String[][]{{"hasClass", "java.lang.String", "3"}, {"charset", "java.nio.charset.Charset", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"!"}, false, 3, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<empty>", "1.12345678"}, {"org.jsoup.parser.XmlTreeBuilder", "currentElement", ""}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"", "<sample:10>"}, false, 15, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:1>"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<empty>", ";[><?cbcF<gp1-p21\"34657777/1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<empty>", "PT1H"}}, 3), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "7"}, {"trimToSize", "", "4"}, {"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<empty>", "PT1H"}}, 3), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "7"}, {"trimToSize", "", "4"}, {"iterator", "", "1"}, {"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<sample:1>", "6"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "[a", "a,b,c"}, {"org.jsoup.parser.XmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:7>"}}, 2), new String[][]{{"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"<null>", "<sample:6>"}, false, 2, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Doctype"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:1>"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "<a><?abc", "1.5"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:0>"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<sample:3>", "?"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:0>", ">", "<sample:2>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<sample:1>", "202/-02-30T25:61;61"}, false, 0, null, 2), new String[][]{{"attributes", "", "0"}, {"hasKey", "java.lang.String", "0"}, {"get", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{""}, false, 4, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "202/-02-30T25:61;61", "<sample:5>"}, {"org.jsoup.parser.XmlTreeBuilder", "runParser", ""}, {"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "123456789012345678901234567890", "1.1233567", "<sample:3>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "<p>b</a>1"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<sample:0>", "<p>b</a>1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:5>", "true>123456789012445678901234567890", "<null>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a,b 1,2 {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:5>", "true>123456789012445678901234567890", "<null>", "<sample:2>"}, false), new String[][]{{"hasAttr", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "http://example.com/a?b=c", "\007\010C{?EE0n\"/kC=>lcq\u00e9[2fPXCCYDe:<??<ooEdA\037X\013V-VU422T !o1lm624FtBc^nDBnnpH28E6AE//."}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:0>", "1L", "<sample:2>", "<sample:3>"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<sample:3>", "/a/b"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:0>", "1E-", "<sample:0>", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a b {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "initialiseParse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:3>", "<a>b<//a> [1,2]", "<null>", "<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<sample:3>", "1.12345678"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:2>", "\t", "<sample:7>", "<sample:0>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:4>"}}, 1), new String[][]{{"hasClass", "java.lang.String", "6"}, {"filter", "org.jsoup.select.NodeFilter", "5"}, {"classNames", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:3>", "true>123456789012445678901234567890", "<null>", "<null>"}, false), new String[][]{{"elementSiblingIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<sample:1>", "iaaaaaaaaabaaIababaaaa`3H`?a"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<empty>", "1.5f"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:7>"}}, 2), new String[][]{{"attr", "java.lang.String,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<!----> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"010", "<p>b<.a>1", "<null>", "<sample:2>"}, false, 2, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<null>", "\007\010C{?EE0n\"/kC=>lcq\u00e9[2fPXCCYDe:<??<ooEdA\037X\013V-VU422T !o1lm624FtBc^nDBnnpH28E6AE//.", "<sample:6>", "<sample:4>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n010]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"010", "<p>b<D.a>1", "<null>", "<sample:2>"}, false, 2, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<null>", "\007\010C{?EE0n\"/kC=>lcq\u00e9[2fPCCYDe:<??<ooEdA\037X\013V-VU422T !o1lm624FtBc^nDBnnpH28E6AE//.", "<sample:6>", "<sample:4>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:6>"}}, 1), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "initialiseParse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:3>", "1", "<null>", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:2>"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<sample:2>", "iaaaaaaaaabaaIababaaaa`3H`?aa`"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "currentElement", ""}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<sample:3>", "\n"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<empty>", "-0.0", "<sample:1>", "<sample:0>"}}, 2), new String[][]{{"getElementById", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "initialiseParse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<null>", "1.123456780901234568T-0.0", "<null>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "initialiseParse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<null>", "1.123456780901234568T-0.0", "<null>", "<sample:7>"}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:3>", ";[>;?cbcF<gp1-p21\"34657777/1", "<null>", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "1.5f", "<sample:4>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:1>"}, {"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "i", "?", "<sample:7>", "<null>"}}, 3), new String[][]{{"body", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<", "123456789012345678901234567890", "<null>", "<sample:4>"}, false, 6, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "currentElement", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"", "123456789012345678901234567890", "<null>", "<sample:4>"}, false, 6, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "currentElement", ""}, {"org.jsoup.parser.XmlTreeBuilder", "runParser", ""}}, 2), new String[][]{{"listIterator", "", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"\007\010C{?EE0n\"/kC=>lcq\u00e9[2f\"XCCYDe:<??<ooEdA\037X\013V-VU422T !o1lm624FtBc^nDBnnpH28E6AE//.", "<>b<//a> [1,2]", "<null>", "<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<sample:3>", "\t"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<sample:2>", "--1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:1>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<null>", "<null>"}, false, 2, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:4>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<empty>", ".W\n", "<null>", "<sample:2>"}, false, 0, null, 3), new String[][]{{"childNode", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:1>", "http://example.com/a?b=c", "<null>", "<sample:2>"}, false, 2, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:0>", "http://example.com/a?b=c", "<null>", "<sample:1>"}, false, 3, new String[][]{}, 3), new String[][]{{"getElementsByAttributeStarting", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:1>", "gtto://eample.com/a?b=c", "<null>", "<sample:4>"}, false, 13, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "1.1234567", "12:30:45"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<null>", "I"}}, 3), new String[][]{{"getElementsByAttributeStarting", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1.123456780901234568T-0.0", "2147483648", "<sample:0>", "<sample:1>"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<empty>", "1"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<empty>", "2020-01-01", "<null>", "<sample:7>"}}, 1), new String[][]{{"childNodes", "", "6"}, {"clear", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"1e10", "1.5f", "<null>", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<sample:2>", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n1e10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"true", "1.1234567890123456.7", "<null>", "<sample:1>"}, false, 3, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "0", "<p>b</a>1", "<sample:2>", "<sample:1>"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "1.1\t234567890123456"}}, 1), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:3>", "1.n234567", "<null>", "<sample:12>"}, false, 11, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processEndTag", "java.lang.String", "-1.0xGFFFFFDF"}, {"org.jsoup.parser.XmlTreeBuilder", "currentElement", ""}}, 3), new String[][]{{"childNodes", "", "3"}, {"size", "", "6"}, {"lastIndexOf", "java.lang.Object", "0"}, {"lastIndexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:2>", "1.6", "<null>", "<sample:3>"}, false, 5, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:5>"}, {"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:3>", "<a>b<</`>", "<sample:4>", "<null>"}}, 2), new String[][]{{"getElementsByClass", "java.lang.String", "1"}, {"hasAttr", "java.lang.String", "2"}, {"listIterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:2>", "11.6", "<null>", "<sample:3>"}, false, 5, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:1>"}, {"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:3>", "<a>b<</`>", "<sample:4>", "<null>"}}, 2), new String[][]{{"getElementsByClass", "java.lang.String", "1"}, {"hasAttr", "java.lang.String", "2"}, {"listIterator", "", "4"}, {"set", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"HL-", "abc2345D67890124456789012345679901.12-34", "<null>", "<sample:0>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\nHL-]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<empty>", "a", "<null>", "<sample:4>"}, false, 4, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "<a>b<//a>A ,a1,2]1.1234567890123456", ""}, {"org.jsoup.parser.XmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:5>"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "a,b,c", "--1"}}, 2), new String[][]{{"firstElementSibling", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "/V\n[1,2]true", "<null>", "<sample:7>"}, false, 12, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:4>"}, {"org.jsoup.parser.XmlTreeBuilder", "currentElement", ""}, {"org.jsoup.parser.XmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:4>"}}, 2), new String[][]{{"attr", "java.lang.String,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<a><b>t</b></a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{";[><?cbcF;gp1-p21\"34657777/1", "true", "<null>", "<sample:5>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n;[&gt;, <?cbcf;gp1-p21\"34657777?>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{".a/b", "true", "<null>", "<sample:5>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n.a/b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"\"<<a>b<Aa><ssrnud<a>b</a>2020-01-01", "f[/Ua..3:567890123456789012345679?0Unexpe1.12345678", "<null>", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:6>"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "<a>b<//a> [1,2]", "1.1234567"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"-", "enexpetedX\t token tzpe: ", "<null>", "<sample:4>"}, false, 8, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "<!>b;</.b? [1,+>]TITLEHelolo, WPrld", "abc?"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:2>", "\u00e9", "<sample:5>", "<sample:0>"}}, 3), new String[][]{{"listIterator", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"-", "efexpeted", "<null>", "<sample:6>"}, false, 8, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "<!>b<</.b_ [1,+>]TILEHelolo, WPrld1.251.25", "p"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n-]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"true>1232147483648", "0xFFFFFFFF", "<null>", "<sample:6>"}, false, 5, new String[][]{}, 3), new String[][]{{"indexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:1>", "Unexpected token type: ", "<null>", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:3>"}}, 3), new String[][]{{"className", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
}
