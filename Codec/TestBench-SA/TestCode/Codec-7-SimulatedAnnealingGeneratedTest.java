package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isArrayByteBase64", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "254", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "setInitialBuffer", "byte[],int,int", "<empty>", "8192", "256"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<sample:4>", "true", "false", "3"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 119, 73, 68, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "setInitialBuffer", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "10", "0"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:0>", "-2147483648", "60"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-41]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AwQ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "0xFFFFFFFF"}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.binary.Base64", "decode", "java.lang.Object", "<s:a>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AH8=", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[95, 119]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"-364"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -108]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "19", "8191"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "readResults", "byte[],int,int", "<sample:0>", "2147483646", "77"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isBase64", new String[]{"byte"}, new String[]{"61"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeInteger", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "byte[],int,int", "<sample:3>", "62", "10"}, {"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"255"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47, 119, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.Object"}, new String[]{"<i:4>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<empty>"}, {"org.apache.commons.codec.binary.Base64", "isUrlSafe", ""}, {"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "{\"a\":0}"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.String"}, new String[]{"nnu=l"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "hasData", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-98, 123]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isArrayByteBase64", new String[]{"byte[]"}, new String[]{"<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "discardWhitespace", new String[]{"byte[]"}, new String[]{"<sample:11>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[11, 12]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "hasData", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.codec.binary.Base64", "avail", ""}, {"org.apache.commons.codec.binary.Base64", "encode", "java.lang.Object", "<i:-9>"}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:3>", "63", "-19"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "-2147483647", "8192"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "java.lang.Object", "<s:a>"}, {"org.apache.commons.codec.binary.Base64", "decode", "byte[]", "<sample:0>"}, {"org.apache.commons.codec.binary.Base64", "decode", "byte[]", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "avail", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<null>"}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:3>", "64", "8192"}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.String"}, new String[]{"1020-02,-30T25:62:71TILE\n"}, false, 14, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "byte[]", "<sample:5>"}, {"org.apache.commons.codec.binary.Base64", "readResults", "byte[],int,int", "<empty>", "-64", "4"}, {"org.apache.commons.codec.binary.Base64", "hasData", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-41, 77, -76, -5, 77, -66, -33, 68, -10, -25, -83, -69, -43, 50, 11]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isArrayByteBase64", new String[]{"byte[]"}, new String[]{"<sample:17>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isArrayByteBase64", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isArrayByteBase64", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isArrayByteBase64", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "avail", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base64", "avail", ""}, {"org.apache.commons.codec.binary.Base64", "hasData", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "avail", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.codec.binary.Base64", "avail", ""}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.binary.Base64", "hasData", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "avail", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.codec.binary.Base64", "avail", ""}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.binary.Base64", "hasData", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "avail", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<sample:0>"}, {"org.apache.commons.codec.binary.Base64", "hasData", ""}, {"org.apache.commons.codec.binary.Base64", "hasData", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AwQ=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "8192", "3"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "8224", "-19"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<sample:4>", "true", "false", "3"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("fwID", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AH8=", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("fwID\r\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<null>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ag==\r\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BAUG\r\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/w==\r\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"ltS\\"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-106, -44]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"lR["}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-107]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"lR8"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-107, 31]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"010"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-45, 93]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[107]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"TITLE"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[76, -124, -53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"THTLE"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[76, 116, -53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("_w", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"/HTE"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-4, 116, -60]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"/HTE1e10"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-4, 116, -60, -43, -19, 116]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"i"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"Cd"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[9]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"CCd"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[8, 39]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"\t1E-5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-44, 79, -71]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"\t1E-6"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-44, 79, -70]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "hasData", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "hasData", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "hasData", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.binary.Base64", "decode", "java.lang.Object", "<s:a>"}, {"org.apache.commons.codec.binary.Base64", "setInitialBuffer", "byte[],int,int", "<sample:0>", "-2147483648", "8193"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.binary.Base64", "decode", "java.lang.Object", "<s:a>"}, {"org.apache.commons.codec.binary.Base64", "setInitialBuffer", "byte[],int,int", "<sample:0>", "-2147483648", "8193"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "avail", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isUrlSafe", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:1>", "19", "8224"}, {"org.apache.commons.codec.binary.Base64", "encode", "java.lang.Object", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isUrlSafe", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "java.lang.Object", "<b:true>"}, {"org.apache.commons.codec.binary.Base64", "encode", "java.lang.Object", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:e]y>"}, false, 12, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[123]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:ee]y>"}, false, 12, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[121, -20]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 12, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "setInitialBuffer", "byte[],int,int", "<empty>", "-19", "255"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AH8=", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "setInitialBuffer", "byte[],int,int", "<empty>", "-19", "255"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AwQ=", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "setInitialBuffer", "byte[],int,int", "<empty>", "-19", "255"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ag==", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean"}, new String[]{"<sample:4>", "true", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 119, 81, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean"}, new String[]{"<sample:5>", "true", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 65, 85, 71, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean"}, new String[]{"<sample:5>", "false", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 65, 85, 71]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean"}, new String[]{"<sample:2>", "false", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 119, 73, 68]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"31"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[31]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"-31"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-31]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"-54"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-54]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"-27"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-27]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"-81"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-81]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"-2199023255633"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-3, -1, -1, -1, -1, -81]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"-2199022731354"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, 0, 0, 7, -1, -90]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"-4398045462678"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-4, 0, 0, 15, -1, 106]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isUrlSafe", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base64", "readResults", "byte[],int,int", "<sample:2>", "-2147483648", "8192"}, {"org.apache.commons.codec.binary.Base64", "decode", "byte[]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("fwID\r\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AH8\r\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("_w\r\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isUrlSafe", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base64", "isUrlSafe", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isUrlSafe", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "readResults", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "63", "256"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isArrayByteBase64", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isArrayByteBase64", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "avail", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "avail", ""}, {"org.apache.commons.codec.binary.Base64", "hasData", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "avail", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base64", "avail", ""}, {"org.apache.commons.codec.binary.Base64", "hasData", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<empty>", "true", "false", "4"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("fwID", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ag==", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AwQ=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BAUG", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<null>", "true", "true", "3"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<sample:0>", "false", "true", "256"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[95, 119]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 65, 85, 71, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 81, 61, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47, 119, 61, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 103, 61, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isBase64", new String[]{"byte"}, new String[]{"63"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isBase64", new String[]{"byte"}, new String[]{"109"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<sample:2>", "false", "true", "63"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 119, 73, 68]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<sample:3>", "false", "true", "63"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 103]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"[0,2]"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-45]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"0,3]21"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-45, 125, -75]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"00,3]"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-45, 77]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"00]"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-45]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"r00]1"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-81, 77, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"r0]1"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-81, 77]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"rT]1"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-83, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"rT]:"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-83]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"sT]:"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-79]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"ltS\\:"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-106, -44]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"java.lang.String"}, new String[]{"THTLE"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[76, 116, -53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AH8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ag", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BAUG", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Bgc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("CQo", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("_w", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "hasData", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"byte[]"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "0xFFFFFFFF"}, {"org.apache.commons.codec.binary.Base64", "decode", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AH8=", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean"}, new String[]{"<empty>", "true"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decodeBase64", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "hasData", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:1>", "4", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<sample:0>", "false", "false", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47, 119, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56, 61]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isUrlSafe", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "isUrlSafe", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 12, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-111, -20]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64Chunked", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 119, 81, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-111, -20]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:ey>"}, false, 12, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[123]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:E>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "avail", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:hE>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "avail", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-124]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[105, -90, -102, 105, -90, -102, 105, -90, -102, 105, -90, -102, 105, -90, -102, 105, -90, -102, 105, -90, -102, 105]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "discardWhitespace", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"255"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"208"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"76"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[76]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"140737488355404"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-128, 0, 0, 0, 0, 76]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"63"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[63]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"31"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[31]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"2199022731339"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[1, -1, -1, -8, 0, 75]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "toIntegerBytes", new String[]{"java.math.BigInteger"}, new String[]{"1099511365669"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1, -1, -4, 0, 37]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-19", "8191"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.Object", "<d:1.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "hasData", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "byte[],int,int", "<sample:1>", "76", "64"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-41]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.String"}, new String[]{"[1,2]aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "byte[],int,int", "<sample:1>", "76", "64"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-41, 102, -102, 105, -90, -102, 105, -90, -102, 105, -90, -102, 105, -90, -102, 105, -90, -102, 105, -90, -102, 105, -90, -102]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.String"}, new String[]{"1+3"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:4>", "61", "0"}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-41, -19]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.String"}, new String[]{"1+3aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1.5e300"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:4>", "61", "0"}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-41, -19, -38, 105, -90, -102, 105, -90, -102, 105, -90, -102, 105, -90, -102, 105, -90, -102, 105, -90, -102, 105, -90, -102, 107, 94, 94, -33, 77]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.String"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:4>", "61", "0"}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-37, 94, 59, -29, -51, -6, -29]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:4>", "268435517", "0"}, {"org.apache.commons.codec.binary.Base64", "decode", "byte[],int,int", "<empty>", "60", "19"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/w==", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("fwID", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ag==", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AwQ=", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("_w\r\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("fwID\r\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean"}, new String[]{"<null>", "true", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "readResults", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "63", "256"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "readResults", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "63", "256"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "1.12345678901234567"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "readResults", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "63", "256"}, false, 9, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "1-12345678901234567"}, {"org.apache.commons.codec.binary.Base64", "decode", "byte[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "readResults", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "63", "256"}, false, 9, new String[][]{{"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "1-1234678901234567"}, {"org.apache.commons.codec.binary.Base64", "decode", "byte[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("fwID", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<sample:4>", "false", "false", "8223"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 119, 81, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<sample:5>", "false", "false", "8276"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 65, 85, 71]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<sample:1>", "false", "false", "8276"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<sample:1>", "false", "false", "8276"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<sample:1>", "false", "true", "8281"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<sample:1>", "true", "true", "8300"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<sample:0>", "true", "true", "187"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[95, 119, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<sample:2>", "false", "false", "-19"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean", "int"}, new String[]{"<empty>", "false", "true", "-33554498"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "setInitialBuffer", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "65", "8191"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "8193", "1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "32", "-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "byte[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 119, 73, 68]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "byte[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "setInitialBuffer", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "1073750091", "95"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "discardWhitespace", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "discardWhitespace", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 127]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "discardWhitespace", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[3, 4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "discardWhitespace", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean"}, new String[]{"<sample:4>", "true", "false"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 119, 81, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean", "boolean"}, new String[]{"<sample:4>", "true", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 119, 81, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:aa>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "readResults", "byte[],int,int", "<sample:1>", "8224", "63"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[105]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:9aW>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-11, -91]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:+9aW>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "byte[],int,int", "<sample:2>", "5", "255"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-5, -42, -106]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 119, 81, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47, 119, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 103, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 119, 73, 68]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 119, 81, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 103]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 119, 73, 68]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 119, 81]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafe", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:1>", "3", "8224"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean"}, new String[]{"<sample:1>", "false"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean"}, new String[]{"<sample:0>", "false"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47, 119, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean"}, new String[]{"<sample:4>", "false"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 119, 81, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean"}, new String[]{"<sample:5>", "false"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 65, 85, 71]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]", "boolean"}, new String[]{"<sample:2>", "false"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 119, 73, 68]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/w==", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BQ==", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 72, 56, 61]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47, 119, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 103, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"76"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[84, 65, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"18014398509482060"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[81, 65, 65, 65, 65, 65, 65, 65, 84, 65, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"18014398509482060"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[81, 65, 65, 65, 65, 65, 65, 65, 84, 65, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "2147483646", "3"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "2147483646", "3"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-536870911", "-2147483648"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.codec.binary.Base64", "encodeToString", "byte[]", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-1073741813", "2147483647"}, false, 14, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "-2147483647"}, false, 14, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483645", "8192"}, false, 14, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:}42>"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<sample:2>", "-2147483648", "2"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-29]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "8192", "8192"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64URLSafeString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("_w", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "byte[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "byte[]", "<sample:3>"}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[],int,int", "<empty>", "254", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AH8=\r\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 81, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64", new String[]{"byte[]"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[67, 65, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ag==", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("fwID", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AH8=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AwQ=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BAUG", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BQ==", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"2147483647"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 47, 47, 47, 47, 119, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"1073741823"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[80, 47, 47, 47, 47, 119, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"4294967349"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 81, 65, 65, 65, 68, 85, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"9223372036854775808"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[103, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"9223363240761753600"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 47, 47, 52, 65, 65, 65, 65, 65, 65, 65, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"18446726481523507200"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47, 47, 47, 119, 65, 65, 65, 65, 65, 65, 65, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AH8=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:O5>"}, false, 12, new String[][]{{"org.apache.commons.codec.binary.Base64", "hasData", ""}, {"org.apache.commons.codec.binary.Base64", "setInitialBuffer", "byte[],int,int", "<null>", "5", "75"}, {"org.apache.commons.codec.binary.Base64", "isUrlSafe", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[59]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 10, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "byte[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 119, 73, 68]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 10, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "byte[]", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 119, 81, 61]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:7>"}, false, 10, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "byte[]", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 103, 99, 61]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base64", "hasData", ""}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base64", "hasData", ""}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base64", "hasData", ""}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 103]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base64", "decode", "java.lang.String", "TITLE"}, {"org.apache.commons.codec.binary.Base64", "encode", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.codec.binary.Base64", "encode", "byte[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-2147483648", "-2147483648"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUrlSafe=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encode", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "64"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"511"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 102, 56, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"-63"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[119, 81, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"4"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 65, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"-140737488355324"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[103, 65, 65, 65, 65, 65, 65, 69]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"140737488355325"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 47, 47, 47, 47, 47, 47, 57]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"281474976710650"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[47, 47, 47, 47, 47, 47, 47, 54]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"2113929216"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[102, 103, 65, 65, 65, 65, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"8589934568"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 102, 47, 47, 47, 43, 103, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeInteger", new String[]{"java.math.BigInteger"}, new String[]{"4503608217305075"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[69, 65, 65, 66, 47, 47, 47, 47, 56, 119, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base64", "org.apache.commons.codec.binary.Base64", "encodeBase64String", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AwQ=", String.valueOf(actual));
 }
}
