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
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"UTF-16"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"charset="}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=1 cap=1] {get=97, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnderflowException, getLon...#333#-589539483", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:3>", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "1.5e300", "-0.0", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "crossStreams", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:2>", "<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "UTF-16", "xl0.5e300"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "<null>", "{\"a\":1}"}, true), new String[][]{{"elementSiblingIndex", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:0>", "<null>", "22", "<sample:15>"}, true, 0, null, 1), new String[][]{{"getElementsByAttribute", "java.lang.String", "1"}, {"prev", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"i\tcharset=010"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"i\tcharset=D010`,b,"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "nIP0x1F", "abc"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:0>", "UTF-8", "\n", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:0>", "UTF-8", "\n", "<sample:6>"}, true, 0, null, 2), new String[][]{{"cssSelector", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#root", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<empty>", "UTF-8", "\n", "<sample:0>"}, true, 0, null, 2), new String[][]{{"cssSelector", "", "3"}, {"charset", "java.nio.charset.Charset", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<empty>", "[1,2]", "\n", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"-.2"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<empty>", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"putDouble", "int,double", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<empty>", "32769"}, true, 0, null, 1), new String[][]{{"putDouble", "int,double", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:1>", "-32769"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"get", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"get", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=3 cap=3] {get=97, getChar=\u0d62, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnderflowException, getLong=!BufferUnderflowExcept...#309#-334018879", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:0>", "<null>", "32768", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:0>", "<null>", "3:2768", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "5.", "3:2768", "<sample:7>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"putLong", "int,long", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:0>", "true", "HI", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "crossStreams", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:3>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "crossStreams", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:3>", "<sample:2>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "12:3945", "12:3:45", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "12:3:45", "12:3:43", "<sample:3>"}, true, 0, null, 1), new String[][]{{"dataNodes", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:0>", "32"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "Title", "UTF-32", "<sample:6>"}, true, 0, null, 2), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "7"}, {"set", "int,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "Title0xFFFFFFFFF", "<null>", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "crossStreams", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<null>", "<empty>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "crossStreams", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:1>", "<empty>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<empty>", "xml", "--1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:3>"}, true, 0, null, 3), new String[][]{{"position", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "UT'E-16tsueeoco4ing", "http://example.com/a?b=c"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "UU'E-v16tsueeoco4ing", "http://example.comm/a?b=c0x1F"}, true, 0, null, 2), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:0>", "123456h7890s123", ".1.1234567", "<sample:4>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "123456h7890s123", ".1.1234567", "<sample:4>"}, true, 0, null, 3), new String[][]{{"className", "", "2"}, {"getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:6>", "-2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "1.12345678", "1.1234567"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"[d,2+]"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<empty>", "5121"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "UTF-8", "0x1F"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<empty>", "\n!12:30:45Hello, World", "32abc"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "1.5", "I", "<sample:6>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "1.5", "I", "<null>"}, true, 0, null, 1), new String[][]{{"getElementsByAttributeStarting", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "29020-02-30T25:61:610", "\tncndi", "<sample:2>"}, true, 0, null, 2), new String[][]{{"children", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"y\"a\":1}"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "1.5e00", "2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "", "\n8h\t"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "5120", "+12:30:45", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "\u00e9", "3", "<sample:3>"}, true, 0, null, 1), new String[][]{{"after", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, true, 0, null, 3), new String[][]{{"putInt", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, true, 0, null, 3), new String[][]{{"putInt", "int", "0"}, {"putShort", "int,short", "7"}, {"duplicate", "", "7"}, {"get", "byte[],int,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=5 lim=6 cap=6] {get=6, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnderflowException, getLong...#332#-221961188", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<null>", "32"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "charset", "+"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:11>", "", "0"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "-6", "xmk", "<sample:0>"}, true, 0, null, 2), new String[][]{{"classNames", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "1", ".71.5f", "<sample:4>"}, true, 0, null, 2), new String[][]{{"classNames", "", "5"}, {"remove", "java.lang.Object", "2"}, {"add", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "", ".71.5f", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.5fHello, World", "\n12020-01-01", "<sample:3>"}, true, 0, null, 1), new String[][]{{"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "6"}, {"first", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"limit", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"limit", "", "3"}, {"getDouble", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"put", "byte", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"compareTo", "java.nio.ByteBuffer", "4"}, {"getFloat", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"compareTo", "java.nio.ByteBuffer", "4"}, {"asDoubleBuffer", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsDoubleBufferB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsDoubleBufferB[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"compareTo", "java.nio.ByteBuffer", "4"}, {"asDoubleBuffer", "", "6"}, {"asReadOnlyBuffer", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsDoubleBufferRB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsDoubleBufferRB[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"compareTo", "java.nio.ByteBuffer", "4"}, {"asDoubleBuffer", "", "6"}, {"put", "java.nio.DoubleBuffer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<null>", "1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "/a.b", "UTF-16"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true), new String[][]{{"asLongBuffer", "", "6"}, {"hasArray", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "12:30:45", "I"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "12:3:45", "I"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "12:3:45", "I"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true), new String[][]{{"order", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteOrder", actual.getClass().getName());
  assertEquals("BIG_ENDIAN", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:0>", "[1,2]", "\n ", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "[1,2]", "\n!", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "[1,2+]", "123456789012345678901234567890", "<sample:4>"}, true), new String[][]{{"attributes", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, true), new String[][]{{"putLong", "long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:5>"}, true), new String[][]{{"putLong", "long", "4"}, {"remaining", "", "7"}, {"asFloatBuffer", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsFloatBufferB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsFloatBufferB[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, true), new String[][]{{"getInt", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1628244578", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, true), new String[][]{{"getInt", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, true), new String[][]{{"position", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:1>", "229375"}, true), new String[][]{{"putDouble", "int,double", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:2>", "32768"}, true);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=3 cap=3] {get=97, getChar=\u0a62, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnderflowException, getLong=!BufferUnderflowExcept...#309#1019495361", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:2>", "32768"}, true), new String[][]{{"isReadOnly", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "UTF-32", "http-equiv", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("\ufffd {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, true), new String[][]{{"isReadOnly", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:5>"}, true), new String[][]{{"get", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true), new String[][]{{"putLong", "int,long", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "Hello, World", "0xFFFFFFFF", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "crossStreams", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:0>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "1.1234567890123456", "I", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "crossStreams", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<empty>", "+1", "1.1234567890123456"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "+12:30:45", "1.1234567"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "1. 5e+00", "-0./", "<sample:3>"}, true), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true), new String[][]{{"putChar", "int,char", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:1>", "31"}, true), new String[][]{{"asCharBuffer", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsCharBufferB", actual.getClass().getName());
  assertEquals(" {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false, length=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:2>", "67108820"}, true), new String[][]{{"asCharBuffer", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsCharBufferB", actual.getClass().getName());
  assertEquals("\u610a {get=\u610a, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false, length=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<null>", "1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "000", "51/", "<sample:7>"}, true), new String[][]{{"getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "//b", "12:4:45"}, true), new String[][]{{"hasAttr", "java.lang.String", "5"}, {"baseUri", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:4:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true), new String[][]{{"limit", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<empty>", "UTF-16", "\u00e9"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:0>", "31"}, true), new String[][]{{"put", "java.nio.ByteBuffer", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "", "a b", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "1234567890123456789012345678902020-01-01", ".1.1234567", "<sample:3>"}, true), new String[][]{{"getElementsContainingOwnText", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true), new String[][]{{"alignmentOffset", "int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "/a/b", " a,b,c", "<sample:1>"}, true), new String[][]{{"dataset", "", "6"}, {"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true), new String[][]{{"asReadOnlyBuffer", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBufferR", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBufferR[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUn...#357#2125525453", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "UTF-16", "xxl0.5e300"}, true), new String[][]{{"getElementsMatchingText", "java.util.regex.Pattern", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <head></head>, <body></body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:2>", "33"}, true), new String[][]{{"getChar", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\u610a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "112:3/:452020-01-011.5f", "TITLE", "<sample:0>"}, true), new String[][]{{"elementSiblingIndex", "", "7"}, {"elementSiblingIndex", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "-1.5", "1..12345678901234567"}, true), new String[][]{{"getElementsByIndexEquals", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "xl0.5e300", "content", "<sample:1>"}, true), new String[][]{{"hasParent", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "UTF-16", "PT1H", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true), new String[][]{{"compareTo", "java.nio.ByteBuffer", "4"}, {"getFloat", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true), new String[][]{{"asCharBuffer", "", "3"}, {"compact", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsCharBufferB", actual.getClass().getName());
  assertEquals(" {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false, length=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "1.12345678901234567", "JrUTF-8"}, true), new String[][]{{"getElementsByClass", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"hasArray", "", "5"}, {"alignedSlice", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, true, 0, null, 3), new String[][]{{"hasRemaining", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "crossStreams", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<empty>", "<sample:2>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "crossStreams", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<null>", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "", "`bc", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "1e10", "1.12345678", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<empty>", "2147483647"}, true, 0, null, 1), new String[][]{{"asIntBuffer", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsIntBufferB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsIntBufferB[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true), new String[][]{{"position", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:1>", "2147483558"}, true, 0, null, 2), new String[][]{{"flip", "", "3"}, {"arrayOffset", "", "5"}, {"getLong", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<null>", "1073741804"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:1>", "1073741804"}, true, 0, null, 2), new String[][]{{"get", "byte[],int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:1>", "0"}, true, 0, null, 1), new String[][]{{"asDoubleBuffer", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsDoubleBufferB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsDoubleBufferB[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "htto-equiv", "P1.5"}, true), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "1"}, {"is", "java.lang.String", "2"}, {"subList", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true, 0, null, 1), new String[][]{{"getFloat", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"isDirect", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "Title", "32"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "<null>", "H{\"bb\":1}"}, true, 0, null, 1), new String[][]{{"elementSiblingIndex", "", "1"}, {"getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "[[\"&']W55-1", ""}, true, 0, null, 1), new String[][]{{"classNames", "", "5"}, {"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "Hello, World", "content", "<sample:8>"}, true, 0, null, 2), new String[][]{{"attributes", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "Hello, World", "content0x1F", "<sample:11>"}, true, 0, null, 2), new String[][]{{"body", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true), new String[][]{{"putShort", "short", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:3>"}, true, 0, null, 3), new String[][]{{"putShort", "short", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:0>", "5119"}, true, 0, null, 2), new String[][]{{"mismatch", "java.nio.ByteBuffer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true), new String[][]{{"getChar", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "UTF-8", "a b", "<sample:7>"}, true, 0, null, 3), new String[][]{{"body", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "", "ab", "<sample:7>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "UTF-32", "6", "<sample:5>"}, true, 0, null, 3), new String[][]{{"body", "", "6"}, {"className", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "UTF-32", "6", "<sample:4>"}, true, 0, null, 3), new String[][]{{"body", "", "6"}, {"clearAttributes", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body>\n \ufffd\ufffd\n</body> {hasParent=true, hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "UTF-32", "66", "<sample:4>"}, true, 0, null, 3), new String[][]{{"body", "", "6"}, {"clearAttributes", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body>\n \ufffd\n</body> {hasParent=true, hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "2147483648", "hstp-equiv", "<sample:5>"}, true), new String[][]{{"charset", "", "6"}});
  assertNotNull(actual);
  assertEquals("sun.nio.cs.UTF_8", actual.getClass().getName());
  assertEquals("UTF-8 {canEncode=true, isRegistered=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "ch1E-5", "0", "<sample:3>"}, true, 0, null, 1), new String[][]{{"getElementsByTag", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"get", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "<null>", "\n!", "<sample:8>"}, true, 0, null, 1), new String[][]{{"getElementsByAttribute", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:0>", "<null>", "22", "<sample:1>"}, true, 0, null, 1), new String[][]{{"getElementsByAttribute", "java.lang.String", "1"}, {"prev", "java.lang.String", "5"}, {"toggleClass", "java.lang.String", "3"}, {"get", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "vw,2+]UT\nF-8", "chXaqseAD2", "<sample:0>"}, true, 0, null, 3), new String[][]{{"getElementsByAttributeStarting", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true), new String[][]{{"asIntBuffer", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsIntBufferB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsIntBufferB[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "1.25", "nuLl"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "UTF-8", "kl"}, true, 0, null, 3), new String[][]{{"absUrl", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "", "kl"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "xl/.5e300", "+12:30:45", "<null>"}, true), new String[][]{{"firstElementSibling", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "5120", "I"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, true, 0, null, 3), new String[][]{{"get", "byte[],int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<null>", ".46f2147483748", ""}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true), new String[][]{{"hasArray", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "conten:xml", "a,bc", "<sample:2>"}, true), new String[][]{{"clearAttributes", "", "6"}, {"childNodes", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:5>", "10"}, true, 0, null, 1), new String[][]{{"getFloat", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("6.372985E20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:0>", "2147483569"}, true, 0, null, 1), new String[][]{{"asShortBuffer", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsShortBufferB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsShortBufferB[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "", "\n!"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "1e10"}, true), new String[][]{{"data", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "\u00e9h.5e300", "\t"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:0>", "2147483647"}, true, 0, null, 3), new String[][]{{"asLongBuffer", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsLongBufferB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsLongBufferB[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:3>"}, true, 0, null, 1), new String[][]{{"position", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, true, 0, null, 1), new String[][]{{"getLong", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "", "cars"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "UTF16", "\n", "<sample:6>"}, true, 0, null, 2), new String[][]{{"baseUri", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "UTF16", "\t", "<sample:5>"}, true, 0, null, 2), new String[][]{{"baseUri", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "2:30:4532", "32758", "<sample:0>"}, true, 0, null, 1), new String[][]{{"childNodesCopy", "", "3"}, {"listIterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "<null>", "=/"}, true, 0, null, 1), new String[][]{{"filter", "org.jsoup.select.NodeFilter", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  a b\n </body>\n</html> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "<null>", ""}, true, 0, null, 2), new String[][]{{"filter", "org.jsoup.select.NodeFilter", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  a\n </body>\n</html> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "<null>", ""}, true, 0, null, 2), new String[][]{{"dataset", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "<null>", "OT1H"}, true, 0, null, 1), new String[][]{{"appendElement", "java.lang.String", "2"}, {"getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "<null>", "0e10cqontent1E-5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "<null>", "/l0e10cs1L"}, true, 0, null, 3), new String[][]{{"getElementsByIndexGreaterThan", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "<null>", "0xFFFFFFFF"}, true, 0, null, 3), new String[][]{{"getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "6"}, {"hasText", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "<null>", "0xFGCF"}, true, 0, null, 2), new String[][]{{"getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "6"}, {"hasText", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "202-2-", "nvll32768\u00e9", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "Thtl;e", "a -"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "<null>", "\"\"']\"", "<sample:10>"}, true, 0, null, 3), new String[][]{{"attr", "java.lang.String,java.lang.String", "0"}, {"classNames", "java.util.Set", "6"}, {"attr", "java.lang.String,boolean", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a b {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "<null>", "\"\"']\"", "<sample:10>"}, true, 0, null, 3), new String[][]{{"attr", "java.lang.String,java.lang.String", "0"}, {"classNames", "java.util.Set", "6"}, {"attr", "java.lang.String,boolean", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "<null>", "I", "<sample:1>"}, true, 0, null, 3), new String[][]{{"attr", "java.lang.String,java.lang.String", "0"}, {"classNames", "java.util.Set", "6"}, {"attr", "java.lang.String,boolean", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  a\n </body>\n</html> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:0>", "<null>", "1.1233567890123456encoding", "<sample:4>"}, true, 0, null, 1), new String[][]{{"attr", "java.lang.String,java.lang.String", "0"}, {"classNames", "java.util.Set", "6"}, {"cssSelector", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#root.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:0>", "<null>", "[5,2+]", "<sample:1>"}, true, 0, null, 1), new String[][]{{"attr", "java.lang.String,java.lang.String", "0"}, {"classNames", "java.util.Set", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "<null>", "[,2\r+]", "<sample:3>"}, true, 0, null, 1), new String[][]{{"attr", "java.lang.String,java.lang.String", "6"}, {"getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[a b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "\n!", "1e10"}, true, 0, null, 1), new String[][]{{"filter", "org.jsoup.select.NodeFilter", "6"}, {"classNames", "", "7"}, {"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedKeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "<null>", "Title"}, true), new String[][]{{"classNames", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "<null>", "trve"}, true), new String[][]{{"getElementsMatchingOwnText", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "<null>", "tt"}, true), new String[][]{{"getElementsMatchingOwnText", "java.lang.String", "2"}, {"addAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "<null>", "tr1.5"}, true), new String[][]{{"after", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "<null>", ""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "<null>", "Hello, World"}, true, 0, null, 3), new String[][]{{"hasAttr", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "<null>", "Hello, World1.1234567890123456"}, true), new String[][]{{"hasAttr", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "<null>", "Hello, World1.1234567890123456"}, true, 0, null, 1), new String[][]{{"hasAttr", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "<null>", "HUello, W1"}, true, 0, null, 1), new String[][]{{"hasAttr", "java.lang.String", "2"}, {"getElementsByIndexGreaterThan", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<body></body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "<null>", "HUello,\037W2"}, true, 0, null, 1), new String[][]{{"hasAttr", "java.lang.String", "2"}, {"getElementsByIndexGreaterThan", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "<null>", "HUello,\037W2"}, true, 0, null, 1), new String[][]{{"hasAttr", "java.lang.String", "2"}, {"baseUri", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("HUello,\037W2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "123456789012345678901234567890", "xl0.5e300"}, true, 0, null, 3), new String[][]{{"appendElement", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<0></0> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "<null>", "1-1i34F5687", "<sample:1>"}, true, 0, null, 1), new String[][]{{"charset", "java.nio.charset.Charset", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head>\n  <meta charset=\"UTF-8\">\n </head>\n <body>\n  a\n </body>\n</html> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseInputStream", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "<null>", "charset=", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=3 cap=3] {get=97, getChar=\u0a62, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnderflowException, getLong=!BufferUnderflowExcept...#309#1019495361", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"remaining", "", "2"}, {"array", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"putDouble", "int,double", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"mark", "", "5"}, {"duplicate", "", "5"}, {"getFloat", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, true, 0, null, 3), new String[][]{{"mismatch", "java.nio.ByteBuffer", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:1>", "32765"}, true, 0, null, 3), new String[][]{{"get", "byte[],int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:2>", "5119"}, true, 0, null, 3), new String[][]{{"asShortBuffer", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsShortBufferB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsShortBufferB[pos=0 lim=1 cap=1] {get=24842, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:2>", "5125"}, true, 0, null, 3), new String[][]{{"asShortBuffer", "", "5"}, {"mismatch", "java.nio.ShortBuffer", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"putDouble", "int,double", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true, 0, null, 1), new String[][]{{"put", "java.nio.ByteBuffer", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"hasRemaining", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, true, 0, null, 3), new String[][]{{"asLongBuffer", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsLongBufferB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsLongBufferB[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:3>"}, true, 0, null, 1), new String[][]{{"get", "byte[],int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "<null>", "32"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"isDirect", "", "6"}, {"asShortBuffer", "", "4"}, {"put", "short[],int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "7-1", " np-"}, true, 0, null, 2), new String[][]{{"appendText", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getInt", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "", "[2,2"}, true, 0, null, 3), new String[][]{{"getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "2"}, {"add", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "i\tcharset=010", "m.Zm2,-U9F-16nul1.25"}, true, 0, null, 1), new String[][]{{"getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "2"}, {"add", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:5>", "33"}, true, 0, null, 2), new String[][]{{"mark", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=8 cap=8] {get=97, getChar=\u2c62, getDouble=!BufferUnderflowException, getFloat=8.530552E-33, getInt=!BufferUnderflowException, getLong=!BufferUnderflowException, getShort...#295#-1235281490", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:2>", "32768"}, true, 0, null, 2), new String[][]{{"putLong", "long", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:3>", "32788"}, true, 0, null, 2), new String[][]{{"getFloat", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.626087E20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, true, 0, null, 1), new String[][]{{"order", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteOrder", actual.getClass().getName());
  assertEquals("BIG_ENDIAN", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "12345678901234567890123456780", "dconHenE", "<sample:1>"}, true, 0, null, 3), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"asCharBuffer", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsCharBufferB", actual.getClass().getName());
  assertEquals(" {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false, length=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, true, 0, null, 3), new String[][]{{"asDoubleBuffer", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsDoubleBufferB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsDoubleBufferB[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, true, 0, null, 1), new String[][]{{"hasRemaining", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true, 0, null, 1), new String[][]{{"position", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"asDoubleBuffer", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsDoubleBufferB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsDoubleBufferB[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:2>", "1"}, true, 0, null, 3), new String[][]{{"array", "", "1"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"get", "byte[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"asIntBuffer", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsIntBufferB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsIntBufferB[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "UTF-8", "12:30p4\t51.12345678901234567"}, true, 0, null, 2), new String[][]{{"attr", "java.lang.String", "0"}, {"getElementsByIndexEquals", "int", "6"}, {"toggleClass", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true, 0, null, 1), new String[][]{{"limit", "", "3"}, {"alignmentOffset", "int,int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "\n\n", "-nBcnding1.0234667", "<sample:5>"}, true, 0, null, 3), new String[][]{{"className", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"compact", "", "1"}, {"hasRemaining", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "UTF-8", "f\tcharset\n=010"}, true, 0, null, 3), new String[][]{{"charset", "", "0"}, {"name", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, true, 0, null, 2), new String[][]{{"alignmentOffset", "int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"compareTo", "java.nio.ByteBuffer", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getInt", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"order", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteOrder", actual.getClass().getName());
  assertEquals("BIG_ENDIAN", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"limit", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"alignedSlice", "int", "5"}, {"asIntBuffer", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsIntBufferB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsIntBufferB[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"asIntBuffer", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsIntBufferB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsIntBufferB[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"position", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"asReadOnlyBuffer", "", "0"}, {"asCharBuffer", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsCharBufferRB", actual.getClass().getName());
  assertEquals(" {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=true, length=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"put", "byte[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"capacity", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"reset", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.InvalidMarkException", thrown.getClass().getName());
 }
}
