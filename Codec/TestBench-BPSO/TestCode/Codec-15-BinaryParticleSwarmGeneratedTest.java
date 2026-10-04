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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "soundex", "java.lang.String", "tr<ue"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("B000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "soundex", "java.lang.String", "\u00e9"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H464", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"\037"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 7, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "/a0b0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "difference", "java.lang.String,java.lang.String", "-1", "1E-6"}, {"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-8190"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8190", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-8190}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "1.5e30+"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "difference", "java.lang.String,java.lang.String", "", "12345678901234567890123456890"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0xFFFFFFFF", "PT1\u00e9"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "setMaxLength", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.Object", "<i:11>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxLength=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "setMaxLength", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxLength=-2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "11"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("X100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0xFFFFFFFG", "6/"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "setMaxLength", new String[]{"int"}, new String[]{"17"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxLength=17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"P1T1H"}, false, 6, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "."}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P300", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1L", "Iull"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:bf>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("B000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:6ey>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "/a/bH"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "setMaxLength", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxLength=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:f>"}, false, 6, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "123456789012i345678901234567890"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"true[1,2", "tr5e"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{" "}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5e3L+", "-0"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "getMaxLength", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\tabc", "tr<7ue"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "setMaxLength", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxLength=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5e300", "12345678901234567890123456890"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483647"}, {"org.apache.commons.codec.language.Soundex", "encode", "java.lang.Object", "<i:-56>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"a,b,c1"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "b/b"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A120", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:x>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.Object", "<i:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("X000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:kfx>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.Object", "<s:o>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K120", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "A."}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("L000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{".5TITLE"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T340", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "setMaxLength", new String[]{"int"}, new String[]{"-8190"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxLength=-8190}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "getMaxLength", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"0x123456B89"}, false, 6, new String[][]{{"org.apache.commons.codec.language.Soundex", "getMaxLength", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("X100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" ", "1d10"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "difference", "java.lang.String,java.lang.String", "\t.1234567890123467", "12:30;45"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 1, new String[][]{{"org.apache.commons.codec.language.Soundex", "soundex", "java.lang.String", "h\037"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:bf>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"--1", "xL"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "1.1234567a,b,c"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"2120-01-01"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "difference", "java.lang.String,java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\t1L"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "setMaxLength", new String[]{"int"}, new String[]{"42"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxLength=42}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:c>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "getMaxLength", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("C000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678", "Id"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"1<5d"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("D000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a", ""}, false, 5, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "setMaxLength", new String[]{"int"}, new String[]{"-8190"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxLength=-8190}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"\037"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "getMaxLength", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("B000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"abc/a/b"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A121", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "setMaxLength", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxLength=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"+1i"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"a/bc"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"/a0b0true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A136", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"aaabaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "difference", "java.lang.String,java.lang.String", "http://example.com/a?b=c{\"a\":1}", "mulo"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T340", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "setMaxLength", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "soundex", "java.lang.String", "2020-\"1-01"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxLength=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567", "[1,2]2020-01-01"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "difference", "java.lang.String,java.lang.String", "1.Wabc", "trtd"}, {"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-4095"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-4095}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"1.12345678\"90123456"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "\u00e9{\"a\":1}"}, {"org.apache.commons.codec.language.Soundex", "difference", "java.lang.String,java.lang.String", "/a0c0", "1.5e3/0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "difference", "java.lang.String,java.lang.String", "", "Tit-e"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"1.5e30+"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "getMaxLength", ""}, {"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-32760"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-32760}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"1.2c"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Soundex", "getMaxLength", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("C000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"1n:30:45"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2097162"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("N000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2097162}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"truen"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Soundex", "difference", "java.lang.String,java.lang.String", "1.5d", "I"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483647"}, {"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"<`>b=/a>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("B000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"F\037"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "getMaxLength", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"trve"}, false, 6, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "0xFFFFFFF"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T610", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:keF>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"5F", "II"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.Object", "<b:false>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483647"}, {"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "`"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "difference", "java.lang.String,java.lang.String", "-1.51.25", "51.5f0x1F"}, {"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" ", "12;30:45"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:bf>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-59"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("B000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-59}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "getMaxLength", ""}, {"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "8190"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8190", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=8190}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:611.12345678901234567"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483621"}, {"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "\u00e9\u00e9"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2147483621}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-67108863"}, {"org.apache.commons.codec.language.Soundex", "soundex", "java.lang.String", "/"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-67108863", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-67108863}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"ab"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.Object", "<s:[>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"null{\"a\":1}"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("N400", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61Title"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "http://example.com/a?b=c"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T340", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-8211"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8211", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-8211}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:bf>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("B000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-0.0PT1H", "TIT\tLE+1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:bf>"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Soundex", "difference", "java.lang.String,java.lang.String", "1.12345678901B456", "1E-5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("B000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.Object", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:ke]y>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "setMaxLength", new String[]{"int"}, new String[]{"-44"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxLength=-44}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "1073741823"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=1073741823}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "1073741823"}, {"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-32760"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-32760", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-32760}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "soundex", "java.lang.String", "0xFFFFFFFF1.12345678"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H312", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "difference", "java.lang.String,java.lang.String", "Hello, WorrldHello, World", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"nhttp://example.com/a?b=c"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("N312", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Soundex", "getMaxLength", ""}, {"org.apache.commons.codec.language.Soundex", "encode", "java.lang.Object", "<i:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"12345678901234567890123456890"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "difference", "java.lang.String,java.lang.String", "a b0", "{\"a\":1}"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\u00e9", "i-1"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-8224"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8224", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-8224}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "setMaxLength", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxLength=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"1..5e300"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:aa>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "soundex", "java.lang.String", "numl1.12345678"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"-u"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "getMaxLength", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("U000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"1.51L"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.Object", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("L000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:hey>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-65575"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-65575}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "67108864"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("67108864", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=67108864}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"1..5e30+"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 2, new String[][]{{"org.apache.commons.codec.language.Soundex", "soundex", "java.lang.String", "PT1H1.5"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "setMaxLength", new String[]{"int"}, new String[]{"-1073741781"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxLength=-1073741781}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.Object", "<d:1.5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "setMaxLength", new String[]{"int"}, new String[]{"1073741823"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "6"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxLength=1073741823}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"a,b,c-0.0"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A120", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"TITLE-0,.0"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.Object", "<i:-10>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T340", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5e30+aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTITLE", "}Title"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.Object", "<s:b>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "setMaxLength", new String[]{"int"}, new String[]{"33554431"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxLength=33554431}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"PT1Hhttp://example.com/a?b=c"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "difference", "java.lang.String,java.lang.String", "5.123456789012345678901234567890a,b,c", "`bc"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P312", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "setMaxLength", new String[]{"int"}, new String[]{"10"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxLength=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"Hello, Worldhttp://exampl.com/a?b=c"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H464", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "setMaxLength", new String[]{"int"}, new String[]{"-41"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxLength=-41}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:611.5f"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "difference", "java.lang.String,java.lang.String", "21ee7483648", "/`/b"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:bf}>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Be00", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A120", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"/a/b1.1234567890234567"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-57"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-57}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "difference", "java.lang.String,java.lang.String", "<a>b1.12345678", "1.5e300.-1"}, {"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "536870932"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=536870932}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "setMaxLength", new String[]{"int"}, new String[]{"1073741823"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxLength=1073741823}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "setMaxLength", new String[]{"int"}, new String[]{"5"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "12"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxLength=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"a/a0b0"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-2143289344"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-2143289344}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "setMaxLength", new String[]{"int"}, new String[]{"-2147483635"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "difference", "java.lang.String,java.lang.String", "Helmo, Wprld", "http://exampole.com/a?b=c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxLength=-2147483635}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:\tkey>"}, false, 6, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "Ii"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-2.5", "["}, false, 7, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-2147483648"}, {"org.apache.commons.codec.language.Soundex", "difference", "java.lang.String,java.lang.String", "0x1G", "I"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:8>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "Hello, Xorld"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"/a0b0"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-2013265907"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-2013265907}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"P1H"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"iI", "T1.5d"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "1E-6"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"/a0b0"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "getMaxLength", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"15"}, false, 7, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-2147483637"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483637", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-2147483637}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"i"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "8190"}, {"org.apache.commons.codec.language.Soundex", "difference", "java.lang.String,java.lang.String", "1E-6", "1.<224567"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=8190}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "setMaxLength", new String[]{"int"}, new String[]{"0"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxLength=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"I\u00e9", "1E-6"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"\u00e8"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-4095"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4095", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-4095}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"2/20-01-01nhttp://example.com/a?b=c"}, false, 6, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "ts<ue"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("N312", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PT1H1L", "t\t\t"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-2147483604"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483604", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-2147483604}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:kny>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "soundex", "java.lang.String", "T"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K500", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-134217718"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-134217718}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:keLy>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "soundex", "java.lang.String", "2.1234567890123456"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K400", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "-1+2]"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:\u00e9>"}, false, 2, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-2147483648"}, {"org.apache.commons.codec.language.Soundex", "encode", "java.lang.Object", "<i:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:mb>"}, false, 6, new String[][]{{"org.apache.commons.codec.language.Soundex", "difference", "java.lang.String,java.lang.String", "[1,2]0x1F", "2020-01-01"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("M100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"1.e300"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "1073741823"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=1073741823}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 6, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"/a0b0"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Aa00", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"tr<ue", "o"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:c>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("C000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567", "1.5"}, false, 6, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "1073741823"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=1073741823}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:aa>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"-_.5"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:bf>"}, false, 2, new String[][]{{"org.apache.commons.codec.language.Soundex", "difference", "java.lang.String,java.lang.String", "/a0b0", "a,b;c"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Be00", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<>b</a>", "1234567890123456789012345678901e10"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "268427266"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=268427266}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"I"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"nhttp//examrle.com/a?b=c"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.Object", "<s:`/>"}, {"org.apache.commons.codec.language.Soundex", "soundex", "java.lang.String", "12:30C:45--1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("N312", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:`>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "5"}, {"org.apache.commons.codec.language.Soundex", "encode", "java.lang.Object", "<s:a>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("X100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"/a00b0"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "+1acc"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"5DB"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("D100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"http://example.dom/a?b=c"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "Hemmo,\037Wprld"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H312", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:bbf>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483588"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("B000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2147483588}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"bbc"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "ntll"}, {"org.apache.commons.codec.language.Soundex", "difference", "java.lang.String,java.lang.String", "nhttp://fxample.com/a?", "tr<ue"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("B200", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.53300", "a,b,d"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-8190"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-8190}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:B0>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("B000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E-6p", "1..5f"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483586"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2147483586}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:cB>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "26"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("C100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=26}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"Helmo, Wprld12:30:4A5"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "46"}, {"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H451", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"a b1e10"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"220-02-30T2D:61:61"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "-2.5"}, {"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "nhttp://example.com/a?b=c"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ihttp://example.com/a?b=c", "1/5"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-8190"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-8190}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12345678:/12345678901234567890", "\t0"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "10"}, {"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", " "}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0a0b0", "/a/b1.5f"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "difference", "java.lang.String,java.lang.String", "http://exampole.com/a?b=c", "[1,2]"}, {"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:3>"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483621"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2147483621}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"nhttp://examole.com/a?b=c2147483648", "2020-01-011L"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-8119"}, {"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-8190"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-8190}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"nhttp://example.dom/a?b=c", "a bA"}, false, 6, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.Object", "<s:=fp>"}, {"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1\tE-6", "0.5dd"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-65536"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-65536}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:bf>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483595"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("B000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2147483595}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"TEitld"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T343", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-4032"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4032", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-4032}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:eb>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "1234567890123456789023456890"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"nhttp://exammple.com/a?b=c1.12345678"}, false, 6, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-8131"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("N312", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-8131}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483644"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483644", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2147483644}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "soundex", new String[]{"java.lang.String"}, new String[]{"hWto://example.com/a?b=c"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "difference", "java.lang.String,java.lang.String", "[1,2", "i"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H325", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>b<a>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahttp://example.com/a?b=c"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:Ik}y>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "6\013"}, {"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-41"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I200", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-41}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{\"a\":4}", "TITLE"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"e", "[1,2]"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-13"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-13}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"http://exampole.com/a?b=c\n"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "getMaxLength", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H312", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"1F-6"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "28"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("28", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=28}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-2147483635"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483635", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-2147483635}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "difference", "java.lang.String,java.lang.String", "214583648", "0-x1F"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("L000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"123456789012345678C90123456890"}, false, 2, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "20"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("C000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A120", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483647"}, {"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483647"}, {"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-6"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"hWHo://example.com/a?b=c1"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-6"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H251", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1u", "{\"aH:1}"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "soundex", "java.lang.String", "123456789012345678901234567890"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"hWto://example.com0`?b=c"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "0xFFFFFFFF"}, {"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H325", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"hetp://exampole.com/a?b=c"}, false, 6, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "1"}, {"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-1073741824"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H312", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-1073741824}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa\010aaaaaaa"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Soundex", "getMaxLength", ""}, {"org.apache.commons.codec.language.Soundex", "encode", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"200-02-30T25:61:61"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "42"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=42}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-45"}, {"org.apache.commons.codec.language.Soundex", "getMaxLength", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-45", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-45}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "encode", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-8190"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8190", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-8190}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"a,b,d"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-3"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A130", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"1e101.1234567890123456"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "5"}, {"org.apache.commons.codec.language.Soundex", "soundex", "java.lang.String", "12:30:450x123456789"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-2147483648"}, {"org.apache.commons.codec.language.Soundex", "encode", "java.lang.Object", "<s:l>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-85"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-85", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-85}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"Helmo, Wprld"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H451", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa1e10"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "20"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"Hebmo, Wprldtrue"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H151", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{";a>>b</a>"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-1048575"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1048575", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-1048575}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "20"}, {"org.apache.commons.codec.language.Soundex", "encode", "java.lang.Object", "<s:>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-44"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-44", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-44}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-1073741824"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741824", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-1073741824}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"t"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483620"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2147483620}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "1"}, {"org.apache.commons.codec.language.Soundex", "soundex", "java.lang.String", "P1.12345678"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "encode", new String[]{"java.lang.String"}, new String[]{"1.-f"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "-7"}, {"org.apache.commons.codec.language.Soundex", "soundex", "java.lang.String", "0x1FTITLE"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "1"}, {"org.apache.commons.codec.language.Soundex", "getMaxLength", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "134217679"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("134217679", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=134217679}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Soundex", "org.apache.commons.codec.language.Soundex", "getMaxLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Soundex", "setMaxLength", "int", "2147483634"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483634", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxLength=2147483634}", SearchInputFactory_scaffolding.receiverState());
 }
}
