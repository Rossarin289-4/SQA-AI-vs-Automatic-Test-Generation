package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "1"}, {"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "trou2f", "2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"true", "0^covfhcou2f"}, false, 8, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "-0.0"}, {"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "difference", new String[]{"org.apache.commons.codec.StringEncoder", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "i", "1E-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"0x1F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("XF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "differenceEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"123456789012345678901234567890", "[^a-z]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "12:30:45"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "0^covfhcou2f", "^mb"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<i:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<s:a>"}, {"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "1^couhh", "i"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1111111111tou2f"}, false, 1, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "PT]1Habc", "^e+noughe$n"}, {"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "cIou2f"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"xH"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("X", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "differenceEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Title", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"^gn+1ci"}, false, 5, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "hG^mb2n"}, {"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "CHi"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"A12:30:35", "  316e300o1424a83A6d4"}, false, 10, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2147483647"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "Ao2f", "CHhh"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "G^mb2n2n "}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:d>"}, false, 2, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "g/q66dethou2f"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "xIabc", "tIou2f"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("D", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:P>"}, false, 7, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "/2\r2[3942f$89^enoutch", "c$"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "ii", "xC^CH"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "hG^mb2n", "Hi"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"^enoCghf$1", "xCE"}, false, 15, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "cou2f"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"gn", "01qKnull"}, false, 17, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "bg", "mb"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "^tough"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "xIa-cq-0.fn", "0x123456789"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"`.iGck1D2a2020-02-30T25:61:661"}, false, 11, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "^+tqougX", "-1"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "1.125567890123356", "wH1.5e300"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KKTT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"aelo, Woarld"}, false, 15, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "g^t5", "ZE^gnn"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "35>gi-", "dg#"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "xC"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ELWR", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"TIabc"}, false, 6, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "27gi-1.", "dg$06toouu2f"}, {"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "cq"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "xCUILE3.25TISL0xFFFfFFF"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("XBK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"xCH]i"}, false, 13, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "wHcd2.5q400.5"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "hG^mb2n", "*tqougX"}, {"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "dgn2P$^0oneuu2f"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"g$06sio$1]>1zlba,b,c1.5-H.5abc"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "ipHhfklPohWnmsle1.aIF4^,5778urpu2f^,roough", "qqgoou2"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "WWd2", "17gi-1"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "xCH]9jnulk^en-110.1345678901234560010P^trough", "Jdgy#024Itte_xA3451.5d2q"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KXSL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"cIaau"}, false, 8, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2147483647"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "ipHffkklPohWnmsl6e1.mIF4^,5777urpu2f^,ro$ugim2020-02-30T25:61:61", "1.5f"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "xCH]:iulD]en-1]10/134567>8:01234560010P^srotgh", "Jdgy60Dl23Htt3_xA34525d2qPTPHacou2f "}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("X", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:9>"}, false, 9, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2147483647"}, {"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "Wrpugh2137493748"}, {"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "ch"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "differenceEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "/22[3942f$899^enoutch"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:aF>"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "1"}, {"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "trou2f", "2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AF11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:5`F>"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "1"}, {"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "trou2f", "2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:eVy>"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AFA1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"^cough", "2:30:45"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"^bovgh", "1-46483"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "difference", new String[]{"org.apache.commons.codec.StringEncoder", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "tou2f", "1E-5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "difference", new String[]{"org.apache.commons.codec.StringEncoder", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "tou2f", "1E-5^_ough"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "difference", new String[]{"org.apache.commons.codec.StringEncoder", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "t0tu2fee$", "ee9nou2f"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "difference", new String[]{"org.apache.commons.codec.StringEncoder", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "t0tu2fee$", "ee9npu2f"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"Ao2f"}, false, 5, new String[][]{{"org.apache.commons.codec.language.Caverphone", "caverphone", "java.lang.String", "12:30:45"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AF11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"@2f"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"e$"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "^mb"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"d$"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "^mb"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"d"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "^enoughf$1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("D", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"2147483647"}, false, 8, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "^trough"}, {"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "1.1234567890123456"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "2n2020-01-01", "2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"65"}, false, 8, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "^trough"}, {"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "1.1234567890123456"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "2n2020-01-01", "2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=65}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"-536870873"}, false, 8, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "^trough"}, {"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "1.1234567890123456"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "2n2020-01-01", "2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=-536870873}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"268435362"}, false, 8, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "^trough1234567890123456789901234567890"}, {"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "1.1234567890123456"}, {"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=268435362}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"268435388"}, false, 8, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "^trough1234567890123456789901234567890"}, {"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=268435388}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"-268435388"}, false, 9, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "^^cough"}, {"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=-268435388}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"-134217694"}, false, 9, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "^^cough"}, {"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=-134217694}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"-268435335"}, false, 9, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "^^cough"}, {"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=-268435335}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"-26"}, false, 9, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "^^couhh"}, {"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=-26}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:-1073741817>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "ci"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "caverphone", "java.lang.String", " "}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"[^^a-9z7"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "caverphone", "java.lang.String", "00x1Fq"}, {"org.apache.commons.codec.language.Caverphone", "caverphone", "java.lang.String", "^enough"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AS11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "2020-01-01"}, {"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "2020-01-01"}, {"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1", ""}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "4ci", "+1"}, {"org.apache.commons.codec.language.Caverphone", "caverphone", "java.lang.String", "1111111111"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"abF"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "^m0", "-1.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("APF1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{":bbF"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "^m0", "-1.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PF11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"0.134u65789q1234563E-^eoough"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AKA1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"Tike0x0F"}, false, 2, new String[][]{{"org.apache.commons.codec.language.Caverphone", "caverphone", "java.lang.String", "a,b,c"}, {"org.apache.commons.codec.language.Caverphone", "caverphone", "java.lang.String", "-1.5"}, {"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "p"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TKKF111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"L"}, false, 2, new String[][]{{"org.apache.commons.codec.language.Caverphone", "caverphone", "java.lang.String", "a,b,c"}, {"org.apache.commons.codec.language.Caverphone", "caverphone", "java.lang.String", "-1.5"}, {"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "p"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"^gn"}, false, 2, new String[][]{{"org.apache.commons.codec.language.Caverphone", "caverphone", "java.lang.String", "a,b,c"}, {"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "p"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("N111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"^g"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Caverphone", "caverphone", "java.lang.String", "a,b,c"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"Hllo, Wold^enovgh"}, false, 10, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "jic2"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "tro2_"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("LWLT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"220-02-30T25:61:61"}, false, 10, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "jic2"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "tro2_"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"Hllo, WoldeLovgh1.12345678901234567"}, false, 9, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "jic2"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "-1"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "1.1234567890123456"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"H2lmo,\037WoleieLovgh1.123456789012345671.12345678"}, false, 9, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "jic2"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "-2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"Trirke"}, false, 9, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "jjic2"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"TqIirke"}, false, 9, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "jjic2"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<i:2>"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TKRK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"TqIirle"}, false, 9, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "jjic2"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<i:2>"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TKRL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"TqIirle"}, false, 9, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "jjic2"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<i:2>"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TKRL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"TIirle"}, false, 9, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "jjic2"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<i:2>"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TRL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 9, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "jjic2"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<i:2>"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"0x145689"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "jji/2"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<i:53>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"W1.25"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "jji/2"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<i:-53>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"qq"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "jji/2"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<i:-53>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"q,q"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "jji/2"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<i:-76>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"q,q123456789012345678901234a,b,c"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "tj"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<i:-93>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KKBK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"q,q133nH6789"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "1.5", "W1.25"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KKN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"q,q133nH67891.5d"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "1.5", "W1.25"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KKNT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"nul"}, false, 8, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "0.5", "W2.26"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 12, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "tro2f", "0w2+F"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"Ao2f"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "1111111111"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"b"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "1111111111"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("B", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"^mb"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<i:-93>"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Iubua,cb", "12532pT"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"2147483P648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"2147X883P648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("XP", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"2147X8L83P648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("XLP", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"2147X8L83Q648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("XLQ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"1.5fcou2f"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FCOUF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"1.53fcou28"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FCOU", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"Titkea,b,c"}, false, 7, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "0x123456789"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TTKB", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"Titkea,c,c"}, false, 7, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "0x123456789"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TTKK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"Taiuke,c,Bc"}, false, 13, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "0x123456789--1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TKKB", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "1.5e300"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "65"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("65", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=65}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "1.5e300"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2097217"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2097217", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=2097217}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "1.5eW300"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:F>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "1"}, {"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "trou2f", "2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:aF>"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "1"}, {"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "trou2f", "2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AF11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<s:key>"}, {"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KA11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:kzey>"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<s:k5y>"}, {"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KSA1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:zey>"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<s:k5y>"}, {"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SA11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:zeWy>"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<s:k5y>"}, {"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SWA1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:zeVy>"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "0"}, {"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "-1", "2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SFA1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:eVy>"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "0"}, {"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "-1", "2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AFA1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"^cough", "1L"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<i:-1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x1F", "^coufh"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "difference", new String[]{"org.apache.commons.codec.StringEncoder", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "i", "1E-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "difference", new String[]{"org.apache.commons.codec.StringEncoder", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "tou2fe$", "enou2f"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"null"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "a", "Title"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"mull"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "a", "Title"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ML", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 2, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"cou2f"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "a", "Title"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"cIou2f"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "a", "Title"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"Ao2f"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "a", "Title"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"cou2f"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "b", "Titke"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"aou2f"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "b", "Titke"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"Ao2f"}, false, 5, new String[][]{{"org.apache.commons.codec.language.Caverphone", "caverphone", "java.lang.String", "12:30:45"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AF11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"1"}, false, 5, new String[][]{{"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "1.5d", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"1L-"}, false, 5, new String[][]{{"org.apache.commons.codec.language.Caverphone", "caverphone", "java.lang.String", "010"}, {"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "1.5d", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"1M-"}, false, 5, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "1.5d", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("M111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 5, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "1.5d", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"PS1H"}, false, 5, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "1.5d", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PS11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"PLS1H2020-02-30T25:61:61"}, false, 5, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<i:-2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PST1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"^gn"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("N111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"^enough", "[^a-z]"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"^enoughe$", "[^a-z]"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"^enoughf$1", "[^a-z]"}, false, 1, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "difference", new String[]{"org.apache.commons.codec.StringEncoder", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "Title", "-1.5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "5.", "^gn"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("APK1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{" "}, false, 8, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "Title"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"0x1E"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("XE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"rou2f"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ROUF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"rou2g"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ROUG", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"tou2f"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<null>"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<null>"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<null>"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<null>"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "1"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"^cough"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"d"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "^enoughf$1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("D", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"q"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "^enoughf$1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Q", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"q"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "^enouggf$1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Q", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"qq"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "^enouggH$1"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "i"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"qq"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "^enouggH$1"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "10"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "i"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"2n"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("N111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "^enouggH$1"}, {"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "^enouggH$1"}, {"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "^enouggH$1"}, {"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "65"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=65}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"/"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "^enouggH$1"}, {"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "65"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=65}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "^enouggH$1"}, {"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "65"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=65}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"trou2f"}, false, 1, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "65"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TRF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=65}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"t_rou2f2020-02-30T25:61:61"}, false, 1, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "65"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TRFT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=65}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "-1.5"}, {"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "null"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "-1.5"}, {"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "null"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"524298"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "-1.5"}, {"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "null"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=524298}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"524350"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "^trough"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "-1.5"}, {"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "null"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=524350}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "ci"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "PT1H"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<s:k<>"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"1L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"tou2f"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TOUF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"tou2ff"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TOUFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"^g"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("G", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "Titke"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KSF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"0w1F"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "Titke"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"0w2+F"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "Titkea,b,c"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"0w2fcq"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FKK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 8, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "ii"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "tro2f"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("HLWR", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"Hllo, World^enovgh"}, false, 9, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "jim2"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "tro2_"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("LWRL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"Hllo, Wold^enovgh"}, false, 10, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "jic2"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "tro2_"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("LWLT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("B", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"Tirke"}, false, 9, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "jjic2"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"TqIirle"}, false, 9, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "jjic2"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<i:2>"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TKRL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:h_alb>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("LB", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:mH$b>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "jji"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MB", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "tro2f", "0w2+F"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-.5", "1.25"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-.5", "1-5d^cough"}, false, 9, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"b"}, false, 6, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "1111111111"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("B", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"^rough"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("RF11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"^rouhh"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "W1.25"}, {"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<i:-30>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("RA11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"^rnuhh"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "W1.25"}, {"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<i:-30>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NA11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"^so4uhh"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "enou2f"}, {"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "abc", "Title"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SA11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"s"}, false, 15, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "enou2f"}, {"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "abc", "Sitle"}, {"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "m", "jic2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("S111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"cr0tsue"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KRTS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "1.5e300"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2097217"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2097217", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=2097217}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "1.5eW300"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "1.5eW300"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "jic2", "^enouggH$1"}, {"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:c>"}, false, 2, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("C", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"ii"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "10"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "-1", "1.5d"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"hh"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "16"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"hh"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "-16"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=-16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"0w2+F"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "112"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=112}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"^^coAuhi", "."}, false, 6, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "1"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"5.", ""}, false, 5, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "e$", "TITLE"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "cj"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"5.", ""}, false, 5, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "e$", "TITLE"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "cj"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2", "1.Em12,3E567^tough"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2147483647"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "b"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "cj"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"m", "1.Em12,3E567]tough"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2147483647"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "b"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "^^couhh"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"m", "^gn"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2147483647"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "b"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "1^couhh"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"tj"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2147483647"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TJ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"0x12345<x789"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KSKS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"1x12a345<x789"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KSKS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"W1.25"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "2147483619"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483619", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483619}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<i:0>"}, {"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KSF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"KTitle"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KTITLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"KT"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1e10", "dg$"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "difference", new String[]{"org.apache.commons.codec.StringEncoder", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "1.12345678901234567", "1.1234567"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "difference", new String[]{"org.apache.commons.codec.StringEncoder", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "1.1234567890192345671111111111", "1.1234567Titlenou2f"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"qq"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"pq"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PK11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a,b,c", "1L"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "1^couhh"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"oull"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "1E-5", "1L"}, {"org.apache.commons.codec.language.Caverphone", "caverphone", "java.lang.String", "^enoughe$"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AA11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"ulo:$"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<s:b>"}, {"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<i:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ALA1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Titkea,c,c1.5e300", "true"}, false, 8, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<i:-53>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"0xFFGCFFFnull"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "Sitk"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KFKFNA1111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"^en"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "Sitk"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AN11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "differenceEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"^rough", "^tough"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "differenceEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"^rou<h", "^tough"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"_^g"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", ".5"}, {"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "2n"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"^tqougX"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TKKK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:4>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "a"}, {"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<s:a>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "a"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "tou21"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "tou21"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KA11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"^enoughf$1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ENOUGHF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"^enoIghf$1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ENOIGHF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"^enoIghf$1a"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ENOIGHFA", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"^enoIghf$1a1E-5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ENOIGHFAE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"r6u3f", "2020-2-3-T1f5h:61:61^mb1.1234567890123456"}, false, 14, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "-1"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "trou2f", "+1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<s:kBey>"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<s:co>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:ug>"}, false, 5, new String[][]{{"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<s:kBey>"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<s:co>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:u,$hg>"}, false, 4, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "1"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<s:kBy>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("U", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-0.0", "010"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "0w1F"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"x-0.0", "010"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "0w1F"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"tro2Ef"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "true"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.Object", "<s:key>"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "65"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TRF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=65}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"Iff"}, false, 15, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "-1", "qq"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "1073741823"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("IF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=1073741823}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"tou2f"}, false, 15, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "-1", "qq"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "1073741823"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=1073741823}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"Etou2f"}, false, 15, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "0^covfhcou2f"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "-1", "qq"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "1073741823"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ETF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=1073741823}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"Etou2f"}, false, 15, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "0^covfhcou2f"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "-1", "qq"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "1073741785"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ETF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=1073741785}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"+Etou2g"}, false, 15, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "0^covfh4cou2f"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "-1", "qq"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:c`>"}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:126>"}, false, 11, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "Tiitkea,b,c"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 11, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "Tiitkea,b,c"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "Tiitkea,b,c"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KA11111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 11, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "Tiitkea,b,c"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:43q>"}, false, 10, new String[][]{{"org.apache.commons.codec.language.Caverphone", "caverphone", "java.lang.String", "1L"}, {"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "Tiitkea,b,c"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"8tro2f"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TRF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.String"}, new String[]{"8dro2f2020-02-30T25:61:61"}, false, 6, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TRFT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"14"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "1.1234567890123456"}, {"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "65"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "difference", new String[]{"org.apache.commons.codec.StringEncoder", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "^tough", "^^^couhh"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "c", "tro2f"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "Titkea,b,c"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "qq", "1e10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:$,<<A>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "c", "tro2f"}, {"org.apache.commons.codec.language.Metaphone", "encode", "java.lang.String", "Titkea,b,c"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "qq", "1e10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"f"}, false, 5, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<sample:3>"}, {"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "ro2f"}, {"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<s:k.<>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"Dln]HHellI- Worldz"}, false, 8, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<sample:5>"}, {"org.apache.commons.codec.language.Caverphone", "isCaverphoneEqual", "java.lang.String,java.lang.String", "", "henough$"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TNLWTS1111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "differenceEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.26", "5.."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "differenceEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PT1H", "5cu2f"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "differenceEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"W1.25", "5cu2ftrou2f"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "differenceEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"W1.25trou2f", "5cu2ftrou2f"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "differenceEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"W1.25trou2f", "5cuDftrou2f"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:-72>"}, false, 14, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "Title4", "cou2f"}, {"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "Hello, Worl:d", "1e10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "e$", "cou2f"}, {"org.apache.commons.codec.language.Metaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "Hello, Worl:d", "1e10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "differenceEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"n,B", "1e10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "differenceEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Titke", "TT2.5e30"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".", "1E5"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Metaphone", "setMaxCodeLen", "int", "10"}, {"org.apache.commons.codec.language.Metaphone", "isMetaphoneEqual", "java.lang.String,java.lang.String", "cr0tsu-e", "[^a-z]"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "difference", new String[]{"org.apache.commons.codec.StringEncoder", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "l1.5e30Etre", "1^couhh"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "difference", new String[]{"org.apache.commons.codec.StringEncoder", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "l1.4e30Etre", "Hello, World"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"tro2_i"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "e$"}, {"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<s:key>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TRA1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"trn2_i"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "ee^rough"}, {"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<s:key>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TNA1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "caverphone", new String[]{"java.lang.String"}, new String[]{"trm2_i"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "tj"}, {"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.Object", "<s:key>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TMA1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "differenceEncoded", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567", "$1yFFEFFFFFcq5."}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"en.u2f"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "M "}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ANF1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"Fen.u2f"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "M "}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FNF1111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "M "}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1111111111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Metaphone", "org.apache.commons.codec.language.Metaphone", "metaphone", new String[]{"java.lang.String"}, new String[]{"01\r243425f789^enougi"}, false, 12, new String[][]{{"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "cr0tsue"}, {"org.apache.commons.codec.language.Metaphone", "metaphone", "java.lang.String", "1E-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FNJ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"Bitle"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BITLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"Bitld"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BITLD", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"iild"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("IILD", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.SoundexUtils", "org.apache.commons.codec.language.SoundexUtils", "clean", new String[]{"java.lang.String"}, new String[]{"11.5d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("D", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.Caverphone", "org.apache.commons.codec.language.Caverphone", "encode", new String[]{"java.lang.String"}, new String[]{"F1.12345010"}, false, 0, new String[][]{{"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "true"}, {"org.apache.commons.codec.language.Caverphone", "encode", "java.lang.String", "Ao2f"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F111111111", String.valueOf(actual));
 }
}
