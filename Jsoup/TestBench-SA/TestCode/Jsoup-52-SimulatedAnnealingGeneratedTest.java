package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodesCopy", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"http-equiv"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{" "}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "1.5g", "xml"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "ownerDocument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "replaceWith", "org.jsoup.nodes.Node", "<sample:0>"}, {"org.jsoup.nodes.XmlDeclaration", "name", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:2>", "33"}, true);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=3 cap=3] {get=97, getChar=\u0a62, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnderflowException, getLong=!BufferUnderflowExcept...#309#1019495361", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:5>", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=1 cap=1] {get=97, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnderflowException, getLon...#333#-589539483", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<empty>", "-65523"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "crossStreams", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:2>", "<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"charset="}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"charset=1.5e300"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"charset=-1.5ekU0"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "UTF-8", "11 ]72XCa5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "runParser", ""}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "UTF-32", "1.5e4l0UnF,8"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "runParser", ""}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "UTF-32", "1.5e4l0UnF,8"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{".0"}, false, 11, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "#declration", "1"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:0>"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "-1", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "UTF-8", "5.1.12345657"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  a,b 1,2 \n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "<null>", "?-1", "<sample:0>"}, true, 0, null, 3), new String[][]{{"appendElement", "java.lang.String", "7"}, {"getElementById", "java.lang.String", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"PT1D", "aa", "<null>"}, false, 13, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "[3'7]+1", "ThaT>LF"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:6>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:7>"}}, 1), new String[][]{{"addAll", "int,java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodesCopy", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodesCopy", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodesCopy", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodesCopy", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "nodeName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodesCopy", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "nodeName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodesCopy", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "nodeName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodesCopy", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "nodeName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<i:-7>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "removeChild", "org.jsoup.nodes.Node", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "removeChild", "org.jsoup.nodes.Node", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<s:1>"}, false, 11, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "removeChild", "org.jsoup.nodes.Node", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"!"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "-we", "<0..12http-equiv", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:0>", "e", "ull\"", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "Hello, World", "um\"", "<sample:4>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "wrap", new String[]{"java.lang.String"}, new String[]{"2020-01-C01"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "getOutputSettings", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "attributes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "getOutputSettings", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "attributes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "getOutputSettings", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "attributes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "getOutputSettings", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "attributes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "getOutputSettings", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "toString", ""}}, 3), new String[][]{{"outline", "boolean", "7"}, {"outline", "boolean", "4"}, {"outline", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "getOutputSettings", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "toString", ""}}, 3), new String[][]{{"outline", "boolean", "7"}, {"outline", "boolean", "4"}, {"outline", "", "6"}, {"charset", "", "2"}});
  assertNotNull(actual);
  assertEquals("sun.nio.cs.UTF_8", actual.getClass().getName());
  assertEquals("UTF-8 {canEncode=true, isRegistered=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "siblingIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "-2147483648", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "siblingIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "-2147483648", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "siblingIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "-2147483648", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "siblingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "-2147483648", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "hasAttr", "java.lang.String", "?"}, {"org.jsoup.nodes.XmlDeclaration", "childNodeSize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!a!>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "getWholeDeclaration", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "replaceWith", "org.jsoup.nodes.Node", "<sample:1>"}, {"org.jsoup.nodes.XmlDeclaration", "after", "java.lang.String", "1E-5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "getWholeDeclaration", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "replaceWith", "org.jsoup.nodes.Node", "<sample:1>"}, {"org.jsoup.nodes.XmlDeclaration", "after", "java.lang.String", "1E-5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "getWholeDeclaration", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "hasAttr", "java.lang.String", ">"}, {"org.jsoup.nodes.XmlDeclaration", "replaceWith", "org.jsoup.nodes.Node", "<sample:1>"}, {"org.jsoup.nodes.XmlDeclaration", "doClone", "org.jsoup.nodes.Node", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "getWholeDeclaration", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "hasAttr", "java.lang.String", ">"}, {"org.jsoup.nodes.XmlDeclaration", "replaceWith", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.XmlDeclaration", "doClone", "org.jsoup.nodes.Node", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "before", new String[]{"java.lang.String"}, new String[]{"IHello, World"}, false, 15, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "parent", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "name", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "childNodesCopy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"2020--01-01"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "32", "31"}, {"org.jsoup.parser.XmlTreeBuilder", "currentElement", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attributes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "removeChild", "org.jsoup.nodes.Node", "<null>"}, {"org.jsoup.nodes.XmlDeclaration", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "2147483594", "<sample:5>"}}, 1), new String[][]{{"html", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attributes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "removeChild", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.XmlDeclaration", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "2147483594", "<sample:5>"}}, 1), new String[][]{{"html", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attributes", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "removeChild", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.XmlDeclaration", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "2147483594", "<sample:5>"}}, 1), new String[][]{{"html", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attributes", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "removeChild", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.XmlDeclaration", "childNodesCopy", ""}, {"org.jsoup.nodes.XmlDeclaration", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "2147483594", "<sample:5>"}}, 1), new String[][]{{"html", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "abcd+1", "0xnF"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "a0bcd+1l", "0xnF"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 10, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 9, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"12:320:45"}, false, 11, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "currentElement", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "addChildren", "int,org.jsoup.nodes.Node[]", "0", "<sample:2>"}, {"org.jsoup.nodes.XmlDeclaration", "absUrl", "java.lang.String", "1.12345678901234567"}, {"org.jsoup.nodes.XmlDeclaration", "equals", "java.lang.Object", "<i:-1>"}}, 1), new String[][]{{"insert", "int,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sample<!a!><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!><!doctype a>\n <!--a-->a {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "absUrl", "java.lang.String", "1.12345678901234567"}, {"org.jsoup.nodes.XmlDeclaration", "equals", "java.lang.Object", "<i:-1>"}}, 1), new String[][]{{"insert", "int,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sample<!a!>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:2>"}, false, 0, null, 1), new String[][]{{"baseUri", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "65278", "<sample:1>"}}, 3), new String[][]{{"childNodesCopy", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "before", "java.lang.String", "ixml"}}, 3), new String[][]{{"ownerDocument", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 0, null, 3), new String[][]{{"ownerDocument", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "childNodesAsArray", ""}, {"org.jsoup.nodes.XmlDeclaration", "html", "java.lang.Appendable", "<sample:1>"}}, 3), new String[][]{{"ownerDocument", "", "5"}, {"nodeName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#declaration", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "childNodesAsArray", ""}, {"org.jsoup.nodes.XmlDeclaration", "html", "java.lang.Appendable", "<sample:1>"}}, 3), new String[][]{{"attributes", "", "5"}, {"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "remove", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "hasAttr", new String[]{"java.lang.String"}, new String[]{"Hexlo,\037World"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "siblingNodes", ""}, {"org.jsoup.nodes.XmlDeclaration", "replaceWith", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.XmlDeclaration", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "131072", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "hasAttr", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 5, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "siblingNodes", ""}, {"org.jsoup.nodes.XmlDeclaration", "replaceWith", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.XmlDeclaration", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "131072", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processEndTag", "java.lang.String", "I"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "2147483648", "[1,2]", "<null>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "doClone", "org.jsoup.nodes.Node", "<sample:4>"}}, 2), new String[][]{{"siblingIndex", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "before", "java.lang.String", "!"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Doctype"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:4>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:0>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Doctype"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "?"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "010", "Title"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:0>", "2020-02-31T25:61:611.5e600", "charse'=", "<sample:7>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 0, null, 1), new String[][]{{"setBaseUri", "java.lang.String", "5"}, {"html", "java.lang.Appendable", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("<!a!>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 1), new String[][]{{"setBaseUri", "java.lang.String", "5"}, {"html", "java.lang.Appendable", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("<?0?>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "baseUri", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "getWholeDeclaration", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "baseUri", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "getWholeDeclaration", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodesCopy", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "nodeName", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodesCopy", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "nodeName", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "outerHtmlTail", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "65278", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<i:15>"}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "outerHtmlTail", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "65278", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<i:-15>"}, false, 2, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "outerHtmlTail", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "65278", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "charset=", "<", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "-1", "1.12345678901234567", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "-1", "1.123456789012334567", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "siblingNodes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "removeChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:0>", "we", "ull!", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "wrap", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "nextSibling", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "getOutputSettings", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "getOutputSettings", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "getOutputSettings", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "getOutputSettings", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "siblingIndex", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document$OutputSettings", actual.getClass().getName());
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "parentNode", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "parentNode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "parentNode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "runParser", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!a!>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<?0?>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!sample!>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "toString", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "traverse", "org.jsoup.select.NodeVisitor", "<null>"}, {"org.jsoup.nodes.XmlDeclaration", "equals", "java.lang.Object", "<s:b>"}, {"org.jsoup.nodes.XmlDeclaration", "childNodesAsArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<??>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodeSize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodeSize", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodeSize", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodeSize", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:4>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "33", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "runParser", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "getWholeDeclaration", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "replaceWith", "org.jsoup.nodes.Node", "<sample:1>"}, {"org.jsoup.nodes.XmlDeclaration", "doClone", "org.jsoup.nodes.Node", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodesAsArray", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodesAsArray", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodesAsArray", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "before", new String[]{"java.lang.String"}, new String[]{"I"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "32", "32"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodesAsArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "after", "java.lang.String", "0x0F65279"}, {"org.jsoup.nodes.XmlDeclaration", "after", "org.jsoup.nodes.Node", "<sample:1>"}, {"org.jsoup.nodes.XmlDeclaration", "outerHtml", "java.lang.Appendable", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Doctype"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "setBaseUri", new String[]{"java.lang.String"}, new String[]{"-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "siblingIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "hasSameValue", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "siblingIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "childNodeSize", ""}, {"org.jsoup.nodes.XmlDeclaration", "hasSameValue", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "siblingIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "childNodeSize", ""}, {"org.jsoup.nodes.XmlDeclaration", "hasSameValue", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "siblingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "absUrl", "java.lang.String", "?"}, {"org.jsoup.nodes.XmlDeclaration", "childNodeSize", ""}, {"org.jsoup.nodes.XmlDeclaration", "hasSameValue", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<!a!>a {getWholeDeclaration=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!>a {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "addChildren", "org.jsoup.nodes.Node[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<!sample!>a {getWholeDeclaration=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!sample!>a {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "removeChild", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.XmlDeclaration", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "2147483647", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attributes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "removeChild", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.XmlDeclaration", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "2147483647", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "removeChild", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.XmlDeclaration", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "2147483647", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attributes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "removeChild", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.XmlDeclaration", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "2147483647", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attributes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "removeChild", "org.jsoup.nodes.Node", "<null>"}, {"org.jsoup.nodes.XmlDeclaration", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:0>", "2147483647", "<sample:5>"}}), new String[][]{{"html", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "getWholeDeclaration", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:2>"}, false), new String[][]{{"before", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "1.5f", "xml"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "1.1234567890C123456<", "1.023456789012334567"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "1.12345678", "UTF-16", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "ensureChildNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "childNodesAsArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "parent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "nodeName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "parent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "hasSameValue", "java.lang.Object", "<i:1>"}, {"org.jsoup.nodes.XmlDeclaration", "nodeName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "parent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "hasSameValue", "java.lang.Object", "<i:1>"}, {"org.jsoup.nodes.XmlDeclaration", "nodeName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "parent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "hasSameValue", "java.lang.Object", "<i:1>"}, {"org.jsoup.nodes.XmlDeclaration", "nodeName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "indent", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "1", "<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "indent", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "1", "<sample:10>"}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "nodeName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 10, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "childNodeSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "equals", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("<?0?>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "html", new String[]{"java.lang.Appendable"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "equals", "java.lang.Object", "<i:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "equals", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("<!a!>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "html", new String[]{"java.lang.Appendable"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "addChildren", "int,org.jsoup.nodes.Node[]", "0", "<sample:2>"}, {"org.jsoup.nodes.XmlDeclaration", "absUrl", "java.lang.String", "1.12345678901234567"}, {"org.jsoup.nodes.XmlDeclaration", "equals", "java.lang.Object", "<i:-7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("<!a!><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "addChildren", "int,org.jsoup.nodes.Node[]", "0", "<sample:2>"}, {"org.jsoup.nodes.XmlDeclaration", "absUrl", "java.lang.String", "1.12345678901234567"}, {"org.jsoup.nodes.XmlDeclaration", "equals", "java.lang.Object", "<i:-7>"}}), new String[][]{{"insert", "int,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sample<!a!><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!><!DOCTYPE a PUBLIC \"0\" \"sample\">\n <!--a-->a {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:1>"}, false), new String[][]{{"baseUri", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "outerHtmlTail", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<empty>", "0", "<sample:6>"}, false, 6, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "addChildren", "int,org.jsoup.nodes.Node[]", "33", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "?", "!", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "before", "java.lang.String", "i"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "before", "java.lang.String", "ixml"}}), new String[][]{{"ownerDocument", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false), new String[][]{{"ownerDocument", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=3 cap=3] {get=97, getChar=\u0a62, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnderflowException, getLong=!BufferUnderflowExcept...#309#1019495361", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, true), new String[][]{{"put", "int,byte", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "1L", "2147483648", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "outerHtmlTail", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "2147483647", "<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNode", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "name", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "remove", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "hasAttr", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "131072", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "doClone", "org.jsoup.nodes.Node", "<sample:4>"}}), new String[][]{{"siblingIndex", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Doctype"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:4>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:3>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\u00e9", "65279"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("\u00e9 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Doctype"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "010", "Title"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "baseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "replaceWith", "org.jsoup.nodes.Node", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "outerHtml", "java.lang.Appendable", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "after", "org.jsoup.nodes.Node", "<sample:4>"}, {"org.jsoup.nodes.XmlDeclaration", "doClone", "org.jsoup.nodes.Node", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<??>a {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "2020-02-30T25:61:61", "1.5d", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "baseUri", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "getWholeDeclaration", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "baseUri", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "getWholeDeclaration", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "baseUri", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "getWholeDeclaration", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "baseUri", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "getWholeDeclaration", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "baseUri", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "getWholeDeclaration", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "ownerDocument", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "replaceWith", "org.jsoup.nodes.Node", "<sample:0>"}, {"org.jsoup.nodes.XmlDeclaration", "name", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "currentElement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodesCopy", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodesCopy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "nodeName", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false), new String[][]{{"childNodes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "crossStreams", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<null>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true), new String[][]{{"putShort", "short", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "indent", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<null>", "65278", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "hasAttr", "java.lang.String", "1.123456789012334567"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "clone", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "clone", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"childNodes", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "name", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "replaceWith", "org.jsoup.nodes.Node", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "name", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "replaceWith", "org.jsoup.nodes.Node", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "name", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "replaceWith", "org.jsoup.nodes.Node", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "name", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "traverse", "org.jsoup.select.NodeVisitor", "<sample:7>"}, {"org.jsoup.nodes.XmlDeclaration", "replaceWith", "org.jsoup.nodes.Node", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "ensureChildNodes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "outerHtml", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "ensureChildNodes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "outerHtml", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "ensureChildNodes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "traverse", "org.jsoup.select.NodeVisitor", "<sample:1>"}, {"org.jsoup.nodes.XmlDeclaration", "outerHtml", ""}, {"org.jsoup.nodes.XmlDeclaration", "attributes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<empty>", "abc", "+1", "<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<empty>", "`bc", "+", "<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "", "1e10", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "", "1e10", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "outerHtmlTail", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "10", "<sample:3>"}}, 3), new String[][]{{"subList", "int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "charset", "1e11", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "cg_arsetUTF-8", "1fe/X", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<s:bb>"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "hasSameValue", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 11, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "absUrl", "java.lang.String", "{\"a\":1}"}, {"org.jsoup.nodes.XmlDeclaration", "attributes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, true, 0, null, 1), new String[][]{{"compareTo", "java.nio.ByteBuffer", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("98", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=3 cap=3] {get=97, getChar=\u0a62, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnderflowException, getLong=!BufferUnderflowExcept...#309#1019495361", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, true, 0, null, 1), new String[][]{{"compareTo", "java.nio.ByteBuffer", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, true, 0, null, 1), new String[][]{{"put", "byte[],int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "indent", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "-1", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "setSiblingIndex", "int", "-65523"}, {"org.jsoup.nodes.XmlDeclaration", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "1", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "", "aaaaaaaaaaaaaaaaaaa`aaaaaaaaaa+1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "@", "`aaaaaaaaaaaaa"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "unwrap", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "nextSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "32", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "nextSibling", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "32", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "nextSibling", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "32", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "nextSibling", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "32", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "outerHtml", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!a!>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "outerHtml", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<?0?>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "outerHtml", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!sample!>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!sample!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "outerHtml", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "outerHtml", "java.lang.Appendable", "<sample:3>"}, {"org.jsoup.nodes.XmlDeclaration", "traverse", "org.jsoup.select.NodeVisitor", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<??>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "previousSibling", ""}}), new String[][]{{"nodeName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#declaration", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 12, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "childNodesAsArray", ""}, {"org.jsoup.nodes.XmlDeclaration", "previousSibling", ""}}), new String[][]{{"nodeName", "", "2"}, {"outerHtml", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<!a!>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "wrap", "java.lang.String", "1.5d1"}, {"org.jsoup.nodes.XmlDeclaration", "replaceWith", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.XmlDeclaration", "parent", ""}}, 1), new String[][]{{"nodeName", "", "0"}, {"outerHtml", "", "4"}, {"before", "org.jsoup.nodes.Node", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "siblingNodes", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<?0?> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "siblingNodes", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"get", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "wrap", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "wrap", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "html", "java.lang.Appendable", "<empty>"}, {"org.jsoup.nodes.XmlDeclaration", "addChildren", "int,org.jsoup.nodes.Node[]", "65279", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!>\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\"> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "html", "java.lang.Appendable", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "html", "java.lang.Appendable", "<empty>"}, {"org.jsoup.nodes.XmlDeclaration", "removeAttr", "java.lang.String", "2020-02-30T25:61:61"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<?0?>a {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"UTF-32", "charset"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "getOutputSettings", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<!a utf-32=\"charset\"!> {getWholeDeclaration=utf-32=\"charset\"}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a utf-32=\"charset\"!> {getWholeDeclaration=utf-32=\"charset\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"UTF-52", "charset"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "getOutputSettings", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<!a utf-52=\"charset\"!> {getWholeDeclaration=utf-52=\"charset\"}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a utf-52=\"charset\"!> {getWholeDeclaration=utf-52=\"charset\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"UT'F-52", "charset"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<!a ut'f-52=\"charset\"!> {getWholeDeclaration=ut'f-52=\"charset\"}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a ut'f-52=\"charset\"!> {getWholeDeclaration=ut'f-52=\"charset\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"UT'F-a52", "chartet"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<!a ut'f-a52=\"chartet\"!> {getWholeDeclaration=ut'f-a52=\"chartet\"}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a ut'f-a52=\"chartet\"!> {getWholeDeclaration=ut'f-a52=\"chartet\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"UT'F-b52", "chartet"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<!a ut'f-b52=\"chartet\"!> {getWholeDeclaration=ut'f-b52=\"chartet\"}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<!a ut'f-b52=\"chartet\"!> {getWholeDeclaration=ut'f-b52=\"chartet\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"UT'F-b52", "chartet"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<? ut'f-b52=\"chartet\"?> {getWholeDeclaration=ut'f-b52=\"chartet\"}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<? ut'f-b52=\"chartet\"?> {getWholeDeclaration=ut'f-b52=\"chartet\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"UT'F-b52", "chartet"}, false, 11, new String[][]{}), new String[][]{{"ownerDocument", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<? ut'f-b52=\"chartet\"?> {getWholeDeclaration=ut'f-b52=\"chartet\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"UT'F-b53", "charte_"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<? ut'f-b53=\"charte_\"?> {getWholeDeclaration=ut'f-b53=\"charte_\"}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<? ut'f-b53=\"charte_\"?> {getWholeDeclaration=ut'f-b53=\"charte_\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"UT'F-b53", "charte_"}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<? ut'f-b53=\"charte_\"?> {getWholeDeclaration=ut'f-b53=\"charte_\"}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<? ut'f-b53=\"charte_\"?> {getWholeDeclaration=ut'f-b53=\"charte_\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"UT'F-b53", "chart=_"}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<? ut'f-b53=\"chart=_\"?> {getWholeDeclaration=ut'f-b53=\"chart=_\"}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<? ut'f-b53=\"chart=_\"?> {getWholeDeclaration=ut'f-b53=\"chart=_\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"UT'F-b53", "chart=_"}, false, 11, new String[][]{}, 2), new String[][]{{"previousSibling", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<? ut'f-b53=\"chart=_\"?> {getWholeDeclaration=ut'f-b53=\"chart=_\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"UT'F-b53", "chart=_"}, false, 11, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "attr", "java.lang.String,java.lang.String", "131072", "1E-5"}}, 2), new String[][]{{"previousSibling", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<? 131072=\"1E-5\" ut'f-b53=\"chart=_\"?> {getWholeDeclaration=131072=\"1E-5\" ut'f-b53=\"chart=_\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"UT'F-b53", "chart=_"}, false, 11, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "attr", "java.lang.String,java.lang.String", "131072", "1E-5"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<? 131072=\"1E-5\" ut'f-b53=\"chart=_\"?> {getWholeDeclaration=131072=\"1E-5\" ut'f-b53=\"chart=_\"}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<? 131072=\"1E-5\" ut'f-b53=\"chart=_\"?> {getWholeDeclaration=131072=\"1E-5\" ut'f-b53=\"chart=_\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+1", "chart=_"}, false, 11, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "attr", "java.lang.String,java.lang.String", "131072", "1E-5"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.XmlDeclaration", actual.getClass().getName());
  assertEquals("<? 131072=\"1E-5\" +1=\"chart=_\"?> {getWholeDeclaration=131072=\"1E-5\" +1=\"chart=_\"}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<? 131072=\"1E-5\" +1=\"chart=_\"?> {getWholeDeclaration=131072=\"1E-5\" +1=\"chart=_\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"UT'F-b53", "chart=_"}, false, 11, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "attr", "java.lang.String,java.lang.String", "131072", "1E-5"}}, 2), new String[][]{{"html", "java.lang.Appendable", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("<? 131072=\"1E-5\" ut'f-b53=\"chart=_\"?>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<? 131072=\"1E-5\" ut'f-b53=\"chart=_\"?> {getWholeDeclaration=131072=\"1E-5\" ut'f-b53=\"chart=_\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"?", "chart=_"}, false, 11, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "attr", "java.lang.String,java.lang.String", "131072", "1E-5"}}, 2), new String[][]{{"html", "java.lang.Appendable", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("<? 131072=\"1E-5\" ?=\"chart=_\"?>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<? 131072=\"1E-5\" ?=\"chart=_\"?> {getWholeDeclaration=131072=\"1E-5\" ?=\"chart=_\"}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, true), new String[][]{{"getFloat", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "absUrl", new String[]{"java.lang.String"}, new String[]{"5."}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "<", "1.5d"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "<", "1.5d"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"32", "<empty>"}, false, 7, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "65278", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<??> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"3", "<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"3", "<sample:1>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-17", "<null>"}, false, 7, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-17", "<sample:2>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "addChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"131072", "<empty>"}, false, 12, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "outerHtmlTail", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<empty>", "0", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<!a!> {getWholeDeclaration=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.XmlDeclaration", "org.jsoup.nodes.XmlDeclaration", "replaceChild", new String[]{"org.jsoup.nodes.Node", "org.jsoup.nodes.Node"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.XmlDeclaration", "setSiblingIndex", "int", "65278"}, {"org.jsoup.nodes.XmlDeclaration", "siblingIndex", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true, 0, null, 1), new String[][]{{"compact", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
