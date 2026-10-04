package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"/00L"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:b>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/00L", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:B>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "null", "13"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("B", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"Helloo, WpO<rldTITMEObjects of type "}, false, 10, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<s:a>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "s00", "\u00e9.1234567"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Helloo, WpO<rldTITMEObjects of type=20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:b>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"1E-Ob\rjects of\037type "}, false, 3, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:iih>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:10>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:keyy>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "1.12345678", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("iih", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 3, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "/"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "<null>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{">1e10ai\tke"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">1e10ai\tke", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "a b"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<i:23>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "TITLE"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 9, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:0>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "\u00e9.1234567"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "1.25", "UTF->"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "<<8aUb<X/b\"=13", "\t"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1123456778http://example.com/a?b=c", "\n\\"}, false, 1, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<s:b>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"1O2345F7801234bc56789012346T7890123446789012347678901231.1349567890123456"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1O2345F7801234bc56789012346T7890123446789012347678901231.13495678901234=\r\n56", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"12345F7801234bc56789012346T7890123446789012347678901231.13[9567890123456-0.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12345F7801234bc56789012346T7890123446789012347678901231.13[9567890123456-=\r\n0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"211\r >56Dybb687T.]004ITE>{D{6fee77[<{B4x466694456U\n\n,+/9r6e[1<3\"2E\t]Q,lr116769;:"}, false, 4, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:2>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "PT1b\u00e9http://example.com/a?b=c", "2E02002-30T25:61:61"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("211=0D >56Dybb687T.]004ITE>{D{6fee77[<{B4x466694456U=0A=0A,+/9r6e[1<3\"2E=09=\r\n]Q,lr116769;:", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"211 >56Dybb66E7U.^004ITE\t{D{6fee77Z<|B4x4\u00e96683456U\n,+/9r6e1<2\"\u00e92E\t]Q,lr116769;:h"}, false, 4, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<d:-0.75>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("211 >56Dybb66E7U.^004ITE\t{D{6fee77Z<|B4x4=C3=A96683456U=0A,+/9r6e1<2\"=C3=A9=\r\n2E\t]Q,lr116769;:h", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 13, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 127]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"010Oajectsof sype "}, false, 9, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "1.5nuk3"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "9", "Hello, Wosld"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "61"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "62"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "6"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "5.", "0x1F"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:5>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Z1,2", ""}, false, 1, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:-58>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Z1,2", ""}, false, 1, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Z1,2", ""}, false, 12, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<sample:1>", "<sample:8>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 55, 61, 48, 56, 61, 48, 57]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"1.2512345678\u00e91123456789012345678900"}, false, 3, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:l>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"1/251234678\u00e91123456789012345678900"}, false, 4, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:l>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/251234678?1123456789012345678900", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"1/2512+4678\u00e91123456789012345678900"}, false, 4, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:l>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/2512+4678?1123456789012345678900", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"i"}, false, 4, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:l>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 4, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:l>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5f", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 4, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:l>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:5>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<empty>", "<sample:7>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<empty>", "<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<sample:2>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 55, 70, 61, 48, 50, 61, 48, 51]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<empty>", "<sample:11>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 65, 61, 48, 66, 61, 48, 67]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<empty>", "<sample:8>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 55, 61, 48, 56, 61, 48, 57]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<empty>", "<sample:9>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:-4>"}, false, 6, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:3>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<i:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 8, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:5>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:a>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 8, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:5>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:a>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 55, 70, 61, 48, 50, 61, 48, 51]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:5>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:a>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 55, 70, 61, 48, 50, 61, 48, 51]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:5>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:key>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:-14>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "1.1234567"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"aa1L"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aa1L", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"5"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"4"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/01Title60x1F", "PT1H"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<i:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, 5, 6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:8>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[7, 8, 9]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:9>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[8]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "1.1234567890123456"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678901234567", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "1.123456789023456", "32"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:23>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 52, 61, 48, 53, 61, 48, 54]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"/"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"/{\"a\":1}"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"/{\"a\":1}-1"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/{\"a\":1}-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<sample:3>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 52, 61, 48, 53, 61, 48, 54]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<sample:0>", "<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Z1,2", "73"}, false, 2, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, 5, 6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[6, 7]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:10>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[9]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[7, 8, 9]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:9>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[8]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:12>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[11]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:10>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[9]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<sample:0>", "<sample:10>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:T>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:.>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:X>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("X", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:C>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("C", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Z1,2", "/01"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TLE-0X.0aa`aaaaaaaaaaaaaaaaaaaaaaaaaaa", "Hello,  World1e\u00e910"}, false, 9, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "PT1H", "/00L"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "1.1234567"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<i:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"1-25"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<i:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1-25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 12, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<i:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678901234567", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"1.12355678901234567"}, false, 12, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<i:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12355678901234567", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"1.12355678901234567"}, false, 7, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<i:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 127]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[3, 4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[6, 7]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"1"}, false, 1, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "1.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"true", "1e10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+1", "1.1234567"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<null>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<null>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:4>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E-5", "true"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:0>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "010", "\u00e9"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("010", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"/010"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/010", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"/01"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/01", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"/01"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:b>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/01", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"/0"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:b>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"/00"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:b>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/00", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"/00L"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:b>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/00L", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"/00L"}, false, 7, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:b>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"00"}, false, 4, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:b>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("00", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<empty>", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 55, 61, 48, 56, 61, 48, 57]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<empty>", "<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 65, 61, 48, 66, 61, 48, 67]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "2020-01-01", "13"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "2020-01-01", "13"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<i:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 55, 61, 48, 56, 61, 48, 57]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", ".5", "1.5f"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 55, 70, 61, 48, 50, 61, 48, 51]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 55, 61, 48, 56, 61, 48, 57]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, 5, 6]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:k8df>"}, false, 6, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("k8df", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:k8d[f>"}, false, 6, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("k8d[f", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "PT1H"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT1H", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"QT1H61"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "PT1H"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("QT1H61", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"QT1H611.5e300"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "PT1H"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("QT1H611.5e300", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"QT1H611.5e301"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "PT1H"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("QT1H611.5e301", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"QT1H6115e301"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "PT1H"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("QT1H6115e301", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"QT1H615e301"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "PT1H"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("QT1H615e301", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"QT1H615e301123456789012345678901234567890"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "PT1H"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("QT1H615e301123456789012345678901234567890", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"QT1H715e301123456789012345678901234567890"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("QT1H715e301123456789012345678901234567890", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"QT1H715,e301123456789012345678901234567890"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("QT1H715,e301123456789012345678901234567890", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:23>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "\u00e9.1234567"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, 5, 6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[8]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "61", "\u00e9.1234567"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "1.123456789023456", "32"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 52, 61, 48, 53, 61, 48, 54]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 127]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<sample:1>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<null>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:8>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[7, 8, 9]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:12>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[11]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:B>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "null", "13"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("B", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:B[>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "null", "13"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("B[", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"1.12355678:01334567"}, false, 12, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:1>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "I", "/01"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<i:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12355678:01334567", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 12, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:1>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "I", "/01"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<i:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"41/r112\t\t567"}, false, 10, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:2>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "I", "/1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("41/r112\t\t567", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"41/X112\t\t567"}, false, 10, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:4>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "I", "/1"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("41/X112\t\t567", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"10"}, false, 10, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:4>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "I", "/1"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"true"}, false, 10, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:4>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "I", "/1"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"trud"}, false, 10, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:4>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "I", "/1"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("trud", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 11, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:4>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"Helloo, WpO<rldTITLEObjects of type!"}, false, 10, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<s:aD>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "s00", "\u00e9.1E+4567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Helloo, WpO<rldTITLEObjects of type!", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 10, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "s00", "\u00e9..1E+4567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFFFF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 10, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "s00", "\u00e9..1E+4567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b</a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"<>b</a>"}, false, 10, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "s00", "\u00e9..1E+4567"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<>b</a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"<>c</a>"}, false, 10, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "s00", "\u00e9..1E+4567"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<>c</a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"<>c</aa>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<>c</aa>", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"<>n</aa>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:-1048575>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<>n</aa>", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 52, 61, 48, 53, 61, 48, 54]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<sample:2>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 52, 61, 48, 53, 61, 48, 54]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<null>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 55, 70, 61, 48, 50, 61, 48, 51]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<empty>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 52, 61, 48, 53, 61, 48, 54]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:-ke>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-ke", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 9, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 9, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:5>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "9"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 9, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:5>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "9"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:10>"}, false, 2, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[9]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 127]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 2, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<sample:1>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 55, 70, 61, 48, 50, 61, 48, 51]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "TITLE"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 8, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "TITLE"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 9, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "TITLE"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "http://example.com/a?b=c", "s00"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "http://example.com/a?b=c", "s00"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"\na. 21574883648i"}, false, 6, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=0Aa. 21574883648i", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String"}, new String[]{"\na. 21564883648i"}, false, 6, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=0Aa. 21564883648i", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:33>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<<8aUb<X/b\"=13", ""}, false, 9, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "9", "--1"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "Z1,2", "+1"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 127]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<s:a>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:33>"}, false, 2, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "Objects of type ", "<a>b</a>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "Objects of type ", "<a>b</a>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 16, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "14"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:6>"}, false, 16, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "j4"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[5]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 16, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "j4"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:10>"}, false, 16, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "j4"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[9]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:8>"}, false, 16, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:8>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "j}"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[7, 8, 9]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:7>"}, false, 16, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[6, 7]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 10, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "Hello, World"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, 5, 6]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "<<8aUb<X/b\"=13", "null"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "1.5d", ""}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "I"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "9"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "<<8aUb<X/b\"=13", "null"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "J"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:iir>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:10>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:keyy>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "1.12345678", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("iir", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:b]>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b]", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 8, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2.124567", "-0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:2-o>"}, false, 10, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:13>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "13", "TITLE"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "9"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2-o", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:2-P>"}, false, 10, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:13>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "13", "TITLE"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "9"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2-P", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:2-P>"}, false, 10, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<b:true>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "13", "TITLE"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "9t"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2-P", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:2-P>"}, false, 10, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<b:true>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "13", "TITLE"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "9t"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2-P", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:2.P>"}, false, 10, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<b:true>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "13", "TITLE"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:-1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2.P", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:2.L>"}, false, 10, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<b:true>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:-1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2.L", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:43>"}, false, 10, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<b:true>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:-1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "1.12345678"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "/a/b"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:10>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[9]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[3, 4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"I"}, false, 6, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "1", "0x1F"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 55, 70, 61, 48, 50, 61, 48, 51]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "1.5", "73"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 55, 61, 48, 56, 61, 48, 57]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "1.5", "73"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 55, 61, 48, 56, 61, 48, 57]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"{.1134"}, false, 6, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "]1LTitle"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{.1134", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"{.11,4"}, false, 6, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "]1LTitle"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{.11,4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"{.11,410"}, false, 6, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "]1LTitle"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{.11,410", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"{.11,400"}, false, 14, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "]1LTitle"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{.11,400", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"0"}, false, 14, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "]1LTitle"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"00"}, false, 14, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "/", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("00", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"0f0"}, false, 14, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "/", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0f0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 14, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "/", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1F", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<empty>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "\n", "2020-02-30T25:61:61"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 11, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:5>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "\n", "2020-02-30T25:61:61"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:8>"}, false, 7, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 55, 61, 48, 56, 61, 48, 57]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[127, 2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, 5, 6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:10>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[9]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decodeQuotedPrintable", new String[]{"byte[]"}, new String[]{"<sample:11>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[11, 12]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:3333>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3333", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:33333>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("33333", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "--1", "2020-02-30T25:61:61"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:3,T>"}, false, 16, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<s:a>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3,T", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:,hT>"}, false, 16, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<s:a>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:16>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",hT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:,h:T>"}, false, 16, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<s:a>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:16>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",h:T", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:14>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 49, 48, 32, 64]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "s00"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 52, 61, 48, 53, 61, 48, 54]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "s00"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<s:b>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[6, 7]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:11>"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 65, 61, 48, 66, 61, 48, 67]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 14, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:1>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "1.12345678"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.Object", "<i:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 55, 70, 61, 48, 50, 61, 48, 51]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<null>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 52, 61, 48, 53, 61, 48, 54]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:1>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 55, 70, 61, 48, 50, 61, 48, 51]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<sample:6>", "<sample:14>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 49, 48, 61, 50, 48, 61, 52, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<sample:6>", "<sample:17>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 54, 52, 61, 70, 70, 61, 48, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encodeQuotedPrintable", new String[]{"java.util.BitSet", "byte[]"}, new String[]{"<sample:4>", "<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 15, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:5>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "1.5", "1.1234 689"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:}7MM>"}, false, 4, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "0x123456789"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("}7MM", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:}7-MM>"}, false, 12, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "0x123456789"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("}7-MM", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "\n"}, false, 4, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:1>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "Z1,2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "\n"}, false, 5, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String", "Z1,2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "decode", new String[]{"byte[]"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String,java.lang.String", "Hello, World", "P1G"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.String", "1L"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[7, 8, 9]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:kdy>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kdy", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-0.0", "UTF-8"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".5", "UTF-8"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-0.0", "UTF-8"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-0.0", "UTF-8"}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-0.x0", "UTF-8"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.x0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-0x0", "UTF-8"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0x0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-0\u00e90", "UTF-8"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0=C3=A90", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-0\u00e90", "UTF-8"}, false, 1, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "i", "\n"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0=C3=A90", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-0\u00e90", "UTF-8"}, false, 1, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "java.lang.String,java.lang.String", "i", "\n"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0=C3=A90", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 65, 61, 48, 66, 61, 48, 67]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<empty>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 55, 61, 48, 56, 61, 48, 57]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=UTF-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.net.QuotedPrintableCodec", "org.apache.commons.codec.net.QuotedPrintableCodec", "encode", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.codec.net.QuotedPrintableCodec", "encode", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "getDefaultCharset", ""}, {"org.apache.commons.codec.net.QuotedPrintableCodec", "decode", "byte[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[61, 48, 52, 61, 48, 53, 61, 48, 54]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultCharset=}", SearchInputFactory_scaffolding.receiverState());
 }
}
