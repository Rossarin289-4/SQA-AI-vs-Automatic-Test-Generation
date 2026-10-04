package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x123456789", "1-5f"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("0x123456789 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "tr"}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "U\u00e9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "tokenType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Character", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "defaultSettings", ""}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "S/a/b", "1.5d"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilderState", "org.jsoup.parser.HtmlTreeBuilderState$1", "values", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.parser.HtmlTreeBuilderState;", actual.getClass().getName());
  assertEquals("[Initial, BeforeHtml, BeforeHead, InHead, InHeadNoscript, AfterHead, InBody, Text, InTable, InTableText, InCaption, InColumnGroup, InTableBody, InRow, InCell, InSelect, InSelectInTable, AfterBody, InF...#275#355538594", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{">ull"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isComment", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.Token", "isEOF", ""}, {"org.jsoup.parser.Token", "asDoctype", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "reset", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "http://exanmple.com/a?b=c"}, {"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "table", "-0/0", "<null>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"aaaaaaaaaaaaaaaaaa", "<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "0xFFFFFFF", "5U."}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<!coctype.5-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<!LOC", "col"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "runParser", ""}}), new String[][]{{"childNodeSize", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilderState", "org.jsoup.parser.HtmlTreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilder"}, new String[]{"<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilder", "<sample:1>", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilder", "<sample:6>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{""}, false, 2, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "\n"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<a>c</a>"}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<c!doctype.5pubSysKey"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<a>a</a6>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "parent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<!DOCTYPE"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<a c</a>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "before", "org.jsoup.nodes.Node", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"ra>b</a>"}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "java.lang.String", "1<!DOCTYPE"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<ab<//ap>"}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "parent", ""}, {"org.jsoup.nodes.DocumentType", "unwrap", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"ra>b<//a>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String", "null"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"ra>b</p/a>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<ab</"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{"systemId"}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String", "."}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!doctype sample>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!doctype sample>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<a>c</>1.5e300name"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<a "}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<a c="}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String", "<ab</a>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<!doctype-5.52020-02-30T25:61:61", "1<!DOCTYPEa"}, false, 3, new String[][]{}), new String[][]{{"addClass", "java.lang.String", "5"}, {"appendChild", "org.jsoup.nodes.Node", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<!DOCTYPE 5.52020-02-30T25:61:61>a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<2ab</"}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "childNode", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<a\r>c</a>1.5e300"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "reparentChild", "org.jsoup.nodes.Node", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<a c\n=/a>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>cX</a>1.5e300", "\""}, false, 6, new String[][]{}, 2), new String[][]{{"attr", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<a c=/`>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "nextSibling", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<a=c</>1.5>e300name"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<!doctype.5pubSysKey "}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "removeAttr", "java.lang.String", "0x124456789"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"1<!DOCTYPE1 L"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<a c=<!eoctype"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"1<!DOCTYPEatru>e"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<a c=/Ea> "}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<!DOCTYPE "}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<a  \""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"coltfoot"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "<a c=>/`>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<a c\n</a>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<a c\n"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<a c\n>a>"}, false, 4, new String[][]{{"org.jsoup.nodes.DocumentType", "parentNode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<a c\nSYSTEM"}, false, 5, new String[][]{{"org.jsoup.nodes.DocumentType", "replaceWith", "org.jsoup.nodes.Node", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<a c\n/a>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<a c=< eoctype"}, false, 5, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<a>cX<a>1.5e3/0"}, false, 5, new String[][]{{"org.jsoup.nodes.DocumentType", "before", "org.jsoup.nodes.Node", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<!doctype.5pubSysKey  \""}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<!doctype.5pubSysKey SYSTEM"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>c<X/>1.5e300name", "f8"}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:4>"}}), new String[][]{{"getElementsByIndexGreaterThan", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<a>c\n <X />1.5e300name</a>, <a>c\n <X />1.5e300name</a>, <X />]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<!doctype.5pubSysKey SYSTEM<!DOCTYPEHello, World"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<doctype.5 pubSysKey  \""}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"<!doctype.5pubSysKey SYSTEM<!DOCTYPE "}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<i:-1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "<b <=x/a>1.12345678901234567"}}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}, {"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nextSibling", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodeSize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "baseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "absUrl", "java.lang.String", "\u00e9"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", "java.lang.Appendable", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String"}, new String[]{"Ui"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "parentNode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asCharacter", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtmlTail", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "65532", "<sample:7>"}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "remove", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parentNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "unwrap", ""}, {"org.jsoup.nodes.DocumentType", "outerHtmlTail", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "2130706431", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"e:itle"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parentNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodeSize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodeSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "ownerDocument", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "nextSibling", ""}, {"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<s:kx>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "previousSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "html", "java.lang.Appendable", "<sample:6>"}, {"org.jsoup.nodes.DocumentType", "remove", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.DocumentType", "setSiblingIndex", "int", "65478"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asStartTag", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.Token", "isEndTag", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "unwrap", ""}, {"org.jsoup.nodes.DocumentType", "baseUri", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "tr \""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "baseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "ensureChildNodes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "previousSibling", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}, 1), new String[][]{{"setBaseUri", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asEndTag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "isEOF", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "after", new String[]{"java.lang.String"}, new String[]{"`tr"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:1>", "<sample:4>"}, {"org.jsoup.nodes.DocumentType", "remove", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "tokenType", ""}, {"org.jsoup.parser.Token", "asComment", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"org.jsoup.nodes.DocumentType", "traverse", "org.jsoup.select.NodeVisitor", "<sample:6>"}, {"org.jsoup.nodes.DocumentType", "childNode", "int", "65540"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodeSize", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hasAttr", new String[]{"java.lang.String"}, new String[]{"t_eadpublicId"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "nextSibling", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "parent", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "absUrl", new String[]{"java.lang.String"}, new String[]{"a babc"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "parentNode", ""}, {"org.jsoup.nodes.DocumentType", "doClone", "org.jsoup.nodes.Node", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtmlHead", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "0", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nextSibling", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtmlTail", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "61440", "<sample:3>"}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesCopy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setSiblingIndex", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "traverse", "org.jsoup.select.NodeVisitor", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{"uhad"}, false, 4, new String[][]{{"org.jsoup.nodes.DocumentType", "baseUri", ""}, {"org.jsoup.nodes.DocumentType", "html", "java.lang.Appendable", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilderState", "org.jsoup.parser.HtmlTreeBuilderState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{"OTH"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\ttd", "0x1F"}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", ""}}, 1), new String[][]{{"attr", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "traverse", "org.jsoup.select.NodeVisitor", "<sample:3>"}, {"org.jsoup.nodes.DocumentType", "traverse", "org.jsoup.select.NodeVisitor", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{\"a\":1", "Hello, World"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "unwrap", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "tfoot", "1.5td", "<sample:3>", "<sample:3>"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "U01/", "aaaaaaaaaaaaaaaaaaaaa`aaaaaaaaa"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "java.lang.String", "1.5e300"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "absUrl", new String[]{"java.lang.String"}, new String[]{"+0"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "unwrap", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodes", ""}, {"org.jsoup.nodes.DocumentType", "setSiblingIndex", "int", "2147483627"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{" Tit9e"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilderState", "org.jsoup.parser.HtmlTreeBuilderState$1", "values", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.parser.HtmlTreeBuilderState;", actual.getClass().getName());
  assertEquals("[Initial, BeforeHtml, BeforeHead, InHead, InHeadNoscript, AfterHead, InBody, Text, InTable, InTableText, InCaption, InColumnGroup, InTableBody, InRow, InCell, InSelect, InSelectInTable, AfterBody, InF...#275#355538594", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "unwrap", ""}, {"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNode", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "int,org.jsoup.nodes.Node[]", "2147483647", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "a b", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaa`aaaaaaaaa"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "parent", ""}, {"org.jsoup.nodes.DocumentType", "unwrap", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodes", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "indent", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "45", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "parentNode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesCopy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "previousSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asEndTag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "asStartTag", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asDoctype", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ensureChildNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "\037"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "unwrap", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingNodes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "traverse", "org.jsoup.select.NodeVisitor", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "2147483647", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "read", new String[]{"org.jsoup.parser.Tokeniser", "org.jsoup.parser.CharacterReader"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.TokeniserState", "read", "org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader", "<sample:0>", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parentNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "1L"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlTail", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "262140", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String"}, new String[]{"SCa/b"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "baseUri", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "setBaseUri", "java.lang.String", "tableA"}, {"org.jsoup.nodes.DocumentType", "removeChild", "org.jsoup.nodes.Node", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("tableA", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.jsoup.nodes.DocumentType", "nextSibling", ""}, {"org.jsoup.nodes.DocumentType", "childNodesAsArray", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingNodes", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "childNode", "int", "65536"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "remove", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"2020-01E-0"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "", "Uttp://example.com/a?b=c", "<sample:1>", "<sample:9>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "absUrl", "java.lang.String", "systemId"}, {"org.jsoup.nodes.DocumentType", "absUrl", "java.lang.String", "<!doctype.5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"65533", "<sample:1>"}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "reparentChild", "org.jsoup.nodes.Node", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesAsArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE sample \"a\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "remove", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Doctype"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodeSize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "reset", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"cbption", "tcolgroup"}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "nextSibling", ""}, {"org.jsoup.nodes.DocumentType", "doClone", "org.jsoup.nodes.Node", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{"body"}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "int,org.jsoup.nodes.Node[]", "32767", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "previousSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "hasSameValue", "java.lang.Object", "<s:keyr>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isEndTag", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parentNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "reparentChild", "org.jsoup.nodes.Node", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isComment", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1048555>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "int,org.jsoup.nodes.Node[]", "-131068", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:1>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "java.lang.String", "10"}, {"org.jsoup.nodes.DocumentType", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "doClone", "org.jsoup.nodes.Node", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", "java.lang.Appendable", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesAsArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "reparentChild", "org.jsoup.nodes.Node", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hasAttr", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String,java.lang.String", "tdx", "/"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesCopy", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "getOutputSettings", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "12:30:45"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "absUrl", new String[]{"java.lang.String"}, new String[]{"a1.12345678901234567"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "hasSameValue", "java.lang.Object", "<i:1>"}, {"org.jsoup.nodes.DocumentType", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "-2147483648", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:0>", "<sample:0>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE a \"0\" \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" name=\"a\" publicId=\"0\" pubSysKey=\"PUBLIC\" systemId=\"sample\" {size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "{a\":1}", "/a/b", "<sample:2>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{"Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "before", "java.lang.String", "65433"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "reset", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.Token", "asStartTag", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "unwrap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "1.5fname"}, {"org.jsoup.nodes.DocumentType", "siblingNodes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parentNode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "10", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNode", new String[]{"int"}, new String[]{"131162"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "attributes", ""}, {"org.jsoup.nodes.DocumentType", "childNodesCopy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"1073741823", "<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String", "1.5en300"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "indent", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "65535", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "absUrl", "java.lang.String", "tablecolgrotp"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String", " aption"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "hasAttr", "java.lang.String", "theada"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{"/pubS"}, false), new String[][]{{"parent", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isDoctype", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "tokenType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{"1.1234567B890"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE 0 sample \"a\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{"captio"}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "a c"}, {"org.jsoup.nodes.DocumentType", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:7>", "<sample:0>"}}), new String[][]{{"outerHtml", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE 0 sample \"a\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "nextSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "tableUa", ";!doctype.5", "<sample:4>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "remove", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\u00e9", "1-5f"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false), new String[][]{{"addAll", "int,java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nextSibling", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "hasAttr", "java.lang.String", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"-16553"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "currentElement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asEndTag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "isCharacter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{"1.251.12345678901234567"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "nextSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtmlHead", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "36", "<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1.5", "sFstemId"}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:6>"}}), new String[][]{{"createElement", "java.lang.String", "1"}, {"hasClass", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "absUrl", new String[]{"java.lang.String"}, new String[]{"12:30:45thead"}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "baseUri", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "after", new String[]{"java.lang.String"}, new String[]{"2020-01-01#doctypd"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodeSize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodeSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asDoctype", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "reset", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilderState", "org.jsoup.parser.HtmlTreeBuilderState$1", "values", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.parser.HtmlTreeBuilderState;", actual.getClass().getName());
  assertEquals("[Initial, BeforeHtml, BeforeHead, InHead, InHeadNoscript, AfterHead, InBody, Text, InTable, InTableText, InCaption, InColumnGroup, InTableBody, InRow, InCell, InSelect, InSelectInTable, AfterBody, InF...#275#355538594", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilderState", "org.jsoup.parser.HtmlTreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilder"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilder", "<sample:9>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"trte", "1E-5"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("trte {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "before", "org.jsoup.nodes.Node", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setSiblingIndex", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String,java.lang.String", "PUBLICthead", "0xFFFFFF5FF"}, {"org.jsoup.nodes.DocumentType", "attr", "java.lang.String,java.lang.String", "http://epxample.com/a9b=c", "U\t"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "values", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.parser.TokeniserState;", actual.getClass().getName());
  assertEquals("[Data, CharacterReferenceInData, Rcdata, CharacterReferenceInRcdata, Rawtext, ScriptData, PLAINTEXT, TagOpen, EndTagOpen, TagName, RcdataLessthanSign, RCDATAEndTagOpen, RCDATAEndTagName, RawtextLessth...#1490#-1802059412", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesCopy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesCopy", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "previousSibling", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "setSiblingIndex", "int", "131064"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<s:kfy>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isCharacter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "isEndTag", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isEOF", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "asCharacter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingIndex", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.DocumentType", "parentNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "before", "org.jsoup.nodes.Node", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"t"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "unwrap", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesCopy", ""}}), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "unwrap", ""}}), new String[][]{{"insert", "int,double", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("1.0<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nodeName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "before", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "nodeName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nextSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "getOutputSettings", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asComment", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokeniserState", "org.jsoup.parser.TokeniserState$1", "read", new String[]{"org.jsoup.parser.Tokeniser", "org.jsoup.parser.CharacterReader"}, new String[]{"<sample:4>", "<sample:6>"}, false, 6, new String[][]{{"org.jsoup.parser.TokeniserState", "read", "org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader", "<sample:4>", "<sample:7>"}, {"org.jsoup.parser.TokeniserState", "read", "org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader", "<sample:5>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesCopy", new String[]{}, new String[]{}, false), new String[][]{{"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asStartTag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "isStartTag", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilderState", "org.jsoup.parser.HtmlTreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilder"}, new String[]{"<sample:0>", "<sample:2>"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilder", "<sample:0>", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilder", "<sample:3>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "parentNode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "int,org.jsoup.nodes.Node[]", "1", "<sample:2>"}, {"org.jsoup.nodes.DocumentType", "childNodes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesCopy", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "indent", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "-2", "<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "unwrap", ""}, {"org.jsoup.nodes.DocumentType", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "2147483647", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "abmdy"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<sample:1>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "baseUri", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.DocumentType", "childNode", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", ""}, {"org.jsoup.nodes.DocumentType", "after", "java.lang.String", "1"}}), new String[][]{{"previousSibling", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "doClone", "org.jsoup.nodes.Node", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilderState", "org.jsoup.parser.HtmlTreeBuilderState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{"0x1234567891.5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asCharacter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$Character", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String"}, new String[]{"Mfoot"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtmlHead", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "2147483647", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setSiblingIndex", new String[]{"int"}, new String[]{"-1073741824"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtmlTail", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "-2147483648", "<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hasAttr", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 5, new String[][]{{"org.jsoup.nodes.DocumentType", "before", "java.lang.String", "tfoott"}, {"org.jsoup.nodes.DocumentType", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:3>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "baseUri", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "equals", "java.lang.Object", "<i:0>"}, {"org.jsoup.nodes.DocumentType", "setSiblingIndex", "int", "-37"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ownerDocument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "isStartTag", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeAttr", new String[]{"java.lang.String"}, new String[]{"1.12345678:01234567Title"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "setBaseUri", "java.lang.String", "thead0x123456789"}, {"org.jsoup.nodes.DocumentType", "attributes", ""}}), new String[][]{{"childNodesCopy", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<empty>"}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "<!doctype.5pubSysKey"}, {"org.jsoup.nodes.DocumentType", "siblingNodes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "absUrl", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "java.lang.String", "1o.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "setSiblingIndex", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesCopy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "removeChild", "org.jsoup.nodes.Node", "<sample:0>"}, {"org.jsoup.nodes.DocumentType", "ownerDocument", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "wrap", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "defaultSettings", ""}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "{\"a\":1}", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "siblingNodes", ""}}), new String[][]{{"indexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1224567colgroup", "table"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String,java.lang.String", ">ull", "<!doctype.5"}, {"org.jsoup.nodes.DocumentType", "childNode", "int", "-2147483648"}}), new String[][]{{"nextSibling", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processEndTag", "java.lang.String", "/a/b"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodesCopy", ""}}), new String[][]{{"childNodesCopy", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "previousSibling", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "siblingIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", "tll"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "java.lang.String", "pubSysKey"}, {"org.jsoup.nodes.DocumentType", "before", "java.lang.String", "0xFFFFFFFF"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "defaultSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processEndTag", "java.lang.String", "tbody"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"x123456789", "e5"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:0>"}, {"org.jsoup.nodes.DocumentType", "hasAttr", "java.lang.String", "11I.12345678"}}), new String[][]{{"after", "org.jsoup.nodes.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<s:c>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtml", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setSiblingIndex", new String[]{"int"}, new String[]{"10"}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "parentNode", ""}, {"org.jsoup.nodes.DocumentType", "attributes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "org.jsoup.nodes.Node", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0290", "-p1"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "defaultSettings", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("0290 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String"}, new String[]{"aaaaaabaaaaaaaaaaanull"}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "parentNode", ""}, {"org.jsoup.nodes.DocumentType", "nodeName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ensureChildNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "ownerDocument", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodeSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "before", "org.jsoup.nodes.Node", "<sample:1>"}, {"org.jsoup.nodes.DocumentType", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "65534", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "ensureChildNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "before", "org.jsoup.nodes.Node", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "nodeName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "baseUri", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#doctype", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false, 6, new String[][]{{"org.jsoup.nodes.DocumentType", "ownerDocument", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "hasAttr", new String[]{"java.lang.String"}, new String[]{"2020-02-30T215:61:61"}, false, 7, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "int,org.jsoup.nodes.Node[]", "66508", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "siblingNodes", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "attr", "java.lang.String,java.lang.String", ".5TITLE", "2020-02-30T25:61:61publicId"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\"><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "childNodeSize", ""}}), new String[][]{{"hasKeyIgnoreCase", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "attributes", ""}}), new String[][]{{"childNodeSize", "", "3"}, {"replaceWith", "org.jsoup.nodes.Node", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "after", new String[]{"java.lang.String"}, new String[]{"0x123356789"}, false, 2, new String[][]{{"org.jsoup.nodes.DocumentType", "addChildren", "int,org.jsoup.nodes.Node[]", "2147483647", "<empty>"}, {"org.jsoup.nodes.DocumentType", "wrap", "java.lang.String", " \""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "previousSibling", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesAsArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.DocumentType", "attributes", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "absUrl", "java.lang.String", "\n"}}), new String[][]{{"listIterator", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "-2", "<sample:7>"}}), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TjtlKe", "aaaaaaaaaaaaaa"}, false, 7, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "defaultSettings", ""}}), new String[][]{{"appendText", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("TjtlKesample {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "outerHtmlHead", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "131072", "<sample:3>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!DOCTYPE a \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PUBLICname", ">ulk"}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "after", "org.jsoup.nodes.Node", "<null>"}, {"org.jsoup.nodes.DocumentType", "setParentNode", "org.jsoup.nodes.Node", "<sample:6>"}}), new String[][]{{"traverse", "org.jsoup.select.NodeVisitor", "6"}, {"traverse", "org.jsoup.select.NodeVisitor", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilderState", "org.jsoup.parser.HtmlTreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilder"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilder", "<sample:4>", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilder", "<sample:6>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "-0//", "65533", "<null>", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "childNodesCopy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.DocumentType", "parentNode", ""}}, 3), new String[][]{{"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$Character", "asComment", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.Token", "isEndTag", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.DocumentType", "org.jsoup.nodes.DocumentType", "baseUri", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.DocumentType", "nodeName", ""}, {"org.jsoup.nodes.DocumentType", "nextSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!DOCTYPE 0 sample \"a\">", SearchInputFactory_scaffolding.receiverState());
 }
}
