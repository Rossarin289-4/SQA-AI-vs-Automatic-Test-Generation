package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c61"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "\u00e9\t"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b=3Dc61", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "--\n", "21\"474836<48"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://example.com/a?b=c61", ".5\n"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:kPey>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"UTF-8010"}, false, 3, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "http:/e/examplf.com/a?b=c", ".5"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<s:pkPey>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<null>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "21474836481.123450678", "Objects of type 1.5e300"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"\u00e9\u00ea\t"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=C3=A9=C3=AA=09", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<s:L>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "Objsects of"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<s:L>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\rUTF-8", "http"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "<null>", "+1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "I"}, false, 7, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "12:30:45Hello, World"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "12:30:45", "-0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "1.123450678", "Objsects of type UTF-8"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "Title"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<sample:0>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 55, 70, 61, 48, 50, 61, 48, 51]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "1234567890123456789012345678890", "PT1H"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "--1", "TITLE"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"01", "1.25"}, false, 4, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "175123456789012345678901234567890"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "--1", "5."}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 127]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[3, 4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "i1.12345678", ".5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "2020-01-01123456789012345678901234567890"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"/ba/b"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/ba/b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"12:3045"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:3045", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<sample:3>", "<empty>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:kUey>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://exbmple.com/a?b=c", ""}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFabc"}, false, 2, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "1e10"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "TITBLE", "null"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFFFabc", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"5\013", "OEbjsects of type UTF-8"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"[1,2]a,b,c"}, false, 5, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "a x1e10"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "1.5e300"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"C3"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "/a0b"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 55, 70, 61, 48, 50, 61, 48, 51]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"PT_H"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "*1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT_H", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "{\"a\":1B}123456789012345678901234567890"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "010[1,2]"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"11234567890123456"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<i:63>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11234567890123456", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"bd"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:kPFy>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kPFy", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<d:0.75>"}, false, 4, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, 5, 6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "2020-01-01"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"bbc"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bbc", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.25aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "11.123450678"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<null>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "/a/b", "1.12345678901234567"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "321.123450678", "<a>b</a>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "-1.5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"1.5f13"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5f13", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"}11"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 127]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"+013"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+013", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"\u00e9\u00ea\t[[1,2]"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=C3=A9=C3=AA\t[[1,2]", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"0xCF"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xCF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"21\"474"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<s:a>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21\"474", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"OEbjsects of type!UTF-8"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("OEbjsects of type!UTF-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"\u00ea"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "+0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 127]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:pkPey>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("pkPey", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"<a>a</a>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "0xFFFFFFsFF", "1.12345678"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>a</a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"http:/e/examplf.com/a?b>c"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http:/e/examplf.com/a?b>c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"22146483648"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "TITLE", "Hello, World"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("22146483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"\u00e9i1.5f"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "1.25aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=C3=A9i1.5f", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:M>"}, false, 6, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<d:1.73>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"21\"474836<48"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21\"474836<48", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"\u00e9p"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=C3=A9p", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[3, 4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 55, 70, 61, 48, 50, 61, 48, 51]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:W>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "TITLE"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("W", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"0w123456789.5"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "--\n"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0w123456789.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<empty>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"+0"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"D", "110"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Objsects of type UTF-8", "i.12345678901234561.5f"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<s:>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{" "}, false, 1, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 127]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 3, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "", "1.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"1[1,2]"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1[1,2]", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<d:0.75>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 5, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<null>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "1.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Title", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[3, 4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"011"}, false, 4, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("011", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"2020-0A-30T25:61:61[1,2]"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-0A-30T25:61:61[1,2]", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 7, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "0xFFFFFFFF", "a "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"aacc"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aacc", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 55, 70, 61, 48, 50, 61, 48, 51]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"`bc"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`bc", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"\u00e9i"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "\u00e9\t", "Title"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=C3=A9i", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", ".<", ",,b,c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"\t1d.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t1d.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"1234567890123456789012334567890"}, false, 6, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1234567890123456789012334567890", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, 5, 6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"1.12345678901"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678901", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<d:0.75>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:jey>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("jey", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"1234567890124456789901234567890"}, false, 6, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "--\013", "1"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1234567890124456789901234567890", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"b "}, false, 6, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<b:false>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "1.5e300"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"\u00e9\t"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?\t", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "1", "00x1F"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http:/e/examplf.com/a?b;c", "OEbjsects of type UTF-8"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<null>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "1.25aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\u00ea\t"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", ".5\t"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 127]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"a-b,c"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a-b,c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"0xFFFFF"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "1.5", "\037y"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:pkP[ey>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "61", "-1-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("pkP[ey", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "Objects of type 0.5e300"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:pkPy>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("pkPy", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<sample:2>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2Lhttp://example.com/a?b=c", "Objsects of type UTF-8"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<sample:3>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 55, 70, 61, 48, 50, 61, 48, 51]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:plPey>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("plPey", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "10"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "1e10"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 127]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:pkP>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("pkP", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, 5, 6]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:kPpy>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kPpy", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:bn>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "true.5", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bn", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:pkPey>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("pkPey", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:qkkPey>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "1.1234567890123456"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("qkkPey", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:`>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "9"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[3, 4]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "Objsects of "}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<d:-42.5>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 55, 70, 61, 48, 50, 61, 48, 51]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 55, 70, 61, 48, 50, 61, 48, 51]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "1.5f300", "+1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"0x1FF"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "12:30:45", "1.1235567"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1FF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 52, 61, 48, 53, 61, 48, 54]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"\rUT"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "", "z\"a\":1}5."}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=0DUT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:i>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "http:/e/exxamplf.com/a?b=c", "2020-02-30T25:61:61"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"Htllo, World"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Htllo, World", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"L12:30:45"}, false, 3, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:1>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<s:a>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "1.1234567H890123456"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:kPeyO>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "6D1", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kPeyO", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "3b"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"UTF-8"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<sample:2>", "<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"Hello, World+"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "21\"474836<48/a/b", "\u00ea]"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "--1h"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World+", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"\rUTFT8010"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTFT8010", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"{\"a\":0~"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "o"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":0~", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<s:}>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"<a>b</d>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b</d>", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:kOey>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kOey", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"\u00e9\t"}, false, 3, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "/1234567"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"O0"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("O0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 6, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "1.5d1.12345678", ""}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 6, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "Hello, World0", "010"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<s:key>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1f10"}, false, 2, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.112340678", "Objects of type 1.1234567890123456"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "i"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"Tittle"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Tittle", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:qkPey>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("qkPey", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"null", "UTF-8"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http:/e/examplf.com/a?b;c", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 127]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "\nbjects of type 1.5e300"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "\0131L"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"http:/.exampl.com/a?b=c"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "a\u00e9 "}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, 5, 6]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:jey>"}, false, 4, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "{\"a\":1}<a>b</a>", "8"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("jey", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:1>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:koey>"}, false, 2, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", ".5214748 648", "123446789012345678901234567890"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "-0-/"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("koey", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<sample:0>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 127]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:L>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("L", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, 5, 6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"-Title"}, false, 6, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "1E-5", ":\u00e9\u00ea\t2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-Title", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:Pey>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:5>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Pey", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "P", "1.2513"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "[1,2]", "*0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Title", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"B\u00e9"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "0xFF[FEFFF"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<s:b/>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("B?", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"http://example.cAom/a?b=c1.123450678"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<b:true>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.cAom/a?b\ufffd.123450678", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[3, 4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:kPey>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 127]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:pkPey>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("pkPey", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "612", "E2020-02-30T25:61:61"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "h\"ttp:/e/examplf.com/a?b=c", "http://example.com/a?b=c61-1.5"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 55, 70, 61, 48, 50, 61, 48, 51]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 55, 70, 61, 48, 50, 61, 48, 51]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:plPey>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "\u00ea\t", "\n1.1234567890123456"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("plPey", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "1e00"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:kPy>"}, false, 4, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<s:b>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kPy", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a\037b", "UTF-8"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a\037b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:ke\u00e9y>"}, false, 2, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "3", "8 e"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ke=C3=A9y", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"326"}, false, 2, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<s:5aa>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("326", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "{\"`\":1}[1,2]"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<d:0.724>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 55, 70, 61, 48, 50, 61, 48, 51]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<s:+key3>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 127]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "/a/b"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:kPey>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:3>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kPey", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:pkPey>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<i:64>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "1e105."}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("pkPey", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:}kPey>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<s:b>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("}kPey", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:b b>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "202y-02-30x25:61:61"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "10e10"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, 5, 6]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, 5, 6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 6, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "*.1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:kPeAy>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kPeAy", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<sample:1>", "<sample:6>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 6, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "2020-/1-C1"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:kPey>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kPey", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:HL>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("HL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<sample:2>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 52, 61, 48, 53, 61, 48, 54]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "-,1Objects of type ", "\u00e9\tI"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", ",010", "11"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[3, 4]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:pkP{ey>"}, false, 2, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("pkP{ey", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 52, 61, 48, 53, 61, 48, 54]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<sample:3>", "<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:kPPey>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:,a>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kPPey", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:DpkPtey>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:pkEPeyE>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DpkPtey", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"13", "UTF-8"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 4, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "\0371.1234567890123456", "1.5d\t"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>b</a>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:ke[>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ke[", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "\u00e9Xu\u00ea\t"}, false, 3, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "1.25aaaaaaaaaaaaaaaaaaaaaoaaaaaaaaa", "123456789012345678901234567890Title"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:pklQey>"}, false, 2, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("pklQey", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "http://example.cpm/a1b=c61"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "2147-83648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "--10xFFFFFFF", "a,b,c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<null>", "<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:psPey>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<s:iey>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("psPey", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-0-01", "UTF-8"}, false, 2, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "1h5", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-0-01", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{">", "UTF-8"}, false, 1, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "Pbjsects of type TTF-8", "\t-1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"hutp", "UTF-8"}, false, 2, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "\u00e9."}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("hutp", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:3>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "atb"}, false, 1, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "1.25aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"--1", "UTF-8"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http:/e5examplf.com/a?b=b", "+1"}, false, 3, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "", "  "}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "htto://example.com/a?b"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 52, 61, 48, 53, 61, 48, 54]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://eexample.com/a?b=c", "Objects of type 1.5e300"}, false, 4, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "http:/e/examplf.com/a?b;cC1e10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\rUTF-80x123456789", "<null>"}, false, 6, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<d:-40.5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>b</a>http://example.com/a?b=c", "UTF-8"}, false, 2, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b</a>http://example.com/a?b=3Dc", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<sample:3>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 55, 70, 61, 48, 50, 61, 48, 51]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:L>"}, false, 2, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("L", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<empty>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 55, 70, 61, 48, 50, 61, 48, 51]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<sample:3>", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 52, 61, 48, 53, 61, 48, 54]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "Hemlo, Worl"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "1.12345678901234467"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:]>>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("]>", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "-0.1", "H"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[6, 7]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "<a>b</a>--1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "123456789012 45678L901234567890"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "2", "U"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 55, 70, 61, 48, 50, 61, 48, 51]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "\u00eai"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "91e10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 52, 61, 48, 53, 61, 48, 54]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
}
