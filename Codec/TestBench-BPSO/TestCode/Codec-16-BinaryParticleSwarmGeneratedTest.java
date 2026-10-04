package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:0>", "33", "0", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "available", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[55, 52, 61, 61, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:1>", "2147483587", "12", "<sample:7>"}, {"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<empty>", "8212", "-14", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:1>", "4", "-7", "<sample:6>"}, false, 3, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"/ab255"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[17]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"00x1234567t9"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-42, -7, -33]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"0.123457"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<s:kWe?y>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-42, -7, -33]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "1.12334567abc"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AB7Q\u007f\u007f\u007f\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "available", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:6>"}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte", "-12"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AQCQM===\r\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "1.12345678901234567"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 85, 61, 61, 61, 61, 61, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:XkWe?y>"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "PT0"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<s:D>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-67]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "readResults", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>", "261", "32", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte", "41"}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte", "60"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"java.lang.String"}, new String[]{"1e10\n"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte[]", "boolean"}, new String[]{"<sample:0>", "false"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:0>", "-2147482597", "4194342", "<sample:9>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[80, 52, 66, 65, 71, 61, 61, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:0>", "-14", "8212", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "+1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte[]", "boolean"}, new String[]{"<sample:2>", "false"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "available", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:7>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 73, 61, 61, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("74======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte"}, new String[]{"4"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base32", "available", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte[]", "boolean"}, new String[]{"<null>", "true"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte[],boolean", "<sample:4>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[55, 52, 61, 61, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{";5"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "ensureBufferSize", new String[]{"int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"-2147483648", "<sample:1>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte[],boolean", "<null>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<i:2147483647>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "available", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[]", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AB7Q====\r\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:1>", "-11", "138", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P4BAG===", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "hasData", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"0x1234567891.5f"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "\u00e9"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-42, -7, -33, 127]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:0>", "2147483587", "2147483647", "<sample:0>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "available", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "123456789W123"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "hasData", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "readResults", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>", "64", "9", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "-25", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AI======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:0>", "118", "18", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("74======\r\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:5>", "2147483647", "-13", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "ensureBufferSize", new String[]{"int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"3", "<sample:5>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", "byte[]", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FS106===", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[]", "<sample:0>"}, {"org.apache.commons.codec.binary.Base32", "encode", "java.lang.Object", "<s:b>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("08======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "ensureBufferSize", new String[]{"int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"44", "<sample:5>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", "byte[]", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("74======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "-.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "http://exampld.com8/a?b=c"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AB7Q====", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"214773648"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-41, 63, -3, -5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "-254", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AMCA\u007f\u007f\u007f\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", "byte[]", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<sample:1>"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<s:dub>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AMCA====", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:10>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AB7Q====\r\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"<.11234567"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "0.1234567890123456"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-42, -7, -33]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8192", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"java.lang.String"}, new String[]{"/"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"\nTithke"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("74======\r\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "ensureBufferSize", new String[]{"int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"-17", "<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:0>", "1073741823", "2147483647", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<empty>", "-2147483648", "2147483586", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[]", "<empty>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<empty>", "9", "8246", "<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte[],boolean", "<sample:5>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>", "-14", "131058", "<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P4BAG===\r\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0C20====", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<i:-2147483648>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:2>", "0", "-2147483648", "<sample:0>"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>"}, {"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:2>", "6", "14", "<sample:1>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "available", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:6>"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", new String[]{"byte[]"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "readResults", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:1>", "9", "2147483647", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[80, 52, 66, 65, 71, 61, 61, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.DecoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<null>", "-2147483647", "474", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "available", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isWhiteSpace", new String[]{"byte"}, new String[]{"-8"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "ensureBufferSize", new String[]{"int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"1", "<sample:11>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 66, 55, 81, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte"}, new String[]{"1"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "16777216", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:0>", "2147483647", "2147483647", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte[]", "boolean"}, new String[]{"<empty>", "true"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>", "2147483647", "53", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "java.lang.Object", "<s:?a>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte[]", "boolean"}, new String[]{"<sample:4>", "true"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:0>", "2147483647", "-54", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AB7Q====", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>", "-2147483648", "27", "<sample:7>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("74======\r\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"java.lang.String"}, new String[]{"0x1234567t9"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AI\u007f\u007f\u007f\u007f\u007f\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte", "63"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"java.lang.String"}, new String[]{"555"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"/ab255"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-41]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:0>", "8", "32", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte[]", "boolean"}, new String[]{"<null>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>", "-1", "5", "<sample:1>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"/abI55"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[71]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:2>", "-7", "36", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "2020-01-0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "hasData", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:6>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P4BAG===", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "ensureBufferSize", new String[]{"int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"-2097204", "<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AI======\r\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AB7Q====", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "readResults", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:1>", "127", "-63", "<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "available", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"x2F"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-47]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte", "-47"}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte[],boolean", "<sample:0>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8192", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "available", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "java.lang.Object", "<s:khey>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("74======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "-2147479552", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AI\u007f\u007f\u007f\u007f\u007f\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte[],boolean", "<sample:1>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("74======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AB7Q====\r\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:0>", "-14", "-14", "<sample:4>"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte[],boolean", "<empty>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AB7Q====\r\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"1234567890123456789012345678901.5f"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-42, -7, -33, 127, 91, -25, 125, -3, 111, -99, -9]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:6>", "2147483647", "66", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P4BAG===", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("VS======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "available", "org.apache.commons.codec.binary.BaseNCodec$Context", "<null>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 77, 67, 65, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"2255"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "\nTitke"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-42, -69]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"00x12234567t9"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-42, -73, -50, -5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 73, 61, 61, 61, 61, 61, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "2/20-02-30T25:61:61"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[41, 74, 82, -108, -91]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte"}, new String[]{"51"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"-1x1234567t9"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[8, 68, 50, 20, -57]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"CineLength "}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[18]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "53", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AB7Q====", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeAsString", "byte[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P4BAG===", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AB7Q====", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "hasData", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:6>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("74\u007f\u007f\u007f\u007f\u007f\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:2>", "33", "-2147483648", "<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "\nTitke"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte[]", "boolean"}, new String[]{"<null>", "true"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isWhiteSpace", new String[]{"byte"}, new String[]{"-49"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P4BAG===", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 81, 67, 81, 77, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>", "60", "-2147483648", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<s:kWe?,y>"}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "31<a>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "hasData", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte", "-28"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "65664", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P4BAG\u007f\u007f\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:0>", "28", "20", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[55, 52, 127, 127, 127, 127, 127, 127]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"/b355"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<null>", "1073741823", "66", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-33]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 49, 86, 71, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 67, 50, 48, 4, 4, 4, 4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa]"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P4BAG\u007f\u007f\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "readResults", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:2>", "0", "2147483647", "<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "1.5fhttp://example.com/a?b=c"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FS106\004\004\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "ensureBufferSize", new String[]{"int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"-2147483647", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte[],boolean", "<sample:0>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P4BAG===\r\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AQCQM===", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:0>", "-1", "-16785428", "<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte[],boolean", "<sample:2>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"1.123456789012345b6"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[8, 68, 50, 20, -57, 66, 64, 17, 12, -123]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", "byte[]", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[86, 83, 61, 61, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[86, 83, 61, 61, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[55, 52, 61, 61, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isWhiteSpace", new String[]{"byte"}, new String[]{"32"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isWhiteSpace", new String[]{"byte"}, new String[]{"5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 81, 67, 81, 77, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"Pn1H"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[121]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "java.lang.Object", "<b:false>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8192", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AI======\r\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[80, 52, 66, 65, 71, 61, 61, 61, 13, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 66, 55, 81, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getDefaultBufferSize", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8192", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:kWWe?y>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-75]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>", "59", "8192", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "hasData", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "7", "<sample:0>"}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte[],boolean", "<sample:1>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[70, 83, 49, 48, 54, 4, 4, 4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:0>", "-2147483648", "0", "<sample:3>"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"PT1H1LlineLength "}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "available", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[124, -50, -75]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte[],boolean", "<sample:1>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("74======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[80, 52, 66, 65, 71, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte", "32"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P4BAG===", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", "byte[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AB7Q====", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:3>"}, {"org.apache.commons.codec.binary.Base32", "encode", "byte[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P4BAG===", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte[]", "boolean"}, new String[]{"<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>", "1073741817", "31", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[55, 52, 61, 61, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isWhiteSpace", new String[]{"byte"}, new String[]{"127"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("74======\r\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 73, 61, 61, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte[]", "boolean"}, new String[]{"<sample:3>", "false"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte", "8"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:4>"}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte", "60"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 56, 61, 61, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:kW2?y>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-74]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"2137483648"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-42, -1, -51, -5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "hasData", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[]", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:aLA>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[88]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeToString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AI======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "ensureBufferSize", new String[]{"int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"-2147483648", "<null>"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "545", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:0>", "-1049088", "24", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base32", "available", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<sample:3>"}, {"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[16, 72, 114, 32, 102, 34]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("VS\004\004\004\004\004\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"1E-5aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "java.lang.Object", "<b:false>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[39]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 66, 55, 81, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("74======\r\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte"}, new String[]{"120"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[]", "<sample:5>"}, {"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"java.lang.String"}, new String[]{"2020-02.20T25:61:61"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:0>", "31", "2147483647", "<sample:1>"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "--1123456789012345678901234567890"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[65, 66, 55, 81, 61, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>", "-2147483648", "2147483647", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:5>", "-2147483648", "-4", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:XkWe?x>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-67]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[70, 83, 49, 48, 54, 61, 61, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "E.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"28047483648"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[18, 0, 67, -111, 3, 49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"\tTITLE"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "available", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-102, 38, -78]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:3Pa>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeAsString", "byte[]", "<sample:0>"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "123456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-37]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"ltrue0x123456789"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte[],boolean", "<sample:0>", "true"}, {"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte", "-128"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-42, -7, -33]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encode", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "java.lang.Object", "<s:kWe?y>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:k6Wey>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-11]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:kWe?yF>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-79]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeAsString", "byte[]", "<sample:0>"}, {"org.apache.commons.codec.binary.Base32", "encodeAsString", "byte[]", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("01VG====", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "hasData", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[]", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "available", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>", "1610612675", "8212", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"[Ib2]"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "15", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[70]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:51:61 "}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[16, 4, 0, 8, 96, -24, -118, 80, -104]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"1234567790123456789012345678901.5f"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-42, -7, -33, 127, -6, -33, 59, -17, -21, 124, -17, -65]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"1-12345578901234567"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-42, -7, -34, -1, 91, -25, 125]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:1>", "-7", "2147483647", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"1.12345672020-01-01"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[8, 68, 50, 20, -57, 16, 4, 0, 4, 1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AI======", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "encodeAsString", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeAsString", "byte[]", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"21473n3648"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[16, 72, 113, -116, -60]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "readResults", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>", "-3", "9", "<null>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:0>", "-28", "7", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:5>", "-16777143", "-2147483648", "<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", "byte[]", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<null>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte[]", "boolean"}, new String[]{"<empty>", "false"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>", "-7", "31", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "-526", "<sample:3>"}, {"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "."}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-41]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "available", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte", "-128"}, {"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"1E-52020-01-010x1234567t9"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base32", "ensureBufferSize", "int,org.apache.commons.codec.binary.BaseNCodec$Context", "-7", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[39, 117, -83, 111, -99, -9]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte"}, new String[]{"73"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "1.12345678901234p56"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"java.lang.String"}, new String[]{"5"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte[]", "boolean"}, new String[]{"<null>", "false"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "2020-01-012020-02-30T25:61:61"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isWhiteSpace", new String[]{"byte"}, new String[]{"10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "1.25"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<empty>", "0", "222", "<null>"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte", "8"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte[],boolean", "<sample:0>", "true"}, {"org.apache.commons.codec.binary.Base32", "encodeAsString", "byte[]", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"java.lang.String"}, new String[]{""}, false, 6, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:1>", "-27", "-2147483648", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:CWe?y>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "available", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[21]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.String"}, new String[]{"PTH"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<s:kfy>"}, {"org.apache.commons.codec.binary.Base32", "decode", "java.lang.String", "1.12445678901234561.5"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[124]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte[]", "boolean"}, new String[]{"<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<s:bb>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isWhiteSpace", new String[]{"byte"}, new String[]{"9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "readResults", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:1>", "-1", "12", "<null>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[]", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "getEncodedLength", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "available", new String[]{"org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "encode", "byte[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte"}, new String[]{"48"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "java.lang.String", "aa"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isInAlphabet", new String[]{"byte"}, new String[]{"53"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "java.lang.Object", "<s:>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "available", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "encodeToString", "byte[]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:kWeu?H>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-79]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "readResults", new String[]{"byte[]", "int", "int", "org.apache.commons.codec.binary.BaseNCodec$Context"}, new String[]{"<sample:3>", "2146435071", "8", "<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte[],boolean", "<sample:1>", "false"}, {"org.apache.commons.codec.binary.Base32", "hasData", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:TkWe?y>"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.Base32", "decode", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:0>", "8", "-33", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-99]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:kLWe\u00e9?y>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", "byte[]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[93]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:k3We?y>"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.Base32", "readResults", "byte[],int,int,org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:1>", "-2147483645", "240", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-35]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:kWeX?yy>"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte[],boolean", "<sample:0>", "true"}, {"org.apache.commons.codec.binary.Base32", "containsAlphabetOrPad", "byte[]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-75]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:kW?yD>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte[],boolean", "<sample:2>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-80]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "isWhiteSpace", new String[]{"byte"}, new String[]{"9"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:7kWe?y>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "isInAlphabet", "byte", "8"}, {"org.apache.commons.codec.binary.Base32", "getEncodedLength", "byte[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.Base32", "org.apache.commons.codec.binary.Base32", "decode", new String[]{"java.lang.Object"}, new String[]{"<s:kWf?2y>"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.Base32", "available", "org.apache.commons.codec.binary.BaseNCodec$Context", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-74]", SearchInputFactory_scaffolding.observe(actual));
 }
}
