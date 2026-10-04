package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<empty>", "UTFd-16", "<a>5b</>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "1E-5", "[\"'][1,2]"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<empty>", "1e104", "ab\rc"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "abd", "2020-01-01"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<empty>", "++1", "Title65279"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:3>", "65535"}, true);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=6 cap=6] {get=97, getChar=\u0d0a, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnderflowException, getLong=!BufferUnderflowExcept...#288#-1871842321", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true), new String[][]{{"putLong", "long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=3 cap=3] {get=97, getChar=\u0a62, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnderflowException, getLong=!BufferUnderflowExcept...#309#1019495361", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:10>", "TITLE", "[\"e']"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, true), new String[][]{{"arrayOffset", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "crossStreams", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:6>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true), new String[][]{{"position", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:3>", "66560"}, true), new String[][]{{"putInt", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:4>", "1.123456789012345", "010", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "crossStreams", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:3>", "<sample:2>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true), new String[][]{{"mismatch", "java.nio.ByteBuffer", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "crossStreams", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:6>", "<sample:3>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"putInt", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "65279", "UTFl-32", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"1.12345+7890123456"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "", "UTF42", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true), new String[][]{{"isReadOnly", "", "0"}, {"hasArray", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "110", "is", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", " ", "0xFFFFFFFhF", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true), new String[][]{{"get", "byte[],int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, true), new String[][]{{"put", "int,byte", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "0x1234567891.1234567890123456", "nul3", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "[\"(][1,2]0", "[\"'][1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "A", "rr"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true), new String[][]{{"putShort", "int,short", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", ".5", " o\n", "<sample:10>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "5[\"'\\", "[\"']1.12345678"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:6>", "-9"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "Hello, World", "charteu", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true), new String[][]{{"hasRemaining", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "U00", "UTFF-16"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "f", "1.4", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "", "charseu=", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:4>"}, true), new String[][]{{"getFloat", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "-1", "-1.5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "-2<a>b</a>", " 2020-01-01", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:4>", "\n", "1.123456789012345", "<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "i", "[\"'][1,2]12:30:45"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:7>"}, true), new String[][]{{"compareTo", "java.nio.ByteBuffer", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("124", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "131072", "1.123456789012345612:30:45", "<sample:6>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "r", "0x"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:10>", "12:3]:451E-5", "a b"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:6>"}, true), new String[][]{{"putInt", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "1.12I345678901234567", "02020-01-01"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "3lr", "UInLE", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:11>"}, true), new String[][]{{"getDouble", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:6>", "2081"}, true), new String[][]{{"clear", "", "1"}, {"mismatch", "java.nio.ByteBuffer", "2"}, {"get", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "7\t", "1.123456789002345"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "<null>", "-1"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  <a><b>t</b></a>\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getChar", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"{.5"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "a,b,\r", "5.", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "1.25", "1-5f"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:3>"}, true), new String[][]{{"reset", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.InvalidMarkException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:11>"}, true), new String[][]{{"hasRemaining", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "UTF-16", ":5279"}, true), new String[][]{{"childNodeSize", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:6>"}, true), new String[][]{{"order", "java.nio.ByteOrder", "4"}, {"get", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("62", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "-0.02020-02-30T25:61:61", "/a0b"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=3 cap=3] {get=97, getChar=\u0a62, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnderflowException, getLong=!BufferUnderflowExcept...#309#1019495361", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:2>", "131038"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=3 cap=3] {get=97, getChar=\u0a62, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnderflowException, getLong=!BufferUnderflowExcept...#309#1019495361", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "UTF-32", "-/1"}, true), new String[][]{{"hasText", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:6>"}, true), new String[][]{{"get", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:3>"}, true), new String[][]{{"asCharBuffer", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsCharBufferB", actual.getClass().getName());
  assertEquals(" {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false, length=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "erue", "rr", "<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"putFloat", "float", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"q[[1,2]"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<empty>", "65280"}, true), new String[][]{{"asCharBuffer", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsCharBufferB", actual.getClass().getName());
  assertEquals(" {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false, length=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "UTF-32", "conntent"}, true), new String[][]{{"baseUri", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("conntent", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "crossStreams", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:4>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:8>", "r\n", "", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "1.25", ";5277"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:5>", "65278"}, true, 0, null, 3), new String[][]{{"put", "byte[],int,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=1 lim=8 cap=8] {get=44, getChar=\u620a, getDouble=!BufferUnderflowException, getFloat=2.5057738E-9, getInt=!BufferUnderflowException, getLong=!BufferUnderflowException, getShort...#296#-896582658", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "UTF-8", "0xFFFFFFFF"}, true), new String[][]{{"cssSelector", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#root", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "crossStreams", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:6>", "<sample:0>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:8>", "[0,2]", "1.12345678010"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", ".C1", "214748464", "<sample:4>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "", "[\"'][1,2]<a>b</a>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:3>"}, true), new String[][]{{"asLongBuffer", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsLongBufferB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsLongBufferB[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "crossStreams", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:8>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, true, 0, null, 1), new String[][]{{"putShort", "short", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:2>", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=1 cap=1] {get=97, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnderflowException, getLon...#333#-589539483", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "[\"e']", "UF-8"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"mark", "", "3"}, {"getChar", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:5>", "69"}, true), new String[][]{{"asLongBuffer", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsLongBufferB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsLongBufferB[pos=0 lim=1 cap=1] {get=7002079316568453642, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "-1", "1.c345678"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"putShort", "short", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"isReadOnly", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true), new String[][]{{"mismatch", "java.nio.ByteBuffer", "0"}, {"hasArray", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=1 cap=1] {get=97, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnderflowException, getLon...#333#-589539483", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:3>", "-33"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "2147488648", ""}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true), new String[][]{{"asShortBuffer", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsShortBufferB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsShortBufferB[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "<null>", "0x123456789"}, true), new String[][]{{"elementSiblingIndex", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "<null>", "121072"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  {\"a\":1}\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:0>", "139263"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "<null>", "12:30:45[1,2]", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  a b \n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getLong", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:7>"}, true, 0, null, 2), new String[][]{{"clear", "", "5"}, {"putDouble", "int,double", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:7>", "", "<a>b</a>1.1234567", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "1", "r0x/FFFFFFFF"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:9>", "<null>", "1.25\t", "<sample:1>"}, true), new String[][]{{"childNodeSize", "", "4"}, {"getElementsByIndexLessThan", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  line1 line3\n </body>\n</html>, <html>\n <head></head>\n <body>\n  line1 line3\n </body>\n</html>, <head></head>, <body>\n line1 line3\n</body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "0", "0xFFFFFFFF"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"remaining", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "[\"'][1,]", "65", "<sample:8>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "UTF-8", "PT1h"}, true, 0, null, 3), new String[][]{{"childNodes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  <a><b>t</b></a>\n </body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<empty>", "r", "5.UTF-16", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "<null>", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  a b \n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:4>"}, true, 0, null, 3), new String[][]{{"order", "java.nio.ByteOrder", "1"}, {"putFloat", "int,float", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getInt", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true, 0, null, 1), new String[][]{{"limit", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:3>", "65543"}, true, 0, null, 1), new String[][]{{"getShort", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("24845", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:5>", "65280"}, true, 0, null, 1), new String[][]{{"order", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteOrder", actual.getClass().getName());
  assertEquals("BIG_ENDIAN", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"asShortBuffer", "", "5"}, {"mark", "", "3"}, {"capacity", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:3>", "2147483647"}, true, 0, null, 3), new String[][]{{"position", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:0>", "10"}, true), new String[][]{{"asReadOnlyBuffer", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBufferR", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBufferR[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUn...#357#2125525453", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:2>", "65280"}, true), new String[][]{{"isDirect", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:7>", "<null>", "00x1F", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  {\"a\":1}\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"position", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"remaining", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true, 0, null, 1), new String[][]{{"getChar", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"position", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "crossStreams", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:3>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:7>", "<null>", "TITL5", "<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("{\"a\":1} {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"putChar", "int,char", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "crossStreams", new String[]{"java.io.InputStream", "java.io.OutputStream"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:7>", "UTF-32", "abc1.1234567", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("\ufffd\ufffd {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<empty>", "32"}, true), new String[][]{{"duplicate", "", "4"}, {"getLong", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "charses=", ".123456789012345", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "", "charseb", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:1>", "65264"}, true), new String[][]{{"putInt", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "<null>", "32", "<sample:6>"}, true), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"get", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"asIntBuffer", "", "2"}, {"get", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "32", "I;5279", "<sample:4>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"alignmentOffset", "int,int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "null", ""}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "0w1F", "12:30:45[1,2]i"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"asReadOnlyBuffer", "", "4"}, {"asFloatBuffer", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsFloatBufferRB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsFloatBufferRB[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"limit", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "<null>", "0x1F0x1F", "<sample:7>"}, true, 0, null, 2), new String[][]{{"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"charset="}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:0>", "65279"}, true, 0, null, 2), new String[][]{{"isDirect", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"charset=[1,[2]"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", ",1", "12:30:45"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"get", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"put", "int,byte", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getFloat", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "", "I[1,2]"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, true, 0, null, 3), new String[][]{{"putShort", "short", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:7>"}, true, 0, null, 3), new String[][]{{"limit", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:0>", "20"}, true, 0, null, 3), new String[][]{{"getInt", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:7>"}, true, 0, null, 3), new String[][]{{"asDoubleBuffer", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsDoubleBufferB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsDoubleBufferB[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "s", "-0.0", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, true, 0, null, 3), new String[][]{{"isDirect", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"asDoubleBuffer", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsDoubleBufferB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsDoubleBufferB[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:10>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", " ", "a b", "<sample:6>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"position", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "<null>", "1.5300", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<a><b>t</b></a> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:6>"}, true, 0, null, 3), new String[][]{{"alignmentOffset", "int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "r", "1.1334567890123458", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"asFloatBuffer", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsFloatBufferB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsFloatBufferB[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:4>", "33"}, true, 0, null, 2), new String[][]{{"getShort", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, true, 0, null, 2), new String[][]{{"array", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "UTF-32", "131;72", "<sample:4>"}, true, 0, null, 1), new String[][]{{"append", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  \ufffd\ufffd\ufffd\ufffd\n </body>\n</html>a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:1>", "1"}, true, 0, null, 1), new String[][]{{"get", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:4>", "-1"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "", "ch`rret"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "UTF-8", "UTFr-8"}, true, 0, null, 1), new String[][]{{"child", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "<null>", ".5"}, true, 0, null, 2), new String[][]{{"getElementsContainingOwnText", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<body>\n a b \n</body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "UTF-32", "{\"a\":1}"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  \ufffd\ufffd\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"limit", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"order", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteOrder", actual.getClass().getName());
  assertEquals("BIG_ENDIAN", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"asFloatBuffer", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsFloatBufferB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsFloatBufferB[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "", "5."}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"hasArray", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, true, 0, null, 1), new String[][]{{"isReadOnly", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:1>", "-1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "emptyByteBuffer", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"order", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteOrder", actual.getClass().getName());
  assertEquals("BIG_ENDIAN", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:6>"}, true, 0, null, 3), new String[][]{{"compareTo", "java.nio.ByteBuffer", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:3>"}, true, 0, null, 1), new String[][]{{"limit", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:6>"}, true, 0, null, 2), new String[][]{{"asReadOnlyBuffer", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBufferR", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBufferR[pos=0 lim=15 cap=15] {get=60, getChar=\u613e, getDouble=7.9120569067118E-18, getFloat=0.010704337, getInt=!BufferUnderflowException, getLong=!BufferUnderflowException, getShort=!Bu...#292#1366995975", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:6>"}, true, 0, null, 1), new String[][]{{"hasRemaining", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"getLong", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:5>"}, true, 0, null, 3), new String[][]{{"getShort", "int", "3"}, {"asDoubleBuffer", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsDoubleBufferB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsDoubleBufferB[pos=0 lim=1 cap=1] {get=1.2469973276356927E160, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:2>", "2147483647"}, true, 0, null, 3), new String[][]{{"limit", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:9>", "<null>", "Hello, World"}, true, 0, null, 2), new String[][]{{"appendElement", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<sample></sample> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "<null>", "5"}, true, 0, null, 1), new String[][]{{"getAllElements", "", "3"}, {"html", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  <a><b>t</b></a>\n </body>\n</html>\n<head></head>\n<body>\n <a><b>t</b></a>\n</body>\n\n<a><b>t</b></a>\n<b>t</b>\nt", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:7>"}, true, 0, null, 3), new String[][]{{"getShort", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:3>"}, true, 0, null, 3), new String[][]{{"put", "byte", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"limit", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "<null>", "rr", "<sample:6>"}, true, 0, null, 3), new String[][]{{"getElementsContainingOwnText", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<a><b>t</b></a>, <a><b>t</b></a>, <b>t</b>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:5>", "UTF-8", "", "<sample:3>"}, true, 0, null, 3), new String[][]{{"children", "", "3"}, {"lastIndexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"charset=Hello, World"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:7>"}, true, 0, null, 2), new String[][]{{"putShort", "short", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:4>", "4096"}, true, 0, null, 2), new String[][]{{"array", "", "3"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 13, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:2>", "65535"}, true, 0, null, 1), new String[][]{{"get", "", "0"}, {"putDouble", "double", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:6>", "2147483647"}, true, 0, null, 3), new String[][]{{"reset", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.InvalidMarkException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:4>", "2147483647"}, true, 0, null, 3), new String[][]{{"order", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteOrder", actual.getClass().getName());
  assertEquals("BIG_ENDIAN", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:0>", "2147483647"}, true, 0, null, 3), new String[][]{{"getShort", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:3>"}, true, 0, null, 1), new String[][]{{"put", "byte[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true, 0, null, 1), new String[][]{{"getShort", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:0>", "32767"}, true, 0, null, 2), new String[][]{{"array", "", "3"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:2>", "2147483647"}, true, 0, null, 1), new String[][]{{"arrayOffset", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:3>", "130556"}, true, 0, null, 1), new String[][]{{"asDoubleBuffer", "", "2"}, {"hasArray", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:3>", "2147483647"}, true, 0, null, 2), new String[][]{{"position", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"charset=\tUTF-32"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-32", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"charset=\t\tUTF-32"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-32", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"charset=UTF-8"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"charset=\tUTF-32"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-32", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream", "int"}, new String[]{"<null>", "1"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"isDirect", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readFileToByteBuffer", new String[]{"java.io.File"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"charset=\tUTF-32"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-32", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "UTF-16", "-15,", "<sample:6>"}, true, 0, null, 1), new String[][]{{"classNames", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"charset=UTF-16"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"charset=UTF-16"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "UTF-16", "1.123456789012345"}, true, 0, null, 3), new String[][]{{"child", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"charset=UTF-16"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"charset=UTF-16"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "UTF-32", "", "<sample:2>"}, true, 0, null, 1), new String[][]{{"hasSameValue", "java.lang.Object", "7"}, {"body", "", "4"}, {"getElementsByAttributeValue", "java.lang.String,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "UTF-8", "652791L", "<sample:3>"}, true, 0, null, 2), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "3"}, {"retainAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "UTF-8", "content", "<sample:7>"}, true, 0, null, 2), new String[][]{{"head", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<head></head> {hasText=false, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"charset=UTF-8"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"charset=UTF-8"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"charset=\tUTF32"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF32", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"charset=\tUTF32"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF32", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"charset=UTF-8"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"charset=\tUTF32"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF32", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"charset=\tuTF-32"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("uTF-32", String.valueOf(actual));
 }
}
