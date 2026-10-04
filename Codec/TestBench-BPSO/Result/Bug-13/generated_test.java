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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUnchecked", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.Y123456780123456", "CK"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "CBESAS"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf8", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"5."}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 53, 0, 46]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"0x1234566789CH"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 120, 49, 50, 51, 52, 53, 54, 54, 55, 56, 57, 67, 72]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\003\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.CharSequenceUtils", "org.apache.commons.codec.binary.CharSequenceUtils", "regionMatches", new String[]{"java.lang.CharSequence", "boolean", "int", "java.lang.CharSequence", "int", "int"}, new String[]{"<s:>", "false", "-30", "<s:\n>", "2147483647", "-7"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"CAE"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[67, 65, 69]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"C"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[67, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{" ", "truue", "true"}, false, 7, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Be", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u0304", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"PTT1H", "false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newString", new String[]{"byte[]", "java.lang.String"}, new String[]{"<null>", "1.24"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newString", new String[]{"byte[]", "java.lang.String"}, new String[]{"<sample:3>", "CC1.1234578"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.Object", "<s:bb>"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "TIM< ", "1.1234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "charAt", new String[]{"java.lang.String", "int"}, new String[]{"1Lbnull", "0"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "i-1CI", "CH", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", " "}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "Hello, Workd", "j", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TIITME ", "DD"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.CharSequenceUtils", "org.apache.commons.codec.binary.CharSequenceUtils", "regionMatches", new String[]{"java.lang.CharSequence", "boolean", "int", "java.lang.CharSequence", "int", "int"}, new String[]{"<null>", "false", "112", "<s:\n>", "2147483647", "39"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "charAt", new String[]{"java.lang.String", "int"}, new String[]{"D0.0 C", "1024"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "PS1HTISLE"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CZ1.12345678901234562020-02-30T25:61:61", "CI", "false"}, false, 6, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String,boolean", "EZ3", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DIA", "Title ", "false"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "-11.25", "CGI", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String,boolean", "CH--1", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"x1", "CL-1", "false"}, false, 5, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "DCE"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "charAt", new String[]{"java.lang.String", "int"}, new String[]{"\016IE", "-7"}, false, 3, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "0xxFFFFXFFF CH", "020"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"E214743648", "PTTH", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.CharSequenceUtils", "org.apache.commons.codec.binary.CharSequenceUtils", "regionMatches", new String[]{"java.lang.CharSequence", "boolean", "int", "java.lang.CharSequence", "int", "int"}, new String[]{"<s:\n7>", "true", "0", "<null>", "2147483647", "-4"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "charAt", new String[]{"java.lang.String", "int"}, new String[]{"CKCIE", "-2147483648"}, false, 1, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "\nPTH"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "charAt", new String[]{"java.lang.String", "int"}, new String[]{"1.I24CIE", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", " ZCZ"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"1M", "trvuue", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"201L", "PSHITLE", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"D.0 C"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "5--1WICZtrue", "CJJE"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"", "", "true"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "DEX", "TITLE "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"Hello, Wo", "h", "false"}, false, 4, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.Object", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"i-1CH", "3C5.1e10a", "false"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "aj"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"TITME ", "Hello, W", "false"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "C5ESAT", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"+1", "DCFCIE", "false"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "DG"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"1.134567", "Hello,AWorld", "false"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "TITLE ", "WCCH", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"SnITME ZCI0xFFFFFFFF", ".52147483648", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf8", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"-2"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "CCIA"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DGI", "2CAAESAR", "true"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"71303161"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "+1PPT1H"}, {"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "56"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=71303161}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "charAt", new String[]{"java.lang.String", "int"}, new String[]{"x41", "0"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String,boolean", "C5ESATCH", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("x", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"abc C", "true"}, false, 3, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "CKCIE", ""}, {"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "71303188"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("APK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=71303188}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"010", "CHIA", "true"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"HCPH", "DC", "true"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"i-1", "CHtruetrue", "false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"WHCZCH", "WICZCH", "false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"WICZH+1", "1.123H567791123456", "false"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"Hello, Workd", "OGGI", "true"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CQQQ", "SITME BI0xFFFFFFFF", "true"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"010", " GH", "true"}, false, 7, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "2.1234567", "DCF", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"KWICZCH", "CSIA", "true"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{" EGH", "13:30:45", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{"1.5fnull"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "Hello, Wrld", "null121474483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FNL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUnchecked", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "OSHITE"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"aW"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "CAESAR--1"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "CZ1.12345678901234562020-02-30T25:6", "1.22345678901234561E-5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"1.1234567890123456", "WISZ", "false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"123456789012245678901234567890", "CAESCH1L", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:`>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "null1", "WICZCH", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"WITZ", "c", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.CharSequenceUtils", "org.apache.commons.codec.binary.CharSequenceUtils", "regionMatches", new String[]{"java.lang.CharSequence", "boolean", "int", "java.lang.CharSequence", "int", "int"}, new String[]{"<s:\n7>", "true", "0", "<null>", "46", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{"1.1e34567890123456"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CZ1.1234567890123456200-02-30T25:61:61CG Q", "CACH1L", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"CBESASCCIB", "false"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "GGI", "BQ", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "CHH", "536870951"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KPSS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"-0l02020-02-30T25:61:61", "5TIM< ", "true"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CGGYI", " G", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"aja", "ajCZ", "true"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "DCE1.25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CrrK0xF", "Gello, Workd0xGFFFFFFF", "true"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "1024"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CrrK0x1F", "1.12345678901234567CZ", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=1024}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"SCTIGH", "1", "true"}, false, 4, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.Object", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CSJGH", "CCIGH", "true"}, false, 1, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CEG", "acCI", "false"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", ".CIGH", "2147483623"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CAESSASCI", "CIGn", "false"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.Object", "<s:keGy>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{" DEGH"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CWAECH 1L", "T1L`nnull", "false"}, false, 1, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "78"}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String,boolean", "CrrK0x1G", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=78}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"BUIGH", ""}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"B\rUIGH", "false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"TJTME I", "CSIACZ", "true"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.Object", "<s:kel>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"Gello, WWorkd", ";1.5CK", "false"}, false, 4, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "GYI", "CC1.1234570", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "DCFCIE", "123456789012345678901234567890CY", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"OHG1", "rvvuue", "false"}, false, 3, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"ajaCIA", "DEH", "false"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "r5--1WfCZ", "GHITE", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"CGFIWICZ", "KGn3"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "CZ1.123456789012"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"TITME CI: 4CIA", "DACHe1L", "true"}, false, 4, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "1.123H567791223456", "CTIGH", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "22"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"WCCCr"}, false, 4, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "SITME BI0xFFFFFFFF-0.0"}, {"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "95"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KKR", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=95}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CrrKJ", "\nIGnTitlei", "true"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.Object", "<s:>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CAESSASCI", "2:1L", "true"}, false, 4, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.Object", "<s:kerGy>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{"BUIGH"}, false, 2, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "Gello, Workd0xFFFFFFFF", "\nIGnTitkei", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "-8069"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"TIMM<!"}, false, 4, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "SCHHTITLE"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TM", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"1.12355678911234562147483648", "OTHITETitle", "false"}, false, 3, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "WCCHu"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "Y1", "TJT<E I", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"-1073741824"}, false, 6, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "9L", "SCHHTHTLE", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=-1073741824}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"WICZZiCH-1", "QSSHITLEE", "false"}, false, 3, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "uCrrKK", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"98"}, false, 4, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "TJTME CI", "2147483647"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "DGI", "CGGLI1.5d"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=98}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"ajo2147483648", "OSHITECIA", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"BK"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUnchecked", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2CAESRCG", "CIE"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "-2147483648"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", ":", "1.1234567F8901234567", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"C9KQ"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[67, 57, 75, 81]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"2020-01-01023456789012345678901234567890CH"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("X", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUnchecked", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TITLE", "trueCZ"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "contains", new String[]{"java.lang.String", "int", "int", "java.lang.String[]"}, new String[]{" ", "2147483647", "2147483647", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.CharSequenceUtils", "org.apache.commons.codec.binary.CharSequenceUtils", "regionMatches", new String[]{"java.lang.CharSequence", "boolean", "int", "java.lang.CharSequence", "int", "int"}, new String[]{"<s:d>", "false", "0", "<s:\n >", "2147483647", "52"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "equals", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:ac>", "<s:Y>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "contains", new String[]{"java.lang.String", "int", "int", "java.lang.String[]"}, new String[]{"1-5d", "-1", "-2147483616", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUnchecked", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"CFo", "CZ1.12e4567890123456"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 50, 58, 51, 48, 58, 52, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "charAt", new String[]{"java.lang.String", "int"}, new String[]{"  C4", "1073741823"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "equals", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:\nD>", "<s:  >"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"2CAESAARCI"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[50, 67, 65, 69, 83, 65, 65, 82, 67, 73]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"1.2234567-90123456", "K", "true"}, false, 7, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newString", new String[]{"byte[]", "java.lang.String"}, new String[]{"<null>", "CK-1"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{"2020-01-01123456789012345678901234567890C"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"BK"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 66, 0, 75]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"ab5c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 98, 53, 99]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "-1.5", ":f", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "charAt", new String[]{"java.lang.String", "int"}, new String[]{"", "-2"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "contains", new String[]{"java.lang.String", "int", "int", "java.lang.String[]"}, new String[]{"CJE", "1", "-2147483648", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"30"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=30}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "contains", new String[]{"java.lang.String", "int", "int", "java.lang.String[]"}, new String[]{"CYCI", "-7", "0", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"2021-01-01"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[50, 48, 50, 49, 45, 48, 49, 45, 48, 49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"12:30:4B"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 50, 58, 51, 48, 58, 52, 66]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"j"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[106]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "CZ"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\003\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "charAt", new String[]{"java.lang.String", "int"}, new String[]{"CE+1", "0"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("C", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"\rIEi", " ", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"112345678"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 49, 0, 49, 0, 50, 0, 51, 0, 52, 0, 53, 0, 54, 0, 55, 0, 56]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"", "true"}, false, 6, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"-30"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=-30}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"+0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[43, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"CZ"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[67, 90]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"2Lbnull"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("LPNL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"TITME "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 84, 0, 73, 0, 84, 0, 77, 0, 69, 0, 32]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"2E"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 50, 0, 69]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"i0", "CZ1.12345678901123456", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String,boolean", "IA", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"3020-01-01"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[51, 48, 50, 48, 45, 48, 49, 45, 48, 49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.CharSequenceUtils", "org.apache.commons.codec.binary.CharSequenceUtils", "regionMatches", new String[]{"java.lang.CharSequence", "boolean", "int", "java.lang.CharSequence", "int", "int"}, new String[]{"<s:>", "true", "-31", "<s:0>", "1", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Be", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"i-1CIC+1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[105, 45, 49, 67, 73, 67, 43, 49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"HCH"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[72, 67, 72]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"-3"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "TIITME "}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=-3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"D0.0 C1.25"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[68, 48, 46, 48, 32, 67, 49, 46, 50, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"1024"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=1024}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"C"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[67]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{"1x123456789"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"1Lanul: CE", "false"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("LNLS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"CIO.5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 67, 0, 73, 0, 79, 0, 46, 0, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"CIP.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[67, 73, 80, 46, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"0xFFFFXFFF "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 120, 70, 70, 70, 70, 88, 70, 70, 70, 32]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"Hello,A"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[72, 101, 108, 108, 111, 44, 65]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "charAt", new String[]{"java.lang.String", "int"}, new String[]{"", "0"}, false, 2, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "-36"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=-36}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"E0L"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[69, 48, 76]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 120, 49, 50, 51, 52, 53, 54, 55, 56, 57]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"2020-071-01023456789012345678901234567890CH"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[50, 48, 50, 48, 45, 48, 55, 49, 45, 48, 49, 48, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 67, 72]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"3C5."}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[51, 67, 53, 46]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{"i-1CIa"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "contains", new String[]{"java.lang.String", "int", "int", "java.lang.String[]"}, new String[]{"+R", "2147483647", "-2147483642", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{"TITLE "}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CIO.5", "CE", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TTL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"26"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "2CAESAR"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=26}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "equals", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:>", "<s:a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "charAt", new String[]{"java.lang.String", "int"}, new String[]{"010", "-60"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String,boolean", "trueCIO", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.CharSequenceUtils", "org.apache.commons.codec.binary.CharSequenceUtils", "regionMatches", new String[]{"java.lang.CharSequence", "boolean", "int", "java.lang.CharSequence", "int", "int"}, new String[]{"<s:abc>", "false", "10", "<s:>", "68", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"trueCO"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 116, 0, 114, 0, 117, 0, 101, 0, 67, 0, 79]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-01-01123456789012345678901234567890", "2020-01-01"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"+2E", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"CIA"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("S", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"Hel7lo, World"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[72, 101, 108, 55, 108, 111, 44, 32, 87, 111, 114, 108, 100]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"t"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[116]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"0x1234567894", "true"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String,boolean", "1Lanull", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "2020-01-01123456789012345678901234567890"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "D", "TITME "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 5, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "2C"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{"truue123456749012345678901234567890"}, false, 5, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.Object", "<d:1.439>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TR", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"1.Y123456c80123456", "1.Y123456780123466", "true"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "524258"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=524258}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567CIE"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 46, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 67, 73, 69]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"CAESAR"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 67, 0, 65, 0, 69, 0, 83, 0, 65, 0, 82]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf8", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:bd>"}, false, 4, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "1.2234567890123456"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"TITME CI"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "CZ1.1234567890123456"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TTMS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 120, 49, 50, 51, 52, 53, 54, 55, 56, 57]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 3, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "26"}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "00TITLE"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=26}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 3, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{"1.5f7"}, false, 1, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Be", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"1.2234567890123456abc"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"CZ1.1234567890113456"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[67, 90, 49, 46, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 49, 51, 52, 53, 54]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"+1CGi"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 43, 0, 49, 0, 67, 0, 71, 0, 105]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"1-.25"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 0, 45, 0, 46, 0, 50, 0, 53, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"E", "false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"26"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String,boolean", "PT1H", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=26}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"4194314"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=4194314}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"5."}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[53, 46]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"HaK"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 72, 0, 97, 0, 75]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "equals", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:\nE>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"-53"}, false, 4, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "6G12:30:45", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=-53}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"2020-01-010234Y6889012345678901234567890CH"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[50, 0, 48, 0, 50, 0, 48, 0, 45, 0, 48, 0, 49, 0, 45, 0, 48, 0, 49, 0, 48, 0, 50, 0, 51, 0, 52, 0, 89, 0, 54, 0, 56, 0, 56, 0, 57, 0, 48, 0, 49, 0, 50, 0, 51, 0, 52, 0, 53, 0, 54, 0, 55, 0, 56, 0, 57,...#294#-2091736912", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "contains", new String[]{"java.lang.String", "int", "int", "java.lang.String[]"}, new String[]{"K-1.5", "2147467263", "2147483647", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{",CIO.5"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[44, 67, 73, 79, 46, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"CAECH"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 67, 0, 65, 0, 69, 0, 67, 0, 72]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "charAt", new String[]{"java.lang.String", "int"}, new String[]{"0", "-2147483648"}, false, 5, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "PS1HTITLE", "3C5.", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u7f02\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:b7>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"KH"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[75, 72]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "charAt", new String[]{"java.lang.String", "int"}, new String[]{"\rIE", "0"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "i-1", "CK-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\r", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{" Q1E-5"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", " G"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "charAt", new String[]{"java.lang.String", "int"}, new String[]{"  Q", "0"}, false, 7, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "C", "TIQLE"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"3C5.1e10"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[51, 67, 53, 46, 49, 101, 49, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CX1L", "TJTME CI G", "false"}, false, 4, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"CAE"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[67, 65, 69]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{" G"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "a"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "C_K", "1.25", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"2CAESARTITLE", "true"}, false, 2, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KSRT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"aR1.1234567"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AR", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"\016IE1.25"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[14, 73, 69, 49, 46, 50, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"-1.6"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 45, 0, 49, 0, 46, 0, 54]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"5."}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 53, 0, 46]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"C5"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[67, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.CharSequenceUtils", "org.apache.commons.codec.binary.CharSequenceUtils", "regionMatches", new String[]{"java.lang.CharSequence", "boolean", "int", "java.lang.CharSequence", "int", "int"}, new String[]{"<s:9a>", "false", "1", "<s:0>", "26", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 49, 46, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "charAt", new String[]{"java.lang.String", "int"}, new String[]{"-1.52020-01-01", "2147483635"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"0xFFFFXFFF "}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KSFF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "CIOTitle", "-T1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"DIO.51.25", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"TITLE"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 84, 0, 73, 0, 84, 0, 76, 0, 69]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"2020L-01-01"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("L", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"CL"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "L: ", "5."}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"CJE"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[67, 74, 69]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"1E-5CAETAR"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 49, 0, 69, 0, 45, 0, 53, 0, 67, 0, 65, 0, 69, 0, 84, 0, 65, 0, 82]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "charAt", new String[]{"java.lang.String", "int"}, new String[]{"", "31"}, false, 5, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "-16777217"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=-16777217}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{"1.123456789012345672020-02-30T25:61:61abc"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TPK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"-18"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=-18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{"a6c"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"PT1H2020-01-01CIE"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[80, 84, 49, 72, 50, 48, 50, 48, 45, 48, 49, 45, 48, 49, 67, 73, 69]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"CIOTITLE", "false"}, false, 7, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "1.2234567890123456"}, {"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("STTL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 50, 58, 51, 48, 58, 52, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{"Hello,AWorld"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("HLRL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"CY"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 67, 0, 89]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"CIA", "true"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("X", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"2147483597"}, false, 2, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "7aa", "2147483647"}, {"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "-30"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483597}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"WICZ"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 87, 0, 73, 0, 67, 0, 90]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Be", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{"o"}, false, 5, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "-30"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "charAt", new String[]{"java.lang.String", "int"}, new String[]{"CIA--1", "0"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("C", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"WICZCH", "TJTME CI", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:bF>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "1.5 ", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"TILE "}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"-2147450880"}, false, 4, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "1Lanul: ", "CAESARCI", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=-2147450880}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{" S"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[32, 0, 83, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"axFFFGXFFF "}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 97, 0, 120, 0, 70, 0, 70, 0, 70, 0, 71, 0, 88, 0, 70, 0, 70, 0, 70, 0, 32]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.CharSequenceUtils", "org.apache.commons.codec.binary.CharSequenceUtils", "regionMatches", new String[]{"java.lang.CharSequence", "boolean", "int", "java.lang.CharSequence", "int", "int"}, new String[]{"<s:1W>", "false", "60", "<null>", "2147483647", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "aCE"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "+ ", "1e10CK"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{"1L2020-01-01"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("L", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{"CtIO"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.Object", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Be", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"E", "CC", "true"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "1.E25", "5.", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"3C.1e10", "true"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String,boolean", "", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\004\005\006", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\003\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:kdy>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CKCIE", "D0", "false"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "HCH"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{"TJTME CICH"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TTMS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"--f", "true"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{" G", "SITME CI0xFFFFFFFF", "true"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:bcT>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PKT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"Ki1.12345678901234567"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[75, 105, 49, 46, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"CAESAR"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[67, 65, 69, 83, 65, 82]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:8>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "CrrK"}, {"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\005", String.valueOf(actual));
 }
}
