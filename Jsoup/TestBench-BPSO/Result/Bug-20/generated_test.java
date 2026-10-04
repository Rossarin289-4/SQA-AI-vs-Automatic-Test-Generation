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
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "1.123456789012345", "1..1234567abc"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"TITLE1.5f"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "0.0", "WTF-8http-equiv"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "TitleTITLD", " "}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "b", "\n"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "", ""}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "\037", "123456789012345678901234567890"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", ".T1H", "1.5c"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<empty>", "0xFFFFFFFF", ""}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=1 cap=1] {get=97, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnderflowException, getLon...#333#-589539483", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "", "1.5e400", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "chCrset", "a b", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "1u", "5//", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "a,b,c", "2020-01-01", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"-.0"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, true), new String[][]{{"asShortBuffer", "", "3"}, {"get", "short[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"contet"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:0>", ",1", "1/25", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0] {get=!BufferUnderflowException, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnd...#356#1959125497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "--10xFFFFFFFF", "TITLE1.5fa,b,c"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "01.5d", "ahttp://xample.com/a?b=c"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, true), new String[][]{{"asFloatBuffer", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsFloatBufferB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsFloatBufferB[pos=0 lim=1 cap=1] {get=1.626087E20, hasArray=false, hasRemaining=false, isDirect=false, isReadOnly=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "1.5f1.5d", "}1}1234567"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, true), new String[][]{{"getDouble", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "onttent", "123456789012345679901234567890"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "2020", "6527U9"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, true), new String[][]{{"isDirect", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "+,", "1/5ne300"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "123456789012", "0"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "I[1,2]", ".9"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "", "-0.0", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "h", "i", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"put", "java.nio.ByteBuffer", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "65269", "1-12345678", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "truee", " 1.5d"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"conWens"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "/a/a", "65279<a>b</a>", "<sample:7>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, true), new String[][]{{"arrayOffset", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "-1", ".5PT1H", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "2", "0xxFFFFFFFF"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "1.5Pf", "-1.\"", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "1.5e400http://example.com/a?b=c", "ai", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, true, 0, null, 2), new String[][]{{"putFloat", "int,float", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "a,bE,c", "1.234567890123456"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "1.25<a>b</a>", "2020-01-01", "<sample:11>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "UTF-8", "TitleTITLD", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("\ufffd {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, true), new String[][]{{"remaining", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"get", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "1E,5", "{#a\":1}", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, true, 0, null, 3), new String[][]{{"getFloat", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "getCharsetFromContentType", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "UTF-8", "\013", "<sample:1>"}, true), new String[][]{{"html", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "", "a,b,c", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "UTF-8", "/1", "<sample:3>"}, true, 0, null, 2), new String[][]{{"hasText", "", "4"}, {"classNames", "java.util.Set", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  \ufffd\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "aaaaaaaaaaaaaaaaaaaEaaaaaaaaaa", "-1.5", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"order", "java.nio.ByteOrder", "1"}});
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=3 cap=3] {get=97, getChar=\u620d, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnderflowException, getLong=!BufferUnderflowExcept...#309#-1825237396", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "\n", "-1.5true"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "[1,2", "b", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"alignedSlice", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<empty>", "2020-01-01", " --1", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"putDouble", "int,double", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"getShort", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("24842", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "<null>", "2147483748\n", "<sample:5>"}, true, 0, null, 3), new String[][]{{"getElementsByAttributeStarting", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "UTF-8", "2020-02-3025:61:61", "<sample:9>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  a\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, true, 0, null, 3), new String[][]{{"isReadOnly", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "1.1234567890123456", "http:0/example.com2/a?b=c"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=1 cap=1] {get=97, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnderflowException, getLon...#333#-589539483", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<empty>", "<null>", "1.123456781.25I"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "6ITLD1.5f", "1.123456"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"arrayOffset", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "<a>b</a>", "abc"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<empty>", "<null>", "trtecontent", "<sample:4>"}, true), new String[][]{{"getElementsByAttribute", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "6c279", "{\"`\":1~"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "", "0I"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:0>", "", "i\u00e9", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "1E-5", "-"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "", "1<a>b</a>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<empty>", "UTF-8", "1.5f1.123456789012345"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "", "1\t.6"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "<null>", "1", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  \ufffd\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<empty>", "1E-", "00", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.UnsupportedCharsetException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "a", "15", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "{\"a\":1}0x1F", "5", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "<null>", "i"}, true), new String[][]{{"getElementsByClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"mismatch", "java.nio.ByteBuffer", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "\u00e9", "TITLE"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "UTF-8", "1.5e300"}, true), new String[][]{{"getElementsMatchingText", "java.util.regex.Pattern", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  a b \n </body>\n</html>, <html>\n <head></head>\n <body>\n  a b \n </body>\n</html>, <head></head>, <body>\n a b \n</body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "r", "a,b,c\u00e9"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "", "0x1F"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "<null>", "http://example.com/a?b=c", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  a\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, true, 0, null, 3), new String[][]{{"getChar", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "<null>", "", "<sample:2>"}, true), new String[][]{{"dataNodes", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<empty>", "UTF-8", ".", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "<null>", "Hello,"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, true, 0, null, 2), new String[][]{{"limit", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"limit", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "2020-02-30T25:61:6F", "2020-02-30T25:61:611.25"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, true, 0, null, 1), new String[][]{{"isReadOnly", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"putDouble", "double", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "<null>", "2474836481"}, true), new String[][]{{"getElementsContainingText", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <head></head>, <body></body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "UTF-8", "I", "<sample:3>"}, true), new String[][]{{"nextSibling", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "214748364", "OS1H", "<sample:6>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "UTF-8", "PT"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "\n", "a b"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "<null>", "abc "}, true), new String[][]{{"getElementsByIndexGreaterThan", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<empty>", "<null>", "{\"a!:1}-1.5", "<sample:6>"}, true), new String[][]{{"addClass", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "UTF-8", "1E-5"}, true), new String[][]{{"baseUri", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "<null>", "1.5dtrue"}, true), new String[][]{{"className", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "UTF-8", "1.5e310", "<sample:9>"}, true, 0, null, 1), new String[][]{{"isBlock", "", "2"}, {"isBlock", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:8>", "<null>", "", "<sample:5>"}, true), new String[][]{{"dataNodes", "", "0"}, {"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "UTF-8", "1.5dTITLE", "<sample:1>"}, true), new String[][]{{"classNames", "", "1"}, {"remove", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<empty>", "UTF-8", "TITLE1.5f65279", "<sample:10>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "", "1.5e300http-equiv", "<sample:9>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "<null>", "PT1H"}, true), new String[][]{{"childNode", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "<null>", "1e10"}, true), new String[][]{{"dataNodes", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "", "2020-01-01", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "<null>", "2\r5f", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("\ufffd {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, true, 0, null, 1), new String[][]{{"putInt", "int,int", "2"}, {"order", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteOrder", actual.getClass().getName());
  assertEquals("BIG_ENDIAN", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:5>"}, true, 0, null, 1), new String[][]{{"arrayOffset", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "<null>", "i"}, true, 0, null, 1), new String[][]{{"getElementsByAttributeStarting", "java.lang.String", "3"}, {"attr", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, true, 0, null, 1), new String[][]{{"get", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "readToByteBuffer", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"getInt", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "<null>", "0x123456789", "<sample:0>"}, true, 0, null, 2), new String[][]{{"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "6"}, {"add", "int,org.jsoup.nodes.Element", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[null, a b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "<null>", "i.5d"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "TITLE1.5f", "12:30:45", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "<null>", "65279", "<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  a\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "", "null"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "<null>", "aaaaaaaaaaaaaaaaaa7aaaaaaaaaaaa"}, true, 0, null, 3), new String[][]{{"getElementsByClass", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:0>", "<null>", "5.", "<sample:6>"}, true, 0, null, 3), new String[][]{{"nextElementSibling", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "UTF-8", "TintleTITLD"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "UTF-8", "+1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "<null>", "1.5e400", "<sample:7>"}, true, 0, null, 3), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.util.regex.Pattern", "7"}, {"hasAttr", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<empty>", "<null>", "truetrue", "<sample:5>"}, true, 0, null, 3), new String[][]{{"empty", "", "4"}, {"appendChild", "org.jsoup.nodes.Node", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "", "1.123456781.25I"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "<null>", "Title"}, true, 0, null, 2), new String[][]{{"appendText", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html>a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "", ".h", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:4>", "", "2020-0101", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<empty>", "<null>", "1.6f", "<sample:3>"}, true, 0, null, 1), new String[][]{{"getElementsByAttributeValue", "java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "<null>", "1e0"}, true, 0, null, 3), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "1"}, {"addClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html class=\" a\">\n <head class=\" a\"></head>\n <body class=\" a\"></body>\n</html>, <html class=\" a\">\n <head class=\" a\"></head>\n <body class=\" a\"></body>\n</html>, <head class=\" a\"></head>, <body class=\" a...#210#-102759128", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "<null>", "TITLEUTF-8", "<sample:1>"}, true, 0, null, 1), new String[][]{{"addClass", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  \ufffd\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "<null>", ".6 ", "<sample:3>"}, true, 0, null, 3), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "0"}, {"attr", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html sample=\"\">\n <head sample=\"\"></head>\n <body sample=\"\">\n  a b \n </body>\n</html>, <html sample=\"\">\n <head sample=\"\"></head>\n <body sample=\"\">\n  a b \n </body>\n</html>, <head sample=\"\"></head>, <bod...#227#1242320041", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<empty>", "UTF8", "1.12345678901234467", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "UTF-8", "0x123456789", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "UTF-8", "UT\u00e9", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("\ufffd {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "<null>", ".\u00e9Hello, World"}, true, 0, null, 1), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <head></head>, <body></body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<empty>", "<null>", "12345678901U2345678901234567890+1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "<null>", "Hello, WordTitle", "<sample:0>"}, true, 0, null, 1), new String[][]{{"getElementsByAttribute", "java.lang.String", "1"}, {"eq", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<empty>", "<null>", "TITLE", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "UTF-8", "\010", "<sample:8>"}, true, 0, null, 1), new String[][]{{"append", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  a b\n </body>\n</html>0 {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "<null>", "1e100", "<sample:6>"}, true, 0, null, 1), new String[][]{{"attr", "java.lang.String", "0"}, {"getElementsByAttributeStarting", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "UTF-8", "]itleTITLD"}, true, 0, null, 3), new String[][]{{"childNodes", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  a b\n </body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:0>", "<null>", "http-equivTitle", "<sample:2>"}, true, 0, null, 2), new String[][]{{"getElementsByIndexGreaterThan", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[\ufffd]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "<null>", "\u00ea"}, true, 0, null, 2), new String[][]{{"child", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.File", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "UTF-8", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "<null>", "123456789012345678901234567890"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  a\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "<null>", "1233456789012345678901234567890", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "<null>", "<a=b</a>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "2"}, {"get", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<empty>", "UTF-8", "123456789012345678901234567890", "<sample:9>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<empty>", "<null>", "123456789012345678901234567890"}, true, 0, null, 1), new String[][]{{"id", "", "3"}, {"getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "<null>", "2027-02-3025:61:601"}, true, 0, null, 3), new String[][]{{"getElementById", "java.lang.String", "6"}, {"absUrl", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:5>", "UTF-8", "content", "<sample:2>"}, true, 0, null, 2), new String[][]{{"getElementsByAttributeStarting", "java.lang.String", "6"}, {"containsAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "<null>", "Hello, World"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  a b\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "<null>", "1.4f"}, true, 0, null, 1), new String[][]{{"className", "", "0"}, {"childNodes", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  a b\n </body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "<null>", "65279"}, true, 0, null, 2), new String[][]{{"getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "<null>", "1.12345678902345", "<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("\ufffd {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "<null>", "0c0"}, true, 0, null, 2), new String[][]{{"getAllElements", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  <a><b>t</b></a>\n </body>\n</html>, <html>\n <head></head>\n <body>\n  <a><b>t</b></a>\n </body>\n</html>, <head></head>, <body>\n <a><b>t</b></a>\n</body>, <a><b>t</b></a>, <b...#207#1880971451", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "load", new String[]{"java.io.InputStream", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "UTF-8", "[1,2]"}, true, 0, null, 3), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  a b \n </body>\n</html>, <html>\n <head></head>\n <body>\n  a b \n </body>\n</html>, <head></head>, <body>\n a b \n</body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<empty>", "<null>", "2020-02-3025:61:61", "<sample:5>"}, true, 0, null, 2), new String[][]{{"getElementsMatchingText", "java.util.regex.Pattern", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  \ufffd\n </body>\n</html>, <html>\n <head></head>\n <body>\n  \ufffd\n </body>\n</html>, <head></head>, <body>\n \ufffd\n</body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.DataUtil", "org.jsoup.helper.DataUtil", "parseByteData", new String[]{"java.nio.ByteBuffer", "java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:0>", "<null>", "1.", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  \ufffd\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
}
