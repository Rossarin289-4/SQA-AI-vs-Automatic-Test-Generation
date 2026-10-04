package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isArrayByteBase64", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean"}, new String[]{"<sample:1>", "true", "true"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[95, 119]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ag==\r\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"262"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 81, 89, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "1L"}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:1>", "10", "61"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AH8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "setInitialBuffer", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "2", "-1073741741"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "readResults", "byte[],int,int", "<sample:0>", "-2147483648", "60"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isBase64", new String[]{"byte"}, new String[]{"61"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"<a>b=/a>-1"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[105]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:3>", "-1073741736", "65"}, {"org.apache.commons.codec.binary.Base64", "decode", "byte[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 119, 73, 68, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "setInitialBuffer", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "4", "2147483647"}, false, 9, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", " "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<sample:2>", "true", "false", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeInteger", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base64", "isUrlSafe", ""}, {"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<sample:3>"}, {"org.apache.commons.codec.binary.Base64", "decode", "java.lang.Object", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-111, -20]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"9223372036854775812"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[103, 65, 65, 65, 65, 65, 65, 65, 65, 65, 81, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:7h>"}, false, 14, new String[][]{{"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<sample:0>"}, {"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "[1,2]Hello, World"}, {"org.apache.commons.codec.binary.Base64", "readResults", "byte[],int,int", "<sample:1>", "1", "8192"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-18]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isArrayByteBase64", new String[]{"byte[]"}, new String[]{"<sample:10>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "hasData", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base64", "setInitialBuffer", "byte[],int,int", "<empty>", "8193", "2"}, {"org.apache.commons.codec.binary.Base64", "decode", "byte[],int,int", "<empty>", "76", "65"}, {"org.apache.commons.codec.binary.Base64", "setInitialBuffer", "byte[],int,int", "<sample:10>", "2", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isArrayByteBase64", new String[]{"byte[]"}, new String[]{"<sample:17>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "hasData", ""}, {"org.apache.commons.codec.binary.Base64", "decode", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "p"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 81, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "discardWhitespace", new String[]{"byte[]"}, new String[]{"<sample:11>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[11, 12]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 16, new String[][]{{"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<sample:0>"}, {"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<sample:17>"}, {"org.apache.commons.codec.binary.Base64", "encode", "java.lang.Object", "<i:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2147483648", "-2147483630"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.Object", "<i:68>"}, {"org.apache.commons.codec.binary.Base64", "avail", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 119, 73, 68, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 103, 61, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 119, 81, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47, 119, 61, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 65, 85, 71, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 81, 61, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 119, 103, 74, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "75", "65"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base64", "avail", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "75", "-1073741736"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "0", "-1073741736"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "64"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "0", "-2147483648"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "byte[]", "<sample:3>"}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<sample:1>"}, {"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "64"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-2147483648", "-2147483648"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "5"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 119, 73, 68, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47, 119, 61, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 65, 85, 71]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "avail", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base64", "avail", ""}, {"org.apache.commons.codec.binary.Base64", "decode", "byte[],int,int", "<empty>", "108", "255"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "avail", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base64", "avail", ""}, {"org.apache.commons.codec.binary.Base64", "decode", "byte[],int,int", "<empty>", "108", "270"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean"}, new String[]{"<empty>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:1>", "10", "61"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 119, 81, 61]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "1L"}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:1>", "10", "61"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 103, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "1L"}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:1>", "10", "61"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 119, 73, 68]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "1L"}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:1>", "10", "61"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56, 61]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "640"}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:1>", "10", "61"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 65, 85, 71]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[95, 119]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 119, 73, 68]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 65, 85, 71]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 103, 99]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 81]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 119, 73, 68]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[95, 119]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean"}, new String[]{"<sample:2>", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 119, 73, 68, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ag", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<sample:1>", "true", "false", "536870968"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<sample:0>", "true", "false", "1073741936"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47, 119, 61, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<sample:1>", "false", "false", "1073741936"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<sample:1>", "false", "true", "1073741936"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"./b"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"]"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"3v"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-34]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"63"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-21]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"613"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-21, 93]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isArrayByteBase64", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isArrayByteBase64", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<null>", "10", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-41]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.String"}, new String[]{"[,2]"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:1>", "10", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.String"}, new String[]{"[,22]"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:1>", "10", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-37]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.String"}, new String[]{"Tiule"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:1>", "10", "2"}, {"org.apache.commons.codec.binary.Base64", "avail", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[78, 43, -91]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.String"}, new String[]{"EUiule!"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:1>", "10", "2"}, {"org.apache.commons.codec.binary.Base64", "avail", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[17, 72, -82, -107]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:1>", "10", "2"}, {"org.apache.commons.codec.binary.Base64", "avail", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-41, -105]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.String"}, new String[]{"d0"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "1.5d"}, {"org.apache.commons.codec.binary.Base64", "isUrlSafe", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[119]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<sample:2>", "true", "false", "62"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 119, 73, 68, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "setInitialBuffer", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "2", "-1073741741"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "readResults", "byte[],int,int", "<sample:1>", "-2147483648", "60"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "setInitialBuffer", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "76", "65"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"9223372036854775810"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-128, 0, 0, 0, 0, 0, 0, 2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"4611686018427387905"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[64, 0, 0, 0, 0, 0, 0, 1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"4"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"-4"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"-2097156"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-33, -1, -4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"-1048578"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-17, -1, -2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"-1048625"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-17, -1, -49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"1048625"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[16, 0, 49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"-2061583253434"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, 32, 0, 16, 0, 70]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"263"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 7]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"526"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2, 14]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"281"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, 25]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"562"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2, 50]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isUrlSafe", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "avail", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "setInitialBuffer", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "63", "8192"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "byte[],int,int", "<empty>", "77", "5"}, {"org.apache.commons.codec.binary.Base64", "decode", "byte[],int,int", "<null>", "1", "64"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "avail", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "byte[],int,int", "<sample:2>", "-1", "64"}, {"org.apache.commons.codec.binary.Base64", "avail", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "discardWhitespace", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-1", "64"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-1", "64"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:2>", "-2147483648", "60"}, {"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "75", "65"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "75", "65"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base64", "avail", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "0", "-2147483617"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "64"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "0", "-2147483648"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "byte[]", "<sample:3>"}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<sample:1>"}, {"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "64"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 119, 73, 68]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeInteger", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 65, 85, 71]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 119, 81, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 103, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "-2147483648", "8192"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47, 119, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 103, 61, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47, 119, 61, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.Object", "<i:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 119, 73, 68]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 103]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean"}, new String[]{"<empty>", "true", "false"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 81]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 65, 85, 71]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 119, 81]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeInteger", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean"}, new String[]{"<sample:3>", "true"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 103, 61, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BAUG\r\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("fwID\r\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AH8=\r\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/w==\r\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isArrayByteBase64", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BQ==\r\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AwQ=\r\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"255"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47, 119, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"265"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 81, 107, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"33033"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[103, 81, 107, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"66066"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 81, 73, 83]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"-66066"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47, 118, 51, 117]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"-74258"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47, 116, 51, 117]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"-281474976784914"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47, 118, 47, 47, 47, 47, 55, 100, 55, 103, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"-148516"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47, 98, 118, 99]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"536722396"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[72, 47, 50, 55, 51, 65, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "hasData", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "hasData", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "hasData", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "64"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "hasData", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "640"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "hasData", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "byte[],int,int", "<sample:2>", "64", "8192"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean"}, new String[]{"<sample:2>", "false"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 119, 73, 68]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean"}, new String[]{"<sample:4>", "true"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 119, 81, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"63"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-21]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-37, 77, -76, -5, 77, 126, -45]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "byte[]", "<empty>"}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:1>", "10", "61"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 119, 73, 68]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "byte[]", "<empty>"}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:1>", "10", "61"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "byte[]", "<empty>"}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:1>", "10", "61"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 65, 85, 71]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:1>", "10", "61"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 81, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:1>", "10", "61"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 103, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:1>", "10", "61"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 119, 81, 61]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "discardWhitespace", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean"}, new String[]{"<sample:0>", "true"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47, 119, 61, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean"}, new String[]{"<empty>", "true"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean"}, new String[]{"<sample:1>", "true"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean"}, new String[]{"<null>", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean"}, new String[]{"<sample:1>", "false"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("_w", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("fwID", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BAUG", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ag", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<empty>", "true", "true", "8192"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<sample:1>", "true", "true", "16384"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<sample:1>", "true", "false", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<sample:1>", "false", "false", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<sample:1>", "false", "true", "536870911"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 119, 73, 68, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 65, 85, 71, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"WT"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[89]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-3, -81, -37]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{".a/b"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[107, -10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"./b"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"613"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-21, 93]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"633"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-21, 125]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isBase64", new String[]{"byte"}, new String[]{"62"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isBase64", new String[]{"byte"}, new String[]{"-3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isBase64", new String[]{"byte"}, new String[]{"65"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isArrayByteBase64", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<null>", "10", "2"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-41]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:1>", "10", "2"}, {"org.apache.commons.codec.binary.Base64", "avail", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-41, -105]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.String"}, new String[]{"1.d"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:1>", "10", "2"}, {"org.apache.commons.codec.binary.Base64", "avail", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-43]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.String"}, new String[]{"0.d"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base64", "avail", ""}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:0>", "254", "8159"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-47]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.String"}, new String[]{".d"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base64", "avail", ""}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:0>", "254", "8159"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.String"}, new String[]{".6d"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base64", "avail", ""}, {"org.apache.commons.codec.binary.Base64", "isUrlSafe", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-23]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "1.5d"}, {"org.apache.commons.codec.binary.Base64", "isUrlSafe", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-5]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.String"}, new String[]{"d1"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "1.5d"}, {"org.apache.commons.codec.binary.Base64", "isUrlSafe", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[119]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AwQ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "setInitialBuffer", "byte[],int,int", "<sample:1>", "8193", "0"}, {"org.apache.commons.codec.binary.Base64", "hasData", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56, 61]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47, 119, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"63"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[63]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"31"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[31]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"2"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"4"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"9223372036854775810"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-128, 0, 0, 0, 0, 0, 0, 2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"1048625"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[16, 0, 49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"137440002118"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[32, 0, 16, 0, 70]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"-2061583253434"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, 32, 0, 16, 0, 70]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"558"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2, 46]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"519"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2, 7]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"539"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[2, 27]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-111, -20]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:k]?y>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-109]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "avail", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "avail", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "avail", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "avail", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "avail", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "hasData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isBase64", new String[]{"byte"}, new String[]{"-35"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isBase64", new String[]{"byte"}, new String[]{"-64"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"\u00ea0?d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-47]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"i"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"hH"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-124]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ag==", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BQ==", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("fwID", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BAUG", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Bgc=", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<sample:3>"}, {"org.apache.commons.codec.binary.Base64", "encode", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AH8=", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AwQ=", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AwQ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("fwID", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isUrlSafe", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isUrlSafe", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "readResults", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-1073741741", "254"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "isUrlSafe", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isUrlSafe", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"]EE2020-02-30T25:61:61"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[16, 77, -76, -37, 79, -76, -37, -19, -12, 79, 110, 122, -41, -83]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-37, 77, -76, -5, 77, -66, -33, 68, -10, -25, -83, 122]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[105, -90, -102, 105, -90, -102, 105, -90, -102, 105, -90, -102, 105, -90, -102, 105, -90, -102, 105, -90, -102, 105]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean"}, new String[]{"<sample:0>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47, 119, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.Object"}, new String[]{"<d:0.15>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "avail", ""}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:3>", "-1073741736", "65"}, {"org.apache.commons.codec.binary.Base64", "decode", "byte[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 103, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "avail", ""}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:3>", "-1073741736", "65"}, {"org.apache.commons.codec.binary.Base64", "decode", "byte[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56, 61]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:3>", "-1073741736", "65"}, {"org.apache.commons.codec.binary.Base64", "decode", "byte[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 65, 85, 71, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:3>", "-1073741736", "65"}, {"org.apache.commons.codec.binary.Base64", "decode", "byte[]", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:3>", "-1073741736", "65"}, {"org.apache.commons.codec.binary.Base64", "decode", "byte[]", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:3>", "-1073741736", "65"}, {"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 119, 81, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:2>", "-1073741736", "139"}, {"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<null>"}, {"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "60"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 103, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 81, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base64", "isUrlSafe", ""}, {"org.apache.commons.codec.binary.Base64", "decode", "java.lang.Object", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 119, 73, 68]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base64", "isUrlSafe", ""}, {"org.apache.commons.codec.binary.Base64", "decode", "java.lang.Object", "<sample:3>"}, {"org.apache.commons.codec.binary.Base64", "hasData", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Bgc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("fwID", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("_w", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ag", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BAUG", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean"}, new String[]{"<null>", "true", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean"}, new String[]{"<empty>", "false", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean"}, new String[]{"<null>", "false", "true"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean"}, new String[]{"<null>", "true", "true"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<sample:2>", "false", "true", "8192"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 119, 73, 68]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<sample:2>", "false", "false", "8192"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 119, 73, 68]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-41, -105]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"0PT1H"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-48, -12, -11]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 119, 81, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "12", "63"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.Object", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "12", "63"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:3>", "10", "-2147483648"}, {"org.apache.commons.codec.binary.Base64", "decode", "java.lang.Object", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "readResults", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "63", "60"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "-0.0"}, {"org.apache.commons.codec.binary.Base64", "decode", "byte[],int,int", "<null>", "76", "2147483646"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "isUrlSafe", ""}, {"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "1.123456781.1234567"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "java.lang.Object", "<i:2>"}, {"org.apache.commons.codec.binary.Base64", "setInitialBuffer", "byte[],int,int", "<sample:1>", "50", "61"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "254", "254"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "hasData", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "3", "-1073741741"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
