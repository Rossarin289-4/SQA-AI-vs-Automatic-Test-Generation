package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "difference", new String[]{"org.apache.commons.codec.StringEncoder", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "cou2f", "010-1.5010"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"^gnbq"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GNBQ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "differenceEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"^gn0", "^enough"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"^toug"}, false, 1, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "1E-52020-02-30T25:61:61"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"aI"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AI", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"a2Hello, Worldd"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<s:ky>"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "ukl"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AHLW", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"2.12345678"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<s:Wa>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"[^a-z]"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("S", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"01e0"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "m2ci", "1.12345678901234560xFFFFFFFF0x123456789"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"1e10+1"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", ".P"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "--11e10123456789012345678901234567890", "tou2e"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"^enothh"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<d:1.5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("N0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"aitge"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "dq"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ATJ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"111111111", "1.5e300"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<s:>"}, {"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "differenceEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"010-1.501000y123456789", "1.12345678901234567^mb"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"^rough2020-01-01", "^mb1.5"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890tou2f1111111111"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "aEb8"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"^cough1.5", "ggn"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "^rou4gh1.1234567890123456", "^rough2020-01-01"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<i:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"vkl^toughiItou2f", "^trodghenou2f"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "--11e101234567890123456789012345678900xFFFFFFFF", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"^cough"}, false, 1, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "Sjtge", " "}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/\037", "tiou2e"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"gn0"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("N", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"fTiAtle"}, false, 7, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "^uoug^trough"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FXTL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"3^gnbq", "ch"}, false, 7, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "Hllo, Worldci"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"ch.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("X", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"010", "aHekl"}, false, 5, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "m2ciA", "1.5e300"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"m21.5", "a2PHello, Worlddci"}, false, 7, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "aitg2e", "^1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:c>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "m2ch", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("C", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"vkl^tough2q"}, false, 2, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "siou2e"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FKLT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"1.5dtrue"}, false, 5, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "Xci", "^rough2020-01-01"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TTR", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:xc>"}, false, 1, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "chi"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "aiDge"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "^enoshh", "^rough2020-01-01cq"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<b:false>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "differenceEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+1", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:qCky>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<b:false>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"Wrue"}, false, 5, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "2.1234567<", "22:30:45"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "1.51111111111", "/\037.12345678"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("R", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"Xch"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"1"}, false, 6, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "siaou2e"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"vkl^toughicou2f", "Wh.5"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"i]eno4>gh", "020-01-01"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "a", "TchTitle"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" 1", "mm2"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"^ough"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"^trough1e10"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TRF1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:k2eyu>"}, false, 1, new String[][]{{"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "1.12345678901234567", "tou2f"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KA11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"-"}, false, 1, new String[][]{{"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "1C.5", "0L"}, {"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "1020-01-01", "aH"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "difference", new String[]{"org.apache.commons.codec.StringEncoder", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "^^gnbq", "\n2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"aHello, World"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<s:4ky>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ALWT111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:ky>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "tot2f"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"2147483591"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483591}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"Title"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"rou2fsrou2f123456789012345678901234567890"}, false, 7, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("RFSR", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"aI"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AA11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"4095"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "[]a-z]", "1.5d"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=4095}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"^enough5."}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("N", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"146"}, false, 1, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "11.5d"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=146}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"Titge"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<s:ky>"}, {"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TTJ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "+", "null1.5e300-0.0"}, {"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "^toug", "1.5e300"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"null1-5e300"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "uk1kl", "0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"^gn"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "trpu2f"}, {"org.apache.commons.codec.language.Caverphone", "caverphone", "java.lang.String", "1251.1234567"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("N111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"PT0H"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PTH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"trxou2f"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TRKS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"tou2W-1"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TA11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "difference", new String[]{"org.apache.commons.codec.StringEncoder", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "1.1234567", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"010-1.50100y123456789"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"abac", "ne10+1"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"50"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<s:>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=50}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"cou2f"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Caverphone", "caverphone", "java.lang.String", "enou22f1.12345678901234567"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KF11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"i^enot>gh"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("IENOTGH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"W1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "differenceEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"h1/5", "rou2ftrou2f13456789012345678901234567890"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"3abc"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("APK1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "caverphone", "java.lang.String", "1.5f"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"enou2f"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "m2di"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ANF1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"^tqough"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"A"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"-52"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "r1.5f"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=-52}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:2>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "\037"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "differenceEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E-52020-02-30T2P:61:61", "1e10+1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "differenceEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2Pl", "P"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "difference", new String[]{"org.apache.commons.codec.StringEncoder", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "1.25", "TITLE2147483648"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"tot2f"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "caverphone", "java.lang.String", "3^gnbq1.12345678901234567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TTF1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E-52030-02-30T25:61:61", "ci"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "difference", new String[]{"org.apache.commons.codec.StringEncoder", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "true", "^gnbq"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"uk]l"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "null", "1.25"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UKL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"^mb"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "caverphone", "java.lang.String", "01/"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("M111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"41"}, false, 1, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<s:key>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"^coughh"}, false, 6, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "-2147483648"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"bbc"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<b:true>"}, {"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"]tough1.12345671.1234567890123456"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "$-"}, {"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"^trou:h"}, false, 2, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<i:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TRA1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"Sitg3e"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("STK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"1c10"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"x."}, false, 3, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<s:WWa>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:k^>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<s:b>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"roou2fsrou2f1234567890123456789012345678901.12345678"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "caverphone", "java.lang.String", "1.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("RFSRF11111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"[^b-z]trou2f"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PSTRF11111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"2qD"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("QD", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"m2<i\n"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MA11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "differenceEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1>.12345678901234567", ""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"184"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=184}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"^touWgi"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TKA1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:14>"}, false, 2, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2147483642"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"1.25Title"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TTL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ABK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF0"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KF11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "differenceEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\037", "21474836481.5f"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"^trough"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", ",1.5", "abbc"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TR", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"^rough1.5d"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("RFT1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"44"}, false, 2, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=44}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<b:false>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:9>"}, false, 7, new String[][]{{"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "trou2f", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"010"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"21474836481.5f"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"--1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"$-", "1.1234567890123456"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<s:ky>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"-48"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=-48}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "16777226"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"xa"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "^gn"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KA11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "aHello, World"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "rou2ftrou2f123456789012345678901234567890"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "-30"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "", "010-1.501/"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KSF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"^rough"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "caverphone", "java.lang.String", "2020-01-"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("RF11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "1.12345678-00.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"tou2f"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "caverphone", "java.lang.String", "trou2f"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TF11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TRA1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"Ti,tle1.5f"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TTLF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"-0/01.5"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "-c"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "1.12335678"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"2020-01f-01"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s::a>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"t3ou2f"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TF11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"null"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NA11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"rou2", "D2"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"rrnu2f"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NF11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"abLc1L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ABLCL", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"abc12:30:45"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ABK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "difference", new String[]{"org.apache.commons.codec.StringEncoder", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "--11.12345678", "enou2f^cough"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"\037"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "^tough"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\037", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s::>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"trou2f"}, false, 6, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "1.5f", "123456789012345678901234567890tou2f1111111111"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "3^gnbq"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TRF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"^tough"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KA11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "difference", new String[]{"org.apache.commons.codec.StringEncoder", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "1.25", "e"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"unull"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UNULL", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{":^mb"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "1", "812:30:45"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("M111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"3^gnbq"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "1e110x1F"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NBK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<s:ky>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{",L"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "2147473648", "aHi"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"-14"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "010-1.50100y123456789"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "i^enou>gh", "null1.5e300"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=-14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:kx>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<sample:2>"}, {"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "srue", "21474836481.4f"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"]tough1.1234567"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "^trough", "e.A"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"1E-e5^cough"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("EECOUGH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"11E-5"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"x"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "1.5f", "123456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("X", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"i"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"1E-52020-02-30T25:61:610xFFFFFFFF"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "+21"}, {"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "0x122456789.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ATKF111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"cou2f"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"niull"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "1.5e300"}, {"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"i^enou>gh"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "-14"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=-14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<i:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("HLWR", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"^toug$"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<s:Wa>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:Wa>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "010-1.50101y123456789"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WA11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "differenceEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"null", "ru2fsIrou2f123456789012345678901234567890"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"010^trough"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "caverphone", "java.lang.String", "nulll1.5e300"}, {"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TRF1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:bg>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PK11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"1.1234556r890123456"}, false, 1, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<i:4>"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("R", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 1, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2147483647"}, {"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "1.14345678901234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("HLWRLT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"l--1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"a2Hello, Woldd"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AHELLOWOLDD", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"^tough"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TOUGH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"1.1234567abc"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("B", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:b$>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "e$cq"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("B", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1cou2f", "-1"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "2020-01.01", "^toucgh"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<b:false>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "difference", new String[]{"org.apache.commons.codec.StringEncoder", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "]tough1.1234567", "14.5d1.5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "67108864"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("67108864", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=67108864}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"1"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "2n1.5", "vkl^tough"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"PT1H "}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"tot2f"}, false, 2, new String[][]{{"org.apache.commons.codec.language.Caverphone", "caverphone", "java.lang.String", "]touf"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TTF1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:ky3>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 2, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "aHello, World^cough^gn", "tou2f"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{";mb^enough"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MBENOUGH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "]gnbqe$", "1>.4d"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"-70"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=-70}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:jez>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("YS11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "difference", new String[]{"org.apache.commons.codec.StringEncoder", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "abc12:30:45null", "^enovgh"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"2..12345578"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"0.12345678901234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"gtoug$"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GTOUG", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "difference", new String[]{"org.apache.commons.codec.StringEncoder", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "-0.0010", "21467483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"enpu2fa,b,c"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ENPF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"]rogh"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ROGH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"3tou2f"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "Arou2ftrou2f123456789012345678901234567890", "cci"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TF11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"H"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:WbPa>"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<s:b>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PA11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "^troughI", "vkl^tough"}, {"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"mm,"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("M", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:ly>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("L", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:$Wa>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "enouhg"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("W", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"c", ""}, false, 2, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "49"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=49}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{".B"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("B", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "difference", new String[]{"org.apache.commons.codec.StringEncoder", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "1.1234667890123456", "1.5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"^trougghI"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TRK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"trou2fHello, World"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TRFH", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"null0x1234567789"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NLKS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"bbc"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "null^enough", "^cough--1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"1L1.5f"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("LF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "difference", new String[]{"org.apache.commons.codec.StringEncoder", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "^rough", "di"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"null1.5e30i"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NULLEI", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"m2cci"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MCCI", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"a+b, c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ABC", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"2q"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"1.12E345678901234560xFFFFFFFFF0x123456789"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AKFK111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"0x1F5."}, false, 7, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"]touglh1.1234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TOUGLH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"[^>-z]e$", "010-1.5010"}, false, 7, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "enou2f"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"^cough"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"010-1.501/^mb"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("M111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456xFFFFFFFF0x123456789"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KFK1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"gnbq"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NPK1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"x"}, false, 1, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "12:30:55", "1.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("X", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:y>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"E-52020-02-30T25:61:61"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "ci"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AT11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:ky>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:hq>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AK11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"cr"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KA11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.123457", "[^a-z]-0-0"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"^tuh"}, false, 6, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "3m3"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TA11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"^gn^troXugh"}, false, 6, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "15"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NTRKS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"^g/q"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"2E-55."}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"^tough"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TF11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"^eough", "2147483648oello, World"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "ci", "22474836482020-01-01"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"enou2f"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ANF1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"^qrough"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KR", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{".rough"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("RF11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "44"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("44", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=44}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"null^trough"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NULLTROUGH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"P1H", "m2ci"}, false, 6, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"bc12:30:45"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<b:false>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PK11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"*1"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1", "ul"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"00xFFFFFFFF^mb", "a"}, false, 5, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "4090"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4090}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"i"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"Hello, Worl d"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<s:Waf>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("HLWR", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"^toughTITE"}, false, 6, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "TEtle"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TFTT111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"tot2f12:30:45"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TTF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"123456789012345678901234567890^tough1.25", "1/5d"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "47"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("47", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=47}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2147483605"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483605", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483605}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:Wa>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<i:2>"}, {"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "^enough2020-01-01"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WA11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 1, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"--0"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "37"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=37}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "a,b4c2147483648"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "50"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("50", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=50}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"A1n1.5"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AN11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5d010", "z"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"^toug$2020-01-01"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678901.23456", "n^gn"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "1"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "-21"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=-21}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:fa>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "^rptgh"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FA11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "-22"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-22", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=-22}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "caverphone", "java.lang.String", "aHello, World"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"^gn0", "^oug"}, false, 2, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "90"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=90}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "-1enou2f"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "difference", new String[]{"org.apache.commons.codec.StringEncoder", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "I01", "1.2_1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:ly>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("LA11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("B", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"^roughI"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "tot2f", "0x1Fa,b,c"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("RK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "17"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<s:ley>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "z21474836481.5f", "1.1234567"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("L", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"1ee10^mb"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "133456799012345678901234567890tou2f1111111111", "PT1H I"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("M", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"^tough"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", ".1.5cou2f", "--11e10123456789012355678901234567890"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TF11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"^gnbqabc", ""}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=-1}", SearchInputFactory_scaffolding.receiverState());
 }
}
