package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"--1: TITLE"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 45, 0, 45, 0, 49, 0, 58, 0, 32, 0, 84, 0, 73, 0, 84, 0, 76, 0, 69]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"nul\u00e9"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[110, 0, 117, 0, 108, 0, -23, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u027f\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{" "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=1 cap=1] {get=32, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnderflowException, getLon...#333#-400164988", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf8", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"1].25"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 93, 46, 50, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUnchecked", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\t"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[50, 48, 50, 48, 45, 48, 50, 45, 51, 48, 84, 50, 53, 58, 54, 49, 58, 54, 49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "equals", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:>", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Be", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newString", new String[]{"byte[]", "java.lang.String"}, new String[]{"<null>", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newString", new String[]{"byte[]", "java.lang.String"}, new String[]{"<sample:2>", "12345678901234567901234467890"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "equals", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:abc>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "equals", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<null>", "<s:abc>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUnchecked", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "--"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "equals", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<null>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUnchecked", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-:2.5", "L1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 58, 50, 46, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newString", new String[]{"byte[]", "java.lang.String"}, new String[]{"<empty>", "L1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"2020-01-01abc"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[50, 0, 48, 0, 50, 0, 48, 0, 45, 0, 48, 0, 49, 0, 45, 0, 48, 0, 49, 0, 97, 0, 98, 0, 99, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1.1234567"}, true, 0, null, 3), new String[][]{{"asDoubleBuffer", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.nio.ByteBufferAsDoubleBufferB", actual.getClass().getName());
  assertEquals("java.nio.ByteBufferAsDoubleBufferB[pos=0 lim=4 cap=4] {get=1.2217638442043777E161, hasArray=false, hasRemaining=true, isDirect=false, isReadOnly=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUnchecked", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"tsuf", "15123456789012345678901234567890\n"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "equals", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:a0>", "<s:>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"nul\u00e9aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[110, 0, 117, 0, 108, 0, -23, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0,...#242#1250681380", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"TITLE"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[84, 0, 73, 0, 84, 0, 76, 0, 69, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"---1: TITLE"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 45, 45, 49, 58, 32, 84, 73, 84, 76, 69]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"1.12345677"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 46, 49, 50, 51, 52, 53, 54, 55, 55]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUnchecked", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-02-30T25:61:61null", "TITLE"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newString", new String[]{"byte[]", "java.lang.String"}, new String[]{"<sample:2>", "11E-5f"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[91, 49, 44, 50, 93]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"TIUE"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[84, 73, 85, 69]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"1.113456"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 46, 49, 49, 51, 52, 53, 54]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"1]725"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 49, 0, 93, 0, 55, 0, 50, 0, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "equals", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:0>", "<s:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"\037"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[31]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"11L"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 49, 76]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 46, 49, 50, 51, 52, 53, 54, 55]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"aaaaaaaa"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 97, 97, 97, 97, 97, 97, 97]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u0403", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00ff", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "equals", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:1>", "<s:abc:>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"_"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[95]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 49, 0, 50, 0, 51, 0, 52, 0, 53, 0, 54, 0, 55, 0, 56, 0, 57, 0, 48, 0, 49, 0, 50, 0, 51, 0, 52, 0, 53, 0, 54, 0, 55, 0, 56, 0, 57, 0, 48, 0, 49, 0, 50, 0, 51, 0, 52, 0, 53, 0, 54, 0, 55, 0,...#218#2011468756", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"+1-"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[43, 49, 45]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"."}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 46]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c010"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[104, 0, 116, 0, 116, 0, 112, 0, 58, 0, 47, 0, 47, 0, 101, 0, 120, 0, 97, 0, 109, 0, 112, 0, 108, 0, 101, 0, 46, 0, 99, 0, 111, 0, 109, 0, 47, 0, 97, 0, 63, 0, 98, 0, 61, 0, 99, 0, 48, 0, 49, 0, 48, 0...#201#-1020954256", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u027f\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{"15"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=2 cap=2] {get=49, getChar=!BufferUnderflowException, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnderflowException, getLon...#332#-1885700413", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3), new String[][]{{"array", "", "7"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"a12345678901234567901234467890"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 57, 48, 49, 50, 51, 52, 52, 54, 55, 56, 57, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUnchecked", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ""}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"aab"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 97, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1), new String[][]{{"remaining", "", "6"}, {"putShort", "int,short", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"9-u1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[57, 45, 117, 49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"--1: TTLE"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 45, 49, 58, 32, 84, 84, 76, 69]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"012345678901234567901244467890"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 57, 48, 49, 50, 52, 52, 52, 54, 55, 56, 57, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"1.E5d"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 49, 0, 46, 0, 69, 0, 53, 0, 100]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaai"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 105]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"/"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"`aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[96, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"/ta/b"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47, 116, 97, 47, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"11"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{"aaa`aaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 1), new String[][]{{"getChar", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\u6161", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"--1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 45, 49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"0.5e30"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 46, 53, 101, 51, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"[1,2]1L"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[91, 49, 44, 50, 93, 49, 76]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, ...#210#-436635498", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{"--2: TTLE"}, true, 0, null, 1), new String[][]{{"hasRemaining", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"15"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1), new String[][]{{"putLong", "long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"\n"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"1.252020-01-01"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 49, 0, 46, 0, 50, 0, 53, 0, 50, 0, 48, 0, 50, 0, 48, 0, 45, 0, 48, 0, 49, 0, 45, 0, 48, 0, 49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"\ta>b<0a>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[9, 97, 62, 98, 60, 48, 97, 62]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"Titl;e0x123456789"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[84, 105, 116, 108, 59, 101, 48, 120, 49, 50, 51, 52, 53, 54, 55, 56, 57]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u7f02\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"0x123466789"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 120, 49, 50, 51, 52, 54, 54, 55, 56, 57]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "equals", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:a>", "<s:b>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newString", new String[]{"byte[]", "java.lang.String"}, new String[]{"<null>", "PT2Hnul\u00e9"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"6-"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[54, 45]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"b"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"+1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[43, 49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa<a>b</a>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 60, 97, 62, 98, 60, 47, 97, 62]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"-8-1"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 0, 56, 0, 45, 0, 49, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"15"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 49, 0, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{"1.12345671.1234567"}, true);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=18 cap=18] {get=49, getChar=\u2e31, getDouble=7.12313610424185E-67, getFloat=2.5931515E-9, getInt=!BufferUnderflowException, getLong=!BufferUnderflowException, getShort=13...#272#692402191", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf8", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"/a/b0xFFFFFFFF"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 47, 0, 97, 0, 47, 0, 98, 0, 48, 0, 120, 0, 70, 0, 70, 0, 70, 0, 70, 0, 70, 0, 70, 0, 70, 0, 70]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u0403", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"Hello,bWorld"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[72, 0, 101, 0, 108, 0, 108, 0, 111, 0, 44, 0, 98, 0, 87, 0, 111, 0, 114, 0, 108, 0, 100, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"-1."}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 0, 49, 0, 46, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"nul\u00e9"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 110, 0, 117, 0, 108, 0, -23]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf8", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"-."}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 46]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 104, 0, 116, 0, 116, 0, 112, 0, 58, 0, 47, 0, 47, 0, 101, 0, 120, 0, 97, 0, 109, 0, 112, 0, 108, 0, 101, 0, 46, 0, 99, 0, 111, 0, 109, 0, 47, 0, 97, 0, 63, 0, 98, 0, 61, 0, 99]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{"nnul\u00e9"}, true), new String[][]{{"hasRemaining", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\004\005\006", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{"1.12345778901234B56"}, true), new String[][]{{"get", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("50", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"a"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"Title"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 84, 0, 105, 0, 116, 0, 108, 0, 101]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{" "}, true), new String[][]{{"compareTo", "java.nio.ByteBuffer", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("33", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"Tjtle"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[84, 106, 116, 108, 101]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{"]"}, true), new String[][]{{"getFloat", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{"`"}, true), new String[][]{{"putInt", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.BufferOverflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"15"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"1E-5+"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 0, 69, 0, 45, 0, 53, 0, 43, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"@"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[64]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"1.2abc"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 49, 0, 46, 0, 50, 0, 97, 0, 98, 0, 99]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"PT1H1LHello, World"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 80, 0, 84, 0, 49, 0, 72, 0, 49, 0, 76, 0, 72, 0, 101, 0, 108, 0, 108, 0, 111, 0, 44, 0, 32, 0, 87, 0, 111, 0, 114, 0, 108, 0, 100]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "equals", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:aA>", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"-1/512:30:45"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 49, 47, 53, 49, 50, 58, 51, 48, 58, 52, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"-000"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 0, 48, 0, 48, 0, 48, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"2147483648Hello, World0xFFFFFFFF"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 50, 0, 49, 0, 52, 0, 55, 0, 52, 0, 56, 0, 51, 0, 54, 0, 52, 0, 56, 0, 72, 0, 101, 0, 108, 0, 108, 0, 111, 0, 44, 0, 32, 0, 87, 0, 111, 0, 114, 0, 108, 0, 100, 0, 48, 0, 120, 0, 70, 0, 70, ...#241#1237914009", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"nullTtle"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[110, 117, 108, 108, 84, 116, 108, 101]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"a\t"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 9]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"1.123456780x123456789"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 46, 49, 50, 51, 52, 53, 54, 55, 56, 48, 120, 49, 50, 51, 52, 53, 54, 55, 56, 57]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u7f02\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{" 1.5e300"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[32, 49, 46, 53, 101, 51, 48, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"12;30:45"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 49, 0, 50, 0, 59, 0, 51, 0, 48, 0, 58, 0, 52, 0, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"1E-"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 69, 45]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"ab"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"25I"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[50, 53, 73]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"1e10"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 101, 49, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, ...#210#-436635498", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true), new String[][]{{"get", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("49", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"55."}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[53, 53, 46]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"nuulh"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[110, 117, 117, 108, 104]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u0405\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{" 123456789012345678901234567890"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[32, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf8", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUnchecked", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"21", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Be", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u7f02\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"-81"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 45, 0, 56, 0, 49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"5"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaabaaaaaa"}, true), new String[][]{{"get", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"15"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 46, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Be", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"1.c"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 0, 46, 0, 99, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00ff", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"  1E-5"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[32, 32, 49, 69, 45, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"I{\"a\":1}0x123456789"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[73, 123, 34, 97, 34, 58, 49, 125, 48, 120, 49, 50, 51, 52, 53, 54, 55, 56, 57]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"abbc"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 98, 98, 99]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u0607", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Be", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u0405\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"C"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 67]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"nul\u00e91.1234567890123456"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 110, 0, 117, 0, 108, 0, -23, 0, 49, 0, 46, 0, 49, 0, 50, 0, 51, 0, 52, 0, 53, 0, 54, 0, 55, 0, 56, 0, 57, 0, 48, 0, 49, 0, 50, 0, 51, 0, 52, 0, 53, 0, 54]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{" \nnul\u00e9"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 32, 0, 10, 0, 110, 0, 117, 0, 108, 0, -23]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"11.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 49, 46, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"1]-25"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 93, 45, 50, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u7f00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"<a>b</a>nul\u00e9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[60, 97, 62, 98, 60, 47, 97, 62, 110, 117, 108, -23]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"p-"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 112, 0, 45]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{".25"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[46, 50, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{"21].25"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.nio.HeapByteBuffer", actual.getClass().getName());
  assertEquals("java.nio.HeapByteBuffer[pos=0 lim=6 cap=6] {get=50, getChar=\u315d, getDouble=!BufferUnderflowException, getFloat=!BufferUnderflowException, getInt=!BufferUnderflowException, getLong=!BufferUnderflowExcept...#288#918075916", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\007\010\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"nul1.25"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 110, 0, 117, 0, 108, 0, 49, 0, 46, 0, 50, 0, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"15"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"QT1H"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 81, 0, 84, 0, 49, 0, 72]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{"{\"a\":31}"}, true, 0, null, 2), new String[][]{{"reset", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.InvalidMarkException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"\0370"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[31, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"0FFFFFFFF-1.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 70, 70, 70, 70, 70, 70, 70, 70, 45, 49, 46, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"-"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 45]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 47, 0, 97, 0, 47, 0, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{"12345678901234567901234467890010"}, true, 0, null, 2), new String[][]{{"getLong", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3834312847369711922", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"UITrLE"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[85, 73, 84, 114, 76, 69]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"\013"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 11]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"0x1234456789"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 0, 120, 0, 49, 0, 50, 0, 51, 0, 52, 0, 52, 0, 53, 0, 54, 0, 55, 0, 56, 0, 57, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"0x1F"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 48, 0, 120, 0, 49, 0, 70]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:610x123456789"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[50, 48, 50, 48, 45, 48, 50, 45, 51, 48, 84, 50, 53, 58, 54, 49, 58, 54, 49, 48, 120, 49, 50, 51, 52, 53, 54, 55, 56, 57]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"<a>b;/a>Hello, World"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 60, 0, 97, 0, 62, 0, 98, 0, 59, 0, 47, 0, 97, 0, 62, 0, 72, 0, 101, 0, 108, 0, 108, 0, 111, 0, 44, 0, 32, 0, 87, 0, 111, 0, 114, 0, 108, 0, 100]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{".-1: TITLE"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[46, 45, 49, 58, 32, 84, 73, 84, 76, 69]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf8", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{"-}1: TITLE"}, true, 0, null, 1), new String[][]{{"getLong", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3277830229515848020", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"Titme"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[84, 105, 116, 109, 101]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"8x1F"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[56, 120, 49, 70]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"-1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Be", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[91, 49, 44, 50, 93]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"1E-C9"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 69, 45, 67, 57]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"PxH"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[80, 120, 72]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"uml"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[117, 109, 108]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Be", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"I"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[73, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{"+1"}, true, 0, null, 3), new String[][]{{"getShort", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{".6"}, true, 0, null, 2), new String[][]{{"getFloat", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaabaaaaaaa"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 98, 0, 97, 0, 97, 0, 97, 0,...#225#429391912", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"1E-5<a>b</a>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 69, 45, 53, 60, 97, 62, 98, 60, 47, 97, 62]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"\t"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[9]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf8", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaa:aaaaaaaaaaaaaaa"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 58, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, ...#224#-447615525", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u7f02\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"0.5e\t00"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 0, 46, 0, 53, 0, 101, 0, 9, 0, 48, 0, 48, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Be", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"1/5e300\n"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 47, 53, 101, 51, 48, 48, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"<a>b</a>0xFFFFFFFF0xFFFFFFFF"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 60, 0, 97, 0, 62, 0, 98, 0, 60, 0, 47, 0, 97, 0, 62, 0, 48, 0, 120, 0, 70, 0, 70, 0, 70, 0, 70, 0, 70, 0, 70, 0, 70, 0, 70, 0, 48, 0, 120, 0, 70, 0, 70, 0, 70, 0, 70, 0, 70, 0, 70, 0, 70, ...#206#-183886729", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"1].2_"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 93, 46, 50, 95]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\004\005\006", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"nl\u00e9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 110, 0, 108, 0, -23]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "equals", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:>", "<s:>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"Titl1.12345678"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[84, 105, 116, 108, 49, 46, 49, 50, 51, 52, 53, 54, 55, 56]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"0xF.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 120, 70, 46, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"A Title"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 32, 84, 105, 116, 108, 101]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"r<--1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[114, 60, 45, 45, 49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaa`aaaaaaaaaaa0xFFFFFFFF"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 96, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97,...#281#268587326", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Be", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00ff", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{"nul\u00e90x123456789"}, true, 0, null, 2), new String[][]{{"alignmentOffset", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"1M"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 77]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"-1: TITLD"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 45, 0, 49, 0, 58, 0, 32, 0, 84, 0, 73, 0, 84, 0, 76, 0, 68]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"1e0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 101, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"[1:2]"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 91, 0, 49, 0, 58, 0, 50, 0, 93]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{"1.12345679"}, true, 0, null, 2), new String[][]{{"get", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("49", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\003\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Be", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"PT1H"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 80, 0, 84, 0, 49, 0, 72]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf8", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"I: "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 73, 0, 58, 0, 32]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Be", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u7f02\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newString", new String[]{"byte[]", "java.lang.String"}, new String[]{"<sample:0>", "TITLE"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Be", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"2"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[50, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"\u00ea"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, -22]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"J"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[74]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf8", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{"/`/b0xFFFFFFFF"}, true, 0, null, 2), new String[][]{{"put", "int,byte", "3"}, {"getFloat", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.1840265E-10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"15: Title"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 53, 58, 32, 84, 105, 116, 108, 101]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[105, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"+1<a>b</a>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[43, 0, 49, 0, 60, 0, 97, 0, 62, 0, 98, 0, 60, 0, 47, 0, 97, 0, 62, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaabaaaaaaaaa"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 98, 97, 97, 97, 97, 97, 97, 97, 97, 97]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61aaaaaaaaa:aaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 50, 0, 48, 0, 50, 0, 48, 0, 45, 0, 48, 0, 50, 0, 45, 0, 51, 0, 48, 0, 84, 0, 50, 0, 53, 0, 58, 0, 54, 0, 49, 0, 58, 0, 54, 0, 49, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, 97, 0, ...#357#-1097544845", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\004\005\006", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"/b"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 47, 0, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 0, 120, 0, 70, 0, 70, 0, 70, 0, 70, 0, 70, 0, 70, 0, 70, 0, 70, 0, 62, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"Helln, World1.5f"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 72, 0, 101, 0, 108, 0, 108, 0, 110, 0, 44, 0, 32, 0, 87, 0, 111, 0, 114, 0, 108, 0, 100, 0, 49, 0, 46, 0, 53, 0, 102]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"--1: TITLE1.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 45, 0, 45, 0, 49, 0, 58, 0, 32, 0, 84, 0, 73, 0, 84, 0, 76, 0, 69, 0, 49, 0, 46, 0, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\004\005\006", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"1.12355678901234567i"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 46, 49, 50, 51, 53, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 105]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Be", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u027f\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{" \u00ea"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 32, 0, -22]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getByteBufferUtf8", new String[]{"java.lang.String"}, new String[]{"1]].251.5f"}, true, 0, null, 3), new String[][]{{"mismatch", "java.nio.ByteBuffer", "6"}, {"hasRemaining", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
}
