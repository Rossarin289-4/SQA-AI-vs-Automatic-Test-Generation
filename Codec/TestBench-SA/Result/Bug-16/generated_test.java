package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "E.5f"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "abc"}, {"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>", "9", "-506", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8192", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte"}, new String[]{"9"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:3>", "-506", "-2147483648", "<sample:3>"}, {"org.apache.commons.codec.binary.Base32", "encodeAsString", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"\n2020-02-30T25:61:61"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "1.12345678"}, {"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<empty>", "-2147483648", "1", "<sample:6>"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "010"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-42, -75, -71, -21, -66]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{">1L[1\u00e92]"}, false, 14, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "java.lang.Object", "<d:3.1>"}, {"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[13, 66]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"71L\\0F"}, false, 14, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeAsString", "byte[]", "<sample:5>"}, {"org.apache.commons.codec.binary.Base32", "encode", "java.lang.Object", "<d:31.0>"}, {"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[56, 106, 7]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"71;L\\0F"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeAsString", "byte[]", "<sample:5>"}, {"org.apache.commons.codec.binary.Base32", "encode", "java.lang.Object", "<d:50.0>"}, {"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-42, -7, -33]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "254", "<sample:4>"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "0xFFFFFFF"}, {"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AB7Q====", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "java.lang.Object", "<s:-3>"}, {"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<sample:0>"}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte[],boolean", "<sample:0>", "true"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 49, 86, 71, 4, 4, 4, 4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"Ta7g|beda<d/a/b"}, false, 15, new String[][]{{"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:3>"}, {"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-97]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>", "9", "6", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8192", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>", "9", "6", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8192", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>", "9", "6", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8192", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>", "9", "6", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8192", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "1.5f"}, {"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>", "9", "6", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8192", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "1.5f"}, {"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>", "9", "6", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8192", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "1.5f"}, {"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>", "9", "-506", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8192", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:1>"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "abd"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8192", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "1.12345678"}, {"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte"}, new String[]{"76"}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "java.lang.Object", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8192", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "ensureBufferSize", new String[]{"int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"8520228", "<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "available", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:4>"}, {"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "hasData", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isWhiteSpace", new String[]{"byte"}, new String[]{"-1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:3>", "0", "4", "<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"java.lang.String"}, new String[]{"x0C"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "available", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:4>"}, {"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "hasData", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:5>"}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"\n2020-0-30T25:61:61"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "1.12345678/a/b"}, {"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<empty>", "-2147483648", "1", "<sample:6>"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "110"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-42, -73, 61, 119, -34]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 14, new String[][]{{"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<empty>", "-2147483648", "1", "<sample:6>"}, {"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[13]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:2>", "-1073741824", "-8", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", ""}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "123456789012345678901234567890"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte[]", "boolean"}, new String[]{"<sample:3>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte[]", "boolean"}, new String[]{"<empty>", "false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("01VG====", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FS106===", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte"}, new String[]{"-17"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "java.lang.Object", "<s:b>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"java.lang.String"}, new String[]{"2020-01-011Impossible mtdulus "}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "hasData", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isWhiteSpace", new String[]{"byte"}, new String[]{"-17"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isWhiteSpace", new String[]{"byte"}, new String[]{"32"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isWhiteSpace", new String[]{"byte"}, new String[]{"-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "7", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:0>", "8254", "1", "<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>", "2147483647", "32", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeAsString", "byte[]", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte[]", "boolean"}, new String[]{"<sample:0>", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte[]", "boolean"}, new String[]{"<null>", "true"}, false, 12, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:0>", "31", "1", "<sample:4>"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.codec.binary.Base32", "encode", "byte[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P4BAG===", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "ensureBufferSize", new String[]{"int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"0", "<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "31", "<sample:4>"}, {"org.apache.commons.codec.binary.Base32", "encode", "byte[]", "<sample:1>"}, {"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:0>", "2147483647", "31", "<sample:7>"}, {"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 66, 55, 81, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>", "31", "-506", "<sample:2>"}, {"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("74======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>", "31", "-506", "<sample:2>"}, {"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>", "31", "-506", "<sample:2>"}, {"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AI======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>", "31", "-506", "<sample:2>"}, {"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AQCQM===", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "hasData", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:B>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "available", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>"}, {"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.binary.Base32", "encodeAsString", "byte[]", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:B6>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "available", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:0>"}, {"org.apache.commons.codec.binary.Base32", "encodeAsString", "byte[]", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[15]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:2>", "31", "-2147483648", "<sample:6>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:2>", "-2147483648", "2147483647", "<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte[]", "boolean"}, new String[]{"<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "1L"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "a"}, {"org.apache.commons.codec.binary.Base32", "encodeAsString", "byte[]", "<sample:1>"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[]", "<sample:4>"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<s:key>"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[]", "<sample:4>"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<s:key>"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[]", "<sample:4>"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<s:key>"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 66, 55, 81, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[55, 52, 61, 61, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "readResults", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:3>", "4", "508", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", "byte[]", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "available", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "1.25"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte[]", "boolean"}, new String[]{"<sample:1>", "false"}, false, 12, new String[][]{{"org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", ""}, {"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>", "32", "10", "<sample:5>"}, {"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<empty>", "1", "7", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte[]", "boolean"}, new String[]{"<null>", "false"}, false, 11, new String[][]{{"org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", ""}, {"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>", "32", "10", "<sample:5>"}, {"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<empty>", "1", "7", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<null>", "256", "256", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<null>", "256", "256", "<null>"}, {"org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", "byte[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "java.lang.Object", "<s:>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[80, 52, 66, 65, 71, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[70, 83, 49, 48, 54, 4, 4, 4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>", "1", "2147483647", "<sample:6>"}, {"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<sample:3>"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<d:1.5>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 85, 61, 61, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>", "1", "2147483647", "<sample:6>"}, {"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<sample:3>"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<d:1.5>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 77, 67, 65, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>", "1", "2147483647", "<sample:6>"}, {"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<sample:3>"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<d:1.5>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 89, 68, 81, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:3>", "200", "1", "<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", "byte[]", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AB7Q====", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "hasData", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "hasData", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte[]", "boolean"}, new String[]{"<null>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte[]", "boolean"}, new String[]{"<sample:1>", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte[]", "boolean"}, new String[]{"<sample:0>", "false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:0>", "9", "6", "<sample:6>"}, {"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8192", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<null>", "10", "-1", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<null>", "10", "-1", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 66, 55, 81, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 77, 67, 65, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<empty>", "-2147483648", "10", "<null>"}, {"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[80, 52, 66, 65, 71, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<empty>", "-2147483648", "10", "<null>"}, {"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<null>"}, {"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 73, 61, 61, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<empty>", "-2147483648", "10", "<null>"}, {"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<null>"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "31"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 66, 55, 81, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:1>"}, {"org.apache.commons.codec.binary.Base32", "available", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:7>"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:1>"}, {"org.apache.commons.codec.binary.Base32", "available", "org.apache.commons.codec.binary.BaseNCodec$Context", "<null>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "available", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte", "30"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "readResults", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<empty>", "256", "6", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:2>", "-506", "255", "<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte[],boolean", "<empty>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte"}, new String[]{"76"}, false, 12, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:1>", "0", "4", "<sample:2>"}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "0x1F]"}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte", "-128"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "ensureBufferSize", new String[]{"int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"256", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isWhiteSpace", new String[]{"byte"}, new String[]{"5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:2>", "1", "8", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("74======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AI======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:0>", "-506", "31", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:0>", "-506", "31", "<sample:5>"}, {"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:3>", "2147483647", "30", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:3>", "-1", "7", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "1.12345678"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "010"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-41]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "1.12345678"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "010"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "readResults", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<empty>", "255", "32", "<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 14, new String[][]{{"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<empty>", "-2147483648", "1", "<sample:6>"}, {"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[13]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{">1L[1,2]"}, false, 10, new String[][]{{"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<empty>", "-2147483648", "1", "<sample:6>"}, {"org.apache.commons.codec.binary.Base32", "encode", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[94]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{">1L[61,2]"}, false, 10, new String[][]{{"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<empty>", "-2147483648", "1", "<sample:6>"}, {"org.apache.commons.codec.binary.Base32", "encode", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[95]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{">1L[61\u00e92]"}, false, 14, new String[][]{{"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<empty>", "-2147483648", "1", "<sample:6>"}, {"org.apache.commons.codec.binary.Base32", "encode", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[13, 76, 17]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[55, 52, 61, 61, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte[],boolean", "<sample:1>", "false"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 81, 67, 81, 77, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:0>", "256", "9", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[86, 83, 4, 4, 4, 4, 4, 4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("VS======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "-1"}, {"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FS106===", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "-1"}, {"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0G2GC===", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "-1"}, {"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0K======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", ",1"}, {"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("08======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "ensureBufferSize", new String[]{"int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"10", "<null>"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[]", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 85, 61, 61, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AI======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:3>", "31", "-2147483648", "<sample:1>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isWhiteSpace", new String[]{"byte"}, new String[]{"32"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[39]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-102, 38, -78]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 7, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>", "-506", "255", "<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "--1"}, {"org.apache.commons.codec.binary.Base32", "encode", "java.lang.Object", "<d:3.1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<empty>", "31", "-2147483648", "<sample:5>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P4BAG===", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", ".."}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte[],boolean", "<sample:0>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "available", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("74======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte[]", "boolean"}, new String[]{"<empty>", "false"}, false, 13, new String[][]{{"org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", "byte[]", "<empty>"}, {"org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:2>", "-15", "-1017", "<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<empty>", "30", "-1", "<sample:7>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte"}, new String[]{"89"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<null>"}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "i"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte"}, new String[]{"-89"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "ensureBufferSize", new String[]{"int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"-102", "<null>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte", "-128"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<s:b>"}, {"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[]", "<null>"}, {"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:0>", "10", "31", "<null>"}, {"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AU======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "+1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P4BAG===", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "+1"}, {"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AQCQM===", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "+1"}, {"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AMCA====", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 13, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "+"}, {"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P4BAG=== ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 13, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "+"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AI====== ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "readResults", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:1>", "-506", "30", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "256", "<sample:5>"}, {"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "5", "<sample:1>"}, {"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "available", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<empty>", "-506", "-255", "<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:0>", "-506", "7", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 10, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:1>", "73", "256", "<sample:5>"}, {"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 10, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:1>", "73", "195", "<sample:4>"}, {"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeAsString", "byte[]", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeAsString", "byte[]", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "abc"}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "true"}, {"org.apache.commons.codec.binary.Base32", "available", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AB7Q====", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "abc"}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "true"}, {"org.apache.commons.codec.binary.Base32", "available", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AB7Q\u007f\u007f\u007f\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 10, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeAsString", "byte[]", "<sample:4>"}, {"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<empty>", "32", "-1", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "ensureBufferSize", new String[]{"int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"536870870", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "-30", "<sample:5>"}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte[],boolean", "<empty>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "readResults", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:1>", "1", "2", "<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "available", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>", "-1", "-2147483648", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "available", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:1>", "-1", "-2147483648", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[55, 52, 61, 61, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "0", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"a75|bdabd"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:3>"}, {"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<null>"}, {"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "-2147483648", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte[]", "boolean"}, new String[]{"<null>", "true"}, false, 14, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "readResults", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:1>", "6", "66", "<null>"}, false, 15, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeAsString", "byte[]", "<sample:3>"}, {"org.apache.commons.codec.binary.Base32", "encode", "byte[]", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 73, 61, 61, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 85, 61, 61, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("74======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte", "30"}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "lineLength "}, {"org.apache.commons.codec.binary.Base32", "encodeAsString", "byte[]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte", "30"}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "123456789012345678901234567890"}, {"org.apache.commons.codec.binary.Base32", "encodeAsString", "byte[]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P4BAG===", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte", "30"}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "123456789012345678901234567890"}, {"org.apache.commons.codec.binary.Base32", "encodeAsString", "byte[]", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AMCA====", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "available", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:0>"}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte", "15"}, {"org.apache.commons.codec.binary.Base32", "encodeAsString", "byte[]", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AI======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "-1"}, {"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("74======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<null>"}, {"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AI======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<null>"}, {"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AQCQM===", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 15, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<i:5>"}, {"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:1>", "-2", "256", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{">1L\\1\u00e8;XX2]"}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[13, 66]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{">2L\\1\u00e8;XX2]"}, false, 12, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:3>", "254", "-2147483648", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[21, 66]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"12L\\1\u00e8;XX2]"}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[8, -86, 17]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"126L\\1\u00e8;XX2]"}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[8, -115, 80]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"31"}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[24]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte", "32"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("74======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AI======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AB7Q====", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P4BAG===", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AMCA====", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("74======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8192", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 13, new String[][]{{"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:3>"}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "--11"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-42, -7, -33, 127, 91, -25]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"1.12345678901"}, false, 13, new String[][]{{"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:3>"}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "--11"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-42, -7, -33]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"1.123X45678901"}, false, 13, new String[][]{{"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:3>"}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "--11"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-42, -17, -50, -5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"1.123X45678901"}, false, 14, new String[][]{{"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:0>"}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "--11"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[8, 68, 50, 20, -57, 66, 64]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"java.lang.String"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A4EAS===", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AB7Q====", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AMCA====", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<null>", "2147483647", "-1", "<sample:0>"}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 73, 61, 61, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<null>", "2147483647", "-1", "<sample:0>"}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[80, 52, 66, 65, 71, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[55, 52, 61, 61, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<sample:3>"}, {"org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", ""}, {"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:1>", "256", "5", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 56, 4, 4, 4, 4, 4, 4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 14, new String[][]{{"org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", "byte[]", "<sample:0>"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<i:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<null>"}, false, 14, new String[][]{{"org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", "byte[]", "<sample:0>"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<i:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:1>", "-1", "4", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"0x21H3456789"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:3>", "9", "10", "<sample:5>"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<i:2>"}, {"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-47, -9, -50, -5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:WA>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-80]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeAsString", "byte[]", "<sample:0>"}, {"org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", ""}, {"org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", "byte[]", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte[],boolean", "<sample:0>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 8, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<sample:0>"}, {"org.apache.commons.codec.binary.Base32", "encode", "java.lang.Object", "<i:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AMCA====", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 8, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<sample:0>"}, {"org.apache.commons.codec.binary.Base32", "encode", "java.lang.Object", "<i:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AI======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P4BAG===", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<null>"}, false, 8, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AB7Q====", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("74======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 13, new String[][]{{"org.apache.commons.codec.binary.Base32", "available", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:3>"}, {"org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", ""}, {"org.apache.commons.codec.binary.Base32", "available", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P4BAG=== ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "0", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AMCA====", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "0", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AB7Q====", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte[],boolean", "<sample:0>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AI======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte[],boolean", "<sample:0>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AI\u007f\u007f\u007f\u007f\u007f\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 66, 55, 81, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:2>", "510", "32", "<null>"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<s:nkey>"}, {"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:0>", "8", "-506", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "123456789012345678901234567890"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[124]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"P"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "123456789012345678901234567890"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "ensureBufferSize", new String[]{"int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"256", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>", "524298", "506", "<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", "byte[]", "<null>"}, {"org.apache.commons.codec.binary.Base32", "encode", "java.lang.Object", "<i:-2147483642>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "available", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 77, 67, 65, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>", "-187", "71", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>", "4", "6", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[80, 52, 66, 65, 71, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "9", "<sample:4>"}, {"org.apache.commons.codec.binary.Base32", "encode", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 13, new String[][]{{"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "9", "<sample:4>"}, {"org.apache.commons.codec.binary.Base32", "encode", "java.lang.Object", "<d:1.5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "java.lang.Object", "<i:-1>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[70, 83, 49, 48, 54, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "java.lang.Object", "<i:-1>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 49, 86, 71, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "hasData", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", ""}, {"org.apache.commons.codec.binary.Base32", "encodeAsString", "byte[]", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"T-\t51-5f"}, false, 10, new String[][]{{"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "-1", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-97]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"T\t\t51H-5f"}, false, 10, new String[][]{{"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "-1", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-97, 79]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"T\t\t51H-5fD"}, false, 10, new String[][]{{"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "-1", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-97, 79, -47]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:0>", "75", "-2147483648", "<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[]", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:0>", "-2113929216", "8", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("VS======@d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:1>", "4", "0", "<sample:7>"}, false, 8, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"0x11E2147483648"}, false, 13, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeAsString", "byte[]", "<sample:0>"}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte[],boolean", "<sample:1>", "false"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "0xFFFFFFFF"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[38, -71, -2, 111, -36]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"-2.5"}, false, 13, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "0xFF"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-41]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "ensureBufferSize", new String[]{"int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"-1", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"?1L[61\u00e92]"}, false, 13, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[95]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte"}, new String[]{"84"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "available", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isWhiteSpace", new String[]{"byte"}, new String[]{"32"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>", "4", "255", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>", "6", "254", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "-506", "<sample:4>"}, {"org.apache.commons.codec.binary.Base32", "encode", "byte[]", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 13, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeAsString", "byte[]", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:IPb>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<sample:1>"}, {"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[67]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "available", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>"}, false, 11, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<empty>", "2147483647", "6", "<sample:0>"}, {"org.apache.commons.codec.binary.Base32", "available", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:4>"}, {"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>", "-3", "-2147483648", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte[]", "boolean"}, new String[]{"<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "hasData", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "0xFFFFFFFF"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<b:false>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:2>"}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", ".5"}, {"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:]TX>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte", "-3"}, {"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-99]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:]TDX>"}, false, 12, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte", "-6"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-21]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isWhiteSpace", new String[]{"byte"}, new String[]{"32"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s::IW>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>"}, {"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[69]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"java.lang.String"}, new String[]{"3L"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:4>"}, {"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:0>", "8", "-506", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
}
