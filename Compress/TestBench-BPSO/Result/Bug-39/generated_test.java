package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]"}, new String[]{"I", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"0x"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 120]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:3>", "-1073741824", "48", "<sample:1>", "-2147483648", "1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa5", "<sample:0>", "134217773", "-128"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:0>", "285", "0", "<sample:1>", "134217773", "128"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<sample:1>", "<empty>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<sample:3>", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"null"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[110, 117, 108, 108]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"1.25"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 46, 50, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{",-1/a/b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",-1/a/b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:3>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"22:300:45"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("22:300:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:2>", "219", "65821", "<sample:3>", "-2147483596", "1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "-2147483647", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"1e2H0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e2H0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<sample:5>", "20", "2147483647", "<sample:3>", "128", "-128", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d       1 sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<sample:0>", "<sample:3>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<sample:0>", "42"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<sample:1>", "<null>", "false"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-       0 0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"1.02345678"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.02345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"I0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<sample:3>", "2147483641", "221", "<sample:2>", "-2147483648", "32769", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"12:30:4"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 50, 58, 51, 48, 58, 52]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<null>", "21"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa5"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:1>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d       4 sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:0>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d       1 sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:6>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]"}, new String[]{"<empty>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:2>", "-1", "-55", "<sample:1>", "0", "-69"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-       3 0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"--"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 45]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"-0.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"1.123456789e01234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.123456789e01234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<sample:3>", "-42", "-118", "<null>", "46", "255", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("- -9223372036854775808 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"1e1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("- 9223372036854775807 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"3+11"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[51, 43, 49, 49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"\n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"/"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"0x1234567890123456789012345678\n0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 120, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 10, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<sample:3>", "285", "256", "<sample:3>", "48", "-2147483648", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"1.1234557"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 46, 49, 50, 51, 52, 53, 53, 55]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"abc"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 98, 99]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<sample:7>", "20"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<null>", "<sample:2>", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"1e10a"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 101, 49, 48, 97]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"1.123456790123456"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.123456790123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-       5 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"-0.0U"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0U", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "67108886", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{" SUS-ASCII"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" SUS-ASCII", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"]L"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[93, 76]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d      -1 a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "-256", "<sample:2>", "1073741823", "268435290"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:0>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d       4 sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<empty>", "14"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:6>", "1073741831", "2147483647", "<sample:2>", "-2147483648", "255"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa5Helllo, World"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa5Helllo, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"11e10"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11e10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\003\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:1>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<sample:3>", "2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"[1,[2]I"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,[2]I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<sample:0>", "<sample:3>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d       2 a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:1>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:0>", "2147483647", "254", "<sample:1>", "2147483647", "311"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"J"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("J", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "319"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"nul{"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[110, 117, 108, 123]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{".-"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[46, 45]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d       2 a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:12>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-       9 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"P"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"PT10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\004\005\006", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:0>", "255", "2147483647", "<sample:1>", "2147483647", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d       4 sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\007\010\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]"}, new String[]{"<null>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<sample:4>", "67108918", "254", "<sample:1>", "-110", "-59", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"2.5e3002147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2.5e3002147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<empty>", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<empty>", "42", "511", "<sample:2>", "255", "-2147483648", "true"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<sample:0>", "276", "-2284", "<empty>", "-104", "-2147483648", "true"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<sample:3>", "-2147483648", "-2147483648", "<sample:1>", "136", "-55", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<empty>", "-67108886"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d       1 sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"12:3/:451E-5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 50, 58, 51, 47, 58, 52, 53, 49, 69, 45, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<null>", "44"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<sample:2>", "<sample:3>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"1.12345678{\"a\":1}"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678{\"a\":1}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"21474836482020-02-30T25:61:61"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21474836482020-02-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:9>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d       6 a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d       1 sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[50]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"5.I\n"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[53, 46, 73, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"HI"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[72, 73]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-       3 0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]"}, new String[]{"{\"a\":1}", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\004\005\006", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"null0x"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null0x", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{" nulm"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[32, 110, 117, 108, 109]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"\t "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[9, 32]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<sample:2>", "2147483647", "-78", "<null>", "10", "-118", "true"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"  "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[32, 32]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"US-ASCIITITLE"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("US-ASCIITITLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"j"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[106]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "285", "33554443"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "-1073740672"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<empty>", "<empty>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-       0 0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-       3 0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d       4 sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]"}, new String[]{"", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<sample:1>", "-2147483648", "-2147483648", "<null>", "191", "-2147483648", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\004\005\006", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\003\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<sample:1>", "508"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"a\n"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"202S-02-30T25:61:61"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[50, 48, 50, 83, 45, 48, 50, 45, 51, 48, 84, 50, 53, 58, 54, 49, 58, 54, 49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaa>a5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 62, 97, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<null>", "2147483647", "-2147483648", "<null>", "22", "46", "true"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"a"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<null>", "16430"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"15.\u00e9"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("15.\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"214748364812:30:45"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[50, 49, 52, 55, 52, 56, 51, 54, 52, 56, 49, 50, 58, 51, 48, 58, 52, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[63]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"0+1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0+1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "sanitize", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("- -9223372036854775808 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("- 9223372036854775807 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"-0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\005", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:2>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "2147483645", "<null>", "1073741823", "128"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:1>", "2", "508", "<null>", "2147483647", "-2097207"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:0>", "-128", "-65718", "<sample:3>", "2147483647", "-118"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"Gello, World"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[71, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-       0 0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("- 9223372036854775807 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "-34", "<sample:3>", "2147483647", "2068"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\003\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<empty>", "508"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-       0 0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d       2 a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d      -1 a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"H"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[72]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:8>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-       5 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"7.5", "<sample:0>", "-2147483648", "33554474"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d       2 a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<sample:2>", "<empty>", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-       3 0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "-134", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"aaaaaaaaaaaaaaaaaUaaaaaaaaaa", "<sample:0>", "508", "516"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-       5 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"c ", "<sample:3>", "2147483647", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d      -1 a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiBytes", new String[]{"java.lang.String"}, new String[]{"hstp://example.com/\na?b=c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[104, 115, 116, 112, 58, 47, 47, 101, 120, 97, 109, 112, 108, 101, 46, 99, 111, 109, 47, 10, 97, 63, 98, 61, 99]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "118", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]"}, new String[]{"0\"x1F", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\005", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"o\u00e9}", "<empty>", "-118", "-146"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:1>", "-69", "255", "<empty>", "-2147483646", "536870794"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<empty>", "<sample:3>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-10", "128"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<null>", "-1073741823", "2147483647", "<sample:3>", "-2147483648", "524416"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<sample:1>", "<empty>", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toString", new String[]{"org.apache.commons.compress.archivers.ArchiveEntry"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<null>", "1048861"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]"}, new String[]{"US-ASDII", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]"}, new String[]{"", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<sample:4>", "<null>", "false"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"\t", "<sample:8>", "256", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<sample:0>", "128", "-114", "<null>", "2147483647", "-69", "true"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\003\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:2>", "134217773", "2147483647", "<sample:1>", "65535", "508"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<sample:2>", "<null>", "false"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:3>", "1073741823", "-1", "<sample:2>", "-1073741824", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"2A55", "<empty>", "0", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "46", "286"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<null>", "-536870912", "67108886", "<sample:3>", "0", "10", "false"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<null>", "-1073741825", "128", "<sample:3>", "-536870962", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<null>", "55", "-2147483648", "<sample:1>", "-2147483648", "261", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<null>", "-512", "134217769", "<sample:2>", "-98", "2"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"2020-01-011.12345678901234567", "<null>", "-55", "64"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<null>", "-42", "42", "<sample:2>", "132", "256"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:6>", "1070", "0", "<sample:2>", "0", "55"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]"}, new String[]{"ta[ b", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]"}, new String[]{"1.12345678901234567-1.5", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "byte[]", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isArrayZero", new String[]{"byte[]", "int"}, new String[]{"<empty>", "42"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"I", "<sample:0>", "-112", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]"}, new String[]{"0020", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<null>", "-2147483648", "138", "<sample:3>", "128", "131327"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:5>", "16394", "-2147483647", "<null>", "1073742847", "33554478"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "1", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\005\006", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<sample:4>", "2147483647", "0", "<empty>", "128", "0", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{" L", "<null>", "134217773", "10"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"Uitleabc", "<null>", "-524246", "1048458"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<null>", "-2", "134217686", "<sample:4>", "254", "127"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:2>", "-261", "-2147483648", "<empty>", "285", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "1", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<null>", "-65790", "-2147483648", "<sample:3>", "270", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:1>", "-1073741872", "-2147483648", "<sample:2>", "55", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<sample:3>", "2147483647", "-2147483648", "<sample:1>", "2147483647", "-2147483648", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:1>", "-2147483648", "-2147483648", "<empty>", "127", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:6>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\005", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:0>", "-31", "-2147483648", "<sample:0>", "42", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int", "boolean"}, new String[]{"<sample:5>", "-69", "-2147483648", "<sample:2>", "-10", "-2147483648", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "10", "<null>", "62", "-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]"}, new String[]{"", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"http:///example.com/a?b=c", "<null>", "-2147483648", "325"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "-8388650", "<empty>", "-64", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "2", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]"}, new String[]{"", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "0", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:1>", "33023", "-2147483648", "<sample:0>", "254", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqual", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:2>", "-131071", "-2147483648", "<null>", "185", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "1", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\005", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "matchAsciiBuffer", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"", "<sample:0>", "2147483647", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "isEqualWithNull", new String[]{"byte[]", "int", "int", "byte[]", "int", "int"}, new String[]{"<sample:2>", "-2147483648", "-1", "<sample:5>", "508", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.ArchiveUtils", "org.apache.commons.compress.utils.ArchiveUtils", "toAsciiString", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
}
