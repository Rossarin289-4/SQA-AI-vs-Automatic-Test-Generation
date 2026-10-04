package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.CharSequenceUtils", "org.apache.commons.codec.binary.CharSequenceUtils", "regionMatches", new String[]{"java.lang.CharSequence", "boolean", "int", "java.lang.CharSequence", "int", "int"}, new String[]{"<null>", "true", "-1", "<null>", "0", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"Title"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[84, 105, 116, 108, 101]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{" "}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[32, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DHF G", "I", "true"}, false, 1, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "0xFFFFFFFF", "2020.02>30T25:61:6\n1Lnull", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CH", "CQG", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf8", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"CQG"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 67, 0, 81, 0, 71]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Be", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u7f02\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newString", new String[]{"byte[]", "java.lang.String"}, new String[]{"<sample:0>", "K010"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{" G"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[32, 71]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CESRKx1aiki 122:C5CAC", "2-", "true"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "CC0X", "2020-0>30T25:61:511L"}, {"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.Object", "<i:1>"}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "CAESAR"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUnchecked", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"CC0X", "CCZS.tomme10a,b,b"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"5."}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 53, 0, 46]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u027f\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"CC-B1H9k- Wrld.CE", "true"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KPKR", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newString", new String[]{"byte[]", "java.lang.String"}, new String[]{"<null>", "a,b,c"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"PI1.1234577", "S", "true"}, false, 5, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", ".", "CH"}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "CCAESAxa1 "}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String,boolean", "2020.02>\n30T25:61:6\n1Lnull", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf8", new String[]{"byte[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.CharSequenceUtils", "org.apache.commons.codec.binary.CharSequenceUtils", "regionMatches", new String[]{"java.lang.CharSequence", "boolean", "int", "java.lang.CharSequence", "int", "int"}, new String[]{"<s:0>", "true", "-1", "<s:0>", "-1", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 4, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "DBIE-,1He:lp, World", "21474836481.12345678"}, {"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "1E-5 QQ"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"IXCK", "CCER,TiCI1CIE0"}, false, 3, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "1.12345678901234567 C"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "1.123456789001234567", "CCES-xai 120:45"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "Ell[oj9h3ig21null", "CCES-GiCIO-1.5aTITL20E020-02-30T25:61:61"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", ""}, false, 3, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "Ekl[oj9h3ig21nulm--1", "CCESfGiCCIN-15aTnn"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "DCIE-,1Hello, World", "DIG G", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String,boolean", "CCZS.tomme10a,b,b", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"SLGiCW1,25", "CdZZ"}, false, 12, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "CCZS.tome1na,b,ca", "0oTI;JuM+B2"}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String,boolean", "Gef10CItCEBCI", "false"}, {"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.Object", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"WCZ", "pSJ2BOvv4"}, false, 8, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "SHh:DWK"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "R,,GiC01-r4CI/", "Hdr-CICAESAR1.5d"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "xxEFGGFF202001-01", "CHTu", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"K,,GiC011.tCH.PT2HBIP1-1CY", ""}, false, 5, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "WICZ0x12L456789"}, {"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "2SSoHmIWiT:DtKCQ1mullCI0ACHECAESAR1.1234567"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CYGGhcCCI\n>-14aTnnM.null3a <Q12345678T01234567890122", "AJTTLLE", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"GYY.0.3/5CH2-1Hmm5AH P", ">>o2SJH19KM/x"}, false, 15, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "SHh:DWKm5C.y03.\013a1H1CuZHC.1.12345668901234567I-,1C", "6GGi,CW1;Kn50y03.b1WICZCIA", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "UIULL"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"dGYY.0...6/5CH2_-2mma5AdH K--0T", ">5>>ooi2SJ2.84KMx"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "SHh:DWKm5C.y03.\013a1H1Cu[H.1.12345668901234576I-,1C", "PH1.123345P7i", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", ";ITtLL GPT11H20G0,02-30T225:61:61"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "S+EGiCW1-25+\n", "CCCZP-ItolZno", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.CharSequenceUtils", "org.apache.commons.codec.binary.CharSequenceUtils", "regionMatches", new String[]{"java.lang.CharSequence", "boolean", "int", "java.lang.CharSequence", "int", "int"}, new String[]{"<s: >", "false", "0", "<null>", "0", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"", "true"}, false, 9, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "1e10", "-1"}, {"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.Object", "<i:2>"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "pSEJI=LM+HBJ.6", "IGYWe.//\n.0\r8GG.3.77.6CH_..n20n3*3Z7iu6_Q\""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:YW>"}, false, 1, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "ijZ--1.5"}, {"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "<"}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "9"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"B-EfGi1bDCHf2-b505dTnnmubl G BnAE\rARabd.4e300", "true"}, false, 8, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "BTGnulC1LWICZCH", "DBIED,1HelL\r+ Worda", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "4194347"}, {"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PFKPTKFPTNMPLKPNRPT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4194347}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"mCCeSCH<uW-Hello-;c W4", "J", "true"}, false, 6, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "TTH1e10\r"}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String,boolean", "D2D-,/Geel\n\r., oqdPaTi", "false"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "K:HC/11.CH.nPP<P12HBHP1+1\nCCYCCZI1.5", "CESDG1.6d", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DC95", "T_a0GeJOLLCHO", "false"}, false, 15, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "aGHg,.CC0131K6100y23.f1IWCoGGZIA.1u1.12345789CC", "oGGi,DWF1Kn5u0Z3.c1WICZC--1a"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "SEZh:DWKmC.y02.\013a1I1CtZHC.1.123456689012234567I-,1C1", "WCZd"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "K:HI5C2-/CHH.n4+Q12HBGQ11H1CYCCZI.T3CI123455.", "@5LLX", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DCYGHhcCCI\n>-11", "ZT_]GJTXbX4-D!G1e1.5534487DQ/WyF1FEEFFFFFCCWOCZC51.5d8ICZCEtrue1e10iCE1234567890", "false"}, false, 3, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "aGH0Gg,/CC0A1RiK1f/0y233.fIWoGZIA-1<1-1234589CC G:  1.25", "WIC[Z1M"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "SEZh:DWmmD.\ry02.\013a1I1CtZHC.1.1E234566_8901223567I-141-/.0II0E1234567891.5e3001C", "CCGibbCCIf>-5 QCIA"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "KK:HI5C2-/CHH.<4,Q12LBGGQQQQ1Hu1BYBCZI2020-01-01", "C4PLLiX", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"1\\VYGHg-0/P*", "2CCESCH-0.0 ", "true"}, false, 5, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "aGH0G4,/CB02Qh:K1f/0y153.f", "WTC[1Mtrue"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "TGn", "GI\nGYWe..1eU/1.:I\r8GG. _7Z.77C2_...n2B4n3*3Z7iu_RBuisleIOZc:4CPT1H1/123456789012"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "KK:HI52C2-//CHH-<4,Q12lLBGQQ.2234567.512:30:45", "4PLLLjX", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"HHIIa<B ZtYGHAo0\nl2QCY", "ttHHCHIaa\n\na:b8c11.-2W247/211>1CC1.1233e1B7true1.25", "true"}, false, 3, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "CH1GKK9Y0/Z23465P789012344:811j-C0.0I", "W11D[[1\014<Mrrr: 11 QPT1H"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "UUGnCH26YBB-55b/010/", "SZh:DWmmD\r"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CCEfGicCCIA\n>-15aT6nnnnull QK-1", ",P,7PH_LLj", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"H66H;;R8/7WW \037ZtZYGHAi\013m2QZ R0xFFFEFFFF-1", "ttHSCH2\t\n\013b77c.-010", "false"}, false, 1, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "CH1GKK9Y0/Z3465P7", "W11DD\\[\014<oMrrr: 01 QPPU1.12345678901234567"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "UUGnCH26YBB-55b/01:0__/<a", "SZgh:ERWmmD\r"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CCEfOGicCCIA\n>>-15aU6nBnnnull QK-01.1234567890123456", ",P,,7PH_LLj", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"H57bbI:`o2i-E7/\rW94l_ZZ!AYYGHHoAw0Z-.43Qx,1jrt 5.1.35CIE", "tHSSaCH05?0E09=a\r8:_1,2/JsCYZ", "true"}, false, 13, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "CHT,7A-abc010CE", "GH\nGYV52-e/1-OI\r88GG.37>7.77CH_..n24o*37iu_QBi/leHHO0c:CPT1H1.1234567890123451a,"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "WHn44CH45Xf\0171/_S30:25CQ G1L1", "SZgh>E1O-OOmmm`mH53>uWI8- GC-1.5"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CCEf.GijcCDD1MMCH", "QIHPP_//LLj", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"ijZ--1.5", "CH0A\n1CYE214748648", "false"}, false, 14, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.Object", "<s:6>"}, {"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "iGHh,fCV/1Km5510y23.f0WCoGZIA.1D1!PCIE5."}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"CCCZP-ItolZnoCAESAR"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "4194442"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "I\013GYWe.//\n0I\r8GG.3.77.6CH_..n20n3*3Z7iu6_Q\"", "22RSoG4\rmoIXiT::9DttKCQ1mulmCI/ACHECC2SAS1.1!3469-0B1214748b364CGtrue2020-01-01"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", " Q", "aGH0Gg,/CC0A1RiK1f/0y233.fIWoGZIA-1<1-1234589CC G:  1.", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KSPTLSNKSR", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4194442}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"GI\013YWe.R1.e/D9I\rG.3l.7", "SIO", "true"}, false, 11, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "--1", "CCEfGicCCIA\n>-15aT6nnnmull QK-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"mCCCH<uD-8H1.5f"}, false, 4, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "Tittlie", "UUGnClH26YBB-55b/010/", "false"}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String,boolean", " 1F", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MKKT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"TT HHe10\r1e1La,b,c G"}, false, 6, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "a", "aGHh,CCV01Km610y23.f1WCoGZIA.11"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "1E,5", "GeQP,!bQ,0.0", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TLPK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"CCHUu"}, false, 13, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "D_Z3gn1.5e3", "GI\013GYWe..e/1.:I\r8GG.377.77CH^..n24n3*3Z7hv_oBTileIOZc:5CPT1H1//123456789012345C"}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String,boolean", "@-LLX", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "CCEfGicCCIA\n>+415aT6nnnnull QK-1", "tHSCH2\n\013b77c."}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"uCHHH15/PJRHD1c426481.12345678900233577"}, false, 4, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "CCYGHhcCCI\n>-24aTnmM.nvllCG0x1F"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "DBZ32gx", "GeIO"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "CCEfGi.CCIA\n>5415aT6nnnnulm QK-1", "tHSCH2\n\014b77b."}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AKPJ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"UGnCH21CIA"}, false, 15, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "SIOlfDECD\014ZK1x00o-014-01CIO", "CH.\r1;12Hc20/64WWICZb<1.1F1X36 8x91//11345W"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "+0uMLL1I1jX", "GHIZYGH+gf@T-C-\tpRCY51.5e30;", "false"}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String,boolean", "t_tu3ttH/SCHEAtrveCIO1.5e300", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AKNX", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"SCHi++A-4c010"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "T2SGGI-\014R,1.252020-02n30T25:61:1CE", "KK:HI5C2-/CHH.<4,Q12LBGGQQQQ1Hu1BYBCZI2020-01-01", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("XK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{" UGnlH26YBB-55b/010/KCE"}, false, 11, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "WHFo4ACHH45YfC1/_S30022", "WHn44CH45Xf\0171/_S30:25CQ G1L1 "}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "UGnDH21", "CCYGHhcCCI\n>-24aTnm_M.nvllCG0x1F"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", ";ITtLL GPT11H20G0,02-30T225:61:61", "KK:HI5C2-/CHH-<4,Q12LBGGQQQQ1Hu1BYBCZI2020-01-01", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AKNL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{"aGHh,fCVt1m560y23.f0WCoGYIA.1D1!QC\nIf+E5CZ GCYC1.5d"}, false, 8, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "16777388"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "JJ", "023>57B8D901f23456"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "D0x123456789", "22SSoH4mIWiT::9DttKCQ1mullCI/ACHECAESAR1.1 3467-0.1-1.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AKFKFTMFKJTKKFSKSKT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=16777388}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "charAt", new String[]{"java.lang.String", "int"}, new String[]{"1.233r466789/123456", "524281"}, false, 15, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "<null>", "CCZR.toleZna-b,<aCH", "false"}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "CCeESCGG15Z"}, {"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"KK:HH5C0-aCHIHH.n4+Q12HBGQ11H0CYCC1ZI.T3CI122020-01-01"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "SH:DnWK"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "-1.5", "oBIEE,1HelL\r+ Worda-1", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KKXN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"1t_tu35ttH/SCHEd0srveCIO12.5e300", "true"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "CCEfGicCCIA\n>-15aT6nnnnull QK-0"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "1", "ZT_]GJTXbX4-8!G1e1.5534487DQ/WyF1FEEFFFFFCCWOZC511.5d8ICZCEtrue11e10iCE123456789", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TTTS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{"BaGH0Gu4"}, false, 9, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "ZT_]GJTXbX4-D!G1e1/5534487DQ/WyF1FEEFFFFFCCWOCZC51.T5d8ICZCEtrue1e10iCE123456789", "00x1;F C2+5e300"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "GI\013GYWe..e/H2.9Ii\r+G.377_777CH_..n24n3*3ZZ1ivH_YRBTisEeOYd:5CPT1I1//12345678901", "SEZh:DWmmD.\ry02.\013Xa1I1CtZHC.1.1E234566_8901223567I-141-/.I0IIE1234567891.5e3001C", "false"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "SCH+A-4c010", "UGnDH1f", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"0_0GeRJOMIEExOO0"}, false, 2, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "W11D[[1\014<Mrrr: 11 QPT1H", "0"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "DBIEE,1HelL\r+!Worda", "xSH6i:::-WKCQ"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KRJM", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{"GetQP- bQ,0.01.5e3001.5"}, false, 9, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "B-EfGi1bDCHf>-bb05dTnnoXmubl   CCAE\rARa1.5e3001.25"}, {"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "W11DD\\[\014<oMrrr: 01 QPPU1.12345678901234567", "4194442"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KTKP", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"CQH", "DCIE-,1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DCIE-,1He9l+ World", "1>,5", "false"}, false, 6, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "0xFFFFFFFF", "2020-02>30T25:61:611Lnull", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "CIOO"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DCHF", ">", "false"}, false, 3, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "0xFFFFFFFF", "2020-02>30T25:61:611Lnull", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "2>", "CQH", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DCHF", ">", "false"}, false, 2, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "0xFFFFFFFF", "2020-02>30T25:61:611Lnull", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "2>", "CQG", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "-2147483648"}, {"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "DHF G"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CCESAxa1 ", "CHIX`bc", "false"}, false, 1, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CHH", "K010", "false"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "DHG G", "0xFFFFGFFF"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", " C", "C", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CCESAxa1 ", "CCESAxa1 ", "false"}, false, 1, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CHH", "K010", "false"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "DHG G", "0xFFFFGFFF"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", " C", "C", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Be", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CK", "CH", "false"}, false, 11, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "a,b,c"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CCESX-xaili 121:C5", "EFCH", "true"}, false, 10, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CCESRKxaiki 122:C5", "fEFCH2:", "false"}, false, 10, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "10"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "CCIX", "2020-02>30T25:61:611L"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CCESRKxaiki 122:C5", "fEFCH2:", "false"}, false, 9, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "-10"}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "DHG G"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "CCIX", "2020-02>30T25:61:611L"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CCESRKx1aiki 122:C5", "DfE\nFCH:", "true"}, false, 8, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "61"}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "DHG G0.5d"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "CCIX", "2020-02>30T25:61:611L"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=61}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CCESRKx1aiki 122:C5", "DfE\nFCH:", "false"}, false, 8, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "87"}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "DHG G0.5d"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "CCIX", "2020-02>30T25:61:611L"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=87}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CCZS.tome10a,b,c", "110", "true"}, false, 12, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "!G", "021_-0>30T25:"}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String,boolean", "1.5d", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CCZS.tome1na,b,ca", "1/5dabb", "false"}, false, 9, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CdZ", "11e5db", "false"}, false, 9, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "CCZS.tomme10a,b,b", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"2020-02>30T25:61:611L", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"2020-02", "true"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "CQG"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"DCIE-B1He9l- World-", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TXPL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"DCIE-B1He9l- World-", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TSPL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "charAt", new String[]{"java.lang.String", "int"}, new String[]{"021_-0>30T25:", "-1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u0504\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u0403", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u0706", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u027f\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u7f00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"TjDY", "CH", "true"}, false, 7, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "abc"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "DBIE-,1He9lp, World", "CCAESxa1 ", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"x11e5db", "B.Inul010", "false"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "DBIE-,1He9lp, Wor\nld", "CCAESxa1 ", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"x22e5db0x1F", "B-Inul010", "false"}, false, 8, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "DBIE-,1He9lp, Wor\nld", "1E-5", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"4C", "CC1-xai 1\t/05\037GK", "true"}, false, 16, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "1"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CCAESAa", "2020-0>30T25:61:511L", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"4C", "CC1-xai 1\t/05\037GK", "false"}, false, 16, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "0"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CCAESAa", "2020-0>30T25:61:511L", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"CCES-Title", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("XSTT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"BESRKx1aikiD 122:C5CAC"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66, 0, 69, 0, 83, 0, 82, 0, 75, 0, 120, 0, 49, 0, 97, 0, 105, 0, 107, 0, 105, 0, 68, 0, 32, 0, 49, 0, 50, 0, 50, 0, 58, 0, 67, 0, 53, 0, 67, 0, 65, 0, 67, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"CIA"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[67, 0, 73, 0, 65, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"IA"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[73, 0, 65, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"IA G"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[73, 0, 65, 0, 32, 0, 71, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"IIA G"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[73, 0, 73, 0, 65, 0, 32, 0, 71, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"DCIE-,1Hf9l+ World"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[68, 0, 67, 0, 73, 0, 69, 0, 45, 0, 44, 0, 49, 0, 72, 0, 102, 0, 57, 0, 108, 0, 43, 0, 32, 0, 87, 0, 111, 0, 114, 0, 108, 0, 100, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"jDY"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[106, 0, 68, 0, 89, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"DY"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[68, 0, 89, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newString", new String[]{"byte[]", "java.lang.String"}, new String[]{"<sample:1>", "a,b,c"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"null"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 110, 0, 117, 0, 108, 0, 108]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"CAESAR"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 67, 0, 65, 0, 69, 0, 83, 0, 65, 0, 82]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"H-"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 72, 0, 45]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"H-: "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 72, 0, 45, 0, 58, 0, 32]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"H: "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 72, 0, 58, 0, 32]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"7:\037K"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 55, 0, 58, 0, 31, 0, 75]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"6:\037K"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 54, 0, 58, 0, 31, 0, 75]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"021_-0>30T25:"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 48, 0, 50, 0, 49, 0, 95, 0, 45, 0, 48, 0, 62, 0, 51, 0, 48, 0, 84, 0, 50, 0, 53, 0, 58]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"CC0X"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[67, 67, 48, 88]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00ff", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\003\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\004\005\006", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{" "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[32]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{" 0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[32, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"2020.02>3KT25:61:6\n1Lnull"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[50, 48, 50, 48, 46, 48, 50, 62, 51, 75, 84, 50, 53, 58, 54, 49, 58, 54, 10, 49, 76, 110, 117, 108, 108]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"2010.02>3KT25:61:6\n1Lnull"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[50, 48, 49, 48, 46, 48, 50, 62, 51, 75, 84, 50, 53, 58, 54, 49, 58, 54, 10, 49, 76, 110, 117, 108, 108]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"201/.02>3KT25:61:6\n1Lnull"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[50, 48, 49, 47, 46, 48, 50, 62, 51, 75, 84, 50, 53, 58, 54, 49, 58, 54, 10, 49, 76, 110, 117, 108, 108]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"DBIE-,1He9lp, Wor\nld"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[68, 66, 73, 69, 45, 44, 49, 72, 101, 57, 108, 112, 44, 32, 87, 111, 114, 10, 108, 100]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DBIE-,1He9lp, Wor\nld", "DD60", "false"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DBI:E-1GeD9mp-- WCIO1", "QG", "true"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DBJ:E-1GeD9mp-- WCIP1", "Q", "false"}, false, 2, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "true", "1"}, {"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DBJ:EC1GeD9mp-- WCIP1", "Q", "false"}, false, 2, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DBJ:EC1GeD9mp-- WCIP1", "P", "false"}, false, 2, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "65"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=65}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf8", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CIE", " C", "true"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CG", "2020-02-30T25:61:61", "false"}, {"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CeE", " C", "true"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CG", "2020-02-30T25:61:61", "false"}, {"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CIE", "3 C", "true"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CG", "2020-02-30T25:61:61", "false"}, {"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CIE", " C", "true"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CH", "2020-02-30T25:61:61", "false"}, {"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CCIE", " C", "false"}, false, 10, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "1E-5", "0"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CH", "2020-02-30T25:61:61", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"C0O", " C", "false"}, false, 10, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "1E-5", "0"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CH", "2020-02-30T25:61:61", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DCIE", "> C", "false"}, false, 10, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "1E-5", "0"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CH", "2020-02-30T25:61:61", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"CeE"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "CI", "1"}, {"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("S", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DCIE--1", "-", "false"}, false, 2, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CQH", "2020-02>30T25:61:61", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DCIE--1", "", "false"}, false, 2, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CQH", "2020-02>30T25:61:61", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DCIE--1", ".", "true"}, false, 2, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CQH", "2020-02>30T25:61:611L", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DCIE--1", ".", "true"}, false, 2, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", " G"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CQH", "2020-02>30T25:61:611L", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DCIE-,1", ".a", "true"}, false, 2, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", " G"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CQH", "2020-02>30T25:61:611Lnull", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DCIE-,1Hello, World", ".a", "true"}, false, 2, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CQH", "2020-02>30T25:61:611Lnull", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DCIE-,1He9lo, World", "1-5", "false"}, false, 1, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "0xFFFFFFFF", "2020-02>30T25:61:611Lnull", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "CIO"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DCIE-B1He9l, World", "1,5", "false"}, false, 1, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "0xFFFFFFFF", "2020-02>30T25:61:611Lnull", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "CIO"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DCIE-,1Hf9l+ World", "1>,5", "false"}, false, 6, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "0xFFFFFFFF", "2020-02>30T25:61:611Lnull", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "CIO"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DCHF", "2>", "false"}, false, 3, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "0xFFFFFFFF", "2020-02>30T25:61:611Lnull", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "CIOO"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DHG G", "", "true"}, false, 1, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "0xFFFFFFFF", "2020.02>30T25:61:6\n1Lnull", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CH", "QG", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DCIE-B1He9l, World", "1L", "false"}, false, 1, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "0xFFGFFFFF", "2020.02>30T25:61:6\n1Lnull", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CH", "K", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DCIE-B1He9l, World", "CZ", "true"}, false, 4, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "0xFFGFFFFF", "2020.02>30T25:61:6\n1Lnull", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CH", "K", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "equals", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<null>", "<s: >"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"DCIE-B1He9l- World-", "CZaiCI", "false"}, false, 4, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "0xFFGFFFFF", "2020.02>\n30T25:61:6\n1Lnull", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CH", "K", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"C", "CZ/CI", "true"}, false, 2, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "1e10", "-5", "false"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "0xFFGFFFFF", "2020.02>\n30T25:61:6\n1Lnull", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CHH", "K010", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CCAESAR", "CIOO", "true"}, false, 2, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "1e10", "-5", "false"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "0xFFGFFFFF", "2020.02>\n30T25:61:6\n1Lnull", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CHH", "K010", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CCAESAa", "C", "false"}, false, 2, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "1e10CIO", "-5", "false"}, {"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.Object", "<s:key>"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CHH", "K010", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CCAESAxa1 ", "CCIX", "true"}, false, 1, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CHH", "K010", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", " C", "C", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Be", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CCES-xai ", "L", "false"}, false, 3, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "-0.0", "-2147483648"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "DIG G", "00FFFFGFFFCIA"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"DIG G"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 68, 0, 73, 0, 71, 0, 32, 0, 71]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CCES-xai ", "L ", "false"}, false, 3, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "10"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "DIG GC", "00FFFFGFFFCIA"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "equals", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:a>", "<s:a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "contains", new String[]{"java.lang.String", "int", "int", "java.lang.String[]"}, new String[]{"PT1H", "-1", "-2147483648", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "-"}, {"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "charAt", new String[]{"java.lang.String", "int"}, new String[]{"2020-02>30T25:61:61", "1"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "0x1F", "DCIE-,1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CCES-xai 120:45", "L\"", "false"}, false, 8, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "CIG FC2147483648", "Y0FFFGGFFFCIA"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Be", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"C"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "CZ"}, {"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "CQG", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 2, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String,boolean", "Y0FFFGGFFFCIA", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("APK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"CE"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[67, 0, 69, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "contains", new String[]{"java.lang.String", "int", "int", "java.lang.String[]"}, new String[]{"0xFFFFGFFF", "1", "-2147483648", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CESRKx1aiki 122:C5CAC", "2", "false"}, false, 8, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "87"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "CC0X", "2020-0>30T25:61:511L"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=87}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CESRKx1aiki 122:C5CAC", "2", "false"}, false, 8, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "-2147483648"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "CC0X", "2020-0>30T25:61:511L"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CESRKx1aiki 122:C5CAC", "2-", "false"}, false, 8, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "43"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "CC0X", "2020-0>30T25:61:511L"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=43}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Be", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u7f02\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CCES-Title", "H-1", "false"}, false, 12, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", " G", "2021-0>30T25:61:521L"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CCES.ome10", "H-", "true"}, false, 12, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", " G", "021-0>30T25:61:521LCIE"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.Object", "<s:>"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "true", " C"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{"CCAESAa"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"<null>", "CIA", "true"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "1e10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 0, 46, 0, 49, 0, 50, 0, 51, 0, 52, 0, 53, 0, 54, 0, 55, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CCZS.tome1na,bTca", "x11e5db", "false"}, false, 8, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "CCZS.tomme10a,b,b", "2147483647"}, {"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CCZS.ttnneS1na,bTcaCH", "", "true"}, false, 9, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", ".b", "1"}, {"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.Object", "<i:61>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Be", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"DCI-B1He9l- World-", "false"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "CC"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TSPL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"DCI-B1H9k- Wrld-CIE", "false"}, false, 14, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TSPK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"K010"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 75, 0, 48, 0, 49, 0, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"DC-B1H9k- Wrld.CE", "true"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TKPK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"2147483596"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483596}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"10"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", new String[]{"int"}, new String[]{"-17"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=-17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u7f00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u0403", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u0504\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"i", "CHt", "true"}, false, 10, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "2020-2>30T25:61:611Lnull", "-2147483648"}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", ""}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "DCIE-,1He9lo, World", "CCAESAxa1 ", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"j", "CHt", "true"}, false, 10, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "2020-2>30T25:61:611Lnull", "-2147483648"}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", ""}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "DCIE-,1He9lo, World", "CCAESAxa1 ", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"j", "BHt", "true"}, false, 7, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", ""}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "DBIE-,1He9lp, World", "CCAESAxa1 ", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "charAt", new String[]{"java.lang.String", "int"}, new String[]{"CCZS.tomme10a,b,b", "0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("C", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"DBIE-,1He9lp, World", "L"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"jDY", "BInull", "true"}, false, 7, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "acc"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "DBIE-,1He9lp, World", "CCAESxa1 ", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "charAt", new String[]{"java.lang.String", "int"}, new String[]{"1.5f", "2147483647"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf8", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"1L"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 49, 0, 76]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUnchecked", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"BHt", "CCAESAR"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"CdZ"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[67, 100, 90]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"1.5d"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 0, 46, 0, 53, 0, 100, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"-0.0"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 48, 46, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"CCES-xai 120:45"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[67, 67, 69, 83, 45, 120, 97, 105, 32, 49, 50, 48, 58, 52, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{" Q"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 32, 0, 81]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"DBIE-,1He9lp, Wor\nld"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 68, 0, 66, 0, 73, 0, 69, 0, 45, 0, 44, 0, 49, 0, 72, 0, 101, 0, 57, 0, 108, 0, 112, 0, 44, 0, 32, 0, 87, 0, 111, 0, 114, 0, 10, 0, 108, 0, 100]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf8", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"L"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[76]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"!H1.1234567", "/", "true"}, false, 6, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "CCAESAxa1 "}, {"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "1"}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String,boolean", "2020.02>\n30T25:61:6\n1Lnull", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"PH1.1234577", "4", "true"}, false, 6, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", ".", "CH"}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "CCAESAxa1 "}, {"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String,boolean", "2020.02>\n30T25:61:6\n1Lnull", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"1>,5"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 62, 44, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"DIG G"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[68, 73, 71, 32, 71]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"CIA"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[67, 73, 65]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{"DCIE-B1He9l- World-"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TSPL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"PT1H"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 80, 0, 84, 0, 49, 0, 72]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"CCES-ah 1E-5", "2020-02-30T25:60b:61"}, false, 1, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "1.12345678", "021-0>30T25:61:521LCIE", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"CHH", "WICZ", "false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "CdZ"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CQ", "3 C", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:c>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "CdZ"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CQ", "3 C", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:Rc>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "CdZ"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CQ", "3 C", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("RK", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2147483648", "1.5"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "CK", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{".b"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[46, 0, 98, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{".c"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[46, 0, 99, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"r.c"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[114, 0, 46, 0, 99, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"r."}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[114, 0, 46, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Le", new String[]{"java.lang.String"}, new String[]{"CCZS.tome1na,bTca"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[67, 0, 67, 0, 90, 0, 83, 0, 46, 0, 116, 0, 111, 0, 109, 0, 101, 0, 49, 0, 110, 0, 97, 0, 44, 0, 98, 0, 84, 0, 99, 0, 97, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"022j"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 48, 0, 50, 0, 50, 0, 106]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"032j"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 48, 0, 51, 0, 50, 0, 106]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16Be", new String[]{"java.lang.String"}, new String[]{"1/5dabb"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 49, 0, 47, 0, 53, 0, 100, 0, 97, 0, 98, 0, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUsAscii", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\003\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00ff", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringIso8859_1", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{" "}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[32]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.CharSequenceUtils", "org.apache.commons.codec.binary.CharSequenceUtils", "regionMatches", new String[]{"java.lang.CharSequence", "boolean", "int", "java.lang.CharSequence", "int", "int"}, new String[]{"<null>", "false", "1", "<s:abc>", "0", "1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 48, 0, 120, 0, 70, 0, 70, 0, 70, 0, 70, 0, 70, 0, 70, 0, 70, 0, 70]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"D+JW", "Y.", "false"}, false, 7, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String", "DCIE-,1"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CCZS.ttnneS1na,bTcaCH", "-", "false"}, {"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String"}, new String[]{"2021-0>30T25:61:521L"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"DBIE-,1He9lp, World"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[68, 66, 73, 69, 45, 44, 49, 72, 101, 57, 108, 112, 44, 32, 87, 111, 114, 108, 100]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "newStringUtf16Le", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"I"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[73]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TjDY", "CCAESAxa1 0"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", "java.lang.String,boolean", ">", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ijZ--1.5d", "2020-01-01"}, false, 8, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "H-1", "12:R0:45", "false"}, {"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.Object", "<i:-56>"}, {"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "BHt", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"CCZ.toBe10,b,c", "PI1.113a577 BTITLD"}, false, 8, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "BIt", "1073741823"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesIso8859_1", new String[]{"java.lang.String"}, new String[]{"1.25"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 46, 50, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"CCES-ah 1E-5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("XS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUsAscii", new String[]{"java.lang.String"}, new String[]{"CCAESAxa1 "}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[67, 67, 65, 69, 83, 65, 120, 97, 49, 32]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"CCES-ah 1D-5"}, false, 1, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "CE", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("XST", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"2020-02>30T25:61:611Lnull"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TLNL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"CCAESAR"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KSR", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"CCAESAR"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KSR", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"CCAESAa"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"CCAESAda"}, false, 1, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "2020-0>30T25:61:511L"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KST", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf8", new String[]{"java.lang.String"}, new String[]{"0x1F"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 120, 49, 70]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"CCCAESAda"}, false, 3, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "2020-02>30T25:61:61", "-2147483648"}, {"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "2020-0>30T25:61:511L"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KKST", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.String"}, new String[]{"CCDAES@da"}, false, 3, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}, {"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "2020-02>30T25:61:61", "-2147483648"}, {"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "2020-0>30T25:61::511L"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("KTST", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "DBIE-,1He9lp, World", "2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "DBIE-,1He:lp, World", "2147483648"}, {"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "1E-5 Q"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "DBIE-,1He:lp, World", "2147483648"}, {"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "1E-5 Q"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:`>"}, false, 7, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "DBIE-,1He:lp, World", "21474836481.12345678"}, {"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.String", "1E-5 QQ"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.binary.StringUtils", "getBytesUtf16", new String[]{"java.lang.String"}, new String[]{"2-"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-2, -1, 0, 50, 0, 45]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "doubleMetaphone", new String[]{"java.lang.String", "boolean"}, new String[]{"21474836481.12345678", "true"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "H-1", ": "}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "setMaxCodeLen", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 8, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "0 C", "2020-02>30T25:61:611Lnull2020-01-01", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "DBIE-,1He:lp, 1.25", "2u474836481.02345678"}, {"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("K", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 8, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "0 C", "2020-02>30T25:61:611Lnull2020-01-01", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String", "DBIE-,1He:lp, 1.25", "2u474836481.02345678"}, {"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", new String[]{"java.lang.String", "java.lang.String", "boolean"}, new String[]{"null", "Hello, World", "false"}, false, 0, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "encode", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 14, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "0 C", "2020-02>30T285:61:611Lnull2020-01-011.1234567", "true"}, {"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "", "10"}, {"org.apache.commons.codec.language.DoubleMetaphone", "charAt", "java.lang.String,int", "2020-0>30T25:61:511L", "-1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.codec.EncoderException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "0 C", "2020-02>30T285:61:611Lnull2020-01-011.1234567", "false"}, {"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "0 C", "2020-02>30T285:61:611Lnull2020-01-011.1234567", "false"}, {"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 13, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "0 C", "2020-02>30T285:61:611Lnull2020-01-011.1234567", "false"}, {"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:i>"}, false, 13, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CIA", "2020-02>30T285:61:611Lnull2020-01-011.1234567", "false"}, {"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:j>"}, false, 13, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CIA", "2020-02>30T285:61:611Lnull2020-01-011.1234567", "false"}, {"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("J", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.language.DoubleMetaphone", "org.apache.commons.codec.language.DoubleMetaphone", "encode", new String[]{"java.lang.Object"}, new String[]{"<s:2j>"}, false, 13, new String[][]{{"org.apache.commons.codec.language.DoubleMetaphone", "isDoubleMetaphoneEqual", "java.lang.String,java.lang.String,boolean", "CIA", "2020-02>30T285:61:611Lnull2020-01-011.1234567", "false"}, {"org.apache.commons.codec.language.DoubleMetaphone", "getMaxCodeLen", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("J", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMaxCodeLen=4}", SearchInputFactory_scaffolding.receiverState());
 }
}
