package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"aUnexpected token type: "}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "name", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "89", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "siblingNodes", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:0>", "-32"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:2>", "65279"}, true);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=3 cap=3] {get=97, getChar=\u0a62, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnderflowException, getLong=!BufferUnderflowExcept...#309#1019495361", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "crossStreams", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:3>", "<sample:1>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.6", "/"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1.6 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"32"}, false, 3, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "0xFFFFFFFFF", "u"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "UTF-32", ""}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"charset="}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:6>", "10"}, true), new String[][]{{"remaining", "", "3"}, {"isReadOnly", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", ".5", "TITLd"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"TITLE", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "aaPT1H", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "UTF-32", "UTF-161.1234567"}, true, 0, null, 1), new String[][]{{"charset", "java.nio.charset.Charset", "7"}, {"child", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "<a>b</a>", "k"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"/a/"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "<a>b</#a=", "1.123k567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Doctype"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "4TDF-16", "1.L5", "<null>"}, {"org.jsoup.parser.XmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:5>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"charset=-0.0"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"charset=0x1F"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "<null>", "//", "<sample:2>"}, true, 0, null, 2), new String[][]{{"getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "2"}, {"subList", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodesAsArray", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "remove", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "getOutputSettings", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "parentNode", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "absUrl", "java.lang.String", "1.250x123456789]"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!>a {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "unwrap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "setParentNode", "org.jsoup.nodes.Node", "<sample:4>"}, {"org.jsoup.nodes.XmlDeclaration", "nextSibling", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "indent", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:4>", "-32", "<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "remove", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "absUrl", new String[]{"java.lang.String"}, new String[]{"_.-5"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"mark", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "parent", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:4>", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "0", "1.5dcha", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "outerHtmlHead", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "63", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "before", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.XmlDeclaration", "childNodesCopy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"UTFh-8", "1xFFFFFFFF"}, false, 3, new String[][]{}, 3), new String[][]{{"removeAttr", "java.lang.String", "7"}, {"siblingIndex", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<? utfh-8=\"1xFFFFFFFF\"?> {getWholeDeclaration=utfh-8=\"1xFFFFFFFF\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "outerHtml", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!sample!>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "-0.00", "X"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "baseUri", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "ensureChildNodes", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "previousSibling", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "2020-02-30T25:61:610", "12:30:u5"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!>\n <#root></#root><!doctype a> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:1>", "-10"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNode", new String[]{"int"}, new String[]{"-32"}, false, 3, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "nextSibling", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "absUrl", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61/"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "crossStreams", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:5>", "<empty>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:1>"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "http-equiv1E-5"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"content", "i"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "name", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<!a content=\"i\"!> {getWholeDeclaration=content=\"i\"}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a content=\"i\"!> {getWholeDeclaration=content=\"i\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "nullabc", "1/5e300"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "before", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "parentNode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "TIULE", "0.5f"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "ownerDocument", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "55279", "1.2E5"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "baseUri", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("<!a!>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "parentNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "getOutputSettings", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "indent", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "1", "<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "currentElement", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "unwrap", ""}}, 3), new String[][]{{"removeAll", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "absUrl", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "absUrl", new String[]{"java.lang.String"}, new String[]{"charse"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, true, 0, null, 3), new String[][]{{"limit", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "nextSibling", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String"}, new String[]{"1ep0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "unwrap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "previousSibling", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNode", new String[]{"int"}, new String[]{"83"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "html", new String[]{"java.lang.Appendable"}, new String[]{"<null>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodeSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "outerHtmlTail", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "130560", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"66", "<empty>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<empty>"}, false, 7, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "equals", "java.lang.Object", "<s:a>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "before", "java.lang.String", "0x1F"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "parent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "removeAttr", "java.lang.String", "1.1L2345678content"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "1.5d", "<", "<sample:6>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "-0.0", "1.123d568"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String"}, new String[]{"UTF-8charset="}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "outerHtml", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "childNode", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!a!>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Uoexpected token sype: ", "PS1HH"}, false, 2, new String[][]{}, 1), new String[][]{{"getAllElements", "", "7"}, {"append", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[Uoexpected token sype: a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "encoding", "UTFb8", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:6>"}, false, 0, null, 1), new String[][]{{"hasSameValue", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "runParser", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "baseUri", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "absUrl", new String[]{"java.lang.String"}, new String[]{"gs"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "previousSibling", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "-51", "\\!']"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!>\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\"> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "indent", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "65535", "<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "absUrl", new String[]{"java.lang.String"}, new String[]{""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "hasAttr", new String[]{"java.lang.String"}, new String[]{""}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "nextSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<null>", "2147483647", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "before", new String[]{"java.lang.String"}, new String[]{"110"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "previousSibling", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "outerHtml", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "after", "org.jsoup.nodes.Node", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "outerHtmlTail", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "65536", "<sample:4>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "crossStreams", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:0>", "<sample:3>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "wrap", new String[]{"java.lang.String"}, new String[]{"qrue"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "after", new String[]{"java.lang.String"}, new String[]{"0E-5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodesCopy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "hasSameValue", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "outerHtmlHead", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "-2147483648", "<sample:6>"}, false, 6, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "outerHtml", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 7, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:6>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "getOutputSettings", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"131072.5"}, false, 5, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "attr", "java.lang.String,java.lang.String", "\u00e91.12345668901234567", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<?0 \u00e91.12345668901234567=\"\"?> {getWholeDeclaration=\u00e91.12345668901234567=\"\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodesCopy", new String[]{}, new String[]{}, false), new String[][]{{"listIterator", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "[\"']", "1u1234567"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:0>", ".6", "abc", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "setSiblingIndex", new String[]{"int"}, new String[]{"16319"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "getOutputSettings", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "outerHtmlTail", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "-28", "<sample:6>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "2,", "http://example.com/a?b=c"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"131119", "<sample:1>"}, false, 2, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "outerHtmlTail", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "-1", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "html", new String[]{"java.lang.Appendable"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "before", "java.lang.String", "0xFa"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<<", "UTF-0x1F"}, false, 7, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "childNodesAsArray", ""}, {"org.jsoup.nodes.XmlDeclaration", "wrap", "java.lang.String", "1.1234567890123456"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<? <<=\"UTF-0x1F\"?> {getWholeDeclaration=<<=\"UTF-0x1F\"}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<? <<=\"UTF-0x1F\"?> {getWholeDeclaration=<<=\"UTF-0x1F\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<??>a {getWholeDeclaration=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<??>a {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "attr", "java.lang.String,java.lang.String", "65279", "aaaaaaaaaaaaaaaaaa aaaaaaaaaa"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<!a 65279=\"aaaaaaaaaaaaaaaaaa aaaaaaaaaa\"!> {getWholeDeclaration=65279=\"aaaaaaaaaaaaaaaaaa aaaaaaaaaa\"}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a 65279=\"aaaaaaaaaaaaaaaaaa aaaaaaaaaa\"!> {getWholeDeclaration=65279=\"aaaaaaaaaaaaaaaaaa aaaaaaaaaa\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodesAsArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "childNode", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String"}, new String[]{"x1G"}, false, 3, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "outerHtml", "java.lang.Appendable", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true), new String[][]{{"asReadOnlyBuffer", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBufferR", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBufferR[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUn...#357#2125525453", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("<?0?>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"545", "<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "childNode", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:0>", "1.1235567890123456", " ", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "removeAttr", new String[]{"java.lang.String"}, new String[]{"1020-02-30T25:61:61"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Doctype"}, new String[]{"<sample:4>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodesAsArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "childNodesAsArray", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "after", "java.lang.String", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "nextSibling", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<null>", "130688"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<empty>", "-155", "bbontent", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "1ml", "U;F-16"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "ownerDocument", ""}}), new String[][]{{"attributes", "", "0"}, {"html", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "addChildren", "int,org.jsoup.nodes.Node[]", "2147483647", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"6579", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=3 cap=3] {get=97, getChar=\u0a62, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnderflowException, getLong=!BufferUnderflowExcept...#309#1019495361", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://example.com/a?b=c", "32"}, false, 1, new String[][]{}), new String[][]{{"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "parent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "2147483647", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "UTF-32", "1.5e40t0"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  \ufffd\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodeSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "html", "java.lang.Appendable", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "ensureChildNodes", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodeSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "wrap", "java.lang.String", "1.1234577890123456"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:4>", "1uT234567UTF-32", "<a>bC</a>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "replaceWith", "org.jsoup.nodes.Node", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678901234561", "xmm"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1.12345678901234561 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "outerHtmlHead", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "33", "<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "outerHtml", "java.lang.Appendable", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:7>"}, true), new String[][]{{"asDoubleBuffer", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsDoubleBufferB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsDoubleBufferB[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "name", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "ownerDocument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "before", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.XmlDeclaration", "getOutputSettings", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attributes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true), new String[][]{{"getShort", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:1>"}, false), new String[][]{{"insert", "int,long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("<!a4!>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "crossStreams", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<null>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "nodeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:8>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#declaration", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "5", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<null>", "<sample:8>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "attributes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "getWholeDeclaration", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "unwrap", ""}, {"org.jsoup.nodes.XmlDeclaration", "outerHtml", "java.lang.Appendable", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1.5dcharset="}, false, 6, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:2>"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "1.6<"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "outerHtml", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!a!>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:3>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<??>\n <!--a--> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNode", new String[]{"int"}, new String[]{"16"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "-66", "<sample:4>"}, {"org.jsoup.nodes.XmlDeclaration", "doClone", "org.jsoup.nodes.Node", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "currentElement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "0xFFFFFFFF", "u"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "parent", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "", "J"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "nextSibling", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "childNodesAsArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "getWholeDeclaration", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "addChildren", "org.jsoup.nodes.Node[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "Z\"']>", "2157483648'"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "remove", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 7, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "runParser", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "outerHtmlTail", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "32", "<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "name", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "absUrl", "java.lang.String", "1.52147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" ", "1"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:3>"}}), new String[][]{{"getElementsByAttributeStarting", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\n", "0"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "wrap", "java.lang.String", "131072"}}), new String[][]{{"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<!a =\"0\"!> {getWholeDeclaration==\"0\"}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a =\"0\"!> {getWholeDeclaration==\"0\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "outerHtmlHead", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "131072", "<sample:6>"}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "previousSibling", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "getWholeDeclaration", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String"}, new String[]{" "}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "indent", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "-2147483648", "<sample:3>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"conteentUTF-8", "1.5e40t0"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "after", "java.lang.String", "TF-32a,b,c"}}), new String[][]{{"childNodeSize", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a conteentutf-8=\"1.5e40t0\"!> {getWholeDeclaration=conteentutf-8=\"1.5e40t0\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "runParser", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:10>"}, false, 3, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "01x0", "conteBnt", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a b", "131072"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:3>"}}), new String[][]{{"getAllElements", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[a b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "siblingNodes", ""}}), new String[][]{{"removeAll", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "ensureChildNodes", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:3>"}, true), new String[][]{{"array", "", "5"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "absUrl", new String[]{"java.lang.String"}, new String[]{"encoding true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true), new String[][]{{"isDirect", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "0x123456789", "2.26"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "r,", "1.2131072"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "getOutputSettings", new String[]{}, new String[]{}, false), new String[][]{{"outline", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "12:30:u5", "1.1234567", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "getOutputSettings", new String[]{}, new String[]{}, false), new String[][]{{"charset", "", "7"}, {"displayName", "java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "--1", ">xoml", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true), new String[][]{{"getShort", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "getWholeDeclaration", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "indent", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "0", "<sample:5>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodeSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "unwrap", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "parentNode", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:6>"}, false), new String[][]{{"insert", "int,double", "7"}, {"append", "java.lang.StringBuffer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("<!a!1.0>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false), new String[][]{{"after", "org.jsoup.nodes.Node", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "getOutputSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "65280", "<sample:6>"}}), new String[][]{{"charset", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attributes", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodesCopy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "childNodesCopy", ""}}), new String[][]{{"clear", "", "7"}, {"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".5", ""}, false, 5, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "nodeName", ""}}), new String[][]{{"nextSibling", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<?0 .5=\"\"?> {getWholeDeclaration=.5=\"\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:0>"}, false), new String[][]{{"delete", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "baseUri", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"1", "<empty>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "attr", "java.lang.String", ""}, {"org.jsoup.nodes.XmlDeclaration", "replaceWith", "org.jsoup.nodes.Node", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String"}, new String[]{"1.5e30012:30:45"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<empty>", "1073741823"}, true), new String[][]{{"mismatch", "java.nio.ByteBuffer", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0ml", ""}, false, 3, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "attr", "java.lang.String", "0a/b"}}), new String[][]{{"childNode", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodesCopy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "absUrl", "java.lang.String", "aUnexpected token type: 1.1234567"}}), new String[][]{{"remove", "java.lang.Object", "7"}, {"removeAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:2>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("<??>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"65279", "<empty>"}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "unwrap", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "after", "org.jsoup.nodes.Node", "<sample:7>"}}), new String[][]{{"childNodesCopy", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"131/72"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "1u1234567", "", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!>a {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "html", "java.lang.Appendable", "<sample:4>"}}), new String[][]{{"appendCodePoint", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("<??>\003", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"a1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-16", "<empty>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "attr", "java.lang.String,java.lang.String", "/5", "1.12245678"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a /5=\"1.12245678\"!> {getWholeDeclaration=/5=\"1.12245678\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<?0?>\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\"> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:4>", "131073"}, true), new String[][]{{"putDouble", "int,double", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "removeAttr", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false), new String[][]{{"attr", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "attr", "java.lang.String,java.lang.String", "-1.52020-02-30T25:61:61", "1311072"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a -1.52020-02-30t25:61:61=\"1311072\"!> {getWholeDeclaration=-1.52020-02-30t25:61:61=\"1311072\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<empty>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ch`nset", "TITLE"}, false, 3, new String[][]{}), new String[][]{{"appendElement", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String"}, new String[]{"\013"}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "before", "org.jsoup.nodes.Node", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1ml123456789012345678901234567890", "charset="}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<!a 1ml123456789012345678901234567890=\"charset=\"!> {getWholeDeclaration=1ml123456789012345678901234567890=\"charset=\"}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a 1ml123456789012345678901234567890=\"charset=\"!> {getWholeDeclaration=1ml123456789012345678901234567890=\"charset=\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"sr0", "ib"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<?0 sr0=\"ib\"?> {getWholeDeclaration=sr0=\"ib\"}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<?0 sr0=\"ib\"?> {getWholeDeclaration=sr0=\"ib\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "parent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:2>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "", "\n2020-02-30T25:61:61"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "absUrl", new String[]{"java.lang.String"}, new String[]{"[p,2]"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"[\"'^", "1.5f"}, false), new String[][]{{"nodeName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#declaration", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a [\"'^=\"1.5f\"!> {getWholeDeclaration=[\"'^=\"1.5f\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "outerHtmlHead", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "65535", "<sample:3>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, true), new String[][]{{"alignedSlice", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<null>", "<sample:1>"}}), new String[][]{{"append", "java.lang.CharSequence", "6"}, {"append", "char", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("<?0?>0 ", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"6?79t", "rTitle", "<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Doctype"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "/", "-2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:3>", "262146", "<sample:4>"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}, {"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"g0x12345678q9", "32"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("g0x12345678q9 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "ensureChildNodes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "removeAttr", new String[]{"java.lang.String"}, new String[]{"2["}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "name", ""}}), new String[][]{{"hasAttr", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1.5f", "1.6"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1.5f {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "indent", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "4325376", "<sample:1>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "siblingIndex", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "attributes", ""}}, 3), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "clone", new String[]{}, new String[]{}, false), new String[][]{{"hasSameValue", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "baseUri", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "parentNode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "removeAttr", "java.lang.String", "1.5f"}}), new String[][]{{"parentNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.DocumentType", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\">", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "outerHtmlHead", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "65535", "<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "childNodes", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"2147483631", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "outerHtml", "java.lang.Appendable", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:9>", "UTF-8", "abc", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("line1 line3 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "name", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "childNodeSize", ""}, {"org.jsoup.nodes.XmlDeclaration", "ownerDocument", ""}}, 1), new String[][]{{"insert", "int,char[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:8>"}, true), new String[][]{{"alignmentOffset", "int,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>b</a>5.", "orueUTF-16"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<!a <a>b</a>5.=\"orueUTF-16\"!> {getWholeDeclaration=<a>b</a>5.=\"orueUTF-16\"}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a <a>b</a>5.=\"orueUTF-16\"!> {getWholeDeclaration=<a>b</a>5.=\"orueUTF-16\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-", "xml"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<!a -=\"xml\"!> {getWholeDeclaration=-=\"xml\"}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a -=\"xml\"!> {getWholeDeclaration=-=\"xml\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "hasAttr", new String[]{"java.lang.String"}, new String[]{"UTA-8"}, false, 3, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "doClone", "org.jsoup.nodes.Node", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodesCopy", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1", "{\"a\":1}"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<!a 1=\"{&quot;a&quot;:1}\"!> {getWholeDeclaration=1=\"{&quot;a&quot;:1}\"}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a 1=\"{&quot;a&quot;:1}\"!> {getWholeDeclaration=1=\"{&quot;a&quot;:1}\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "nodeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "addChildren", "int,org.jsoup.nodes.Node[]", "15", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#declaration", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "siblingNodes", new String[]{}, new String[]{}, false), new String[][]{{"add", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:8>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=7 cap=7] {get=32, getChar=\u7820, getDouble=!BufferUnderflowException, getFloat=1.9316252E-33, getInt=!BufferUnderflowException, getLong=!BufferUnderflowException, getShor...#297#1653849653", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true), new String[][]{{"arrayOffset", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:3>"}, true), new String[][]{{"putLong", "long", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "", "1.5e40", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "removeAttr", "java.lang.String", "1.123456789012345677"}}), new String[][]{{"asList", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "nextSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "unwrap", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false), new String[][]{{"attributes", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "removeChild", "org.jsoup.nodes.Node", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "outerHtml", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<?0?>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "parentNode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "addChildren", "org.jsoup.nodes.Node[]", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<?0?>a\n <!--a--> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
